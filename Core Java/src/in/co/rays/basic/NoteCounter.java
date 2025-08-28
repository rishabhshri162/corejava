package in.co.rays.basic;

public class NoteCounter {
	public static void main(String[] args) {
		int[] notes = { 1000, 500, 200, 100 };

		int money = 56900;
		int count = 0;

		for (int note : notes) {
			count = money / note;
			money = money % note;
			
			System.out.println(note + "=" + count);

		}

	}
}