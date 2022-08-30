import java.lang.String;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(new InputStreamReader(System.in));;
    public static void createArr(book[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = new book();
            System.out.println("\n Книжка №" + (i + 1));
            System.out.println("\nВведіть ідентифікаційний код книжки");
            int id = reader.nextInt();
            reader.nextLine();
            arr[i].setId(id);
            System.out.println("\nВведіть назву книжки");
            String name = reader.nextLine();
            arr[i].setName(name);
            System.out.println("\nВведіть автора книжки");
            String author = reader.nextLine();
            arr[i].setAuthor(author);
            System.out.println("\nВведіть видавництво книжки");
            String publishingHouse = reader.nextLine();
            arr[i].setPublishingHouse(publishingHouse);
            System.out.println("\nВведіть рік видання книжки");
            int year = reader.nextInt();
            arr[i].setYear(year);
            System.out.println("\nВведіть кількість сторінок книжки");
            int pageAmount = reader.nextInt();
            arr[i].setPageAmount(pageAmount);
            System.out.println("\nВведіть ціну книжки");
            int price = reader.nextInt();
            reader.nextLine();
            arr[i].setPrice(price);
        }
    }

    public static void printArr(book[] arr){
        for(int i = 0; i < arr.length;i++)
            System.out.println(arr[i]);
    }

    public static void printAuthorsBook(book[] arr){
        System.out.println("\nВведіть автора, книги якого хочете побачити:");
        String author = reader.nextLine();
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i].getAuthor().compareTo(author) == 0){
                count++;
                System.out.println(arr[i]);
            }
        }
        if(count == 0)
            System.out.println("\nНемає книг такого автора у списку книг");
    }

    public static void printPublishingHouse(book[] arr){
        System.out.println("\nВведіть видавництво, книги якого хочете побачити:");
        String publishingHouse = reader.nextLine();
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i].getPublishingHouse().compareTo(publishingHouse) == 0){
                count++;
                System.out.println(arr[i]);
            }
        }
        if(count == 0)
            System.out.println("\nНемає книг такого видавництва у списку книг");
    }

    public static void printAfterYear(book[] arr){
        System.out.println("\nВведіть рік,після якого хочете побачити книги:");
        int year = reader.nextInt();
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i].getYear() > year){
                count++;
                System.out.println(arr[i]);
            }
        }
        if(count == 0)
            System.out.println("\nНемає книг після такого року у списку книг");
    }

    public static void main(String[] args) {
        System.out.println("Введіть кількість книжок, які хочете ввести:\n");
        int amount = reader.nextInt();
        book[] arr = new book[amount];
        createArr(arr);
        System.out.println("\nСписок книг: ");
        printArr(arr);
        printAuthorsBook(arr);
        printPublishingHouse(arr);
        printAfterYear(arr);
    }
}