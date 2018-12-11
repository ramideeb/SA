/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "COURSES_SELECTED", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoursesSelected.findAll", query = "SELECT c FROM CoursesSelected c")
    , @NamedQuery(name = "CoursesSelected.findBySeq", query = "SELECT c FROM CoursesSelected c WHERE c.seq = :seq")})
public class CoursesSelected implements Serializable {

    @Column(name = "DOWNLOADED")
    private BigInteger downloaded;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEQ", nullable = false, length = 20)
    private String seq;
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Course courseId;
    @JoinColumn(name = "S_USERNAME", referencedColumnName = "USERNAME", nullable = false)
    @ManyToOne(optional = false)
    private Puser sUsername;

    public CoursesSelected(String seq,Course course,Puser user) {
        this.seq=seq;
        this.courseId=course;
        this.sUsername=user;
    }

       public CoursesSelected( ) {
           
    }
 
    public CoursesSelected(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    public Puser getSUsername() {
        return sUsername;
    }

    public void setSUsername(Puser sUsername) {
        this.sUsername = sUsername;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoursesSelected)) {
            return false;
        }
        CoursesSelected other = (CoursesSelected) object;
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.CoursesSelected[ seq=" + seq + " ]";
    }

    public BigInteger getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(BigInteger downloaded) {
        this.downloaded = downloaded;
    }
    
}
