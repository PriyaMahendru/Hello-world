package dummy.experiment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** This class is provide basic utility functions on list
 * @author Priya
 *
 */
public class ArrayListExample {

	public  List<Integer> getList() {
		List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		return list;
	}



	/**
	 * @param inputlist given list to split in desired size
	 * @param splitSize
	 * @return
	 */
	public  <T> List<List<T>> splittedList(List<T> inputlist, int splitSize) {
		List<List<T>> listOfLists = new ArrayList<>();
		int inputListSize = inputlist.size();
			for (int start = 0; start < inputListSize; start += splitSize) {
				int end = getEndIndex(splitSize, inputListSize, start);
				List<T> splitList = inputlist.subList(start, end);
				listOfLists.add(splitList);
			}
		return listOfLists;
	}

	
	private  int getEndIndex(int splitSize, int inputListSize, int start) {
		return Math.min(start + splitSize, inputListSize);
	}

	public  void printMe(List<List<Object>> splittedList) {

		System.out.println(splittedList);
	}
}