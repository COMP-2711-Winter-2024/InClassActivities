package bottles.demo;

public class BottlesGreen {

	private ContainerFactory factory;

	public BottlesGreen(ContainerFactory factory) {
		this.factory = factory;
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
	 * @param containerNum Verse number.
	 * @return Verse.
	 */
	public String verse(int n){
		return	capitalize(getQuantity()) + " " + getContainers() + " on the wall, " +
			getQuantity() + " " + getContainers() + ".\n" +
			capitalize(procurementInstruction()) + ", " +
			getQuantity(getSuccessor()) + " " + getContainers(getSuccessor()) + " on the wall.\n";
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
	private String getContainers() {
		return number.getContainers();
	}

	/**
	 * Get the next number of bottles.
	 * 
	 * @param numberOfContainers Current number of bottles.
	 * @return Next number of bottles.
	 */
	private ContainerNumber getSuccessor() {
		return number.getSuccessor();
	}

	/**
	 * Format the bottle count as a String.
	 * 
	 * @param numberOfContainers Number of bottles.
	 * @return Number formatted as a String.
	 */
	private String getQuantity() {
		return number.getQuantity();
	}

	private String procurementInstruction() {
		return number.procurementInstruction();
	}

	private String capitalize(String string) {
		return string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
	}
}
