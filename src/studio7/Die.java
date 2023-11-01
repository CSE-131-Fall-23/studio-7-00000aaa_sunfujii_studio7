package studio7;


/**
 * Die
 * 
 * When a Die is constructed it is specified to have n number of sides.
 * Each time the die is thrown, a random integer is returned in the range [1.. n],
 * inclusive.
 * 
 * @param number of sides
 * @return die roll result
 */

public class Die {
	
	private int sides;
	
	public Die (int n) {
		sides = n;
	}
	

	public int getSides() {
		return sides;
	}
	
	public int Roll() {
		return (int)(Math.random() * this.sides);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(10);
		System.out.println(d1.Roll());
	}

}
