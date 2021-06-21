//using in built functions

import java.util.*;

public class SinglyLinkedList {
    
    static class node {
        int info;
        node next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> newnode = new LinkedList<Integer>();

        while(true) {
            System.out.println("Please select one:");
            System.out.println("1.Insert at beginning \n2.Insert at end \n3.Insert after \n4.Insert before");
            System.out.println("5.Delete at beginning \n6.Delete at end \n7.Delete after \n8.Delete before \n9.Display \n10.Exit");
            int ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("Enter value to be entered:");
                    int val1 = sc.nextInt();
                    newnode.addFirst(val1);
                    break;
                case 2:
                    System.out.println("Enter value to be entered:");
                    int val2 = sc.nextInt();
                    newnode.addLast(val2);
                    break;
                case 3:
                    System.out.println("Enter value to be entered:");
                    int val3 = sc.nextInt();
                    System.out.println("Enter position after which node to be entered:");
                    int pos1 = sc.nextInt();
                    newnode.add(pos1+1, val3);
                    break;
                case 4:
                    System.out.println("Enter value to be entered:");
                    int val4 = sc.nextInt();
                    System.out.println("Enter position before which node to be entered:");
                    int pos2 = sc.nextInt();
                    newnode.add(pos2-1, val4);
                    break;
                case 5:
                    System.out.println("Deleted element is " + newnode.get(0));
                    newnode.removeFirst();
                    break;
                case 6:
                    System.out.println("Deleted element is " + newnode.get(newnode.size()-1));
                    newnode.removeLast();
                    break;
                case 7:
                    System.out.println("Enter position after which node to be deleted:");
                    int pos3 = sc.nextInt();
                    System.out.println("Deleted element is " + newnode.get(pos3+1));
                    newnode.remove(pos3+1);
                    break;
                case 8:
                    System.out.println("Enter position before which node to be deleted:");
                    int pos4 = sc.nextInt();
                    System.out.println("Deleted element is " + newnode.get(pos4-1));
                    newnode.remove(pos4-1);
                    break;
                case 9:
                    System.out.println(newnode);
                    break;
                case 10:
                    System.exit(0);
            }
        }
    }
}
/*
Divitas-MacBook-Air:java divita$ javac SinglyLinkedList.java
Divitas-MacBook-Air:java divita$ java SinglyLinkedList
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
1
Enter value to be entered:
10
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
2
Enter value to be entered:
20
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
2
Enter value to be entered:
30
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
2
Enter value to be entered:
40
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
2
Enter value to be entered:
50
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[10, 20, 30, 40, 50]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
5
Deleted element is 10
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[20, 30, 40, 50]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
6
Deleted element is 50
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[20, 30, 40]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
3
Enter value to be entered:
10
Enter position after which node to be entered:
2
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[20, 30, 40, 10]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
1
Enter value to be entered:
50
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[50, 20, 30, 40, 10]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
4
Enter value to be entered:
60
Enter position before which node to be entered:
2
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[50, 60, 20, 30, 40, 10]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
6
Deleted element is 10
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[50, 60, 20, 30, 40]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
7
Enter position after which node to be deleted:
2
Deleted element is 30
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[50, 60, 20, 40]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
8
Enter position before which node to be deleted:
1
Deleted element is 50
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
9
[60, 20, 40]
Please select one:
1.Insert at beginning 
2.Insert at end 
3.Insert after 
4.Insert before
5.Delete at beginning 
6.Delete at end 
7.Delete after 
8.Delete before 
9.Display 
10.Exit
10
Divitas-MacBook-Air:java divita$ 
*/