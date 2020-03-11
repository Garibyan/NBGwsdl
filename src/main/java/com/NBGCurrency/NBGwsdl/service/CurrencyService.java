package com.NBGCurrency.NBGwsdl.service;

import com.NBGCurrency.NBGwsdl.NBG;
import com.NBGCurrency.NBGwsdl.model.Currency;
import com.NBGCurrency.NBGwsdl.repository.CurrencyRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;

@Service
public class CurrencyService {

    private final CurrencyRepository currencyRepository;
    private final NBG nbg;

    public CurrencyService(CurrencyRepository currencyRepository, NBG nbg) {
        this.currencyRepository = currencyRepository;
        this.nbg = nbg;
    }

    @Scheduled(initialDelay = 1000L, fixedDelay = 2000L)
    public void initCurrency() throws ServiceException {
        Currency currency = new Currency();
        currency.setEUR(nbg.getEURCurrency());
        currency.setEUR(nbg.getUSDCurrency());
        currencyRepository.save(currency);
    }
}
