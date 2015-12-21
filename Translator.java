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
        String result = String.format(format, hour, minute);
        
        System.out.println(result);
    }
}
