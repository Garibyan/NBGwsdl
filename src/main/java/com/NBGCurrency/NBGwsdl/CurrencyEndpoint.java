package com.NBGCurrency.NBGwsdl;

import com.NBGCurrency.NBGwsdl.model.Currency;
import com.NBGCurrency.NBGwsdl.service.CurrencyService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.soap11.Soap11Body;

import javax.xml.bind.Element;
import javax.xml.rpc.ServiceException;

@Endpoint
public class CurrencyEndpoint {

//    @ResponsePayload
//    public void currencyEndpoint() throws RemoteException {
//        NBGCurrencyBindingStub abc = new NBGCurrencyBindingStub();
//        String usdCurrency = "USD";
//        String currensyUSD = abc.getCurrency(usdCurrency);
//    }

    private final CurrencyService currencyService;

    public CurrencyEndpoint(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PayloadRoot(localPart = "currency", namespace = "http://localhost:8080")
    public void currency(@RequestPayload Element currencyElement) throws ServiceException {
//        Currency currency = null;
        currencyService.initCurrency();
    }
//
//    @PayloadRoot(localPart = "orderRequest", namespace = "http://samples")
//    @ResponsePayload
//    public Currency getCurrency(@RequestPayload Currency, SoapHeader header){
//
//
//    }
}
