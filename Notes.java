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
       public void funct(String s) {  // This is overloading
           
       }
   }
   
   class B extends A {
       @override
       public void funct(int x) {   // This is overriding
           
       }
   }

7. 
