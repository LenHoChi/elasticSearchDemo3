package com.example.elactisSearchDemoDB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foods", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Foods {
	@Id
	@Column(name= "id")
	@NonNull
	private String id;

	@Column(name="name")
	private String name;

	@Column(name="price")
	private Float price;

	@Column(name="quantity")
	private Integer quantity;

	@Column(name = "category")
	private String category;

	@Column(name = "description")
	private String description;

	@Column(name="manufacturer")
	private String manufacturer;
}
