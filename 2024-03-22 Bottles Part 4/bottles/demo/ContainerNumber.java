package bottles.demo;

public interface ContainerNumber {
    ContainerNumber containerFactory(int n);
    String getContainers();
    String getQuantity();
	String getPronoun();
	String procurementInstruction();
    ContainerNumber getSuccessor();
}
