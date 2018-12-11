/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rami
 */
@Entity
@Table(name = "DEPARTMENT", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")
    , @NamedQuery(name = "Department.findByName", query = "SELECT d FROM Department d WHERE d.name = :name")
    , @NamedQuery(name = "Department.findByDescription", query = "SELECT d FROM Department d WHERE d.description = :description")})
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 20)
    private String name;
    @Column(name = "DESCRIPTION", length = 20)
    private String description;
    @OneToMany(mappedBy = "department")
    private Collection<Puser> puserCollection;
    @JoinColumn(name = "COLLEGE_ID", referencedColumnName = "CID")
    @ManyToOne
    private College collegeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "depName")
    private Collection<DepartmentPlan> departmentPlanCollection;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(String text, String text0, College result) {
        this.name=text;
        this.description=text0;
        this.collegeId=result;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Puser> getPuserCollection() {
        return puserCollection;
    }

    public void setPuserCollection(Collection<Puser> puserCollection) {
        this.puserCollection = puserCollection;
    }

    public College getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(College collegeId) {
        this.collegeId = collegeId;
    }

    @XmlTransient
    public Collection<DepartmentPlan> getDepartmentPlanCollection() {
        return departmentPlanCollection;
    }

    public void setDepartmentPlanCollection(Collection<DepartmentPlan> departmentPlanCollection) {
        this.departmentPlanCollection = departmentPlanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Department[ name=" + name + " ]";
    }
    
}
