package day2;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projects_1")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;
	
	@Column(name="title")
	private String title;

	@Embedded
	private Client client;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return this.project_id;
	}

	@Override
	public boolean equals(Object obj) {
		Project other = (Project) obj;
		return project_id == other.project_id ;
	}

	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", title=" + title + "]";
	}
	
	
}
