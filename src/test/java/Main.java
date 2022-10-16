public class Main  {
    public static void main(String[] args) {
        AbstractExample ae = new AbstractExample() {
            @Override
            void multiply() {
                int a= 4;
                int b=3;
                System.out.println(a*b);
            }

            @Override
            public void division() {
                int a =5 ;
                int b=4;
                System.out.println(a/b);

            }
        };
        ae.add();
        ae.substract();
        ae.multiply();
        ae.division();
        Employee chandu = new Employee("chandu","prahallad",27);
        System.out.println(chandu);

    }
}
