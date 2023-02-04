public class grandFather {
    private int age;
    private String name;
    private Working working;
    private House house;


    public grandFather(int age, String name, Working working,House house) {
        this.age = age;
        this.name = name;
        this.working = working;
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Working getWorking() {
        return working;
    }

    public String getInfo (){
        return "Age: " + age +
                "\nName: " + name +
                "\nWorking: " + working +
                "\nHouse: " + house.getAddres();
    }
}
