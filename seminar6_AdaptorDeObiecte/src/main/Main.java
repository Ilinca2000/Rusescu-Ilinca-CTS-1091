package main;

import adaptor.Adapter;
import validatoareSubterane.ValidatorMetrou;
import validatoareSubterane.ValidatorSubteran;
import validatoareTerestre.ValidatorAutobuz;
import validatoareTerestre.ValidatorTerestru;

public class Main {

    public static void valideazaBilet(ValidatorTerestru validatorT){
        validatorT.valideazaBilet();
    }
    public static void main(String[] args) {
        ValidatorSubteran validatorMetrou=new ValidatorMetrou();
        ValidatorTerestru validatorAutobuz= new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);
        Adapter adapter= new Adapter(validatorMetrou);
        valideazaBilet(adapter);
        // valideazaBilet(validatorMetrou);

    }
}