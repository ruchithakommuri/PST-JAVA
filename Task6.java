import java.util.Scanner;

abstract class Vehicle {
    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {
    int calculateFare(int distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    int calculateFare(int distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    int calculateFare(int distance) {
        return distance * 12;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            Vehicle vehicle;

            if (type.equals("Bike")) {
                vehicle = new Bike();
            } else if (type.equals("Auto")) {
                vehicle = new Auto();
            } else {
                vehicle = new Cab();
            }

            System.out.println(vehicle.calculateFare(distance));
        }

        sc.close();
    }
}
