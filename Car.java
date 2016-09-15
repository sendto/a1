//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************
import java.lang.*;
import java.util.*;
  
public class Car {
  static int engine;
  static final int CHASSIS = 0x1;
  int[] timingOnTest = new int[10];
  String[] factorySet = {"TMZ", "VAZ", "MAZ"};
  int wheels;
  int gears;
  float v_long;
  String fuel;// = new String();
  public Car(String p_fuel,
             float  p_v_long
            ){
    fuel = p_fuel;
    v_long = p_v_long;
  };
  public void change_wheels(int p_wheels){
    wheels = p_wheels;
  };
  public void set_engine(int engine){
    this.engine = engine;
  };
  public void set_gears(int gears){
    this.gears = gears;
  };
  
  public void set_timing(byte index , int time){
    timingOnTest[index] = time;
  };
  
  public void print(){
    System.out.println("engine(sh_"+  CHASSIS + ")" + engine + ", fuel=" + fuel + ", wheels=" + wheels + ", gears=" + gears + ", v_long=" + v_long);
  };
  
  public void print_timing(){
    System.out.println(factorySet[0] + " timingOnTest[0]=" + String.valueOf(timingOnTest[0]) + ",timingOnTest[1]=" + String.valueOf(timingOnTest[1]));
  };
  
};

interface Action{
  abstract void set_on_repair(int set_hours);
};

public class Truck extends Car implements Action{
  int ladle;
  //int k;
  int[] ladleSize = {1000, 200, 777};
  int h_to_repair;
  static final char type_ladle = '\u0108';
  public Truck(String p_fuel,
               float  p_v_long
              ){
    super(p_fuel, p_v_long);
  };
  public void set_ladle(int ladle){
    this.ladle = ladle;
  };
  public void print(){
    System.out.println("engine(sh_"+ super.CHASSIS + ")" + super.engine + ", fuel=" + super.fuel + ", wheels=" + super.wheels + ", gears=" + super.gears + ", v_long=" + super.v_long + ", ladle=" + ladle + ", h_to_repair=" + h_to_repair);
    System.out.println("type_ladle=" + type_ladle);
    System.out.print("ladleDimension:");
    //int[] ladleSize_copy = new int[3];
    //System.arraycopy(ladleSize, 0, ladleSize_copy, 0, ladleSize.length);
    int[] ladleSize_copy = Arrays.copyOfRange(ladleSize, 0, ladleSize.length);
    int k;
    Arrays.sort(ladleSize_copy);
    for(int i = 0; i < ladleSize_copy.length; i++) 
      System.out.print(" " + ladleSize_copy[i]); 
    System.out.println();
    //System.out.println(k);
    //System.out.println(this.k);
    
    
    
  };
  public void set_on_repair(int set_hours){
    h_to_repair = set_hours;
  };
   
};

public class App {
  public static void main(String[] args){
    Car car = new Car("gasoline", 5F);
    car.change_wheels(8);
    car.set_gears(5);
    car.set_engine(1);
    car.print();
    car.set_timing((byte)0, 200);
    car.set_timing((byte)1, 800);
    car.print_timing();
    System.out.println("");
    Truck truck = new Truck("diesel", 5.4F);
    truck.change_wheels(20);
    truck.set_on_repair(200);
    truck.set_ladle(9);
    truck.print();
    truck.set_timing((byte)0, 20);
    truck.set_timing((byte)1, 80);
    truck.print_timing();
    System.out.println();
    System.out.println(truck instanceof Car);
  }
    
};
