/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "COURSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c")
    , @NamedQuery(name = "Course.findById", query = "SELECT c FROM Course c WHERE c.id = :id")
    , @NamedQuery(name = "Course.findByDescription", query = "SELECT c FROM Course c WHERE c.description = :description")
    , @NamedQuery(name = "Course.findByName", query = "SELECT c FROM Course c WHERE c.name = :name")
    , @NamedQuery(name = "Course.findByOutline", query = "SELECT c FROM Course c WHERE c.outline = :outline")
    , @NamedQuery(name = "Course.findByBook", query = "SELECT c FROM Course c WHERE c.book = :book")
    , @NamedQuery(name = "Course.findByCredits", query = "SELECT c FROM Course c WHERE c.credits = :credits")
    , @NamedQuery(name = "Course.findByType", query = "SELECT c FROM Course c WHERE c.type = :type")
    , @NamedQuery(name = "Course.findByCourseLevel", query = "SELECT c FROM Course c WHERE c.courseLevel = :courseLevel")
    , @NamedQuery(name = "Course.findByAcademinF", query = "SELECT c FROM Course c WHERE c.academinF = :academinF")
    , @NamedQuery(name = "Course.findByAcademicAdder", query = "SELECT c FROM Course c WHERE c.academicAdder = :academicAdder")
    , @NamedQuery(name = "Course.findByNonacademicF", query = "SELECT c FROM Course c WHERE c.nonacademicF = :nonacademicF")
    , @NamedQuery(name = "Course.findByNonacademicAdder", query = "SELECT c FROM Course c WHERE c.nonacademicAdder = :nonacademicAdder")})
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "OUTLINE")
    private String outline;
    @Column(name = "BOOK")
    private String book;
    @Column(name = "CREDITS")
    private BigInteger credits;
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @Column(name = "COURSE_LEVEL")
    private BigInteger courseLevel;
    @Basic(optional = false)
    @Column(name = "ACADEMIN_F")
    private BigInteger academinF;
    @Column(name = "ACADEMIC_ADDER")
    private BigInteger academicAdder;
    @Column(name = "NONACADEMIC_F")
    private BigInteger nonacademicF;
    @Column(name = "NONACADEMIC_ADDER")
    private BigInteger nonacademicAdder;
    @ManyToMany(mappedBy = "courseCollection")
    private Collection<Department> departmentCollection;
    @ManyToMany(mappedBy = "courseCollection")
    private Collection<Puser> puserCollection;
    @OneToMany(mappedBy = "courseId")
    private Collection<Note> noteCollection;

    public Course() {
    }

    public Course(BigDecimal id) {
        this.id = id;
    }

    public Course(BigDecimal id, String name, BigInteger courseLevel, BigInteger academinF) {
        this.id = id;
        this.name = name;
        this.courseLevel = courseLevel;
        this.academinF = academinF;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public BigInteger getCredits() {
        return credits;
    }

    public void setCredits(BigInteger credits) {
        this.credits = credits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigInteger getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(BigInteger courseLevel) {
        this.courseLevel = courseLevel;
    }

    public BigInteger getAcademinF() {
        return academinF;
    }

    public void setAcademinF(BigInteger academinF) {
        this.academinF = academinF;
    }

    public BigInteger getAcademicAdder() {
        return academicAdder;
    }

    public void setAcademicAdder(BigInteger academicAdder) {
        this.academicAdder = academicAdder;
    }

    public BigInteger getNonacademicF() {
        return nonacademicF;
    }

    public void setNonacademicF(BigInteger nonacademicF) {
        this.nonacademicF = nonacademicF;
    }

    public BigInteger getNonacademicAdder() {
        return nonacademicAdder;
    }

    public void setNonacademicAdder(BigInteger nonacademicAdder) {
        this.nonacademicAdder = nonacademicAdder;
    }

    @XmlTransient
    public Collection<Department> getDepartmentCollection() {
        return departmentCollection;
    }

    public void setDepartmentCollection(Collection<Department> departmentCollection) {
        this.departmentCollection = departmentCollection;
    }

    @XmlTransient
    public Collection<Puser> getPuserCollection() {
        return puserCollection;
    }

    public void setPuserCollection(Collection<Puser> puserCollection) {
        this.puserCollection = puserCollection;
    }

    @XmlTransient
    public Collection<Note> getNoteCollection() {
        return noteCollection;
    }

    public void setNoteCollection(Collection<Note> noteCollection) {
        this.noteCollection = noteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Course[ id=" + id + " ]";
    }
    
}
