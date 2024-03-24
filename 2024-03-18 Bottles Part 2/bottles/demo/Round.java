package bottles.demo;

public class Round {
	
	private int bottles = -1;
	private String beer = "beer";
	private String onWall = "on the wall";
	private String buyNewBeer = "Go to the store and buy some more";
	private String lyrics = "";

	Round(int numOfBottles){
		bottles = numOfBottles;
	}
	
	public String toS(){
		return challenge() + response();
	}
	
	private String challenge(){
		return bottlesOfBeer()+ " " + onWall() + ", " + bottlesOfBeer() + ".\n"; 
	}
	
	private String response(){
		return goToTheStoreOrTakeOneDown() + ", " + bottlesOfBeer() + " " + onWall() + ".\n";
	}
	
	private String bottlesOfBeer(){
		return anglicizedBottleCount() + pluralizedBottleForm() + " of " + beer();
	}
	
	private String anglicizedBottleCount(){
		return allOut() ? "no more": String.valueOf(bottles); 
	}
	
	private boolean allOut(){
		return bottles==0;
	}
	
	private String pluralizedBottleForm() {
		return lastBeer() ? " bottle" : " bottles";
	}
	
	private String beer(){
		return beer;
	}
	
	private String onWall(){
		return onWall;
	}
	
	private boolean lastBeer(){
		return bottles == 1;
	}
	
	private String goToTheStoreOrTakeOneDown(){
		if (allOut()){
			bottles = 99;
			return buyNewBeer();
			
		}
		else {
			lyrics = drinkBeer();
			bottles--;
			//reset lyrics?
			return lyrics;
		}
	}
	
	private String buyNewBeer(){
		return buyNewBeer;
	}
	
	private String drinkBeer(){
		return "Take " + itOrOne() + " down and pass it around";
	}
	
	private String itOrOne(){
		return lastBeer() ? "it": "one";
	}
}
