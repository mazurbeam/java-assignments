package com.mazurbeam.overflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
	@GeneratedValue
	private Long id;
	private String question;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "tags_questions",
			joinColumns = @JoinColumn(name="question_id"),
			inverseJoinColumns = @JoinColumn(name="tag_id")
			)
	private List<Tag> tags;
	
	@OneToMany(mappedBy="question", fetch = FetchType.LAZY)
	private List<Answer> answers;
	
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date created_at;
	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updated_at;
	
	public Question() {
		
	}
	
	public Question(String question, List<Tag> tags) {
		this.question = question;
		this.tags = tags;
	}
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
}
