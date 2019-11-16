public class Main {

    public static void main(String[] args) {7
        // need to sort out after 20
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                task1 myObject = new task1(i, j);
                System.out.println(myObject.getResult());
            }
        }

        task2 t2 = new task2(5 , 4, "Relevance Factor -");
        System.out.println(t2.getTersonomy());
        task2 t2v = new task2(5 , 6, "Relevance Factor -");
        System.out.println(t2v.getTersonomy());

        task3 t3 = new task3(1, "=", true);
        System.out.println(t3.getIVal() + t3.getSVal() + t3.getBVal());

        task4 t4 = new task4(5, 6, "TEST ");
        System.out.println(t4.getTersonomy());
        t4.update(5,2);
        System.out.println(t4.getTersonomy());
        System.out.println(t4.getTersonomy());
        System.out.println(t4.getTersonomy());
        t4.update(3,1);
        System.out.println(t4.getTersonomy());
        t4.update(3,2);
        System.out.println(t4.getTersonomy());
        System.out.println(t4.getTersonomy());
    }
}
