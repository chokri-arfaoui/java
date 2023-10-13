package com.chokri.Savetravels.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="pocketbook")

public class Pocketbook {
//	MEMBER VARIABLES
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotEmpty(message="You need to enter expence name")
	private String expences;
	
	@NotNull(message="You need to enter vender name")
	@NotEmpty
	private String vender;
	
	@NotNull(message="You need to enter an amount")
	private double amount;
	
	@NotNull
	@NotEmpty(message="You need to enter  description")
	private String description;
	
	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
   
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
//	EMPTY CONSTRUCTOR
	public Pocketbook() {};
	
	
	
	
	
	
	
//	GETTERS AND SETTERS
	// other getters and setters removed for brevity
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getExpences() {
		return expences;
	}
	public void setExpences(String expences) {
		this.expences = expences;
	}
	public String getVender() {
		return vender;
	}
	public void setVender(String vender) {
		this.vender = vender;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	 public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

			


	
}
