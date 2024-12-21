public class GoodDogTestDrive {

    public static void main(String[] args){
        GoodDog max = new GoodDog();
        max.setSize(70);
        GoodDog maxSon = new GoodDog();
        maxSon.setSize(8);
        System.out.println("Father: " + max.getSize() );
        System.out.println("Son: " + maxSon.getSize());
        max.bark();
        maxSon.bark();


    }
}
