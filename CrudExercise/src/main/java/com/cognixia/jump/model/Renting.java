package com.cognixia.jump.model;

import javax.persistence.*;

@Entity
public class Renting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "varchar(100)")
	private String make;
	
	@Column(columnDefinition = "varchar(100)")
	private String model;
	
	@Column(columnDefinition = "varchar(100) DEFAULT '20XX'")
	private String year;
	
	@Column(columnDefinition = "varchar(100)")
	private String color;
	
	@Column(columnDefinition = "varchar(100) DEFAULT '1000'")
	private String mileage;
	
	@Column(columnDefinition = "bit(1) DEFAULT false")
	private Boolean accident;
	
	@Column(name = "preowned", columnDefinition = "bit(1) DEFAULT true")
	private Boolean preOwned;
	
	public Renting() {
	
	}
	
	public Renting(Integer id, String make, String model, String year, String color) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public Boolean getAccident() {
		return accident;
	}

	public void setAccident(Boolean accident) {
		this.accident = accident;
	}

	public Boolean getPreOwned() {
		return preOwned;
	}

	public void setPreOwned(Boolean preOwned) {
		this.preOwned = preOwned;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", mileage=" + mileage + ", accident=" + accident + ", preOwned=" + preOwned + "]";
	}

	
	
}