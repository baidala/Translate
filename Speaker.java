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
public interface Speaker {
    int hour = 12;
    int minute = 30;
    String halfOfDay = "AM";
    void howSay();
    String howSayWithTime(int lHour, int lMinutes);
    
}
