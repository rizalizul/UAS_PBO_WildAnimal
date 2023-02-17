package Animal;
public abstract class WildAnimal {
  public String name;
  public String gender;
  protected int age;
  protected String food;
  private int numberOfClaws;
  public String JenisBinatang;

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public int getNumberOfClaws() {
    return numberOfClaws;
  }
  public void setNumberOfClaws(int numberOfClaws) {
    this.numberOfClaws = numberOfClaws;
  }

  public abstract int prey();
  public abstract String type();
  public abstract String active();

}
