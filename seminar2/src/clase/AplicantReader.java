package clase;

import java.util.Scanner;

public class AplicantReader {

    public static void citireAplicant(Scanner input,Aplicant a){

            String nume = input.next();
            String prenume = input.next();
            int varsta = input.nextInt();
            int punctaj = input.nextInt();
            int nrProiecte = input.nextInt();
            String[] vect = new String[nrProiecte];
            for (int i = 0; i < nrProiecte; i++)
                vect[i] = input.next();
        a.setNume(nume);
        a.setPrenume(prenume);
        a.setVarsta(varsta);
        a.setPunctaj(punctaj);
        a.setDenumiriProiecte(nrProiecte,vect);

    }

}
