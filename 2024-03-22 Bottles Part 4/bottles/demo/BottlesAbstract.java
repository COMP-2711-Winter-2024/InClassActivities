package bottles.demo;

public class BottlesAbstract {
	
	public void song(){
		verses(99,0);
	}
	
	private void verses(int bottlesAtStart, int bottlesAtEnd){
		for (int bottles = bottlesAtStart; bottles>=bottlesAtEnd; bottles--){
			verse(bottles);
		}
	}
	
	private void verse(int bottles){
		Round aRound = new Round(bottles);
		System.out.println(aRound.toS());
	}


}