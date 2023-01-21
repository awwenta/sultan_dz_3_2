public class BankAccount {
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void deposit(Double sum) {
        amount = sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ваш баланс: ", amount -= amount);
        }else {
            amount -= sum;
        }
    }


}