# JOM. Classes. Encapsulation. Exceptions
## Task 7

Please, create a class for the exception (automatically enforced by the Handle or Declare Rule) that is used in the code below so that it will compile without errors:
```
class CheckingAccount {
    private double balance;
    private int number;
    
    public CheckingAccount(int number) {
       this.number = number;
    }
    
    public void deposit(double amount) {
       balance += amount;
    }
    
    public void withdraw(double amount) throws InsufficientAmountException {
       if(amount <= balance) {
          balance -= amount;
       }else {
          double needs = amount - balance;
          throw new InsufficientAmountException(needs);
       }
    } 
    // some other code 
 }
 ```
 ```
 class BankDemo {
    public static void doOperations() {
        CheckingAccount c = new CheckingAccount(101);      
        c.deposit(500.00);       
        try {         
            c.withdraw(100.00);          
            c.withdraw(600.00);
        } catch (InsufficientAmountException e) {
            System.out.println(e.getMessage());
            System.out.println("Please, deposit at least $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
```


The output of the doOperations invocation looks like this:
> Sorry, but you are short $200.0
> 
> Please, deposit at least $200.0
> 
> **standard stack trace output**
