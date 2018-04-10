package datastructure;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> Students = new ArrayList<>();
		Students.add("jack");
		Students.add("Mike");
		Students.add("Pritom");
		Students.add("Zara");


		for (int i = 0; i < Students.size(); i++) {
			System.out.println(Students.get(i));
		}
	}}

