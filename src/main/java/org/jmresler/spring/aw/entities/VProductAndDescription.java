package org.jmresler.spring.aw.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author John
 */
@Entity
@Table(name = "vProductAndDescription", catalog = "AdventureWorks2017", schema = "Production")

@NamedQueries({
    @NamedQuery(name = "VProductAndDescription.findAll", query = "SELECT v FROM VProductAndDescription v"),
    @NamedQuery(name = "VProductAndDescription.findByProductID", query = "SELECT v FROM VProductAndDescription v WHERE v.productID = :productID"),
    @NamedQuery(name = "VProductAndDescription.findByCultureID", query = "SELECT v FROM VProductAndDescription v WHERE v.cultureID = :cultureID"),
    @NamedQuery(name = "VProductAndDescription.findByDescription", query = "SELECT v FROM VProductAndDescription v WHERE v.description = :description")})
public class VProductAndDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @Column(name = "CultureID")
    private String cultureID;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public VProductAndDescription() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getCultureID() {
        return cultureID;
    }

    public void setCultureID(String cultureID) {
        this.cultureID = cultureID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	@Override
	public int hashCode() {
		return Objects.hash(cultureID, description, productID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VProductAndDescription other = (VProductAndDescription) obj;
		return Objects.equals(cultureID, other.cultureID) && Objects.equals(description, other.description)
				&& productID == other.productID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VProductAndDescription [productID=")
				.append(productID)
				.append(", cultureID=")
				.append(cultureID)
				.append(", description=")
				.append(description)
				.append("]");
		return builder.toString();
	}
    
	
    
}
