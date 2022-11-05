package com.Restaurant.Application.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.Restaurant.Application.AppConstant.AppConstant;

@Entity
@Table(name=AppConstant.restaurant)
public class RestaurantEntity implements Serializable {
	
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto" )
	@Id
	@Column(name="Id")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Type")
	private String type;
	
	@Column(name="average_price")
	private Double avgPrice;
	
	@Column(name="Rating")
	private String rating;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Contact")
	private String contactNum;
	
	
	
	//getter and setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	@Override
	public String toString() {
		return "RestaurantEntity [id=" + id + ", name=" + name + ", type=" + type + ", avgPrice=" + avgPrice
				+ ", rating=" + rating + ", city=" + city + ", contactNum=" + contactNum + "]";
	}

	
}
