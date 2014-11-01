package dades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author alumne
 */

public class ControlDades {

    File fitxer;
    FileReader fr;
    BufferedReader in;

    /**
     * Constructor per defecte.
     */
    public ControlDades() {
        fitxer = null;
        fr = null;
    }

    /**
     * Funció que obre el fitxer
     * @param path un String que indica el path al fitxer
     */
    public void obrirfitxer(String path) throws IOException {
        fitxer = new File(path);
        if (!fitxer.exists()) {
            fitxer.createNewFile();
        }
        fr = new FileReader(fitxer);
        in = new BufferedReader(fr);
    }

    /**
     * Funció que tanca el fitxer
     */
    public void tancarfitxer() throws IOException {
        fitxer = null;
        if (null != fr) {
            fr.close();
        }
    }

    /**
     * Funció que modifica el fitxer
     * @param Dades Un array de Strings que conté les dades del fitxer.
     */
    public void modificarfitxer(String[] Dades) throws IOException {
        if (fitxer == null) {
            throw new IllegalArgumentException("Error: No existeix cap fitxer obert.");
        }
        
        FileWriter fw = new FileWriter(fitxer, false);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        for (int i = 0; i < Dades.length; ++i) {
            out.println(Dades[i]);
        }
        out.close();
        bw.close();
        fw.close();
    }

    /**
     * Funció que llegeix el fitxer
     * @param num numero de dades a llegir
     * @return Un array de Strings que conté les dades
     */
    public String[] llegirDades(int num) throws IOException {
        ArrayList<String> dades = new ArrayList();
        
        for (int i = 0; i < num; i++) {
            String linea;
            if((linea = in.readLine())!=null) dades.add(linea);
        }
        //in.close();
        String[] DadesArray = new String[dades.size()];
        if (dades.size() > 0) {
            DadesArray = new String[dades.size()];
        }
        return dades.toArray(DadesArray);
    }

}