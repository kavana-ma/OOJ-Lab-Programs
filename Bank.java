import java.util.Scanner;

class Account{
String customer_name;
double acc_num;
String acc_type;
double balance;

}

class Sav_acct extends Account{
double comp_interest;
}
class Cur_acct extends Account{

}

class Bank{
public static void main(String args[]){


System.out.println("Enter customer name:");
String customer_name=s.next();
System.out.println("Enter account number:");
String acc_num=s.nextDouble();
System.out.println("Choose account type: 1. Savings 2. Current");
int accountTypeChoice = scanner.nextInt();

Sav_acct savings=new Sav_scct();
Cur_acct current=new Cur_acct();

System.out.println("1.Deposit 2.Withdraw");
System.out.println("3.Compute interes for savings account");
System.out.println("4. Display account details");
System.out.println("5. Exit");
System.out.println("Enter choice:");
x
Scanner s=new Scanner();

int a=s.nextInt();
while(1){
switch(a){
case (1):{}
case (2):{}
case (3):{}
case (4):{System.out.println("Enter accpunt type(savings/current):");
String type=s.next();
if(type=="savings"){savings.}}
case (5):{exit(0)}
default:
}
}
}
}
