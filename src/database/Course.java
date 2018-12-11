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
@Table(name = "COURSE", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c")
    , @NamedQuery(name = "Course.findById", query = "SELECT c FROM Course c WHERE c.id = :id")
    , @NamedQuery(name = "Course.findByDescription", query = "SELECT c FROM Course c WHERE c.description = :description")
    , @NamedQuery(name = "Course.findByName", query = "SELECT c FROM Course c WHERE c.name = :name")
    , @NamedQuery(name = "Course.findByCredits", query = "SELECT c FROM Course c WHERE c.credits = :credits")
    , @NamedQuery(name = "Course.findByType", query = "SELECT c FROM Course c WHERE c.type = :type")
    , @NamedQuery(name = "Course.findByCourseLevel", query = "SELECT c FROM Course c WHERE c.courseLevel = :courseLevel")
    , @NamedQuery(name = "Course.findByBook", query = "SELECT c FROM Course c WHERE c.book = :book")
    , @NamedQuery(name = "Course.findByOutline", query = "SELECT c FROM Course c WHERE c.outline = :outline")})
public class Course implements Serializable {

    @OneToMany(mappedBy = "course")
    private Collection<Event> eventCollection;

    @OneToMany(mappedBy = "course")
    private Collection<Task> taskCollection;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "DESCRIPTION", length = 100)
    private String description;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;
    @Column(name = "CREDITS")
    private BigInteger credits;
    @Column(name = "TYPE", length = 20)
    private String type;
    @Basic(optional = false)
    @Column(name = "COURSE_LEVEL", nullable = false)
    private BigInteger courseLevel;
    @Column(name = "BOOK", length = 500)
    private String book;
    @Column(name = "OUTLINE", length = 500)
    private String outline;
    @OneToMany(mappedBy = "courseId")
    private Collection<Note> noteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseId")
    private Collection<DepartmentPlan> departmentPlanCollection;
    @JoinColumn(name = "ADDER", referencedColumnName = "USERNAME")
    @ManyToOne
    private Puser adder;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courseId")
    private Collection<CoursesSelected> coursesSelectedCollection;

    public Course() {
    }

    public Course(BigDecimal id) {
        this.id = id;
    }

    public Course(BigDecimal id, String name, BigInteger courseLevel) {
        this.id = id;
        this.name = name;
        this.courseLevel = courseLevel;
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

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    @XmlTransient
    public Collection<Note> getNoteCollection() {
        return noteCollection;
    }

    public void setNoteCollection(Collection<Note> noteCollection) {
        this.noteCollection = noteCollection;
    }

    @XmlTransient
    public Collection<DepartmentPlan> getDepartmentPlanCollection() {
        return departmentPlanCollection;
    }

    public void setDepartmentPlanCollection(Collection<DepartmentPlan> departmentPlanCollection) {
        this.departmentPlanCollection = departmentPlanCollection;
    }

    public Puser getAdder() {
        return adder;
    }

    public void setAdder(Puser adder) {
        this.adder = adder;
    }

    @XmlTransient
    public Collection<CoursesSelected> getCoursesSelectedCollection() {
        return coursesSelectedCollection;
    }

    public void setCoursesSelectedCollection(Collection<CoursesSelected> coursesSelectedCollection) {
        this.coursesSelectedCollection = coursesSelectedCollection;
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

    @XmlTransient
    public Collection<Task> getTaskCollection() {
        return taskCollection;
    }

    public void setTaskCollection(Collection<Task> taskCollection) {
        this.taskCollection = taskCollection;
    }

    @XmlTransient
    public Collection<Event> getEventCollection() {
        return eventCollection;
    }

    public void setEventCollection(Collection<Event> eventCollection) {
        this.eventCollection = eventCollection;
    }
    
}
