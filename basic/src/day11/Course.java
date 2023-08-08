package day11;

import java.util.HashSet;

public class Course {
	
	private String title;
	private int price;
	public Course(String title,int price)
	{
		this.title= title;
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet<Course>(); 
		Course c[] = {
				new Course("java",12000), new Course("python",8000),new Course("c++",9000)
				,new Course("java",12000)
		};
		for(var course: c)
		{
			set.add(course.title+" costs "+course.price);
		}
		System.out.println(set);

	}

}
