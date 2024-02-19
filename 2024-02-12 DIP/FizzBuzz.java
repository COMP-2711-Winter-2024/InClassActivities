import java.util.ArrayList;

public class FizzBuzz
{
    private ArrayList<String> listOfNumbers;

    public FizzBuzz(int n)
    {
        listOfNumbers = new ArrayList<String>();
        listOfNumbers.add("0");
        for (int i=1; i<=n; i++){
            listOfNumbers.add(i,generateElement(i));
        }
    }

    private String generateElement(int element){
        if ((element % 3 == 0 ) && (element % 5 == 0)) {
            return "Fizz Buzz";
        }
        if (element % 3 == 0) {
            System.out.println("This is element "+element);
            return "Fizz";
        }
        if (element % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(element);
    }
    
}
