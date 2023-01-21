public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        System.out.println(bankAccount.getAmount());
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());

            } catch (LimitException e) {
                try {
                    bankAccount.withDraw(bankAccount.hashCode());

                } catch (LimitException ex) {
                    System.out.println(ex.getMessage()+ ex.getRemainingAmount());
                }
                break;
            }
        }
    }
}