package doItJava_ch12;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        // Powder 형으로 GernericPrinter 클래스 생성

        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter); // toString 설정해주고 참조변수 출력

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        // Plastic형으로 GenericPrinter 클래스 생성

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}
