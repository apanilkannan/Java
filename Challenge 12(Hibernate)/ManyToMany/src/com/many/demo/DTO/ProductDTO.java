package com.many.demo.DTO;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Entity
@Table(name = "product")
public class ProductDTO {
    @Id
    @GenericGenerator(name="ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
    private int productId;
    private String productName;
    private String productDescription;

    @ManyToMany(mappedBy = "products")
    private Set<CompanyDTO> companies;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Set<CompanyDTO> getCompanies() {
		return companies;
	}

	public void setCompanies(Set<CompanyDTO> companies) {
		this.companies = companies;
	}
    
}

