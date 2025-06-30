package Homework6.CreditCard;

public class CreditCard
{
    String nameOfCards = "Default name of credit card";
    String accountNumber = "XXXX XXXX XXXX XXXX";
    int sumOnAccount = 100_000;

//Constructors
    CreditCard(String nameOfCard, String accountNumber, int sumOnAccount) {
        this.nameOfCards = nameOfCard;
        this.accountNumber = accountNumber;
        this.sumOnAccount = sumOnAccount;
    }

    CreditCard(String nameOfCard, String accountNumber) {
        this.nameOfCards = nameOfCard;
        this.accountNumber = accountNumber;
        System.out.println();
    }

    CreditCard() {

    }

    //Methods
    int Accruals(String nameOfCards, int sumOnAccount) {
        this.nameOfCards = nameOfCards;
        this.sumOnAccount += sumOnAccount;
        System.out.println("Операция: Пополнение карты" +"\n" +
                "Карта \"" + nameOfCards + "\" на сумму: "+ sumOnAccount + " рублей.");
        return sumOnAccount;
    }

    int Offs (int sumOnAccount) {
        this.sumOnAccount -= sumOnAccount;
        if (this.sumOnAccount < 0){
            System.out.println("Недостаточно средств для выполнения операции: \"Списание денежных средств\" с карты " + nameOfCards);
            this.sumOnAccount += sumOnAccount;
            return this.sumOnAccount;
        }else{
            System.out.println("Операция: Списание денежных средств:" +"\n" +
            "Карта \"" + nameOfCards + "\" на сумму: "+ sumOnAccount + " рублей.");
        }
        return sumOnAccount;
    }

    void CurrentStatus(){
        System.out.println("Текущее состояние по карте: " + nameOfCards + "\n" + "№ карты: " + accountNumber);
        System.out.println("Доступно: " + sumOnAccount + " рублей.");
        System.out.println();
    }
}
