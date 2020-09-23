package day51_Exceptions;

public class methodOverriding {
    class A {

        protected void method() {

        }

    }


    public class method1Overriding extends A {
/*
    @Override
    public int method(){
        return 10;
    }
 */


        @Override
        public void method() {

        }


        @Override
        public String toString() {
            return "example";
        }

    }
}