/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translate;

/**
 *
 * @author student
 */
public class Translator implements Speaker {
    
    
    @Override
    public void howSay() {
        //System.out.println("Hello"+value);
    }
    
    public void writeTime() {
        System.out.println("Hour: "+hour+" minute: "+minute);
    }
    
    public void writeTime(String format) {
        String result = String.format(format, hour, minute, halfOfDay);
        
        System.out.println(result);
    }
    
    public void whatTimeIsIt(Speaker sp) {
        sp.howSay();
        System.out.printf("From howSayWithTime "+sp.howSayWithTime(12, 0));
    }

    @Override
    public String howSayWithTime(int lHour, int lMinutes ) {
        
        return String.format("The time is - %d:%d.", lHour, lMinutes);
    }
}
