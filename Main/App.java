package Main;

import java.util.Scanner;

import Function.Function;
// import Function.Function.*;

class App {
    static boolean information = false;

    public static void setInformation(Boolean bool) {
        App.information = bool;
    }

    public static void main(String[] args) throws Exception {
        Function fun = new Function();
        Function.clearScreen();
        System.out.println("\n================================== ");
        System.out.println("TUGAS JAVA NIKI");
        System.out.println("================================== ");
        System.out.println("-- Pilihan --");
        System.out.println("1. Pinjam  ");
        System.out.println("2. Beli ");
        System.out.print("Pilih [1 / 2 ] :  ");
        try (Scanner input = new Scanner(System.in)) {

            try (Scanner inputString = new Scanner(System.in)) {
                int pil_status = input.nextInt();
                if (pil_status == 1) {
                    Function.clearScreen();
                    do {
                        App.information = false;
                        Function.clearScreen();
                        Function.optionBook();
                        System.out.print("Pilih Cerita : [ 1 / 2 ] : ");
                        int choose_book = input.nextInt();
                        if (choose_book == 1) {
                            Function.clearScreen();
                            Function.choose();
                            System.out.print("Pilih [ 1 / 2 ] : ");
                            int choose_status = input.nextInt();
                            if (choose_status == 1) {
                                fun.input("Cara Jago Main Valorant", "Dongeng", "NIKI - Entertaiment", 2000);
                            } else if (choose_status == 2) {
                                fun.setType("Cara Jago Main Valorant", "Dongeng", "NIKI - Entertaiment", 2000);
                                System.out.println("pilih 1 untuk kembali dan 0 untuk selesai");
                                int key = input.nextInt();
                                if (key == 1) {
                                    App.information = true;
                                }
                            } else {
                                App.information = true;
                            }

                        } else if (choose_book == 2) {
                            Function.clearScreen();
                            Function.choose();
                            System.out.print("Pilih [ 1 / 2 ] : ");
                            int choose_status = input.nextInt();
                            if (choose_status == 1) {
                                fun.input("Tutorial OOP Java", "Dongeng", "yutub", 2000);
                            } else if (choose_status == 2) {
                                fun.setType("Tutorial OOP Java", "Dongeng", "yutub", 2000);
                                System.out.println("pilih 1 untuk kembali dan 0 untuk selesai");
                                int key = input.nextInt();
                                if (key == 1) {
                                    App.information = true;
                                } else {
                                    App.information = true;
                                }
                            }
                        } else {
                            System.out.println("Tidak Ditemukan");
                        }
                    } while (App.information == true);
                } else if (pil_status == 2) {
                    Function.clearScreen();
                    do {
                        Function.optionBook();
                        System.out.print("Pilih Cerita : [ 1 / 2 ] : ");
                        int pil = input.nextInt();
                        if (pil == 1) {
                            Function.clearScreen();
                            Function.chooseBuy();
                            System.out.println("Pilih : [ 1 / 2 ]");
                            int choose = input.nextInt();
                            if (choose == 1) {
                                fun.setDataBuy("Cara Jago Main Valorant", "Dongeng", "Niki - Entertaiment", 40000);
                            } else if (choose == 2) {
                                fun.informationBook("Cara Jago Main Valorant", "Dongeng", "Niki - Entertaiment", (long) 40000);
                                System.out.println("pilih 1 untuk kembali dan 0 untuk selesai");
                                int key = input.nextInt();
                                if (key == 1) {
                                    App.information = true;
                                }
                            }
                        } else if (pil == 2) {
                            Function.clearScreen();
                            Function.chooseBuy();
                            System.out.println("Pilih : [ 1 / 2 ]");
                            int choose2 = input.nextInt();
                            if (choose2 == 1) {
                                fun.setDataBuy("Tutorial OOP Java", "Dongeng", "NIKI", 30000);
                            } else if (choose2 == 2) {
                                fun.informationBook("Tutorial OOP Java", "Dongeng", "NIKI", (long) 30000);
                                System.out.println("pilih 1 untuk kembali dan 0 untuk selesai");
                                int key = input.nextInt();
                                if (key == 1) {
                                    App.information = true;
                                }
                            }
                        }
                    } while (App.information == true);
                }
            }
        }

    }

}