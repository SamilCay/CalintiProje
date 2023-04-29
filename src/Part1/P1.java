package Part1;

public class P1 {
    public P1(String carNumber, String carUser, String carBrand, String howManyHoursYouPark) {
        this.carNumber = carNumber;
        this.carUser = carUser;
        this.carBrand = carBrand;
        this.howManyHoursYouPark = howManyHoursYouPark;
    }

    @Override
    public String toString() {
        return "P1{" +
                "carNumber='" + carNumber + '\'' +
                ", carUser='" + carUser + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", howManyHoursYouPark=" + howManyHoursYouPark +
                '}';
    }

    static String carPark = "Central Park";
    static int capacityForCars = 10 ;
    String carNumber ;
    String carUser ;
    String carBrand ;
    String howManyHoursYouPark ;

    public static void main(String[] args) {

    }
}
