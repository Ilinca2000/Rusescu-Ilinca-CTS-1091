package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface ApplicatsReader {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}
