/*
**** DESAFIO ****
Fazer com que o java identifique
o idioma do SO
 */
package primeiroprograma;

import java.util.Locale;

/**
 *
 * @author fabio.nunes
 */
public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do seu sistema está em: "+ idioma.getDisplayLanguage());
        System.out.println(idioma.getLanguage());
    }
}
