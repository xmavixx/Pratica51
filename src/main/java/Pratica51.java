import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) throws Exception {
        
        Matriz primeira = new Matriz(3, 3);
        Matriz segunda = new Matriz(3, 3);
        Matriz somaErro = new Matriz(1, 3);
        
        try {
        Matriz erro = new Matriz(0, 3);
        } catch (MatrizInvalidaException invalida) {
            System.out.println(invalida.getLocalizedMessage());
        }
        // Criando as variáveis associadas aos objetos
        double[][] m1 = primeira.getMatriz();
        double[][] m2 = segunda.getMatriz();
        double[][] mS = somaErro.getMatriz();
        
        m1[0][0] = 1.0;
        m1[0][1] = 1.0;
        m1[0][2] = 1.0;
        m1[1][0] = 1.0;
        m1[1][1] = 1.0;
        m1[1][2] = 1.0;
        m1[2][0] = 1.0;
        m1[2][1] = 1.0;
        m1[2][2] = 1.0;
        
        m2[0][0] = 2.0;
        m2[0][1] = 2.0;
        m2[0][2] = 2.0;
        m2[1][0] = 2.0;
        m2[1][1] = 2.0;
        m2[1][2] = 2.0;
        m2[2][0] = 2.0;
        m2[2][1] = 2.0;
        m2[2][2] = 2.0;
        
        mS[0][0] = 2.0;
        mS[0][1] = 2.0;
        mS[0][2] = 2.0;
        
        /*
        // Imprimindo as matrizes originais
        System.out.println("Matriz original 1: ");
        System.out.println(primeira);
        System.out.println("Matriz original 2: ");
        System.out.println(segunda);
        */
        
        try {
        Matriz soma = primeira.soma(segunda);
        Matriz errada = primeira.soma(somaErro);
        } catch (SomaMatrizesIncompativeisException somaException) {
            System.out.println(somaException.getLocalizedMessage());
        }
            
        try {
        Matriz produto = primeira.prod(segunda);
        Matriz errado = somaErro.prod(primeira);
        } catch (ProdMatrizesIncompativeisException prodException) {
            System.out.println(prodException.getLocalizedMessage());
        } 
        
        /*
        // Imprimindo a matriz soma
        System.out.println("Soma: ");
        System.out.println(soma);

        // Imprimindo a matriz produto
        System.out.println("Produto: ");
        System.out.println(produto);
        */
        
    }
}
