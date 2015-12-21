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
public class UkrainianSpeaker {
    public void writeTime() {
        String result = String.format("Зараз 10:20.");
        
        System.out.println(result);
    }
    
    class MySpeaker implements Speaker {
        
        @Override
        public void howSay() {
            System.out.println("Привет");
        }
    }
    
}
