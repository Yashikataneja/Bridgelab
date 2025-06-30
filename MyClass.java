
/* CLASS NAME ALWAYS STARTS WITH CAPITAL LETTERS */

public class MyClass {

    int b; //this var is inside class, so this is instance variable
    static int s; //this can be accessed anywhere inside the class.


    /*INSTANCE VARIABLE CAN BE INITIALIZED AND DECLARAED AT THE SAME TIME , WE CAN'T
    INITIALIZE IT AFTER THE DECLARATION, BUT IN LOCAL VARIABLE WE CAN INITIALIZE IT AFTER
    DECLARATION IN THE METHOD*/

    //Moreover, when we write static infront of any var, it is named as static var

    void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }


     /* METHOD NAME ALWAYS WITH SMALL LETTER!*/

    public static void main(String[] args)
    {
        int a; //this variable is inside the main method, therefore, this is local variable
        System.out.println(s);

    }


}
