package upmc;

public class tp6 {

    public static void main(String[] args) {
//        tp6 test = new tp6();
//        test.exo3();
//        Person pp = new Person(18);
//        
//        System.out.println(pp.age);
//        Person.make_new(pp);
//        System.out.println(pp.age);
        ArrayList<Integer> test = new ArrayList();
        for (int i = 0; i < 25; i++) {
            test.add(i);
        }
        
        test.add(5);
        Integer remove2 = test.get(20);
        //test.remove(25);
        //test.remove(remove2);
        System.out.println(test.remove(remove2));
        System.out.println(test.get(20));
    }


}
