//    Object basics
//    Create Person class inside of src that has a private name field that is a string, and the following methods:
    class Person {
        private String name; //

        public String getName(){
        //TODO: return the person's name
            return  name;
        }

        public void setName(String name){
        //TODO: change the name field to the passed value
            this.name = name;
        }
        public void sayHello(){
        //TODO: print a message to the console using the person's name
            System.out.println("Hello " + getName());
        }
        //  The class (defined at line 4) should have
        //
        //  a constructor that accepts a `String` value
        public Person(String person) {
        //  and sets the person's name to the passed string
            // the constructor will instantiate a new object
            // that we can interact with when setting the fields
            this.name = person; // use .this to reinforce that it's a new object of this class
        }
        //  Create a `main` method on the class (class defined on line 22)
        public static void main(String[] args) {
        //  that creates a new `Person` object
            Person p1 = new Person("Codey");
        //  and tests the above methods

            // test getName() returns the person's name
            System.out.println(p1.getName()); // Codey

            // test setName() changes the name field to the passed value
            p1.setName("new Codey"); // sets the name need to run getName to see the new value
            System.out.println(p1.getName()); // new Codey

            // test sayHello() print a message to the console using the person's name
            p1.sayHello(); // Hello new Codey

            // test of the main method that creates a new `Person` object
            Person p2 = new Person("David");
            // test getName, setName, and sayHello
            System.out.println(p2.getName());
            p2.setName("new David");
            System.out.println(p2.getName());
            p2.sayHello();

            //    Understanding references
            //    The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

            Person p3 = new Person("John"); // this line creates a new person
            System.out.println(p3.getName()); // Adding getName to test new object
            Person p4 = new Person("John"); // this line creates a new person
            System.out.println(p4.getName()); // Adding getName to test new object
            System.out.println(p3.getName().equals(p4.getName())); // prints true
            System.out.println(p3 == p4); // prints false
        }





}
//





