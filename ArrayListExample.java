import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the total number of elements :");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		int size=reader.nextInt();
		for(int i=0;i<n;i++)
		{
		list.add(reader.nextInt());
		}
		reader.close();
		if(size<=n)
		{
        for (int start = 0; start < list.size();start+=size)
	        {
        	int end=Math.min(start+size,list.size());
        	List<Integer>sublist=list.subList(start, end);
    		System.out.println(sublist);
	        }	
		}
		else
		{System.out.println("enter the no. of subelements less than the total no.of elements");
	}
	}
}

