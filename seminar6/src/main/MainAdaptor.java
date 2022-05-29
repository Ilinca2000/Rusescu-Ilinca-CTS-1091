package main;

import adaptor.Adapter;
import validatoareTerestre.ValidatorAutobuz;
import validatoareTerestre.ValidatorTerestru;

public class MainAdaptor {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz=new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        ValidatorTerestru validatorMetrou= new Adapter();
        validatorMetrou.valideazaAbonament();
        validatorMetrou.valideazaBilet();
    }
}