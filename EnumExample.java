enum Level {
  LOW,
  MEDIUM,
  HIGH
}

 class EnumExample { 
  public static void main(String[] args) { 
    for (Level myVar : Level.values()) {
      System.out.println(myVar);
    }
  } 
}
