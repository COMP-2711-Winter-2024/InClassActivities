package bottles.demo;

public class BottlesConcise {
	public void song(){
		this.verses(99,0);
	}
	
	private void verses(int hi, int lo){		
		for (int i=hi; i>=lo; i--){
			verse(i);
		}
	}
	
	private void verse(int n) {
		String returnString = ((n==0) ? "No more ": ""+n+" ") + (n!=1 ? "bottles" : "bottle");
		returnString+= " of beer on the wall, ";
		returnString+= ((n==0) ? "no more": ""+n) + (n!=1 ? " bottles" : " bottle");
		returnString+=" of beer.\n";
		returnString+= (n>0) ? "Take"+ ((n>1)? " one ": " it ") +"down and pass it around. ":"Go to the store and buy some more. ";
		returnString+= ((n-1 < 0) ? 99 : n-1==0? "No more": n-1 )+ ""+(n-1!=1 ? " bottles" : " bottle");
		returnString+= " of beer on the wall.\n";		
		System.out.println(returnString);
	}
}
