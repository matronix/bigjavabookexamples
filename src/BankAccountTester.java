


public class BankAccountTester
{
   
   public static void main(String[] args)
   {
       BankAccount b1 = new BankAccount(2000);
       BankAccount b2 = new BankAccount(150);
       BankAccount b3 = new BankAccount(0);
       
       DataSet d = new DataSet();
       d.add(b1);
       d.add(b2);
       d.add(b3);
       
       
       System.out.println("Average of bank accounts: " + d.getAverage());
       
       
      
   }
   
}
