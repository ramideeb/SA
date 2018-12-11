

package study.assistant;


public class StudyAssistant {

home home;
login login;

static StudyAssistant prog;

    public static void main(String[] args) {
        // TODO code application logic here
        
        prog=new StudyAssistant();
        prog.  login=new login();
        prog.login.setLocationRelativeTo(null);
        prog.login.setTitle("study assistan");
        prog.login.setSize(1100, 600);
        prog.login.setVisible(true);
        
        
    }
    
}
