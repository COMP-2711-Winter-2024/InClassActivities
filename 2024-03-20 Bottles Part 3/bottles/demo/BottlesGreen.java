package bottles.demo;

public class BottlesGreen {

	private ContainerNumber number;

	public BottlesGreen(ContainerNumber number) {
		this.number = number;
	}

	/**
	 * Print all verses of "99 bottles of beer".
	 */
	public void song(){
		this.verses(99,1);
	}
	
	/**
	 * Get the nth verse of "99 bottles of beer".
	 * 
	 * @param n Verse number.
	 * @return Verse.
	 */
	public String verse(int n){

		return	capitalize(getQuantity(n)) + " " + getContainers(n) + " on the wall, " +
			getQuantity(n) + " " + getContainers(n) + ".\n" +
			capitalize(procurementInstruction(n)) + ", " +
			getQuantity(getSuccessor(n)) + " " + getContainers(getSuccessor(n)) + " on the wall.\n";
	}
	
	private void verses(int hi, int lo){		
		for (int i=hi; i>=lo; i--){
			verse(i);
		}
	}

	/**
	 * Get the "bottles of beer" part of the song for a certain number of
	 * bottles (of beer).
	 * 
	 * @param numberOfContainers Number of bottles.
	 * @return "bottles of beer" phrase adjusted for quantity
	 */
	private String getContainers(int numberOfContainers) {
		ContainerNumber number = new ContainerNumber(numberOfContainers);
		return number.getContainers();
	}

	/**
	 * Get the next number of bottles.
	 * 
	 * @param numberOfContainers Current number of bottles.
	 * @return Next number of bottles.
	 */
	private int getSuccessor(int numberOfContainers) {
		ContainerNumber number = new ContainerNumber(numberOfContainers);
		return number.getSuccessor();
	}

	/**
	 * Format the bottle count as a String.
	 * 
	 * @param numberOfContainers Number of bottles.
	 * @return Number formatted as a String.
	 */
	private String getQuantity(int numberOfContainers) {
		ContainerNumber number = new ContainerNumber(numberOfContainers);
		return number.getQuantity();
	}

	private String procurementInstruction(int numberOfContainers) {
		ContainerNumber number = new ContainerNumber(numberOfContainers);
		return number.procurementInstruction();
	}

	private String capitalize(String string) {
		return string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
	}
}
