package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Abstract_Base {
   
    //Division requires this field unlike the other
    //operations according to the problem statement
    private int remainder=0;

    //Constructor
    public Divide(int value1,int value2){
        super(value1,value2);
    }

    //gets the value of remainder field
    public int getRemainder() {
        return remainder;
    }

    //sets the value of remainder field
    private void setRemainder(int value) {
        remainder = value;
    }

    //Defining calculate method for Divide
    public void calculate(){
        int res=getValue1()/getValue2();
        int rem=getValue1()%getValue2();
        setResult(res);
        setRemainder(rem);
    }

    //Overriding the default toString()
    public String toString(){
        String part1= Integer.toString(getResult());
        part1+=" R:";
        part1+=Integer.toString(getRemainder());
        return part1;
    }
}


