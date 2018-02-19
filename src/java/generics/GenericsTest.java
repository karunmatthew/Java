package java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest<T> {

	List<T> list;

	T add(List<T> list) {

		for (T t : list) {
			return t;
		}

		return null;

	}

	T get(List<T> list) {

		for (T t : list) {
			return t;
		}

		return null;

	}

	public static void main(String args[]) {

		List<Entry> entryList = new ArrayList<Entry>();

		List<DerivedEntry> derivedEntries = new ArrayList<DerivedEntry>();

		DerivedEntry derivedEntry = new DerivedEntry();
		derivedEntry.setA("AAAA");
		derivedEntries.add(derivedEntry);
		entryList.add(derivedEntry);

		OtherEntry otherEntry = new OtherEntry();
		otherEntry.setA("BBBB");
		entryList.add(otherEntry);

		Entry entry = new Entry();
		entry.setA("DDDD");
		entryList.add(entry);

		process(entryList);
		process123(entryList);
		Integer intValue = new Integer(78);
		unprocess(intValue);

	}

	// ERROR CODE
	void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
		// Number temp = l1.get(0);
		// l1.set(0, l2.get(0)); // expected a CAP#1 extends Number,
		// got a CAP#2 extends Number;
		// same bound, but different types
		// l2.set(0, temp); // expected a CAP#1 extends Number,
		// got a Number
	}

	static void unprocess(Number object) {

	}

	static void process(List<? extends Entry> list) {

		System.out.println(list.get(1));
	}

	static void process123(List<? super Entry> list) {

		System.out.println(list.get(0));
	}

}
