import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Employee sınıfı tanımlanıyor
class Employee implements Comparable<Employee> {  // Generics kullanarak type safety sağlıyoruz
    String name;
    double salary;

    // Constructor (yapıcı metot) ile name ve salary atanıyor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Employee bilgilerini yazdırmak için Object class'ından gelen bu metot override edilmiştir.
    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

  
 /*
    @Override                                         Generic kullanılmadan Comparable implemen edilseydi.
    public int compareTo(Object other) {
        if(other instanceof Employee){
            Employee emp = (Employee)other;
            return this.getName().compareTo(emp.getName());
        }

        throw new UnsupportedOperationException();
    }

*/

    @Override
    public int compareTo(Employee other) {  // İsme göre compare eder.
        return this.getName().compareTo(other.getName());
      
    }
}
/*
  @Override
    public int compareTo(Employee other) {  
        if(other instanceof Employee){
        Employe emp = (Empoyee)other;
        return (int) Math.round((this.getSalary()-emp.getSalary()));
        }else{

        throw new RuntimeException("An error occured.")}
      
    } 



 */


/*
  Ana sınıf, Java uygulamanızın giriş noktasıdır. 
  Java programı çalıştırıldığında JVM (Java Virtual Machine), 
  belirtilen ana sınıfı bulur ve içindeki main metodunu çalıştırır.
  

  Bir Java dosyasında en fazla bir adet public sınıf bulunabilir. 
  Eğer bir dosyada bir public sınıf varsa, dosya adı bu sınıfın adıyla aynı olmalıdır. Bu da ana sınıf mıdır.s

 */

public class BuiltinInterfacesComparable {


    public static void writelist(Iterable<Employee> collection) 
    {
        for (Employee item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args)
    {
        // Liste oluşturulurken elemanlar geçiriliyor
        List<Employee> employees = Arrays.asList(
            new Employee("John Doe", 5000),
            new Employee("Jane Smith", 6000),
            new Employee("Alice Johnson", 5500)
        );

        writelist(employees);
        System.out.println("---------------");
        // Listeyi sıralıyoruz


        Collections.sort(employees);

        // Liste elemanları tekrar yazdırılıyor
        writelist(employees);
    }
}

/*
Arrays.asList(...), Java'da bir veya birden fazla elemanı alıp bunları bir listeye dönüştürür.
Bu metod, diziyi listeye çevirmek için kullanılır ve sabit boyutlu bir liste döndürür.
Yani, bu listeye sonradan eleman ekleyemez veya çıkaramazsın, ama liste elemanlarını
değiştirebilirsin. 
*/
