import java.util.HashMap;
import java.util.Map;

class CityInfo {
    String capital;
    String currency;

    CityInfo(String capital, String currency) {
        this.capital = capital;
        this.currency = currency;
    }
}

public class SimpleHashW {
    public static void main(String[] args) {
        HashMap<String, CityInfo> capitalCities = new HashMap<>();

        capitalCities.put("England", new CityInfo("London", "Pound"));
        capitalCities.put("Germany", new CityInfo("Berlin", "Euro"));
        capitalCities.put("Norway", new CityInfo("Oslo", "Krone"));
        capitalCities.put("USA", new CityInfo("Washington DC", "Dollar"));

        for (Map.Entry<String, CityInfo> entry : capitalCities.entrySet()) {
            String country = entry.getKey();
            CityInfo info = entry.getValue();
            System.out.println("Country: " + country + 
                               ", Capital: " + info.capital + 
                               ", Currency: " + info.currency);
        }
    }
}
