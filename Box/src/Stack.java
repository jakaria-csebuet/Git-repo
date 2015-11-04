/**
 * Created by MD on 23/09/2015.
 */
public class Stack {
    int stck[] = new int[10] ;
    int tos ;

    Stack(){
        tos = -1 ;
    }

    void push(int item){
        if(tos > 9){
            System.out.println("Stack is full");
            return;
        }
        else
            stck[++tos] = item ;
    }

    int pop(){
        if(tos < 0){
            System.out.println("Stack is empty");
            return -1 ;
        }
        else
            return stck[tos--] ;
    }
}
