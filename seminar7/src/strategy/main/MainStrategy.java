package strategy.main;

import strategy.clase.CardBancar;
import strategy.clase.CardCalatorie;
import strategy.clase.SMS;
import strategy.clase.Validator;

public class MainStrategy {
    public static void main(String[] args) {
        Validator validator= new Validator(3, new CardCalatorie());
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new SMS());
        validator.platesteCalatorie();
    }
}