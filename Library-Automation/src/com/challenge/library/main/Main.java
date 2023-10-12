package com.challenge.library.main;

import com.challenge.library.enums.Categories;
import com.challenge.library.model.Book;
import com.challenge.library.model.Employee;
import com.challenge.library.model.Library;
import com.challenge.library.model.User;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        System.out.println("Kütüphane Konsol Uygulamasına Hoş Geldiniz!");

        // kütüphane nesnesi
//        Library library = new Library("Eskişehir Halk Kütüphanesi", "Odunpazarı, Eskişehir", "0222 XXX XX XX", new ArrayList<Book>());
        Library library = new Library( new ArrayList<Book>());
        // kütüphaneye kitap eklendi
        library.addBook(new Book("Sineklerin Tanrısı", "William Golding", Categories.NOVEL, 12.0));
        library.addBook(new Book("Beyaz Zambaklar Ülkesinde", "Grigory Petrov", Categories.STORY, 10.0));
        library.addBook(new Book("Suç ve Ceza", "Fyodor Dostoyevski", Categories.NOVEL, 15.0));

        System.out.println(library.getBooks());

        //kullanıcı eklendi
        User user = new User("deneme", "123456", "Test test", "test@test.com", new HashSet<Book>());

        //personel eklendi
        Employee employee = new Employee("Mehmet X", "1001", "Kütüphaneci", 3000.0);

        boolean isRun = true;
        Scanner scanner = new Scanner(System.in);
        while (isRun) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1- Kütüphane Bilgilerini Görüntüle");
            System.out.println("2- Kitap Ara");
            System.out.println("3- Kitap Listele");
            System.out.println("4- Kitap Ekle");
            System.out.println("5- Kitap Sil");
            System.out.println("6- Kullanıcı Kaydı Yap");
            System.out.println("7- Kullanıcı Kaydı Sil");
            System.out.println("8- Kullanıcı Girişi Yap");
            System.out.println("9- Kullanıcı Çıkışı Yap");
            System.out.println("10- Ödünç Aldığım Kitapları Görüntüle");
            System.out.println("11- Kitap Ödünç Al");
            System.out.println("12- Kitap İade Et");
            System.out.println("13- Çıkış Yap");

            int secim = scanner.nextInt(); // Kullanıcıdan sayıyı alınır.

            switch (secim) {
                case 1:
                    System.out.println("Kütüphane bilgileri şunlardır:");
//                    System.out.println(library.toString());
//                    System.out.println("Kütüphane adı: " + library.getName());
//                    System.out.println("Adresi: " + library.getAddress());
//                    System.out.println("Telefon numarası: " + library.getPhone());
                    System.out.println("Kitap sayısı: " + library.getBooks().size());
                    break;
                case 2:
                    System.out.println("Kütüphaneye yeni kitap eklemek için sırasıyla :");
                    System.out.println("1- Kitap adı:");
                    System.out.println("2- Yazar adı:");
                    System.out.println("3- Kitap kategorisi:");
                    System.out.println("4- Kitap fiyatı:");
//                    String value = scanner.next(); // Kullanıcıdan sayıyı alınır.
                    String []arr = {scanner.next(),scanner.next(),scanner.next()};
                    //Categories categori = Categories.(arr[2].toUpperCase(Locale.ENGLISH));
//                    double fiyat = scanner.nextDouble();
//                    library.addBook(new Book(arr[0],arr[1],arr[2],));
//                    Employee e2 = new Employee(scanner.next(),scanner.next(),scanner.next(),scanner.nextDouble());
//                    System.out.println(e2);
//                    System.out.println(library.toString());

                    break;
                case 13:
                    isRun = false;
                    break;
                default:
                    break;
            }

        }

    }
}