package com.NBGCurrency.NBGwsdl;

import com.wsdlparser.NBGCurrencyBindingStub;
import org.apache.axis.AxisFault;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

import javax.xml.rpc.Service;
import java.net.URL;
import java.rmi.RemoteException;

@Component
public class NBG extends NBGCurrencyBindingStub {

    public String getUSDCurrency() {
        String usd = null;
        try {
            usd = getCurrency("USD");
            System.out.println(usd);
            return usd;
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return usd;
    }

    public String getEURCurrency() {
        String eur = null;
        try {
            eur = getCurrency("EUR");
            System.out.println(eur);
            return eur;
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return eur;
    }

    public NBG() throws RemoteException {
    }

    public NBG(URL endpointURL, Service service) throws RemoteException {
        super(endpointURL, service);
    }

    public NBG(Service service) throws RemoteException {
        super(service);
    }

    public void currencyEndpoint() throws RemoteException {
        NBGCurrencyBindingStub abc = new NBGCurrencyBindingStub();
        String usdCurrency = "USD";
        String currensyUSD = abc.getCurrency(usdCurrency);
    }
}
