public class Main {

    public static void main(String[] args) {
        task1 t1 = new task1(4);
        System.out.println(t1.calculate());

        task2 t2 = new task2();
        System.out.println(t2.outputFor());
        System.out.println(t2.outputWhile());


        task3 t3 = new task3();
        System.out.println(t3.task3());

        task4 t4 = new task4();
        System.out.println(t4.task4());
    }
}
