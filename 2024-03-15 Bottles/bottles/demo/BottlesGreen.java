package bottles.demo;

public class BottlesGreen {



	public void song(){
		this.verses(99,1);
	}
	
	private void verses(int hi, int lo){		
		for (int i=hi; i>=lo; i--){
			verse(i);
		}
	}
	
	public String verse(int n){
		String returnString = "";
	
		switch (n){
			case 0:
					returnString = "No more bottles of beer on the wall, "+
									"no more bottles of beer.\n"+
									"Go to the store and buy some more, " +
									"99 bottles of beer on the wall.\n";
					break;
			case 1: 
					returnString = 	"1 bottle of beer on the wall, "+
									"1 bottle of beer.\n"+
									"Take it down and pass it around, " +
									"no more bottles of beer on the wall.\n";
					break;
			case 2: 
					returnString = 	"2 " + getBottlesOfBeer(n) + " on the wall, "+
									"2 " + getBottlesOfBeer(n) + ".\n"+
									"Take one down and pass it around, " +
									"1 " + getBottlesOfBeer(n - 1) + " on the wall.\n";
					break;
			default:
					returnString = 	n + " bottles of beer on the wall, "+
									n + " bottles of beer.\n"+
									"Take one down and pass it around, " +
									(n-1) + " bottles of beer on the wall.\n";
		}

		return returnString;

	}

	private String getBottlesOfBeer(int numberOfBottles) {
		return (numberOfBottles > 1 ? "bottles" : "bottle") + " of beer";
	}
}
