package spring_pubs.spring_pubs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class TitleController {
	
	@Autowired
	TitleRepo tr;
	
	@Autowired
	PubRepo pr;
	
	@GetMapping("/title")
	public List<Title> getAll()
	{
		return tr.findAll();
	}
	
	// 1st in titles
	@GetMapping("/titlebyprice/{min}/{max}")
	public List<Title> displayTitlesByPrice(@PathVariable("min") Integer min, @PathVariable("max") Integer max)
	{
		return tr.getBooksByPrice(min, max);
		
	}
	
	//2nd  -- incomplete
	@GetMapping("/titlebyauthor/{id}")
	public List<Title> displayTitlesByAuthor(@PathVariable("id") String id)
	{
		return tr.findByAuid(id);
		
	}
	
	//3rd 
	@PutMapping("/updateprice/{id}/{newprice}")
	public Title updatePrice(@PathVariable("id") String id, @PathVariable("newprice") double newprice)
	{
		var t = tr.findById(id);
		if(t.isPresent())
		{
			var title = t.get();
			title.setPrice(newprice);
			tr.save(title);
			return title;
		}
		else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Title not found with given ID");
	}
	
	//4th inc
	@GetMapping("/top5sales")
	public Page<Title> getTitles()
	{
		return tr.findAll(PageRequest.of(0, 5,Sort.by("ytd"))) ;
				
	}
	
	//5th
	
	@GetMapping("/titlebytype")
	public List<Title> getTitlesOfType(@RequestParam("type")String type)
	{
		return tr.getTitleByType(type);
	}
	//6th 
	@GetMapping("/titleByCity")
	public List<Title> getTitleByCity(@RequestParam("city")String city)
	{
		return pr.findByCity(city).getTitle();
	}
	
	
}
