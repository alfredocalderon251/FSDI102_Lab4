class Animal{

    private String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void attack(String n){
        System.out.println(this.name+" attacks "+n);
    }

    public void attack(Employee n){
        System.out.println(this.name+" attacks "+n.getName());
    }

    public void attack(Person n){
        System.out.println(this.name+" attacks "+n.getName());
    }
}