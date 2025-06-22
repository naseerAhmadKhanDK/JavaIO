public class Count {
  public static void main(String[] args) {
    String words = "One Two Three Four Five";
    int countWords = words.split("\\s").length;
    int totalCount=words.length();
    System.out.println(countWords);
    System.out.println(totalCount);
  }
}