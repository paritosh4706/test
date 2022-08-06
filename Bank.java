import java.util.*;


class Banking
{
        private String name;
        private long number;
        private long accNumber;
        private long balance;
        private long withdraw;
        private long deposit;



        Scanner sc=new Scanner(System.in);
        public void OpenAcc()
        {
            System.out.println("Enter Your Name");
            name=sc.next();
            System.out.println("Enter your mobile number");
            number=sc.nextLong();
            System.out.println("Enter your Account number");
            accNumber=sc.nextLong();
            System.out.println("Enter Balance");
            balance=sc.nextLong();
        }
        public void DisplayAcc()
        {
            System.out.println("Account Number"+accNumber);
            System.out.println("Name:"+name);
            System.out.println("Mobile Number:"+number);
            System.out.println("Balance:₹"+balance);
        }
        public void WithDrawAmt()
        {
            System.out.println("Enter the amount you want to withdraw");
            withdraw=sc.nextInt();
            if(withdraw<balance)
            {
                balance-=withdraw;
            }
            else
            {
                System.out.println("Insufficient Balance");
            }

        }
        public void DepositAmt()
        {
            System.out.println("Enter the amount you want to deposit");
            deposit=sc.nextInt();
            balance+=deposit;
        }

        public boolean ExistAcc(long accNumber)
        {
            if(this.accNumber==accNumber)
            {
                DisplayAcc();
                return true;
            }
            else
            {
                return false;
            }
        }



}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of customers you want to enter");
        int n = sc.nextInt();
        Banking b[] = new Banking[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Banking();
            b[i].OpenAcc();

        }
        int ch;

        do {
            System.out.println("Welcome");
            System.out.println("Choose the service you want:");
            System.out.println("1.Show Account Details \n 2.Search Account \n 3.Deposit Amount \n 4.Withdraw Amount");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < b.length; i++) {
                        b[i].DisplayAcc();
                    }
                    break;
                case 2: {
                    System.out.println("Enter acc number");
                    long check = sc.nextLong();
                    boolean f = false;
                    for (int i = 0; i < b.length; i++) {

                        f = b[i].ExistAcc(check);
                        if (f) {
                            break;
                        } else {
                            System.out.println("Account doesnt exist");
                        }
                    }
                }
                case 3: {

                    System.out.println("Enter acc number to withdraw amount from");
                    long check = sc.nextLong();
                    boolean f = false;
                    for (int i = 0; i < b.length; i++) {

                        f = b[i].ExistAcc(check);
                        if (f) {
                            b[i].WithDrawAmt();
                            break;
                        } else {
                            System.out.println("Account doesnt exist");
                        }

                    }
                }
                case 4: {
                    System.out.println("Enter acc number to deposit amount in");
                    long check = sc.nextLong();
                    boolean f = false;
                    for (int i = 0; i < b.length; i++) {

                        f = b[i].ExistAcc(check);
                        if (f) {
                            b[i].DepositAmt();
                            break;
                        } else {
                            System.out.println("Account doesnt exist");
                        }

                    }
                }
                case 5: {
                    System.out.println("Thanks for using");
                    break;
                }

            }
        }
        while (ch != 5);
    }
}






