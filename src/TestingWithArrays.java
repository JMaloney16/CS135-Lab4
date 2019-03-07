import static org.junit.Assert.*;

import org.junit.Test;
import sun.security.timestamp.TSRequest;

public class TestingWithArrays {

	public SingleTest[]  myTestSuite () {
	       SingleTest[] tmp = new SingleTest [36];
	       int[] month = new int[]{6,7,2};
	       int[] day = new int[]{14,29,30,31};
	       int[] year = new int[]{2000,1996,2002};
	       int counter = 0;
		while (counter < 36) {
			for (int i = 0; i < (month.length); i++) {
				for (int j = 0; j < (day.length); j++) {
					for (int k = 0; k < (year.length); k++) {
						String output;
						if ((month[i] == 6 && day[j] >= 31)){
							output = "Invalid input date";
						}else if((month[i]) == 2 && (day[j] >= 29)){
							if (year[k] != 2002){
								output = (1 + "." + 3 + ".---" + year[k]);
							}else{
								output = "Invalid input date";
							}
						}
						else if ((day[j] == 31) && (month[i] == 7)){
							output = (1 + "." + (month[i] + 1) + ".---" + year[k]);
						}else{
							output = ((day[j] + 1) + "." + month[i] + ".---" + year[k]);
						}
						tmp[counter++] = new SingleTest(month[i],day[j],year[k], output);
					}
				}
			}
		}

               return tmp;    	
	}
	                                     	
       @Test  
       public void ExecuteTestSuite () {
       SingleTest[] TestSuite;
       TestSuite = myTestSuite();
		   System.out.println(TestSuite[3].Output());
       for (int i = 0; i < TestSuite.length; i++) {
		   System.out.println(TestSuite[i].SecondInput() + " " + TestSuite[i].FirstInput() + " " + TestSuite[i].ThirdInput());
       	assertEquals(  TestSuite[i].Output(),
    		 	         nextDateFunction.tomorrow( TestSuite[i].SecondInput(),
	    		                                      TestSuite[i].FirstInput(),
	                                                  TestSuite[i].ThirdInput()
	                                          )  
    	              );	
    	}	
    }
    
}

