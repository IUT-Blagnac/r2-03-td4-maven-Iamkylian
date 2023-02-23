public class Pile {

	private int[] elements;
	private int sommet;
	
	public Pile(int i) {
		this.elements = new int[i];
		this.sommet = -1;
	}

	public boolean est_vide() {
		if(sommet == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void empiler(int i) throws Exception {
		if(sommet == elements.length-1) {
			throw new Exception("La pile est pleine");
		}
		sommet ++;
		elements[sommet] = i;
		
	}

	public int depiler() throws Exception {
		if(est_vide()) {
			throw new Exception("La pile est vide");
		}
		sommet--;
		return elements[sommet+1];
	}
	
	public int sommet() throws Exception {
		if(est_vide()) {
			throw new Exception("La pile est vide");
		}
		return elements[sommet];
	}

	public void vider() {
		sommet = 0;
	}
	

}
