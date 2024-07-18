/*
(Exibindo formas com asteriscos) Escreva um aplicativo que exiba uma caixa, uma elipse, uma seta e um losango utilizando asteriscos
(*), como segue:
 */

package application;

public class ExibindoFormasAsteriscos {

    public static void main(String[] args) {

        String retangulo = "*********\n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                "*********\n";

        String circulo = "   ***   \n" +
                " *     * \n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                "*       *\n" +
                " *     * \n" +
                "   ***   \n";

        String seta = "   *   \n" +
                "  ***  \n" +
                " ***** \n" +
                "   *\n" +
                "   *\n" +
                "   *\n" +
                "   *\n" +
                "   *\n" +
                "   *\n";

        String losango = "    *    \n" +
                "   * *   \n" +
                "  *   *  \n" +
                " *     * \n" +
                "*       *\n" +
                " *     * \n" +
                "  *   *  \n" +
                "   * *   \n" +
                "    *    ";

        System.out.printf("%s%s%s%s", retangulo, circulo, seta, losango);

    }

}
