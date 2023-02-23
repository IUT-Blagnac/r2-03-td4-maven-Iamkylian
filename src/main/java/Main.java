public class Main {

	public static void main(String[] args) {
		Pile maPile = new Pile(10);
		if (!maPile.est_vide()) System.out.println("NOK");

		try {
			maPile.empiler(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (maPile.est_vide()) System.out.println("NOK");

		int element;
		try {
			element = maPile.depiler();

			if (!maPile.est_vide()) System.out.println("NOK");
			if (element != 5) System.out.println("NOK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
