package principal;

import modelos.DataMonstruos;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class LeerDatosMonstruos {
    public static void main(String[] args) {
        final var listaTotal = ExcelReader.obtenerListaExcel();
        final var listaMayorNivel = filtrarNivel(listaTotal);

        System.out.printf("La lista moustruos con mayor nivel: %s%n", listaMayorNivel);
    }

    private static List<DataMonstruos> filtrarNivel(List<DataMonstruos> dataMonstruosList) {
        final var listaManyorNivel = new ArrayList<DataMonstruos>();

        for (var datamostruos : dataMonstruosList) {
            if (datamostruos.getNivel() > 75) {
                listaManyorNivel.add(datamostruos);
            }
        }
        return listaManyorNivel;
    }
}
