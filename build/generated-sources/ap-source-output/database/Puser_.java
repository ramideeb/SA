package database;

import database.Course;
import database.CoursesSelected;
import database.Department;
import database.Event;
import database.Note;
import database.Task;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(Puser.class)
public class Puser_ { 

    public static volatile SingularAttribute<Puser, String> fname;
    public static volatile SingularAttribute<Puser, String> uniName;
    public static volatile SingularAttribute<Puser, Date> birthdate;
    public static volatile CollectionAttribute<Puser, Event> eventCollection;
    public static volatile SingularAttribute<Puser, Character> gender;
    public static volatile SingularAttribute<Puser, String> jobTitle;
    public static volatile SingularAttribute<Puser, BigInteger> verified;
    public static volatile CollectionAttribute<Puser, Course> courseCollection;
    public static volatile SingularAttribute<Puser, String> type;
    public static volatile CollectionAttribute<Puser, Note> noteCollection;
    public static volatile SingularAttribute<Puser, String> uniId;
    public static volatile SingularAttribute<Puser, String> lname;
    public static volatile SingularAttribute<Puser, String> password;
    public static volatile CollectionAttribute<Puser, Task> taskCollection;
    public static volatile SingularAttribute<Puser, String> class1;
    public static volatile SingularAttribute<Puser, String> univirsity;
    public static volatile SingularAttribute<Puser, Department> department;
    public static volatile SingularAttribute<Puser, String> email;
    public static volatile CollectionAttribute<Puser, CoursesSelected> coursesSelectedCollection;
    public static volatile SingularAttribute<Puser, String> username;

}