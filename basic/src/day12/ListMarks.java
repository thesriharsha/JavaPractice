package day12;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class ListMarks {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("/home/developer/files/marks.dat", "r");
		raf.seek(0);
		int count = (int)raf.length()/4;
		for(int i=0;i<count;i++)
		{
			System.out.print(raf.readInt()+" ");
		}
	}

}
