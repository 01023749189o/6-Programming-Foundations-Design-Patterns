public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone) {
    this.drone = drone;
    }
    public void quack() {
    drone.beep();
    }

    public void fly() {
    drone.spin_rotors();
    drone.take_off();
    }
}
public interface Drone {
    public void beep();
    public void spin_rotors();
    public void take_off();
}
public class SuperDrone implements Drone {
    public void beep() {
    System.out.println("Beep beep beep");
    }
    public void spin_rotors() {
    System.out.println("Rotors are spinning");
    }
    public void take_off() {
    System.out.println("Taking off");
    }
}

public class Duck Simulator {
    public static void main(String[] args) {
        // Test the duck and turkey...
        // Challenge
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter (drone);
        testDuck(droneAdapter);
    }
    static void testDuck (Duck duck) {
        duck.quack();
        duck.fly();
    }
}