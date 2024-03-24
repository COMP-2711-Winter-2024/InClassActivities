package bottles.demo;

import static org.junit.Assert.*;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

public class TestSixPacks {

	@Test
	public void testVerseSix(){
		String expected = "1 six pack of beer on the wall, " + "1 six pack of beer.\n" + "Take one down and pass it around, " + "5 bottles of beer on the wall.\n";
		BottlesGreen bottles = new BottlesGreen();
		assertEquals(expected, bottles.verse(6));
	}
	
	@Test
	public void testAnotherVerse(){
		String expected = "3 bottles of beer on the wall, " + "3 bottles of beer.\n" + "Take one down and pass it around, " + "2 bottles of beer on the wall.\n";
		BottlesGreen bottles = new BottlesGreen();
		assertEquals(expected, bottles.verse(3));
	}
	
	@Test
	public void testVerseTwo(){
		String expected = "2 bottles of beer on the wall, " + "2 bottles of beer.\n" + "Take one down and pass it around, " + "1 bottle of beer on the wall.\n";
		BottlesGreen bottles = new BottlesGreen();
		assertEquals(expected, bottles.verse(2));
	}
	
	@Test
	public void testVerseOne(){
		String expected = "1 bottle of beer on the wall, " + "1 bottle of beer.\n" + "Take it down and pass it around, " + "no more bottles of beer on the wall.\n";
		BottlesGreen bottles = new BottlesGreen();
		assertEquals(expected, bottles.verse(1));
	}
	
	@Test
	public void testLastVerse(){
		String expected = "No more bottles of beer on the wall, " + "no more bottles of beer.\n" + "Go to the store and buy some more, " + "99 bottles of beer on the wall.\n";
		BottlesGreen bottles = new BottlesGreen();
		assertEquals(expected, bottles.verse(0));
	}
	

}