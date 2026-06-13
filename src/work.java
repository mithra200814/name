/*
public class work{
    interface Employee {

        String solveProblem();

        String work();
    }
    static class BankEmployee implements Employee {
        String name;
        String id;
        int salary;

        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public String solveProblem() {
            System.out.println("problem solved");
            return "Problem Solved";
        }

        @Override
        public String work() {
            System.out.println("Work Finished");
            return "Work Finished";
        }

        void display() {
            System.out.println("Name:" + "name");
            System.out.println("ID:" + "id");
            System.out.println("Salary:" + "salary");
        }
    }
    class CheckingEmployee implements Employee {
        @Override
        public String solveProblem() {
            System.out.println("Problem Solved...");
            return "Problem Solved";
        }

        public String work() {
            System.out.println("Work Finished");
            return "Work Finished";
        }
    }
    */


public class work{
    interface Employee {
        String Name();
        String id();
        String Salary();
    }
    static class BankEmployee implements Employee {
        @Override
        public String Name() {
            return "Jai Shree";
        }
        @Override
        public String id() {
            return "105";
        }
        @Override
        public String Salary() {
            return "90000";
        }
        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }
    static class CheckingEmployee implements Employee {
        @Override
        public String Name() {
            return "Mithra Jii";
        }
        @Override
        public String id() {
            return "102";
        }
        @Override
        public String Salary() {
            return "50000";
        }
        public String work() {
            System.out.println("process");
            return "process";
        }
    }
    public static void main(String[] args) {
        BankEmployee bank = new BankEmployee();
        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.Salary());
        bank.solveprogram();
        System.out.println();
        CheckingEmployee checking = new CheckingEmployee();
        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.Salary());
        checking.work();
    }
}








