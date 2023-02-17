package Animal;
public class BigCat extends WildAnimal{
  public String type() {
    if (super.JenisBinatang=="Burung Hantu") return "Owl";
    else if (super.JenisBinatang=="Singa") return "Big Cat";
    else if (super.JenisBinatang=="Leopard") return "Big Cat";
    return "Tidak Ada Data";
  }

  @Override
  public int prey() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String active() {
    // TODO Auto-generated method stub
    return null;
  }
}