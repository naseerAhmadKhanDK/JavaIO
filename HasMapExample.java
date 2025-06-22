import java.util.HashMap;
public class HasMapExample {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    // Print both key and value
    for (HashMap.Entry<String, String> entry : capitalCities.entrySet()) {
      System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
    }
  }
}
