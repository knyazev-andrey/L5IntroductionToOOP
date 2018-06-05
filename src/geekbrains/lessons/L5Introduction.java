package geekbrains.lessons;

/**
 * @author Andrey Knyazev
 * @version dated by 05.06.2018
 */

public class L5Introduction {

    public static void main(String[] args) {
        Employee[] arrayOfEmployees = new Employee[5];
        arrayOfEmployees[0] = new Employee("Ivan Ivanov", "cleaning manager", "vano@mail.ru", "+79607226056", 35000, 51);
        arrayOfEmployees[1] = new Employee("Vasiliy Vasiliev", "courier", "vasyan@gmail.com", "+79034075528", 25000, 19);
        arrayOfEmployees[2] = new Employee("Aleksandr Aleksandrov", "office manager", "sanek@yandex.ru", "+79166121515", 110000, 34);
        arrayOfEmployees[3] = new Employee("Andrey Andreev", "advertising director", "dron@mail.ru", "+79155779860", 200000, 47);
        arrayOfEmployees[4] = new Employee("Sergey Sergeev", "general director", "seryoga@mail.ru", "+79065881364", 560000, 43);
        for (Employee employee : arrayOfEmployees) {
            if (employee.getAge() > 40) {
                System.out.println(employee.showInformation());
                System.out.println();
            }

        }
    }
}

class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void setFullName(String fullName) {
        if (fullName != null && fullName != "" && fullName.contains(" ")) this.fullName = fullName;
    }

    String getFullName() {
        return fullName;
    }

    void setPosition(String position) {
        if (position != null && position != "") this.position = position;
    }

    String getPosition() {
        return position;
    }

    void setEmail(String email) {
        if (email != null && email != "" && email.contains("@")) this.email = email;
    }

    String getEmail() {
        return email;
    }

    void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber != "" && phoneNumber.contains("+79") && phoneNumber.length() == 12)
            this.phoneNumber = phoneNumber;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setSalary(int salary) {
        if (salary > 0 && salary <= 500000) this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    void setAge(int age) {
        if (age > 18 && age <= 65) this.age = age;
    }

    int getAge() {
        return age;
    }

    String showInformation() {
        String information = "Full name: " + fullName + "\n" + "Position: " + position + "\n" + "Email: " + email + "\n" + "Phone number: " + phoneNumber + "\n" + "Salary: " + salary + " rubles" + "\n" + "Age: " + age;
        return information;
    }

}

