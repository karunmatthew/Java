package java.misc;

public class DerivedEntry extends Entry {

	private String b;

	@Override
	public void setA(String a) {
		super.setA(a + "_DERIVED");
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getB() {
		return b;

	}
}
