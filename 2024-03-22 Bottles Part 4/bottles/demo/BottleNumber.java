package bottles.demo;

public class BottleNumber implements ContainerNumber {

    private static final int MAX_CONTAINERS = 99;

    private String containers;
    private String quantity;
    private String pronoun;
    private String procurementInstruction;
    private int successor;

    public BottleNumber(int numberOfContainers) {
        // set containers
        if(numberOfContainers == 1) {
            containers = "bottle of beer";
        } else {
            containers = "bottles of beer";
        }

        // set pronoun
        if(numberOfContainers > 1) {
            pronoun = "one";
        } else {
            pronoun = "it";
        }

        // set quantity, procurementInstruction, and successor
        if(numberOfContainers == 0) {
            quantity = "no more";
            procurementInstruction = "go to the store and buy some more";
            successor = MAX_CONTAINERS;
        } else {
            quantity = Integer.toString(numberOfContainers);
            procurementInstruction = "take " + pronoun + " down and pass it around";
            successor = numberOfContainers - 1;
        }

    }

    public String getContainers() {
		return containers;
	}

    public String getQuantity() {
		return quantity;
	}

	public String getPronoun() {
		return pronoun;
	}

	public String procurementInstruction() {
		return procurementInstruction;
	}

    public ContainerNumber getSuccessor() {
		return new BottleNumber(successor);
	}
}
