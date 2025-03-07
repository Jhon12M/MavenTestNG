package reader;

import com.poiji.bind.Poiji;
import modelos.DataMonstruos;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/data/dataExcel.xlsx";

    public static List<DataMonstruos> obtenerListaExcel() {
        return Poiji.fromExcel(new File(excelPath), DataMonstruos.class);
    }
    
}
