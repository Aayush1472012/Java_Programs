class test{
  int a;
  public int b;
  private int c;
  //methods to access c
  void setc(int i)
  {
    c=i;
  }
  int getc()
  {
    return c;
  }
}
class accesstest {
  public static void main(String[] args) {
    test ob = new test();
    ob.a=10;
    ob.b=20;
    //ob.c=30; it will generae error as private
    ob.setc(30);
    System.out.println(ob.a + " " + ob.b + " " + ob.getc());

  }
}
