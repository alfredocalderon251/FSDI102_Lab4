class ExampleTwo{

    public static void main(String args[]){

        Person p1=new Person("Alfredo",31);
        Employee e1=new Employee(1234567,"Adrian",31);

        Employee e2=new Employee(1,"John",25);
        Employee e3=new Employee(2,"Steve",27);

        Animal a1=new Animal("Lion");

        Animal a2=new Animal("Dragon");
        Animal a3=new Animal("Tiger");

        System.out.println(p1.getName()+" "+p1.getAge());
        System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary());

        a1.attack(p1.getName());

        a1.attack(e1);

        a2.attack(e2);
        a2.attack(e3);

        a3.attack(e3);
        a3.attack(e2);

        a2.attack(p1);

        
    }
}