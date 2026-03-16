import java.util.*;

class Ride {
    int baseFare;

    Ride(int baseFare) {
        this.baseFare = baseFare;
    }

    int calculateFare(int distance) {
        return baseFare;
    }
}

class Mini extends Ride {

    Mini(int baseFare) {
        super(baseFare);
    }

    @Override
    int calculateFare(int distance) {
        return baseFare + (distance * 5);
    }
}

class Sedan extends Ride {

    Sedan(int baseFare) {
        super(baseFare);
    }

    @Override
    int calculateFare(int distance) {
        return baseFare + (distance * 10);
    }
}

class SUV extends Ride {

    SUV(int baseFare) {
        super(baseFare);
    }

    @Override
    int calculateFare(int distance) {
        return baseFare + (distance * 15);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rideType = sc.next();
        int baseFare = sc.nextInt();
        int distance = sc.nextInt();

        Ride ride;

        if (rideType.equals("Mini")) {
            ride = new Mini(baseFare);
        } 
        else if (rideType.equals("Sedan")) {
            ride = new Sedan(baseFare);
        } 
        else {
            ride = new SUV(baseFare);
        }

        int finalFare = ride.calculateFare(distance);

        System.out.println("Final Fare: " + finalFare);
    }
}