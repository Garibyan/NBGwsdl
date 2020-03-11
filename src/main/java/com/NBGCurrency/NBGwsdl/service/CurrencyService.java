package com.NBGCurrency.NBGwsdl.service;

import com.NBGCurrency.NBGwsdl.NBG;
import com.NBGCurrency.NBGwsdl.model.Currency;
import com.NBGCurrency.NBGwsdl.repository.CurrencyRepository;
import com.wsdlparser.NBGCurrencyService;
import org.apache.axis.AxisFault;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) throws MalformedURLException {
        this.currencyRepository = currencyRepository;
    }
    private NBGCurrencyService nbgCurrencyService;
    private NBG nbg;

    URL url = new URL("https://nbg.gov.ge/currency.wsdl");

    {
        try {
            nbg = new NBG(url, nbgCurrencyService);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }
    }


    @Scheduled(initialDelay = 1000L, fixedDelay = 2000L)
    public void initCurrency() throws ServiceException {
        Currency currency = new Currency();
        currency.setEUR(nbg.getEURCurrency());
        currency.setEUR(nbg.getUSDCurrency());
        currencyRepository.save(currency);
    }
}
