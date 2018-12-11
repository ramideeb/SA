/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rami
 */
@Entity
@Table(name = "DEPARTMENT_PLAN", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DepartmentPlan.findAll", query = "SELECT d FROM DepartmentPlan d")
    , @NamedQuery(name = "DepartmentPlan.findByDSeq", query = "SELECT d FROM DepartmentPlan d WHERE d.dSeq = :dSeq")})
public class DepartmentPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "D_SEQ", nullable = false, precision = 0, scale = -127)
    private BigDecimal dSeq;
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Course courseId;
    @JoinColumn(name = "DEP_NAME", referencedColumnName = "NAME", nullable = false)
    @ManyToOne(optional = false)
    private Department depName;

    public DepartmentPlan() {
    }

    public DepartmentPlan(BigDecimal dSeq) {
        this.dSeq = dSeq;
    }

    public DepartmentPlan(BigDecimal nextSequenceValue, Course id, Department find) {
this.dSeq=nextSequenceValue;
this.courseId=id;
this.depName=find;



    }

    public BigDecimal getDSeq() {
        return dSeq;
    }

    public void setDSeq(BigDecimal dSeq) {
        this.dSeq = dSeq;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    public Department getDepName() {
        return depName;
    }

    public void setDepName(Department depName) {
        this.depName = depName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dSeq != null ? dSeq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartmentPlan)) {
            return false;
        }
        DepartmentPlan other = (DepartmentPlan) object;
        if ((this.dSeq == null && other.dSeq != null) || (this.dSeq != null && !this.dSeq.equals(other.dSeq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.DepartmentPlan[ dSeq=" + dSeq + " ]";
    }
    
}
