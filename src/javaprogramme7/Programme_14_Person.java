package javaprogramme7;

/**
 * Write a class with the name Person.
 * The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
 */

public class Programme_14_Person {
    //Instance variable
    String firstName;
    String lastName;
    int age;
    public String getFirstName (){
        return this.firstName ;
    }
    public String getLastName () {
        return this.lastName ;
    }
    public int getAge() {
        return this.age;
    }
    //Setter method
     public void setFirstName (String firstName ){
        this.firstName = firstName ;
     }
     public void setLastName (String lastName ){
        this.lastName = lastName ;
     }
     public void setAge (int age ){
        if(age < 0|| age > 100){
            this.age = 0;
        }else{ this.age = age; }
     }
     public boolean isTeen(){
        return(age > 12 && age < 20);
     }
     public String getFullName(){
        if(firstName .isEmpty() && lastName.isEmpty()) {
          return""  ;
        } else if (firstName .isEmpty() ) {
            return lastName ;
        }else if(lastName .isEmpty() ){
            return firstName ;
        }else{
            return firstName + " "+ lastName ;
        }
     }
     public static void main(String [] args ){
        Programme_14_Person person = new Programme_14_Person() ;
        person.setFirstName("")  ;
        person .setLastName(" ");
        person .setAge(10);
         System.out.println("fullName =" + person .getFullName() );
         System.out.println("teen =" + person .isTeen() );
         person .setFirstName("john") ;
         person .setLastName("Smith");
         person .setAge(18) ;
         System.out.println("fullName =" + person .getFullName());
         System.out.println("teen =" + person .isTeen());

     }
}

