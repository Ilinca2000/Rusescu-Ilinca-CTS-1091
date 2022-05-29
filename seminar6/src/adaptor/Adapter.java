package adaptor;

import validatoareSubterane.ValidatorMetrou;
import validatoareTerestre.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}
