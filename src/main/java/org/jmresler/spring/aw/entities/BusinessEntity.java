package org.jmresler.spring.aw.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author John
 */
@Entity
@Table(name = "BusinessEntity", catalog = "AdventureWorks2017", schema = "Person")

@NamedQueries({
    @NamedQuery(name = "BusinessEntity.findAll", query = "SELECT b FROM BusinessEntity b"),
    @NamedQuery(name = "BusinessEntity.findByBusinessEntityID", query = "SELECT b FROM BusinessEntity b WHERE b.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "BusinessEntity.findByRowguid", query = "SELECT b FROM BusinessEntity b WHERE b.rowguid = :rowguid"),
    @NamedQuery(name = "BusinessEntity.findByModifiedDate", query = "SELECT b FROM BusinessEntity b WHERE b.modifiedDate = :modifiedDate")})
public class BusinessEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    @Basic(optional = false)
    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "businessEntity")
    private Collection<BusinessEntityContact> businessEntityContactCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "businessEntity")
    private Collection<BusinessEntityAddress> businessEntityAddressCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "businessEntity")
    private Person person;

    public BusinessEntity() {
    }

    public BusinessEntity(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public BusinessEntity(Integer businessEntityID, String rowguid, Date modifiedDate) {
        this.businessEntityID = businessEntityID;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Collection<BusinessEntityContact> getBusinessEntityContactCollection() {
        return businessEntityContactCollection;
    }

    public void setBusinessEntityContactCollection(Collection<BusinessEntityContact> businessEntityContactCollection) {
        this.businessEntityContactCollection = businessEntityContactCollection;
    }

    public Collection<BusinessEntityAddress> getBusinessEntityAddressCollection() {
        return businessEntityAddressCollection;
    }

    public void setBusinessEntityAddressCollection(Collection<BusinessEntityAddress> businessEntityAddressCollection) {
        this.businessEntityAddressCollection = businessEntityAddressCollection;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (businessEntityID != null ? businessEntityID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusinessEntity)) {
            return false;
        }
        BusinessEntity other = (BusinessEntity) object;
        if ((this.businessEntityID == null && other.businessEntityID != null) || (this.businessEntityID != null && !this.businessEntityID.equals(other.businessEntityID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jmresler.spring.aw.entities.BusinessEntity[ businessEntityID=" + businessEntityID + " ]";
    }
    
}
