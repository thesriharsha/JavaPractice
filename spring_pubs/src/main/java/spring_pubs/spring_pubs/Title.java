package spring_pubs.spring_pubs;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity(name = "Title")
@Table(name = "titles")
public class Title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "title_id")
	private String id;

	@Column(name = "title")
	private String title;
	
	@Column(name = "price")
	private Double price;
	@Column(name="ytd_sales")
	private Integer ytd;
	
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getYtd_sales() {
		return ytd;
	}

	public void setYtd_sales(Integer ytd_sales) {
		this.ytd = ytd_sales;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@ManyToMany
	@JsonIgnore
	@JoinTable(
			  name = "titleauthor", 
			  joinColumns = @JoinColumn(name = "title_id"), 
			  inverseJoinColumns = @JoinColumn(name = "au_id"))
    Set<Author> authors;
	

	public Set<Author> getAuthors() {
		return authors;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %f", this.id, this.title, this.price);
	}

}