
package lommeregner;


public class Lommeregner {

    public int plus(int a, int b) throws UgyldigtInputException {
        //accepterer kun positive heltal 
        if(a < 1 || b < 1){
            //Fejlhåndtering
            throw new UgyldigtInputException("Input er ikke positivt heltal:" + a + " " + b);  
           
        } return a + b; 
    }

    
}
