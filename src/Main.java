import java.util.Random;

public class Main {
  public static void main(String[] args) {
    randomName();
  }

  private static void randomName() {
    String[] firstNames = {"John", "Emily", "Michael", "Sarah", "David"};
    String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown"};

    Random random = new Random();
    int firstNameIndex = random.nextInt(firstNames.length);
    int lastNameIndex = random.nextInt(lastNames.length);

    String randomName = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];
    System.out.println("Tên ngẫu nhiên: " + randomName);
  }
}