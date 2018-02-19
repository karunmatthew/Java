package java.misc;

public class Entry {

	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Entry [a=" + a + "] "+this.getClass().getName();
	}

	public int hashCode() {
		return (a.length());

	}

	@Override
	public boolean equals(Object o) {

		Entry newEntry = (Entry) o;

		if (newEntry.getA().equals(this.a)&& this.getClass().getName().equals(newEntry.getClass().getName()))
			return true;
		return false;
	}

}
