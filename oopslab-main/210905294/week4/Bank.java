import java.util.Scanner;

 class Account{
    Scanner sc = new Scanner(System.in);
    String name;
    int accno;
    String type;
    int bal;
    static float roi=3.2f;
    static int temp = 1111;

    //Account()

    Account(String name, String type, int bal)
    {
        this.name=name;
        this.accno=temp++;
        this.type=type;
        this.bal=bal;
    }

    void deposit(){
        int dep;
        System.out.println("Enter amount to deposit: ");
        dep = sc.nextInt();
        bal += dep;
    }

    void withdraw(){
        int wid;
        System.out.println("Enter amount to withdraw: ");
        wid = sc.nextInt();
        if(bal > wid)
            bal -= wid;
        else
            System.out.println("You're broke dude!");
    }

    void display()
    {
        System.out.println("Name of the account holder:"+name+"\n Account Number:"+accno+"\n Account Type:"+type+"\n Balance:"+bal);
    }

    void displayROI()
    {
        System.out.println("Rate of interest is: " + roi);
        sc.close();
    }
}





class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("....Welcome to the Bank....");

        System.out.println("Enter the number of Accounts to be Created.");
        int n = sc.nextInt();
        int input;

        Account c[] = new Account[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the name of the account holder:");
            String name = sc.next();
            System.out.println("Please enter the type of Account(Savings/Salary):");
            String type = sc.next();
            System.out.println("Please enter the balance of your account(minimum bal=1000/-):");
            int bal = sc.nextInt();
            while(bal<1000)
            {
                System.out.println("Please Enter minimum balance..");
                bal = sc.nextInt();
            }

            c[i] = new Account(name,type,bal);
        }

        do{
            System.out.println("Which account to modify: ");
            int p=sc.nextInt();
            System.out.println("1. Deposit:");
            System.out.println("2. Withdraw:");
            System.out.println("3. Display ACCOUNT details:");
            System.out.println("4. Display ROI:");
            System.out.println("5. exit:");
            System.out.println("Aapko kya kana hai??");
            input = sc.nextInt();

            switch(input){
                case 1:{
                    c[p].deposit();
                    break;
                }
                case 2:{
                    c[p].withdraw();
                    break;
                }
                case 3:{
                    for(int i=0; i<n; i++)
                    {
                        c[i].display();
                    }
                    break;
                }
                case 4:{
                    for(int i=0; i<n; i++)
                    {
                        c[i].displayROI();
                    }
                    break;
                }
                case 5:{
                    break;
                }
            }
        }while(input!=5);

        sc.close();
        
    }    
}