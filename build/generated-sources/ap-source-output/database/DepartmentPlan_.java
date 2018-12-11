package database;

import database.Course;
import database.Department;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(DepartmentPlan.class)
public class DepartmentPlan_ { 

    public static volatile SingularAttribute<DepartmentPlan, BigDecimal> dSeq;
    public static volatile SingularAttribute<DepartmentPlan, Course> courseId;
    public static volatile SingularAttribute<DepartmentPlan, Department> depName;

}