package Menu;
import Animal.WildAnimal;

public class MenuTampil extends Menu{
  @Override
  public void display(WildAnimal[] animal) {
    System.out.println("== Tampil Data ==");
    System.out.println("===================================================================================");
    System.out.println("| NO | Jenis Binatang | Name | Gender | Age | Food | Claws | Prey | Type | Active |");
    System.out.println("===================================================================================");

    for (int i = 0; i < animal.length; i++) {
      if (animal[i] == null) continue;

      System.out.printf("| %d | %s | %s | %s | %d | %s | %d | %d | %s | %s |\n",
          i+1,
          animal[i].JenisBinatang,
          animal[i].name,
          animal[i].gender,
          animal[i].getAge(),
          animal[i].getFood(),
          animal[i].getNumberOfClaws(),
          animal[i].prey(),
          animal[i].type(),
          animal[i].active()
      );
    }
    System.out.println("");
  }

  @Override
  public WildAnimal display() {
      return null;
  }
}
