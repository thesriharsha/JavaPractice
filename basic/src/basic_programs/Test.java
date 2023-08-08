package basic_programs;

class Add
{
	public int sum(int a,int b)
	{
		return a+b;
	}
	public String sum(String a)
	{
		return a;
	}
}

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add t = new Add();
		int x = t.sum(5, 8);
		//int y = t.sum(5, 6, 7);
		System.out.println(x);

		float a = 35/0;
		System.out.println("---------------------");
		System.out.println(a);
	}

}
