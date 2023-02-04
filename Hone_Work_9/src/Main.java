public class Main {
    public static void main(String[] args) {
        House house = new House("Aitmatova 36","Naryn");
        Father father = new Father(45,"Jone ", Working.DEVELOPER,house,"BMV");
        Son son = new Son(18,"Alex",Working.STUDENT,new House("Prospekt mira","Bishkek"),"moped",2);
        Son son1 = new Son(19,"Michel ",Working.STUDENT, new House("CHui 22","Bishkek"),"baik",7 );
        System.out.println(father.getInfo());
        System.out.println("=======");
        System.out.println(son.getInfo());
        System.out.println("=======");
        System.out.println(son1.getInfo());
        father.Work();
        father.Work("Development");
        father.Work(150);
        son.Work();
        son.Work("Student and study school number 2");
        son1.Work();
        son1.Work("Student and study school number 7");

    }
}