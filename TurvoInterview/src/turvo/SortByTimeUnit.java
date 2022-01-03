package turvo;

import java.util.Comparator;

public class SortByTimeUnit implements Comparator<Person>{
	public int compare(Person a, Person b) {
		return a.getTimeUnit() - b.getTimeUnit();
	}
}
