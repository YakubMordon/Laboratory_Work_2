import java.lang.String;
public class book {

    private int id;

    private String name;

    private String author;

    private String publishingHouse;

    private int year;

    private int pageAmount;

    private int price;

    public book(){
        this.id = 0;
        this.year = 0;
        this.price = 0;
        this.pageAmount = 0;
        this.publishingHouse = "None";
        this.name = "None";
        this.author = "None";
    }

    public int getId() {
        return this.id;
    }

    public int getPageAmount() {
        return this.pageAmount;
    }

    public int getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public String getPublishingHouse() {
        return this.publishingHouse;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "\n�� - " + this.id + "\n����� ����� - " + this.name + "\n����� - " + this.author
                + "\n����������� - " + this.publishingHouse + "\nг� ������� - " + this.year +
                "\nʳ������ ������� - " + this.pageAmount + "\nֳ�� - " + this.price;
    }
}
