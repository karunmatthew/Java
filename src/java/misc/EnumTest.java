package java.misc;

public class EnumTest {

	public static void main(String[] args) {

		for (Season s : Season.values()) {
			System.out.println(s);
			System.out.println(s.getClass().getName());
		}
		int a = 345_45;
		System.out.println(a);
	}
}

enum Season {
	WINTER(9), SUMMER(7);

	private int value;

	private Season(int value) {
		this.value = value;
	}
}