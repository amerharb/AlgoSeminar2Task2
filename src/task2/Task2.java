package task2;

public class Task2
{

    public static void main(String[] args)
    {
        while (true) {
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String ans;

            System.out.println("Enter the Value of M");
            System.out.print("M=");
            ans = sc.nextLine();
            if (ans.toLowerCase().contains("exit")) {
                break;
            }
            int m;
            try {
                m = Integer.parseInt(ans);
            } catch (Exception e) {
                System.out.println("Invalid input");
                continue;
            }

            System.out.println("Enter the Value of N");
            System.out.print("N=");
            ans = sc.nextLine();
            if (ans.toLowerCase().contains("exit")) {
                break;
            }
            int n;
            try {
                n = Integer.parseInt(ans);
            } catch (Exception e) {
                System.out.println("Invalid input");
                continue;
            }

            class Person
            {

                final String name;

                public Person(String name)
                {
                    this.name = name;
                }
            }

            CircularDoubleLinkedList<Person> l;
            l = new CircularDoubleLinkedList();

            for (int i = 0; i < n; i++) {
                l.add(new Person("P: " + (i + 1)));
            }
            l.next(); // return the pointer to the first person added
            System.out.println("start from "+  l.peek().name);
            while (l.size() > 1) {
                for (int i = 0; i < m; i++) {
                    l.next();
                }
                System.out.println("Element " + l.remove().name);
            }
            System.out.println("last one remain" + l.peek().name);
        }
    }

}
