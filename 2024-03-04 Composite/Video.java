public class Video implements Module {

    private String name;

    public Video(String name) {
        this.name = name;
    }

    @Override
    public void display(String indentationLevel) {
        System.out.println(indentationLevel + name);
    }

}
