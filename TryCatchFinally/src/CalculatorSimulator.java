public class CalculatorSimulator {
    public static void main (String[] args) {
        TaxCalculator taxcal = new TaxCalculator();
        try {
         //   System.out.println("Tax amount is : " + taxcal.calculateTax("Ron", false, 34000d));
         //   System.out.println("Tax amount is : " + taxcal.calculateTax("Jack", true, 55000d));
         //   System.out.println("Tax amount is : " + taxcal.calculateTax("", true, 30000d));
            System.out.println("Tax amount is : " +
                    taxcal.calculateTax("Tim", true, 1000d));
        }
        catch (TaxNotEligibleException ex){
            System.out.println(ex.getMessage());

        }
        catch (CountryNotValidException ex){
            System.out.println(ex.getMessage());
        }
        catch (EmployeeNameInvalidException ex){
          //  ex.printStackTrace();
              System.out.println(ex.getMessage());
        }
    }
}
