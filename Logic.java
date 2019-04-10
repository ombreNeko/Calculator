package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface,Interface{
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){

      //Creating an array of references of the Abstract_Base class.
      Abstract_Base [] attempt = new Abstract_Base[5];


      //We now create a reference of each element in the array to
      //to one of the operator classes.
      //1st index is for addition
      //2nd index is for subtraction and so on.
      attempt[ADDITION]= new Add(argumentOne,argumentTwo);
      attempt[SUBTRACTION]= new Subtract(argumentOne,argumentTwo);
      attempt[MULTIPLICATION]= new Multiply(argumentOne,argumentTwo);
      attempt[DIVISION]=new Divide(argumentOne,argumentTwo);


      //We then simply instantiate the array element corresponding
      //to the operator integer provided by the user.
      //We also call the calculate method of the object instantiated.
      attempt[operation].calculate();


      //We call the toString() method of our object and
      //and print it to the screen
      mOut.print(attempt[operation].toString());

    }
}
