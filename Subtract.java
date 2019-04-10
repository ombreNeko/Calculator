package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Abstract_Base {
    // TODO -- start your code here

    //Constructor
    public Subtract(int value1,int value2){
        super(value1,value2);
    }

    //Defining calculate() for Subtract
    public void calculate(){
        int res= getValue1()-getValue2();
        setResult(res);
    }

    //Overriding the default toString()
    public String toString(){
        return Integer.toString(getResult());
    }

}


