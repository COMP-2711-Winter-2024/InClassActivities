public class FizzBuzzRule
{
    public boolean matches(int element)
    {
        return (element%5 == 0 && element%3==0);
    }
    
    public String getReplacement()
    {    
            return "FizzBuzz";
    }
    
}
