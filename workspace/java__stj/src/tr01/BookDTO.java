package tr01;

  //작성해야 할 클래스 정보
  //1. 아래의 출력을 참고하여 클래스를 작성. 클래스 이름을 BookDTO로 한다.

public class BookDTO {

  //2. Book 정보를 저장할 클래스에 생성자와 Encapsulation을 적용하여 생성
  //   ( isbn, title, author, publisher, price, desc )

  private int isbn;
  private String title;
  private String author;
  private String publisher;
  private int price;
  private String descrpt;
  
  //생성자
  
  public BookDTO() {
    super();
  }
  
  public BookDTO(int isbn, String title, String author, String publisher, int price, String descrpt) {
    super();
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.price = price;
    this.descrpt = descrpt;
  }
  
  //3. BookDTO 클래스가 가지고 있는 정보를 문자열로 리턴 시켜주는 toString()을 출력을 참고하여 작성

  @Override
  public String toString() {
    return "|" + isbn + "  | " + title + " | " + author + " | " + publisher + " | "
        + price + " | " + descrpt;
  }
  
  
  //getters & setters

  public int getIsbn() {
    return isbn;
  }
  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public String getDescrpt() {
    return descrpt;
  }
  public void setDescrpt(String descrpt) {
    this.descrpt = descrpt;
  }
  
  

}