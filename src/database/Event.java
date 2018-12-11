/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "EVENT", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
    , @NamedQuery(name = "Event.findByEid", query = "SELECT e FROM Event e WHERE e.eid = :eid")
    , @NamedQuery(name = "Event.findByName", query = "SELECT e FROM Event e WHERE e.name = :name")
    , @NamedQuery(name = "Event.findByDescription", query = "SELECT e FROM Event e WHERE e.description = :description")
    , @NamedQuery(name = "Event.findByTime", query = "SELECT e FROM Event e WHERE e.time = :time")
    , @NamedQuery(name = "Event.findByNF", query = "SELECT e FROM Event e WHERE e.nF = :nF")
    , @NamedQuery(name = "Event.findByNTime", query = "SELECT e FROM Event e WHERE e.nTime = :nTime")})
public class Event implements Serializable {

    @JoinColumn(name = "COURSE", referencedColumnName = "ID")
    @ManyToOne
    private Course course;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EID", nullable = false, length = 20)
    private String eid;
    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "DESCRIPTION", length = 20)
    private String description;
    @Column(name = "TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @Column(name = "N_F")
    private BigInteger nF;
    @Column(name = "N_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nTime;
    @JoinColumn(name = "USERNAME", referencedColumnName = "USERNAME")
    @ManyToOne
    private Puser username;

    public Event() {
    }

    public Event(String eid) {
        this.eid = eid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigInteger getNF() {
        return nF;
    }

    public void setNF(BigInteger nF) {
        this.nF = nF;
    }

    public Date getNTime() {
        return nTime;
    }

    public void setNTime(Date nTime) {
        this.nTime = nTime;
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
        hash += (eid != null ? eid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eid == null && other.eid != null) || (this.eid != null && !this.eid.equals(other.eid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Event[ eid=" + eid + " ]";
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
}
