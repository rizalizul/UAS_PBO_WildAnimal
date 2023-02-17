package Menu;

import java.util.Scanner;

import Animal.Owl;
import Animal.BigCat;
import Animal.Leopard;
import Animal.Lion;
import Animal.WildAnimal;

public class MenuInput extends Menu{
  
  @Override
  public WildAnimal display() {
    Scanner input = new Scanner(System.in);

    System.out.println("== Tambah Data ==");
    System.out.println("Jenis Binatang :");
    System.out.println("1. Burung Hantu");
    System.out.println("2. Singa");
    System.out.println("3. Leopard");
    System.out.print("Pilih [1-3]: ");
    int pilih = input.nextInt();
    input.nextLine();

  if (pilih == 1) {
    WildAnimal owl = new Owl();
    System.out.println("\nJenis Binatang : Burung Hantu");
    owl.JenisBinatang = "Burung Hantu";
    System.out.print("Nama Hewan     : ");
    owl.name = input.nextLine();

    System.out.print("Jenis Kelamin  : ");
    owl.gender = input.nextLine();

    System.out.print("Makanan        : ");
    owl.setFood(input.nextLine());

    System.out.print("Usia Hewan     : ");
    owl.setAge(input.nextInt());

    System.out.print("Jumlah Cakar   : ");
    owl.setNumberOfClaws(input.nextInt());

    System.out.println();
    return owl;
  } else if (pilih == 2) {
    BigCat lion = new Lion();
    System.out.println("\nJenis Binatang : Singa");
    lion.JenisBinatang = "Singa";
    System.out.print("Nama Hewan     : ");
    lion.name = input.nextLine();

    System.out.print("Jenis Kelamin  : ");
    lion.gender = input.nextLine();

    System.out.print("Makanan        : ");
    lion.setFood(input.nextLine());

    System.out.print("Usia Hewan     : ");
    lion.setAge(input.nextInt());

    System.out.print("Jumlah Cakar   : ");
    lion.setNumberOfClaws(input.nextInt());

    System.out.println();
    return lion;
  } else if (pilih == 3) {
    BigCat leo = new Leopard();
    System.out.println("\nJenis Binatang : Leopard");
    leo.JenisBinatang = "Leopard";
    System.out.print("Nama Hewan     : ");
    leo.name = input.nextLine();

    System.out.print("Jenis Kelamin  : ");
    leo.gender = input.nextLine();

    System.out.print("Makanan        : ");
    leo.setFood(input.nextLine());

    System.out.print("Usia Hewan     : ");
    leo.setAge(input.nextInt());

    System.out.print("Jumlah Cakar   : ");
    leo.setNumberOfClaws(input.nextInt());

    System.out.println();
    return leo;

  } else {
    return null;
  }
}

  @Override
  public void display(WildAnimal[] animal) {
  }
}
