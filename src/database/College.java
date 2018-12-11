/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "COLLEGE", catalog = "", schema = "RAMI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "College.findAll", query = "SELECT c FROM College c")
    , @NamedQuery(name = "College.findByCid", query = "SELECT c FROM College c WHERE c.cid = :cid")
    , @NamedQuery(name = "College.findByCname", query = "SELECT c FROM College c WHERE c.cname = :cname")})
public class College implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CID", nullable = false, length = 20)
    private String cid;
    @Column(name = "CNAME", length = 20)
    private String cname;
    @OneToMany(mappedBy = "collegeId")
    private Collection<Department> departmentCollection;

    public College() {
    }

    public College(String cid) {
        this.cid = cid;
    }

    public College(String bigDecimal, String text) {
this.cid=bigDecimal;
this.cname=text;


    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @XmlTransient
    public Collection<Department> getDepartmentCollection() {
        return departmentCollection;
    }

    public void setDepartmentCollection(Collection<Department> departmentCollection) {
        this.departmentCollection = departmentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof College)) {
            return false;
        }
        College other = (College) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.College[ cid=" + cid + " ]";
    }
    
}
