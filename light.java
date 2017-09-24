//COmpute distance light travels using long int
class light{
  public static void main(String args[]) {
    int light_speed;
    long days;
    long seconds;
    long distance;
    //approx speed of light in miles per second
    light_speed=18600;
    days=1000;
    seconds=days*60*60*24;
    distance=light_speed*seconds;
    System.out.println(distance);
  }
}
