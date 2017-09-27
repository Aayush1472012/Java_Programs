class Box{
  double length,breadth,height;
}
class BoxDemo{
  public static void main(String[] args) {
    Box myBox= new Box();
    myBox.length=10;
    myBox.breadth=10;
    myBox.height=10;
    double vol=myBox.length*myBox.breadth*myBox.height;
    System.out.println("Volume = " + vol);
  }
}
