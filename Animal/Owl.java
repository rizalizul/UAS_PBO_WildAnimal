package Animal;
public class Owl extends WildAnimal{
  @Override
  public int prey() {
    if (super.JenisBinatang=="Burung Hantu" && super.age==1) return 1;
    else if (super.JenisBinatang=="Burung Hantu" && super.age==2) return 2;
    return 0;
  }

  @Override
  public String type() {
    if (super.JenisBinatang=="Burung Hantu") return "Owl";
    return "Tidak Ada Data";
  }

  @Override
  public String active() {
    if (super.JenisBinatang=="Burung Hantu") return "Malam Hari (Nokturnal)";
    return "Tidak Ada Data";
  }
}
