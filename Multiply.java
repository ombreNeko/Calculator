package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Abstract_Base{
  
    //Constructor
    public Multiply(int value1,int value2){
        super(value1,value2);
    }

    //Defining calculate() for Multiply
    public void calculate(){
        int res= getValue1() * getValue2();
        setResult(res);
    }

    //Overriding the default toString()
    public String toString(){
        return Integer.toString(getResult());
    }

}

