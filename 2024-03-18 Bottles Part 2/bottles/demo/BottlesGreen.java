package bottles.demo;

public class BottlesGreen {

	/**
	 * Print all verses of "99 bottles of beer".
	 */
	public void song(){
		this.verses(99,1);
	}
	
	private void verses(int hi, int lo){		
		for (int i=hi; i>=lo; i--){
			verse(i);
		}
	}
	
	/**
	 * Get the nth verse of "99 bottles of beer".
	 * 
	 * @param n Verse number.
	 * @return Verse.
	 */
	public String verse(int n){
		return	titleCase(formatBottleCount(n)) + " " + getBottlesOfBeer(n) + " on the wall, " +
			formatBottleCount(n) + " " + getBottlesOfBeer(n) + ".\n" +
			titleCase(procurementInstruction(n)) + ", " +
			formatBottleCount(getNextBottleCount(n)) + " " + getBottlesOfBeer(getNextBottleCount(n)) + " on the wall.\n";
	}

	/**
	 * Get the "bottles of beer" part of the song for a certain number of
	 * bottles (of beer).
	 * 
	 * @param numberOfBottles Number of bottles.
	 * @return "bottles of beer" phrase adjusted for quantity
	 */
	private String getBottlesOfBeer(int numberOfBottles) {
		return (numberOfBottles == 1 ? "bottle" : "bottles") + " of beer";
	}

	/**
	 * Get the next number of bottles.
	 * 
	 * @param numberOfBottles Current number of bottles.
	 * @return Next number of bottles.
	 */
	private int getNextBottleCount(int numberOfBottles) {
		if(numberOfBottles == 0) {
			return 99;
		}
		
		return numberOfBottles - 1;
	}

	/**
	 * Format the bottle count as a String.
	 * 
	 * @param numberOfBottles Number of bottles.
	 * @return Number formatted as a String.
	 */
	private String formatBottleCount(int numberOfBottles) {
		if(numberOfBottles == 0) {
			return "no more";
		}

		return Integer.toString(numberOfBottles);
	}

	private String getQuantity(int numberOfBottles) {
		return numberOfBottles > 1 ? "one" : "it";
	}

	private String titleCase(String string) {
		return string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
	}

	private String procurementInstruction(int numberOfBottles) {
		if(numberOfBottles == 0) {
			return "go to the store and buy some more";
		} else {
			return "take " + getQuantity(numberOfBottles) + " down and pass it around";
		}
	}
}
