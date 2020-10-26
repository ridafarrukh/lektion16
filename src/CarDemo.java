public class CarDemo {
    public static void main(String[] args) {

        Car car1;
        car1 = new Car();
        System.out.println(car1);

        Car car2;
        car2 = new Car();
        System.out.println(car2);

        Car car3;
        car3 = new Car();
        System.out.println(car3);

        car1.model = "Volvo";
        car1.price = 350_000;
        car1.year = 2020;

        car2.model = "Saab";
        car2.price = 250_000;
        car2.year = 2018;

        car3.model = "Audi";
        car3.price = 150_000;
        car3.year = 2015;

        System.out.println(car1.model + " kostar : " +  car1.price + " kr ");
        System.out.printf("%s kostar : %,d kr \n", car1.model,car1.price);






    }

}
