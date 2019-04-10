package mooc.vandy.java4android.calculator.logic;

//This is an abstract base class containing all the common fields
//and methods.

public abstract class Abstract_Base {
    int Value1;
    int Value2;
    int result;

    //constructor
    public Abstract_Base(int value1,int value2) {

        setValue1(value1);
        setValue2(value2);
    }

    //setter functions
    protected void setValue1(int value){
        this.Value1= value;
    }

    protected void setValue2(int value){
        this.Value2=value;
    }

    protected void setResult(int value){
        this.result=value;
    }

    //getter functions
    public int getValue1(){
        return Value1;
    }

    public int getValue2() {
        return Value2;
    }

    public int getResult(){
        return result;
    }

    //this is an abstract method (with only declaration,
    // and no definition,as the definition would differ
    //with different operations
    abstract void calculate();



}
