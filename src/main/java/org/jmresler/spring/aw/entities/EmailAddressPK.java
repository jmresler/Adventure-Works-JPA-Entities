package org.jmresler.spring.aw.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author John
 */
@Embeddable
public class EmailAddressPK implements Serializable {

	private static final long serialVersionUID = -726002148887052820L;

	@Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @Column(name = "EmailAddressID")
    private int emailAddressID;

    public EmailAddressPK() {
    }

    public EmailAddressPK(int businessEntityID, int emailAddressID) {
        this.businessEntityID = businessEntityID;
        this.emailAddressID = emailAddressID;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getEmailAddressID() {
        return emailAddressID;
    }

    public void setEmailAddressID(int emailAddressID) {
        this.emailAddressID = emailAddressID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) businessEntityID;
        hash += (int) emailAddressID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailAddressPK)) {
            return false;
        }
        EmailAddressPK other = (EmailAddressPK) object;
        if (this.businessEntityID != other.businessEntityID) {
            return false;
        }
        if (this.emailAddressID != other.emailAddressID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jmresler.spring.aw.entities.EmailAddressPK[ businessEntityID=" + businessEntityID + ", emailAddressID=" + emailAddressID + " ]";
    }
    
}
