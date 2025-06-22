import java.util.HashMap;

class HasMapExample {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
      System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
    }
  }
}
