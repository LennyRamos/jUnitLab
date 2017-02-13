

package junitlab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;


public class TestOut {
    
   Date dateOne = new Date(1992, 1, 1);	
   Date dateTwo = new Date(2010, 5, 30);
   
   @Test
   public void print(){
       System.out.println("sup");
   }
   
   @Test
   public void testDateFail() {
      //assertEquals(1, dateOne.daysTo(dateOne));
      assertEquals(2, dateTwo.daysTo(dateOne));
   }
   
   @Test
   public void testDatePass() {
      //assertEquals(1, dateOne.daysTo(dateOne));
      assertEquals(6719, dateTwo.daysTo(dateOne));
   }
   
   @Test
   public void testDateFail2() {
      assertEquals(1, dateOne.daysTo(dateTwo));
      //assertEquals(2, dateTwo.daysTo(dateOne));
   }

//Pass in the same date 
   @Test
   public void testDatePass2() {
      assertEquals(400, dateOne.daysTo(dateOne));
      //assertEquals(2, dateTwo.daysTo(dateOne));
   }
}
/*

1st Parameter   ||  2nd Parameter     ||    Expected     || Output of
2010, 5, 30         1992, 1, 1              2               6719
1992, 1, 1          2010, 5, 30             1               -6719
2010, 5, 30         1992, 1, 1              6719            6719
1992, 1, 1          1992, 1, 1              400              0

*/
