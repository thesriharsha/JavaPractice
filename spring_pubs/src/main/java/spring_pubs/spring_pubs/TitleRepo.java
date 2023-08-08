package spring_pubs.spring_pubs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface TitleRepo extends JpaRepository<Title, String>{

	@Query("from Title where price>:min and price<:max")
	List<Title>getBooksByPrice(@Param("min") Integer min, @Param("max") Integer max);
	
	@Query("from Title where authors.id= :auid")
	List<Title> findByAuid(@Param("id") String id);
	
	@Query("from Title where type=:type")
	List<Title> getTitleByType(@Param("type")String type);

}
