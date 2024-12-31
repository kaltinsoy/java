// Account.java 
// 
// A bank account class with methods to deposit to, withdraw from, 
// change the name on, and get a String representation 
// of the account. 
//******************************************************* 
public class Account 
{ 
 private double balance; 
 private String name; 
 private long acctNum; 
 private static int numAccounts = 0;
 //---------------------------------------------- 
 //Constructor -- initializes balance, owner, and account number 
 //---------------------------------------------- 
 public Account(double initBal, String owner, long number) 
 { 
 balance = initBal; 
 name = owner; 
 acctNum = number; 
 ++numAccounts;
 } 
  public Account(double initBal, String owner) 
 { 
 balance = initBal; 
 name = owner;
 ++numAccounts;
 } 
  public Account(String owner) 
 { 
 name = owner;  
 ++numAccounts;
 } 
 //---------------------------------------------- 
 // Checks to see if balance is sufficient for withdrawal. 
 // If so, decrements balance by amount; if not, prints message. 
 //---------------------------------------------- 
 public void withdraw(double amount) 
 { 
 if (balance >= amount) 
 balance -= amount; 
 else 
 System.out.println("Insufficient funds"); 
 }
  public void withdraw(int amount, int fee) 
 { 
 if (balance >= amount) 
 balance -= amount + fee; 
 else 
 System.out.println("Insufficient funds"); 
 } 
 //---------------------------------------------- 
 // Adds deposit amount to balance. 
 //---------------------------------------------- 
 public void deposit(double amount) 
 { 
 balance += amount; 
 } 
 //---------------------------------------------- 
 // Returns balance. 
 //---------------------------------------------- 
 public double getBalance() 
 { 
 return balance; 
 } 
// Static
 public static int getNumAccounts()
 {
    return numAccounts;
 }

 public void close () {
    name += " Closed";
    
 }
 //---------------------------------------------- 
 // Returns a string containing the name, account number, and balance. 
 //---------------------------------------------- 
 public String toString() 
 { 
 return "Name:" + name + 
"\nAccount Number: " + acctNum + 
"\nBalance: " + balance;  
//"\nTotal account number: " + numAccounts;
 } 
} 
