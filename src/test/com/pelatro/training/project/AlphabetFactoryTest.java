package test.com.pelatro.training.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.pelatro.training.project.AlphabetFactory;

class AlphabetFactoryTest {

	
	@Test
	public void checkPickAlphabetMethod() {
		AlphabetFactory alphabetFactory=new AlphabetFactory(null,1);
		alphabetFactory.pickAlphabet();
		Assert.assertFalse(alphabetFactory.flag);
	}
	

}
