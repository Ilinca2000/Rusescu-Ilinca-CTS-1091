package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader  implements ApplicatsReader{

    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input = new Scanner(new File(numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            AplicantReader.citireAplicant(input,student);
            String facultate = input.next();
            int anStudii = input.nextInt();
            student.setFacultate(facultate);
            student.setAn_studii(anStudii);


            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
