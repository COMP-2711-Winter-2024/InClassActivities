public class Lecture implements Module {
	private String name; // give each lecture a name
	
	public Lecture (String givenName) {
		this.name = givenName;
	}
	 /*
	  * display the hierarchy of the lecture
	  */
	@Override
	public void display(String indentLevel) {
		System.out.println(indentLevel + name);
	}

}


