package database;

import database.Course;
import database.Puser;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(Note.class)
public class Note_ { 

    public static volatile SingularAttribute<Note, String> path;
    public static volatile SingularAttribute<Note, Date> timeAdded;
    public static volatile SingularAttribute<Note, String> name;
    public static volatile SingularAttribute<Note, BigDecimal> noteId;
    public static volatile SingularAttribute<Note, String> text;
    public static volatile SingularAttribute<Note, String> type;
    public static volatile SingularAttribute<Note, Course> courseId;
    public static volatile SingularAttribute<Note, Puser> username;

}