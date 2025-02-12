import java.util.Arrays;
import java.util.List;

// Employee sınıfı tanımlanıyor
class Employee {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Constructor (yapıcı metot) ile name ve salary atanıyor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Employee bilgilerini yazdırmak için Object class'ından gelen bu metot
    // override edilmiştir.
    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

}

class BuiltinInterfacesIterable {

    // Liste elemanlarını yazdırmak için statik metod ve Iterable ınterface kullanımı
    public static void writelist(Iterable<Employee> collection) {
        for (Employee item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Liste oluşturulurken elemanlar geçiriliyor
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 5000),
                new Employee("Jane Smith", 6000),
                new Employee("Alice Johnson", 5500));

        // Liste elemanları yazdırılıyor
        writelist(employees);
    }

}

/*
 * Arrays.asList(...), Java'da bir veya birden fazla elemanı alıp bunları bir
 * listeye dönüştürür.
 * Bu metod, diziyi listeye çevirmek için kullanılır ve sabit boyutlu bir liste
 * döndürür.
 * Yani, bu listeye sonradan eleman ekleyemez veya çıkaramazsın, ama liste
 * elemanlarını
 * değiştirebilirsin.
 */
