

package study.assistant;

import admin.admin;
import java.util.List;


public class StudyAssistant {

public home home;
public login login;
public admin admin;
public List l;
public static StudyAssistant prog;


    public static void main(String[] args) {
        // TODO code application logic here
        
        prog=new StudyAssistant();
        prog.  login=new login();
        prog.login.setVisible(true);
        
        
    }
    
}
