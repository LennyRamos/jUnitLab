

package junitlab;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JunitLab {

    
   public static void main(String[] args) {
      
        System.out.println("Hello, the bottom is about to commence\n");
        
        Result result = JUnitCore.runClasses(junitlab.TestOut.class);
        	
        
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
            }
        }
        
}
