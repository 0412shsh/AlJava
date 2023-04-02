package doItJava;

class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    } // 책 번호, 책 이름을 인자로 받는 생성자

    @Override
    public String toString() {
        return "Book{" +
                "책 번호=" + bookNumber +
                ", 책 이름='" + bookTitle + '\'' +
                '}';
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200,"빙빙");

        System.out.println(book1);  // 인스턴스 정보(클래스 이름.주소값)  doItJava.Book@6a5fc7f7  ==> 클래스명@해시코드명
        // toString 재정의 후 ==> Book{책 번호=200, 책 이름='빙빙'}
        System.out.println(book1.toString()); // 메서드로 인스턴스 정보(클래스 이름.주소 값) 보여줌 doItJava.Book@6a5fc7f7 ==> 클래스명@해시코드명
        // toString 재정의 후 ==> Book{책 번호=200, 책 이름='빙빙'}


        // String과 Integer 클래스는 toString을 이미 재정의해둠
        String str = new String("test");
        System.out.println(str);

        Integer li = new Integer(100);
        System.out.println(li);


    }
}
