package dummy.experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListCount {


	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(9, 8, 9, 9, 6, 9, 8, 9, 7);

		List<List<Integer>> groupedList = countGroupByItem(list);
		printSummary(groupedList);

		 

	}

	private static void printSummary(List<List<Integer>> groupedList) {
		for (List<Integer> itemList : groupedList) {

			System.out.println(String.format("The count of item [%s] is [%s]", itemList.get(0), itemList.size()));

		}

	}

	private static List<List<Integer>> countGroupByItem(List<Integer> list) {

		if (!Objects.isNull(list) && !list.isEmpty()) { // list != null
			Collections.sort(list);
			System.out.println(list);
			List<List<Integer>> groupedList = new ArrayList<>();
			List<Integer> itemList = null;

			for (Integer item : list) {

				if (itemList == null) {
					itemList = new ArrayList<>();
					// itemList.add(item);
				} else {
					if (!itemList.contains(item)) {

						groupedList.add(itemList);
						itemList = new ArrayList<>();
						// itemList.add(item);
					}
				}

				itemList.add(item);

			}
			// System.out.println(itemList);
			groupedList.add(itemList);
			// System.out.println(groupedList);

			return groupedList;

		}
		return Collections.emptyList();
		// TODO Auto-generated method stub

	}

}
