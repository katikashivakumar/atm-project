public class TsBankAtm  implements atmSoftware {

  AtmModel model =  new AtmModel();
  @Override
 public void addMoney(int inputMoney) {
     int balance = model.getBankBalance();
     int newBalance = balance + inputMoney;
     model.setBankBalance(newBalance);
     System.out.println("your new balance is " + newBalance);
 }
 @Override
 public void withdrawMoney(int inputMoney) {
     int balance = model.getbankBalance();
     int newBalance = balance - inputMoney;
     if (newBalance < 0) {
         System.out.println("Insufficient balance");
     }else {
     model.setBankBalance(newBalance);
     System.out.println("your new balance is " + newBalance);
 }
}


    @Override
    public void viewBalance(int inputViewBalance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public AtmModel getModel() {
        return model;
    }

    public void setModel(AtmModel model) {
        this.model = model;
    }
}