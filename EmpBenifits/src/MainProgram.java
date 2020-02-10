public class MainProgram {
    public static void main(String[] args){
        Employee emp = new Employee();
        System.out.println("The employee Id is " + emp.empId);
        System.out.println("The salary of the employee is " + emp.empSalary);
        System.out.println("The percentof tax employee need to pay "+ emp.empTax);
        System.out.println("The total number or working days is "+ emp.empDaysofWork);

        emp.calculatePF();
    }
}
