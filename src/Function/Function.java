/**
 * Function
 */
package Function;

import java.util.Scanner;

import Main.Buy;
import Main.Loan;

public class Function {

    public void input(String name, String type, String publisher, long book_price) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nama Lengkap : ");
            String fullname = input.nextLine();
            System.out.print("Umur : ");
            int age = input.nextInt();
            System.out.print("Berapa Hari Lama Peminjaman Buku : ");
            int value = input.nextInt();
            this.setLoanData(name, type, publisher, book_price, value, fullname, age);
        }
    }

    public void setType(String name, String type, String publisher, long book_price) {
        Loan functionType = new Loan(name, publisher, type, book_price);
        functionType.info();
    }

    public void setLoanData(String name, String type, String publisher, long book_price, int value, String fullname,
            int age) {
        Loan functionType = new Loan(name, type, publisher, book_price);
        functionType.setTitle(name);
        functionType.setType(type);
        functionType.setPublisher(publisher);
        functionType.setBook_price(book_price);
        functionType.sumPrice(value);
        functionType.result(fullname, age);
        functionType.pay();
    }

    public void setDataBuy(String title, String publisher, String type, long book_price) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nama Lengkap : ");
            String fullname = input.nextLine();
            System.out.print("Umur : ");
            int age = input.nextInt();
            System.out.print("Berapa Banyak Buku yang ingin Dibeli ? : ");
            int count = input.nextInt();
            this.setBuy(title, publisher, type, book_price, fullname, age, count);
        }
    }

    public void setBuy(String title, String publisher, String type, long book_price, String fullname, int age,
            int count) {
        Buy buy = new Buy(title, publisher, type, book_price);
        buy.result(fullname, age, count);
        buy.pay();
    }

    public void informationBook(String title, String type, String publisher, Long i) {
        Buy buy = new Buy(title, publisher, type, i);
        buy.info();
    }

    public static void choose() {
        System.out.println("--- Pilihan ---");
        System.out.println("1. Pinjam");
        System.out.println("2. Informasi Buku");
    }

    public static void chooseBuy() {
        System.out.println("--- Pilihan ---");
        System.out.println("1. Beli");
        System.out.println("2. Informasi Buku");
    }

    public static void optionBook() {
        System.out.println("================================== ");
        System.out.println("Pilih Buku : ");
        System.out.println("================================== ");
        System.out.println("1.Cara Jago Main Valorant");
        System.out.println("2.Tutorial OOP Java");
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }
}