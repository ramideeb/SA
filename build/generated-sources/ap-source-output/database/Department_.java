package database;

import database.College;
import database.DepartmentPlan;
import database.Puser;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile CollectionAttribute<Department, Puser> puserCollection;
    public static volatile SingularAttribute<Department, College> collegeId;
    public static volatile SingularAttribute<Department, String> name;
    public static volatile SingularAttribute<Department, String> description;
    public static volatile CollectionAttribute<Department, DepartmentPlan> departmentPlanCollection;

}