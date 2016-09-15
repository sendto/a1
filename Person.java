//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

// one class needs to have a main() method
public class HelloWorld
{

  
  public static void printPersonsOlderThan(List<Person>      roster, 
                                           Predicate<Person> tester,
                                           Consumer<Person>  block,
                                           Function <Person, String> mapper
                                          ) 
  {
    for (Person p : roster) {
        if (tester.test(p)) {
            String data = mapper.apply(p);
            System.out.println("Age=" + data);
            block.accept(p);
                            }
                            }
  }

  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Person myObject = new Person(7);
    myObject.printPerson();
    List<Person> t = new ArrayList<Person>();
    t.add(0, new Person(10));
    t.add(1, new Person(11));
    System.out.println(t.size());
    
//    CheckPerson tst = new CheckPersonEligibleForSelectiveService();
//    printPersonsOlderThan(t, tst);
//    printPersonsOlderThan(t, new CheckPerson() {
//                                                public boolean test(Person p) {
//                                                                               return p.getAge() >= 10 && p.getAge() <= 25;
//                                                                              }
//                                               }
//                         );

    printPersonsOlderThan(t, 
                          (Person p) -> p.getAge() >= 10 && p.getAge() <= 25,
                          (Person p) -> p.printPerson(),
                          (Person p) -> Integer.toString(p.getAge())
                         );
    
  }
  
}

// you can add other public classes to this editor in any order
public class Person {

    private String name = "Tester";
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    private int age;
  
    public enum Sex {
        MALE, FEMALE
    }
  
    public Person(int age)
    {
      this.age = age;
    }



    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println(name + age);
    }
}
  
  interface CheckPerson {
    boolean test(Person p);
  }
  
  public class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return p.getAge() >= 9 && p.getAge() <= 25;
    }
  }
  

    
