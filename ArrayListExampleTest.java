package dummy.experiment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayListExampleTest {
	
	private ArrayListExample arrayListExample=null;

	@Before
	public void setup() {
		arrayListExample=new ArrayListExample();
	}

	@Test
	public void testGetList() {

		List<Integer> inputList = arrayListExample.getList();
		assertNotNull(inputList);

		assertTrue(inputList.size() > 0);
	}
	
	@Test
	public void testPrintMe()
	{
		List<Object> inputList = getInputList(10);
		int splitSize = 5;
		List<List<Object>> splittedList = arrayListExample.splittedList(inputList, splitSize);
		arrayListExample.printMe(splittedList);
	}



	@Test
	public void testSplittedList_String() {
		int expectedInputListSize = 10;
		List<String> inputList = getInputList1(expectedInputListSize);
		int splitSize = 5;
		List<List<String>> splittedList = arrayListExample.splittedList(inputList, splitSize);
		assertNotNull(splittedList);
		assertTrue(splittedList.size() > 0);
		assertNotNull(splittedList.get(0));
		assertEquals("size of first list must be 5", splitSize, splittedList.get(0).size());
		assertEquals("size of splitted list", (int) Math.ceil(expectedInputListSize / splitSize), splittedList.size());

	}

	
	@Test
	public void testSplittedList_Integer() {
		int expectedInputListSize = 10;
		List<Integer> inputList = getInputList1(expectedInputListSize);
		int splitSize = 5;
		List<List<Integer>> splittedList = arrayListExample.splittedList(inputList, splitSize);
		assertNotNull(splittedList);
		assertTrue(splittedList.size() > 0);
		assertNotNull(splittedList.get(0));
		assertEquals("size of first list must be 5", splitSize, splittedList.get(0).size());
		assertEquals("size of splitted list", (int) Math.ceil(expectedInputListSize / splitSize), splittedList.size());

	}

	
	private List<Object> getInputList(int size) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(String.valueOf(i)+"dummy");
		}
		return list;

	}
	
	private <T>List<T> getInputList1(int size) {
		
		List<T> list = new ArrayList<>();
		for (Integer i = 0; i < size; i++) {
			T input=(T)i;
			list.add(input);
		}
		return list;

	}


}
