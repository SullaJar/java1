package java1.lesson5.homework;

public class TestEmployee {

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Ivanov" , "manager" , "ivanov@gmail.com",
                "89113754578", 30000, 18);
        employeeArray[1] = new Employee("Petrov" , "HR" , "petrov@gmail.com",
                "89219006757", 50000, 41);

        employeeArray[2] = new Employee("Sidorov" , "engineer" , "sidorov@gmail.com",
                "89114569090", 60000, 35);

        employeeArray[3] = new Employee("Vasechkin" , "IT" , "vasechkiv@gmail.com",
                "89053458990", 90000, 31);

        employeeArray[4] = new Employee("Sitnikov" , "SEO" , "sitnikov@gmail.com",
                "9995080", 150000, 45);


        for (int i = 0; i<employeeArray.length; i++) {
            if (employeeArray[i].getAge() >=40) {
                employeeArray [i].printInfo();
            }
        }



    }
}
