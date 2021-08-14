package day10.Boxing;

public class Main02 {
    public static void main(String[] args) {
        Unit units = new Unit[5];
        units[0] = new AirForce("공군 1호");
        units[1] = new AirForce("공군 2호");
        units[2] = new Navy("해군 1호");
        units[3] = new Army("육군 1호");
        units[4] = new Army("육군 2호");
    }
   

}
