import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static List<Integer> getList() {
		List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		return list;
	}

	public static List<ArrayList<Integer>> splittedList(List<Integer> getlist, int splitSize) {

		List<Integer> list = getlist;
		List<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();

		if (splitSize <= list.size()) {
			for (int start = 0; start < list.size(); start += splitSize) {
				int end = Math.min(start + splitSize, list.size());
				List<Integer> splitList = list.subList(start, end);
				listOfLists.add((ArrayList<Integer>) splitList);
			}
		}
		return listOfLists;
	}

	public static void printMe(List<ArrayList<Integer>> sublists) {

		for (int i = 0; i < sublists.size(); i++) {
			for (int j = 0; j < sublists.get(i).size(); j++) {
				System.out.println(sublists.get(i).get(j));
			}
			System.out.println("next list");
		}
	}
}