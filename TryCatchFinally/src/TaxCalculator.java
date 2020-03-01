public class TaxCalculator {
/*If  empSal is greater than one lakh and isIndian true
taxAmount =empSal *8/100
Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
taxAmount =empSal *6/100
Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
taxAmount =empSal *5/100
Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
 taxAmount =empSal *4/100
Otherwise
   The calculator should throw a TaxNotEligibleException.
*/
    public double calculateTax(String empName, Boolean isIndian, Double empSalary)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException  {

            if(isIndian == false){
                throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
            }

            if(empName == null || empName.equals("")){
                throw new EmployeeNameInvalidException("The employee name cannot be empty");
            }

            if(empSalary>100000 && isIndian==true){
                return empSalary*8/100;
            }
            else if(empSalary<100000 && empSalary>50000 && isIndian==true ){
                return empSalary*6/100;
            }
            else if(empSalary<50000 && empSalary>30000 && isIndian==true ){
                return empSalary*5/100;
            }
            else if(empSalary<30000 && empSalary>10000 && isIndian==true ){
                return empSalary*4/100;
            }
            else {
                throw new TaxNotEligibleException("The employee does not need to pay tax");
            }

    }

}
