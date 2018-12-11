package database;

import database.Course;
import database.Puser;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, String> eid;
    public static volatile SingularAttribute<Event, String> name;
    public static volatile SingularAttribute<Event, BigInteger> nF;
    public static volatile SingularAttribute<Event, Course> course;
    public static volatile SingularAttribute<Event, String> description;
    public static volatile SingularAttribute<Event, Date> time;
    public static volatile SingularAttribute<Event, Date> nTime;
    public static volatile SingularAttribute<Event, Puser> username;

}