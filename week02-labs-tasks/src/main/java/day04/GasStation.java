package day04;

public class GasStation {

    private int uzemanyagAr;

    public GasStation(int uzemanyagAr) {
        this.uzemanyagAr = uzemanyagAr;
    }

    public int tankolas (Car car,int liter) {

        car.setLiter(liter);
        return liter*uzemanyagAr;
    }

    public static void main(String[] args) {
        Car car = new Car();
        GasStation gs = new GasStation(1000);

        car.setDistance(100);

        System.out.println(gs.tankolas(car,30));
        System.out.println(car.fogyasztas());
    }

}