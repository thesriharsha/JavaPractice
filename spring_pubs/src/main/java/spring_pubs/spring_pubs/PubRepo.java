package spring_pubs.spring_pubs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PubRepo extends JpaRepository<Publisher, Integer>{
	
	Publisher findByCity(String city);

}