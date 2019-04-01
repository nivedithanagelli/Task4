import java.util.Scanner;
import java.util.Stack;
public class QueueUsingTwoStacks{
    public static void main(String []args){
        Stack<Long> stack1=new Stack<Long>();
        int q;
        long x;
        int type;
        Scanner s=new Scanner(System.in);
        q=s.nextInt();
        for(int i=0;i<q;i++){
            type=s.nextInt();
            switch(type){
                case 1:x=s.nextLong();
                stack1.push(x);
                break;
                case 2:stack1.remove(0);
                break;
                case 3:System.out.println(stack1.get(0));
                break;
            }
        }
        s.close();
    }
}
