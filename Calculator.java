public class Calculator {

    public void methodAdd(){
        int a=1;
        int b=2;
        int c=a+b;
        System.out.println(c);
    }

    public void methodSubtract(){
        int a1=1;
        int b1=2;
        int c1=a1-b1;
        System.out.println(c1);
    }

    public void methodMultiply(){
        int a2=1;
        int b2=2;
        int c2=a2*b2;
        System.out.println(c2);
    }

    public void methodDivision(){
        int a3=1;
        int b3=2;
        int c3=a3/b3;
        System.out.println(c3);
    }


    public static void main(String[] args){
        Calculator obj = new Calculator();

        //calling the method using the object

        obj.methodAdd();
        obj.methodSubtract();
        obj.methodMultiply();
        obj.methodDivision();
    }
}
