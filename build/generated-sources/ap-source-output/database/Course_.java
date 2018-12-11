package database;

import database.CoursesSelected;
import database.DepartmentPlan;
import database.Event;
import database.Note;
import database.Puser;
import database.Task;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(Course.class)
public class Course_ { 

    public static volatile CollectionAttribute<Course, Event> eventCollection;
    public static volatile SingularAttribute<Course, String> book;
    public static volatile SingularAttribute<Course, String> description;
    public static volatile SingularAttribute<Course, Puser> adder;
    public static volatile SingularAttribute<Course, String> type;
    public static volatile CollectionAttribute<Course, Note> noteCollection;
    public static volatile CollectionAttribute<Course, DepartmentPlan> departmentPlanCollection;
    public static volatile SingularAttribute<Course, String> outline;
    public static volatile CollectionAttribute<Course, Task> taskCollection;
    public static volatile SingularAttribute<Course, BigInteger> courseLevel;
    public static volatile SingularAttribute<Course, BigInteger> credits;
    public static volatile SingularAttribute<Course, String> name;
    public static volatile SingularAttribute<Course, BigDecimal> id;
    public static volatile CollectionAttribute<Course, CoursesSelected> coursesSelectedCollection;

}