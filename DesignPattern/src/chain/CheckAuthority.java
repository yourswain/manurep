package chain;
import java.io.*;
class CheckAuthority {
    public static void main(String[] args) throws Exception{
        Manager manager = new Manager();
        Director director = new Director();
        VicePresident vp = new VicePresident();
        President president = new President();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);
        
        //enter ctrl+c to kill.
        while (true) {
            System.out.println("Enter the amount to check who should approve your expenditure.");
            System.out.print(">");

            System.out.print("M");
            System.out.print("B1");
            System.out.print("B2");

            double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
            manager.processRequest(new PurchaseRequest(d));
        }

  }
}