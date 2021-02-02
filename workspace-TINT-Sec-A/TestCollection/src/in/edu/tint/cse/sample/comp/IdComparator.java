package in.edu.tint.cse.sample.comp;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.id == o2.id)
			return 0;
		else if (o1.id > o2.id)
			return 1;
		else
			return -1;
	}

}
