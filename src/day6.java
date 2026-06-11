import java.util.Scanner;

public class day6 {
    /*
     static class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        Car(String color, String brand, int speed, int fuel) {
            this.color = color;
            this.brand = brand;
            this.speed = speed;
            this.fuel = fuel;
        }
        void Car(String fuel){
             fuel+=speed;
             this.speed=speed;
        }
        void expense(int expense){
            fuel-=expense;
        }
        void showFuel(){
            System.out.println("your fuel is:"+fuel);
        }
        void Accelerate(){
            speed+=fuel;
        }
        void accelerate(int accelerate){
            speed+=accelerate;
        }
        void printDetails(){
            System.out.println("color:"+color);
            System.out.println("brand:"+brand);
            System.out.println("speed:"+speed);
            System.out.println("fuel:"+fuel);
        }
    }
    public static void main(String[]args){
       Car car=new Car("blue","tesla",200,100);
        car.printDetails();
        car.showFuel();
        car.expense(1000);
        car.showFuel();
    }
    }
*/
static class Student {
        String name;
        int regno;
        String department;
        int mathsMarks;
        int phyMarks;
        int cseMarks;

        Student(String name, int regno, String department, int mathsMarks, int phyMarks, int cseMarks) {
            this.name = name;
            this.regno = regno;
            this.department = department;
            this.mathsMarks = mathsMarks;
            this.phyMarks = phyMarks;
            this.cseMarks = cseMarks;
        }

        void printDetails() {
            System.out.println("name:" + name);
            System.out.println("regno:" + regno);
            System.out.println("department:" + department);
            System.out.println("mathsMarks:" + mathsMarks);
            System.out.println("phyMarks:" + phyMarks);
            System.out.println("cseMarks:" + cseMarks);
        }
    }public static void main(String[]args){
         Student student=new Student("mithra",28,"Bsc computer science",90,89,96);
         student.printDetails();
    }

}
