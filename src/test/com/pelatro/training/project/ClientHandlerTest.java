package test.com.pelatro.training.project;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.jupiter.api.Test;

import com.pelatro.training.project.ClientHandler;

class ClientHandlerTest {
	@Test
	public void checkToStoreInRepositoryMethod() {
		ConcurrentHashMap<Character, Integer> hm=new ConcurrentHashMap<Character, Integer>();
		String msg="h";
		for(char ch='a';ch<='z';ch++) {
			hm.put(ch, 0);
		}
		ClientHandler ch=new ClientHandler(msg, hm);
		ch.storeInRepository(msg);
		assertEquals(hm.get('h'), 1);
	
	}

}
