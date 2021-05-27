package com.serosoft;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="address")
public class AddressDemo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="add_id")
	private Long  id;
	private String Street;
	private String city ;
	private String country;
	private Boolean  isopen;
	
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Lob
	private byte[] image;
	
	public AddressDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressDemo(Long id, String street, String city, String country, Boolean isopen, Date addDate, byte[] image) {
		super();
		this.id = id;
		Street = street;
		this.city = city;
		this.country = country;
		this.isopen = isopen;
		this.addDate = addDate;
		this.image = image;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Boolean getIsopen() {
		return isopen;
	}
	public void setIsopen(Boolean isopen) {
		this.isopen = isopen;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	
	
	
	
}
