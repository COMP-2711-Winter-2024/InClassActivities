public class TestTopicLecture {
	
	public static void main(String[] args) {
		Topic designPatterns = new Topic("Design patterns");
		Topic observer = new Topic("Observer");
		Topic composite = new Topic("Composite");
		Topic factory = new Topic("Factory");
		Lecture patternsIntro = new Lecture("Intro to Patterns I");
		Lecture observerIntro = new Lecture("Intro to Observer");
		Lecture compositeDoIt = new Lecture("Let's compose!"); 
		Lecture abstractFactory = new Lecture("Abstract Factory");
		Lecture factoryMethod = new Lecture("Factory method");		
		designPatterns.addModule(observer);
		designPatterns.addModule(composite);
		designPatterns.addModule(patternsIntro);
		designPatterns.addModule(factory);
		factory.addModule(factoryMethod);
		factory.addModule(abstractFactory);
		observer.addModule(observerIntro);
		composite.addModule(compositeDoIt);
	

		Video video = new Video("Video on composite");
		composite.addModule(video);
		Video otherVideo = new Video("Design patterns video");
		designPatterns.addModule(otherVideo);

		ICA compositeICA = new ICA("Composite ICA");
		composite.addModule(compositeICA);

		designPatterns.display("  ");
	}

}

