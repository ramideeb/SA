
import database.Event;
import calendar.EditEventFrame;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masri
 */
public class SpinnerTest {
    public static void main(String args[]){
        Event e=new Event();
        Date d = null;
        try {
             d=new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ YYYY").parse("Mon Feb 30 12:30:15 EET 2018");
        } catch (ParseException ex) {
            Logger.getLogger(SpinnerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(d);
        /*e.setNTime(d);
        e.setName("this is a test event");
        e.setEid("e15");
        e.setNF(BigInteger.ZERO);
        e.setDescription("this is a test desc");
        EditEventFrame evf=new EditEventFrame(e);
     */
        
    }
    
}
