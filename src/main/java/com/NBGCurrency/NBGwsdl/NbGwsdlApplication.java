package com.NBGCurrency.NBGwsdl;

import org.apache.axis.AxisFault;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.rmi.RemoteException;

@SpringBootApplication
public class NbGwsdlApplication {

	public NbGwsdlApplication() throws AxisFault {
	}

	public static void main(String[] args) throws RemoteException {
		SpringApplication.run(NbGwsdlApplication.class, args);
		NBG nbg = new NBG();
		System.out.println(nbg.getUSDCurrency());
	}

}
