package Animal;

public class Leopard extends BigCat{
  @Override
  public int prey() {
    if (super.JenisBinatang=="Leopard" && super.age==1) return 2;
    else if (super.JenisBinatang=="Leopard" && super.age==2) return 4;
    return 0;
  }

  @Override
  public String active() {
    if (super.JenisBinatang=="Leopard") return "Siang Hari (Diurnal)";
    return "Tidak Ada Data";
  }
}
