package org.jmresler.spring.aw.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "vSalesPerson", catalog = "AdventureWorks2017", schema = "Sales")

@NamedQueries({
    @NamedQuery(name = "VSalesPerson.findAll", query = "SELECT v FROM VSalesPerson v"),
    @NamedQuery(name = "VSalesPerson.findByBusinessEntityID", query = "SELECT v FROM VSalesPerson v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "VSalesPerson.findByTitle", query = "SELECT v FROM VSalesPerson v WHERE v.title = :title"),
    @NamedQuery(name = "VSalesPerson.findBySuffix", query = "SELECT v FROM VSalesPerson v WHERE v.suffix = :suffix"),
    @NamedQuery(name = "VSalesPerson.findByJobTitle", query = "SELECT v FROM VSalesPerson v WHERE v.jobTitle = :jobTitle"),
    @NamedQuery(name = "VSalesPerson.findByEmailAddress", query = "SELECT v FROM VSalesPerson v WHERE v.emailAddress = :emailAddress"),
    @NamedQuery(name = "VSalesPerson.findByEmailPromotion", query = "SELECT v FROM VSalesPerson v WHERE v.emailPromotion = :emailPromotion"),
    @NamedQuery(name = "VSalesPerson.findByAddressLine1", query = "SELECT v FROM VSalesPerson v WHERE v.addressLine1 = :addressLine1"),
    @NamedQuery(name = "VSalesPerson.findByAddressLine2", query = "SELECT v FROM VSalesPerson v WHERE v.addressLine2 = :addressLine2"),
    @NamedQuery(name = "VSalesPerson.findByCity", query = "SELECT v FROM VSalesPerson v WHERE v.city = :city"),
    @NamedQuery(name = "VSalesPerson.findByPostalCode", query = "SELECT v FROM VSalesPerson v WHERE v.postalCode = :postalCode"),
    @NamedQuery(name = "VSalesPerson.findByTerritoryGroup", query = "SELECT v FROM VSalesPerson v WHERE v.territoryGroup = :territoryGroup"),
    @NamedQuery(name = "VSalesPerson.findBySalesQuota", query = "SELECT v FROM VSalesPerson v WHERE v.salesQuota = :salesQuota"),
    @NamedQuery(name = "VSalesPerson.findBySalesYTD", query = "SELECT v FROM VSalesPerson v WHERE v.salesYTD = :salesYTD"),
    @NamedQuery(name = "VSalesPerson.findBySalesLastYear", query = "SELECT v FROM VSalesPerson v WHERE v.salesLastYear = :salesLastYear")})
public class VSalesPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Column(name = "Title")
    private String title;
    @Column(name = "Suffix")
    private String suffix;
    @Basic(optional = false)
    @Column(name = "JobTitle")
    private String jobTitle;
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "EmailPromotion")
    private int emailPromotion;
    @Basic(optional = false)
    @Column(name = "AddressLine1")
    private String addressLine1;
    @Column(name = "AddressLine2")
    private String addressLine2;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "PostalCode")
    private String postalCode;
    @Column(name = "TerritoryGroup")
    private String territoryGroup;
    @Column(name = "SalesQuota")
    private BigDecimal salesQuota;
    @Basic(optional = false)
    @Column(name = "SalesYTD")
    private BigDecimal salesYTD;
    @Basic(optional = false)
    @Column(name = "SalesLastYear")
    private BigDecimal salesLastYear;

    public VSalesPerson() {
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getEmailPromotion() {
        return emailPromotion;
    }

    public void setEmailPromotion(int emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritoryGroup() {
        return territoryGroup;
    }

    public void setTerritoryGroup(String territoryGroup) {
        this.territoryGroup = territoryGroup;
    }

    public BigDecimal getSalesQuota() {
        return salesQuota;
    }

    public void setSalesQuota(BigDecimal salesQuota) {
        this.salesQuota = salesQuota;
    }

    public BigDecimal getSalesYTD() {
        return salesYTD;
    }

    public void setSalesYTD(BigDecimal salesYTD) {
        this.salesYTD = salesYTD;
    }

    public BigDecimal getSalesLastYear() {
        return salesLastYear;
    }

    public void setSalesLastYear(BigDecimal salesLastYear) {
        this.salesLastYear = salesLastYear;
    }

	@Override
	public int hashCode() {
		return Objects.hash(addressLine1, addressLine2, businessEntityID, city, emailAddress, emailPromotion, jobTitle,
				postalCode, salesLastYear, salesQuota, salesYTD, suffix, territoryGroup, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VSalesPerson other = (VSalesPerson) obj;
		return Objects.equals(addressLine1, other.addressLine1) && Objects.equals(addressLine2, other.addressLine2)
				&& businessEntityID == other.businessEntityID && Objects.equals(city, other.city)
				&& Objects.equals(emailAddress, other.emailAddress) && emailPromotion == other.emailPromotion
				&& Objects.equals(jobTitle, other.jobTitle) && Objects.equals(postalCode, other.postalCode)
				&& Objects.equals(salesLastYear, other.salesLastYear) && Objects.equals(salesQuota, other.salesQuota)
				&& Objects.equals(salesYTD, other.salesYTD) && Objects.equals(suffix, other.suffix)
				&& Objects.equals(territoryGroup, other.territoryGroup) && Objects.equals(title, other.title);
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VSalesPerson [businessEntityID=")
				.append(businessEntityID)
				.append(", title=")
				.append(title)
				.append(", suffix=")
				.append(suffix)
				.append(", jobTitle=")
				.append(jobTitle)
				.append(", emailAddress=")
				.append(emailAddress)
				.append(", emailPromotion=")
				.append(emailPromotion)
				.append(", addressLine1=")
				.append(addressLine1)
				.append(", addressLine2=")
				.append(addressLine2)
				.append(", city=")
				.append(city)
				.append(", postalCode=")
				.append(postalCode)
				.append(", territoryGroup=")
				.append(territoryGroup)
				.append(", salesQuota=")
				.append(salesQuota)
				.append(", salesYTD=")
				.append(salesYTD)
				.append(", salesLastYear=")
				.append(salesLastYear)
				.append("]");
		return builder.toString();
	}
 
    
}
