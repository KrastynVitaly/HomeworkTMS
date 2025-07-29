package HomeWork__13.Task_Star;

import HomeWork__13.Task_1.LoginInformation;
import HomeWork__13.Task_1.WrongPasswordException;

public class Main {
    public static void main(String[] args) throws Exception{
        try{
            LoginInformation.dataEntry("SecondUser", "qwerty123", "qwerty124");
        }catch(WrongPasswordException ex){
            System.exit(0);
        } finally {
            System.out.println("Не выполнится");
        }
    }
}
