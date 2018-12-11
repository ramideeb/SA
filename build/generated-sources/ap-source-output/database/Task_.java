package database;

import database.Course;
import database.Puser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(Task.class)
public class Task_ { 

    public static volatile SingularAttribute<Task, String> note;
    public static volatile SingularAttribute<Task, String> name;
    public static volatile SingularAttribute<Task, Course> course;
    public static volatile SingularAttribute<Task, String> priority;
    public static volatile SingularAttribute<Task, Date> dueTime;
    public static volatile SingularAttribute<Task, String> tid;
    public static volatile SingularAttribute<Task, Puser> username;

}