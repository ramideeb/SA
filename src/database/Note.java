/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rami
 */
@Entity
@Table(name = "NOTE", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Note.findAll", query = "SELECT n FROM Note n")
    , @NamedQuery(name = "Note.findByNoteId", query = "SELECT n FROM Note n WHERE n.noteId = :noteId")
    , @NamedQuery(name = "Note.findByName", query = "SELECT n FROM Note n WHERE n.name = :name")
    , @NamedQuery(name = "Note.findByType", query = "SELECT n FROM Note n WHERE n.type = :type")
    , @NamedQuery(name = "Note.findByTimeAdded", query = "SELECT n FROM Note n WHERE n.timeAdded = :timeAdded")
    , @NamedQuery(name = "Note.findByPath", query = "SELECT n FROM Note n WHERE n.path = :path")
    , @NamedQuery(name = "Note.findByText", query = "SELECT n FROM Note n WHERE n.text = :text")})
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NOTE_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal noteId;
    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "TYPE", length = 20)
    private String type;
    @Column(name = "TIME_ADDED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeAdded;
    @Column(name = "PATH", length = 100)
    private String path;
    @Column(name = "TEXT", length = 500)
    private String text;
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
    @ManyToOne
    private Course courseId;
    @JoinColumn(name = "USERNAME", referencedColumnName = "USERNAME", nullable = false)
    @ManyToOne(optional = false)
    private Puser username;

    public Note() {
    }

    public Note(BigDecimal noteId) {
        this.noteId = noteId;
    }

    public BigDecimal getNoteId() {
        return noteId;
    }

    public void setNoteId(BigDecimal noteId) {
        this.noteId = noteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Date timeAdded) {
        this.timeAdded = timeAdded;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    public Puser getUsername() {
        return username;
    }

    public void setUsername(Puser username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noteId != null ? noteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.noteId == null && other.noteId != null) || (this.noteId != null && !this.noteId.equals(other.noteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Note[ noteId=" + noteId + " ]";
    }
    
}
