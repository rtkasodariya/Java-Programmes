1.	Java is fully Pass by value.
2.	Objcts are actually pointers.
3.	String – String Buffer – String Builder
    >> String :
    o	String is Immutable class. We can’t change modify string once created.
    o	String str=”abc”;  
      str.concat(“d”); 
      still str would be str=”abc”.
  
  	>> StringBuffer :
    StringBuffer str=new StringBuffer("abc");
    str.append("d");
    System.out.println(str); // "abcd"

    >> StringBuilder : 
    -> It is not synchronizes so It can't be used in Threads. StringBuffer is better for this.
    
    Conclusion:
        >>  Objects of String are immutable, and objects of StringBuffer and StringBuilder are mutable.
        >>  StringBuffer and StringBuilder are similar, but StringBuilder is faster and preferred over 
             StringBuffer for single threaded program. If thread safety is needed, then StringBuffer is used.

4. int defaultVariable              //  Visible and accesed to same package 
   public int publicVariable        //  Visible to all packages
   private int privateVariable      //  Visible to only class in which it is declared 
   protected int protectedVariable  //  Visible to same package and inherited classes from different pakages. 
   
5. final variable  :- Can't change the value
   final method    :- can't @override method
   final class     :- can't extend this class
   
6. overriding Vs Overloading :
   class A {
       public void funct(int x) {
           
       }
       public void funct(String s) {  // This is overloading (Same function different parameter)
           
       }
   }
   
   class B extends A {
       @override
       public void funct(int x) {   // This is overriding (Same function  , 
                                    // Same parameter but does different work)
       }
   }

7. Interface :
   >> It represents actions that a class can perform.
   >> In interface everything is " public static final "
   >> Just a structure , class which implements interface must complete (@override ) all the methods
   
8. Interface vs. Abstract class
    >> public abstract class A {
        
    }
    >> Instacnce of abstract class can't be created.
    >> abstract class is not complete. Need to create sub class tocomplete abstract class.
    >> Methods can be defined in a abstract class which is not possible in interface.
    >> Abstract class can contain non static methods and variables.
    
9. Anonymous class :
    >> make class without name
    >> when required only once , no need to declare class.
    
10. Wrapper classes :
    >> class representing premitive variables.
    >> Exa. Boolean , Byte , Character , Double , Float , Integer , Long , Short
            boolean   byte   char        double   float   int       long   short
    >> Gives more functionalities.
    >> Wrapper objects are immutabe.
    >> Auto Boxing : Integer x=new integer(10); while
                     Integer y=10; both are allowed. 
        Behind the screen java automatically does 'new Integer(10)' for y
    >> x++ is also allowed.
    
11. Variable Arguments :
    public int sum(int... numbers) {
        int sum=0;
        
        for(int n:numbers) {
            sum+=n;
        }
        
        return sum;
    }
   
   
12. toString() Method :
    >> Represents class description .
    >> class has inbuilt toString() method.
    >> System.out.println(animal);   // package_name @ memory_location
    >> we can override it.
    >> public String toString() {
            return "Animal is " + name;
        }

13. Coupling :
    >> measure of => How much a class change when other class changes.
    >> There should be minimum coupling.
    >> class much don't know about inner items of other classes.
    >> class design must be like if we change variables and structure of one class then other class must not affect.
    >> Instead of direct accesing variables try to design method that returns variable. So evenif we change variable name
       other class won't be affected.
       
14. Cohesion :
    >> measure of how related of the responsibilities of class are.
    >> Different classes have their different responsibilities. => cohesion
    >> 3 tasks : Download , parse , store )) Instead doing everything in one class do it in separate classes.
    
 15. Inner Class :
    >> class inside other class/method.
    >> must try to avoid.
    >> 2 types : 1) Normal 2) Static
    
16. Constructor :
    >> Chaining :
      class A {
          int x;
          A(int x) {
              this.x=x;
          }
      }
      
      class B extends A {
          int y;
          B(int x,int y) {
              super(x);         // This is called chaining , there is a chain of constructor
              this.y=y;
          }
      }
      
    >> Copy Constructor :
        To make new instance of same class
        
        class student {
            String name;
            int marks;
            
            Student(String name , int marks) {
                this.name=name;
                this.marks=marks;
            }
            
            Student(Student s) {   // copy constructor
                name=s.name;
                marks=s.marks;
            }
        }
    
        So how to use ?
        Student student=new Student("X",10);
        Student studentcopy =new Student(student);  

17. Asserts :
    >> program asserts when condition is false.
     > assert(money>0);
    >> assert with log message.
     > assert(money>0):"Error mesage";
     
18. Collection :

19. Serialization :
    

    
    
    

