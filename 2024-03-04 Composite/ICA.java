public class ICA implements Module {
    private String name;

    public ICA(String name) {
        this.name = name;
    }

    @Override
    public void display(String indentationLevel) {
        System.out.println(indentationLevel + name);
    }


}
