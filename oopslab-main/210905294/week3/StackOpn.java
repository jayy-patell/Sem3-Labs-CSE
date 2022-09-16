import java.util.Scanner;

class Stack
{
    int arr[];
    int tos;
    Scanner sc = new Scanner(System.in);
    void initialize(){
        tos=-1;
        System.out.println("Enter size of stack: ");
        int n = sc.nextInt();
        arr = new int[n];
    }
    void push(){
        System.out.println("Enter a number to push to stack: ");
        int value = sc.nextInt();
        if((arr.length-tos) > 1){
            tos++;
            arr[tos]=value;
        }else{
            System.out.println("Stack Overflow");
        } 
          
    }
    void pop(){
        System.out.println("Time to pop!");
        if(tos == -1){
            System.out.println("Stack Underflow");
        }else{
            System.out.println(arr[tos]+" popped");
            tos--;
        }
    }
    void display(){
        System.out.println("Printing Stack");
        for(int i=0;i<=tos;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

class StackOpn
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack S = new Stack();

        S.initialize();
        S.push();
        S.push();
        S.push();
        S.pop();
        S.display();

    }
}