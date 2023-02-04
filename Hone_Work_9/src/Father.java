public class Father extends grandFather {
    private String car;

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nCar:" + car;

    }

    public Father(int age, String name, Working working, House house, String car) {
        super(age, name, working, house);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void Work(){
        System.out.println("Development");
    }

    public void Work(String working){
        System.out.println(Working.DEVELOPER);
    }

    public final void Work(int speedCar){
        System.out.println("Скорость машины: " + speedCar);

    }


}