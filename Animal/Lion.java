package Animal;

public class Lion extends BigCat {
  @Override
  public int prey() {
    if (super.JenisBinatang=="Singa" && super.age==1) return 2;
    else if (super.JenisBinatang=="Singa" && super.age==2) return 3;
    return 0;
  }

  @Override
  public String active() {
    if (super.JenisBinatang=="Singa") return "Siang Hari (Diurnal)";
    return "Tidak Ada Data";
  }
}
