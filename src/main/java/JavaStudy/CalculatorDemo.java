package JavaStudy;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void divide() {
        //계산 결과는
        //오류가 발생했습니다./ by zero
        try {

            /**
             *
             *
             * 계산 결과는
             *
             *
             * e.getMessage()
             * / by zero
             *
             *
             * e.toString()
             * java.lang.ArithmeticException: / by zero
             *
             *
             * e.printStackTrace()
             * java.lang.ArithmeticException: / by zero
             * java.lang.ArithmeticException: / by zero
             * 	at JavaStudy.Calculator.divide(CalculatorDemo.java:15)
             * 	at JavaStudy.CalculatorDemo.main(CalculatorDemo.java:30)
             *
             *
             * */
            System.out.println("계산 결과는 ");
            System.out.println(this.left / this.right);
            System.out.println("입니다.");
        } catch (Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()\n"+e.toString());
            e.printStackTrace();
        }
        System.out.println("Divide End");
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,0);
        c1.divide();
    }
}
