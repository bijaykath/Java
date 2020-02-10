public class Employee {
    long empId = 345L;
    Double empSalary = 10000d;
    float empTax = 9.5f;
    int empDaysofWork = 24;

    public void calculatePF(){
        float p = 10.5f;
        System.out.println("The PF Rate of Employee is " + p);

    }
}
