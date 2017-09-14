package com.mazurbeam.overflow.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tags")
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String subject;
	
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date created_at;
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updated_at;
	
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
