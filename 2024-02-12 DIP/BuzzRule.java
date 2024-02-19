public class BuzzRule
{
    public boolean matches(int element)
    {
        return element%5 == 0;
    }
    
    public String getReplacement()
    {    
            return "Buzz";
    }
    
}
