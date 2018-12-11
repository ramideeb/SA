/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rami
 */
@Entity
@Table(name = "PUSER", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puser.findAll", query = "SELECT p FROM Puser p")
    , @NamedQuery(name = "Puser.findByUsername", query = "SELECT p FROM Puser p WHERE p.username = :username")
    , @NamedQuery(name = "Puser.findByFname", query = "SELECT p FROM Puser p WHERE p.fname = :fname")
    , @NamedQuery(name = "Puser.findByLname", query = "SELECT p FROM Puser p WHERE p.lname = :lname")
    , @NamedQuery(name = "Puser.findByGender", query = "SELECT p FROM Puser p WHERE p.gender = :gender")
    , @NamedQuery(name = "Puser.findByBirthdate", query = "SELECT p FROM Puser p WHERE p.birthdate = :birthdate")
    , @NamedQuery(name = "Puser.findByPassword", query = "SELECT p FROM Puser p WHERE p.password = :password")
    , @NamedQuery(name = "Puser.findByType", query = "SELECT p FROM Puser p WHERE p.type = :type")
    , @NamedQuery(name = "Puser.findByClass1", query = "SELECT p FROM Puser p WHERE p.class1 = :class1")
    , @NamedQuery(name = "Puser.findByUniName", query = "SELECT p FROM Puser p WHERE p.uniName = :uniName")
    , @NamedQuery(name = "Puser.findByUniId", query = "SELECT p FROM Puser p WHERE p.uniId = :uniId")
    , @NamedQuery(name = "Puser.findByJobTitle", query = "SELECT p FROM Puser p WHERE p.jobTitle = :jobTitle")
    , @NamedQuery(name = "Puser.findByUnivirsity", query = "SELECT p FROM Puser p WHERE p.univirsity = :univirsity")
    , @NamedQuery(name = "Puser.findByEmail", query = "SELECT p FROM Puser p WHERE p.email = :email")})
public class Puser implements Serializable {

    @Column(name = "VERIFIED")
    private BigInteger verified;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME", nullable = false, length = 20)
    private String username;
    @Basic(optional = false)
    @Column(name = "FNAME", nullable = false, length = 20)
    private String fname;
    @Basic(optional = false)
    @Column(name = "LNAME", nullable = false, length = 20)
    private String lname;
    @Basic(optional = false)
    @Column(name = "GENDER", nullable = false)
    private Character gender;
    @Basic(optional = false)
    @Column(name = "BIRTHDATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthdate;
    @Basic(optional = false)
    @Column(name = "PASSWORD", nullable = false, length = 20)
    private String password;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false, length = 25)
    private String type;
    @Column(name = "CLASS", length = 20)
    private String class1;
    @Column(name = "UNI_NAME", length = 20)
    private String uniName;
    @Column(name = "UNI_ID", length = 20)
    private String uniId;
    @Column(name = "JOB_TITLE", length = 20)
    private String jobTitle;
    @Column(name = "UNIVIRSITY", length = 20)
    private String univirsity;
    @Column(name = "EMAIL", length = 100)
    private String email;
    @OneToMany(mappedBy = "username")
    private Collection<Task> taskCollection;
    @JoinColumn(name = "DEPARTMENT", referencedColumnName = "NAME")
    @ManyToOne
    private Department department;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Note> noteCollection;
    @OneToMany(mappedBy = "adder")
    private Collection<Course> courseCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sUsername")
    private Collection<CoursesSelected> coursesSelectedCollection;
    @OneToMany(mappedBy = "username")
    private Collection<Event> eventCollection;

    public Puser() {
    }

    public Puser(String username) {
        this.username = username;
    }

    public Puser(String username, String fname, String lname, Character gender, Date birthdate, String password, String type) {
        this.username = username;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.password = password;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getUniId() {
        return uniId;
    }

    public void setUniId(String uniId) {
        this.uniId = uniId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getUnivirsity() {
        return univirsity;
    }

    public void setUnivirsity(String univirsity) {
        this.univirsity = univirsity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Task> getTaskCollection() {
        return taskCollection;
    }

    public void setTaskCollection(Collection<Task> taskCollection) {
        this.taskCollection = taskCollection;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @XmlTransient
    public Collection<Note> getNoteCollection() {
        return noteCollection;
    }

    public void setNoteCollection(Collection<Note> noteCollection) {
        this.noteCollection = noteCollection;
    }

    @XmlTransient
    public Collection<Course> getCourseCollection() {
        return courseCollection;
    }

    public void setCourseCollection(Collection<Course> courseCollection) {
        this.courseCollection = courseCollection;
    }

    @XmlTransient
    public Collection<CoursesSelected> getCoursesSelectedCollection() {
        return coursesSelectedCollection;
    }

    public void setCoursesSelectedCollection(Collection<CoursesSelected> coursesSelectedCollection) {
        this.coursesSelectedCollection = coursesSelectedCollection;
    }

    @XmlTransient
    public Collection<Event> getEventCollection() {
        return eventCollection;
    }

    public void setEventCollection(Collection<Event> eventCollection) {
        this.eventCollection = eventCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puser)) {
            return false;
        }
        Puser other = (Puser) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Puser[ username=" + username + " ]";
    }

    public BigInteger getVerified() {
        return verified;
    }

    public void setVerified(BigInteger verified) {
        this.verified = verified;
    }
    
}
