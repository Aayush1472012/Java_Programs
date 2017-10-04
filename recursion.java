class fact {
  int fact(int n) {
    if(n==1){
      return 1;
    }
    else
    {
      return (n*fact(n-1));
    }
  }
}
class recursion {
  public static void main(String[] args) {
    fact f=new fact();
    System.out.println("Factorial of 5 = " + f.fact(5));
  }
}
