
package lommeregner;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class LommeregnerTest {
    Lommeregner lommeregner; 
    
    @Before
    public void setup(){
        lommeregner = new Lommeregner(); 
    }
    
    @Test
    public void testPlusPos() throws UgyldigtInputException{
        //Arrange 
        int forventetResultat = 3; 
        //Act
        int resultat = lommeregner.plus(1,2); 
        //Assert
        assertEquals(forventetResultat,resultat); 
        
    }
    
    @Test
    public void testStorTal() throws UgyldigtInputException{
        //Arrange 
        int forventetResultat = 1000000; 
        //Act
        int resultat = lommeregner.plus(999999,1);
        //Assert
         assertEquals(forventetResultat,resultat); 
    }
   
    @Test (expected = UgyldigtInputException.class)
    public void testPlusNeg() throws UgyldigtInputException{
        //Act
        int resultat = lommeregner.plus(-1,-3); 

    }
}
