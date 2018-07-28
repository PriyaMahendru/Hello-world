import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayListExample {

	@Test
	public void testGetList() {
		
		List<Integer> testlist=Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		assertEquals(testlist,ArrayListExample.getList());
		}

	@Test
	public void testSplittedList() {
		List<Integer> testlist=Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		List<ArrayList<Integer>> listOfLists=[[9, 8, 7, 6, 5],[4, 3, 2, 1, 10],[11, 12, 13, 14, 15],[16, 17, 18, 19, 20]];
		assertEquals(listOfLists,ArrayListExample.splittedList(testlist,5));
	}

	
}
