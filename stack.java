import java.util.*;

public class stacks {
    ArrayList<Integer> stack;
    int size, top = -1;

    stacks(int s) {
        size=s;
        stack = new ArrayList<Integer>(s);

    }

    void push() {
        Scanner sc = new Scanner(System.in);
        if (top + 1 >= size) {
            System.out.println("overflow");
        } else {
            top++;
            System.out.println("enter element");
            int ele = sc.nextInt();
            stack.add(ele);

        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("underflow");
        } else {
            stack.remove(top);
            top--;
        }
    }

    void display() {
            System.out.println("Stack elements are: " + stack);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size = sc.nextInt();
        stacks s = new stacks(size);
        int ch;
        
        while(true){
            System.out.println("1.push /n 2.pop /n 3.display /n 4.exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:s.push();
                break;
                case 2:s.pop();
                break;
                case 3:s.display();
                break;
                case 4:return ;
                default:
                System.out.println("error");
            }
        }
      
    }
}
