class Test{
  int a,b;
  Test(int i,int j){
    a=i;
    b=j;
  }
}
class parameter{
  public static void main(String[] args) {
    Test obj1=new Test(10,20);
    Test obj2=obj1;
    System.out.println(obj1.a + " " + obj1.b);
    if(obj1==obj2)
    {
      System.out.println("true" + obj1 + " " + obj2);
    }
  }
}
