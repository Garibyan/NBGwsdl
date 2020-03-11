package com.NBGCurrency.NBGwsdl;

		import org.junit.jupiter.api.Test;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.context.SpringBootTest;

		import java.rmi.RemoteException;

@SpringBootTest
class NbGwsdlApplicationTests {

	@Autowired
	private NBG nbg;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetCurrency() throws RemoteException {
		nbg.getUSDCurrency();
	}

}
