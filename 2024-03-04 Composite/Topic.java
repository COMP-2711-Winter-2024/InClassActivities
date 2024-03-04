import java.util.ArrayList;
import java.util.List;

public class Topic implements Module {
	private List<Module> modules = new ArrayList<>();
	private String name;
	
	public Topic(String givenName) {
		name = givenName;
	}
	
	/*
	 * Add a lecture
	 */
	public void addModule(Module module) {
		modules.add(module);
	}
	
	/* 
	 * Display the lectures and topics in a hierarchy
	 */
	
	public void display(String indentLevel) {
		System.out.println(indentLevel+name);
		for(Module modules:modules) {
			modules.display(indentLevel+indentLevel);
		}
	}

}

