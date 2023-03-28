class App {
    public static void main(String[] args) {
        Bag b = new Bag();
        for (;;) {
            System.out.println("1.Add    2.Remove    3.Display Details    4.Exit");
            switch (b.sc.nextInt()) {
                case 1:
                    b.add();
                    break;
                case 2:
                    b.remove();
                    break;
                case 3:
                    b.display();
                    break;
                case 4:
                    System.exit(4);

            }
        }
    }
}
