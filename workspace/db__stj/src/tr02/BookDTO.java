package tr02;

public class BookDTO {

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