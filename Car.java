public class Car {
    private int total_seats;
    private int total_wheels;

    public Car(int total_seats, int total_wheels) {
        this.total_seats = total_seats;
        this.total_wheels = total_wheels;
    }
    
    public int getNo_of_wheels() {
        return total_wheels; }

    public int getNo_of_seats() {
        return total_seats; }
    
    public static void main(String[] args) {
        Car motorcycle = new Car(1, 2);

        Car car = new Car(4, 4);

        System.out.println("\nCar Description:");
        displayVehicleDescription(car);

        System.out.println("Motorcycle Description:");
        displayVehicleDescription(motorcycle);
    }

    public static void displayVehicleDescription(Car vehicle) {
        System.out.println("Number of Seats: " + vehicle.getNo_of_seats());
        System.out.println("Number of Wheels: " + vehicle.getNo_of_wheels());
    }
}