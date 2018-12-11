package database;

import database.Course;
import database.Puser;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(CoursesSelected.class)
public class CoursesSelected_ { 

    public static volatile SingularAttribute<CoursesSelected, Puser> sUsername;
    public static volatile SingularAttribute<CoursesSelected, BigInteger> downloaded;
    public static volatile SingularAttribute<CoursesSelected, Course> courseId;
    public static volatile SingularAttribute<CoursesSelected, String> seq;

}