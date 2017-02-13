

package junitlab;


public class Date {
    int year;
    int month;
    int day;
    
    public Date(int y, int m, int d){
        
        this.year = y;
        this.month = m;
        this.day = d;
        
    }
    
     public int daysTo(Date date1){
         
         year = (this.year - date1.year);
         month = (this.month - date1.month);
         day = (this.day - date1.day);
         
         int diff = (year*365)+(month*30)+day;
            
         //diff = Math.abs(diff);
        
        return diff;
    }
}
