/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jamalahmed
 */
@Entity
@Table(name = "uuid")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uuid.findAll", query = "SELECT u FROM Uuid u"),
    @NamedQuery(name = "Uuid.findById", query = "SELECT u FROM Uuid u WHERE u.id = :id"),
    @NamedQuery(name = "Uuid.findByUuid", query = "SELECT u FROM Uuid u WHERE u.uuid = :uuid")})
public class Uuid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "uuid")
    private String uuid;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User_1 userId;

    public Uuid() {
    }

    public Uuid(Integer id) {
        this.id = id;
    }

    public Uuid(Integer id, String uuid) {
        this.id = id;
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public User_1 getUserId() {
        return userId;
    }

    public void setUserId(User_1 userId) {
        this.userId = userId;
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
        if (!(object instanceof Uuid)) {
            return false;
        }
        Uuid other = (Uuid) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Uuid[ id=" + id + " ]";
    }
    
}
