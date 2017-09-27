class Switch{
  public static void main(String[] args) {
    for(int i=0;i<6;i++)
    {
      switch(i){
        case 0:
          System.out.println("ZERO");
          break;
        case 1:
          System.out.println("One");
          break;
        case 2:
          System.out.println("TWO");
          break;
        case 3:
          System.out.println("Three");
          break;
        default:
          System.out.println("Gt 3");
      }
    }
  }
}
