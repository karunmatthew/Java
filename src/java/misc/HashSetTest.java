package java.misc;

import java.util.HashSet;

public class HashSetTest {
	
public static void main(String[] args) {
	
	HashSet set = new HashSet();
	
	Entry entry = new Entry();
	entry.setA("abc");
	
	set.add(entry);
	
	Entry entry1 = new Entry();
	entry1.setA("cccc");
	
	set.add(entry1);
	
	Entry entry2 = new Entry();
	entry2.setA("bbb");
	
	set.add(entry2);
	
	Entry entry3 = new Entry();
	entry3.setA("abc");
	
	set.add(entry3);
	
	
	DerivedEntry entry_derived = new DerivedEntry();
	entry_derived.setA("abc");
	
	set.add(entry_derived);
	
	System.out.println(set);
	
	
}
}
