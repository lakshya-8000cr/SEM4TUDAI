package Exceptionshandling;

class MyException extends Exception {

    MyException(String msg) {

        super(msg);

    }

}

public class Test {

    static void checkAge(int age) throws MyException {
         age = 15;
        if(age<30){
            throw new MyException("chota hai abhi ");
        }
        else{
            System.out.print("Bda hai ");
        }

    }

    public static void main(String[] args) {

        try {

            checkAge(16);

        }

        catch(MyException e) {

            System.out.println(e);

        }

    }

}