import java.util.Scanner;

import Menu.MenuInput;
import Menu.MenuTampil;
import Animal.WildAnimal;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("===========================================");
    System.out.println("| Aplikasi National Geographic            |");
    System.out.println("| Dibuat Oleh: 10521772-IS1-Muhamad Rizal |");
    System.out.println("===========================================");

    int pilih, index = 0;
    MenuInput menuInput = new MenuInput();
    MenuTampil menuTampil = new MenuTampil();
    WildAnimal animal[] = new WildAnimal[50];

    do {
      System.out.println("=== Menu Utama ===");
      System.out.println("1. Tambah Data");
      System.out.println("2. Ubah Data");
      System.out.println("3. Lihat Seluruh Data");
      System.out.println("4. Keluar dari Aplikasi");
      System.out.print("Pilih Menu [1-4]: ");
      pilih = input.nextInt();
      System.out.println("");

      if (pilih == 1) {
          animal[index] = menuInput.display();
          index++;
      } else if (pilih == 2) {
        int dataIndex = 0;
        menuTampil.display(animal);
        System.out.print("Masukan data yang akan diubah: ");
        dataIndex = input.nextInt() - 1;
        animal[dataIndex] = menuInput.display();
      } else if (pilih == 3) menuTampil.display(animal);
      else if (pilih == 4) System.out.println("Keluar dari aplikasi");
      else System.out.println("Pilihan Tidak Sesuai");
    } while (pilih != 4);
    System.out.println();
  }
}