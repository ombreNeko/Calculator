package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Abstract_Base{
    // TODO -- start your code here

    //Constructor
    public Add(int value1,int value2){
        super(value1,value2);

    }

    //Defining the calculate method for Add
    public void calculate(){
        setResult(getValue1()+getValue2());
    }

    //Overriding the default toString()
    public String toString(){
        return Integer.toString(getResult());
    }

}
