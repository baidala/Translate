/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translate;
import translate.Speaker;
/**
 *
 * @author student
 */
public class Main {
    //static int value = 10;
    
    
    
    
    public static void main(String[] args) {
        Speaker speaker2 = new Speaker() {

        @Override
        public void howSay() {
            //System.out.println(hour +" -hourse "+minute+"-minute.");
            System.out.printf("We are at %s."+" Our time is %d:%d.", halfOfDay, hour, minute);
            
            
        }

            @Override
            public String howSayWithTime(int lHour, int lMinutes) {
                
            }
        };
        
        Translator tr = new Translator();
        
        tr.writeTime("Our time is %d:%d %s.");
        
        UkrainianSpeaker us = new UkrainianSpeaker();
        us.writeTime();
        
        tr.whatTimeIsIt(speaker2);
        
        tr.whatTimeIsIt( 
          new Speaker() {

            @Override
            public void howSay() {
                
            }

            @Override
            public String howSayWithTime(int lHour, int lMinutes ) {
                
                return String.format("The time is - %d:%d.", lHour, lMinutes);
            }
          }
        );
        
        
        
        
        
        
    }
    
    
    Speaker speaker1 = new Speaker() {

        @Override
        public void howSay() {
            System.out.println(hour +" -hourse "+minute+"-minute.");
            System.out.printf("%d-hourse, %d-minutes.", hour, minute);
                       
        }

        @Override
        public String howSayWithTime(int lHour, int lMinutes) {
            
        }
    };
    
    
    
    
}
