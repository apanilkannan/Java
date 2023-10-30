package com.many.demo.DTO;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Entity
@Table(name = "company")
public class CompanyDTO {
    @Id
    @GenericGenerator(name="ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
    private int companyId;
    private String companyName;
    private String companyDescription;

    @ManyToMany
    @JoinTable(
        name = "company_product", 
        joinColumns = @JoinColumn(name = "company_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<ProductDTO> products;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public Set<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(Set<ProductDTO> products) {
		this.products = products;
	}
    
}