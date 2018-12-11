package database;

import database.Department;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-10T08:35:06")
@StaticMetamodel(College.class)
public class College_ { 

    public static volatile SingularAttribute<College, String> cname;
    public static volatile SingularAttribute<College, String> cid;
    public static volatile CollectionAttribute<College, Department> departmentCollection;

}