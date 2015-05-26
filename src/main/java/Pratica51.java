import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) throws Exception {
        
        // Criando os objetos
        Matriz primeira = new Matriz(3, 3);
        Matriz segunda = new Matriz(3, 3);
        Matriz erro = new Matriz(0, 3);
        Matriz somaErro = new Matriz(2, 3);
        
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
        mS[1][0] = 2.0;
        mS[1][1] = 2.0;
        mS[1][2] = 2.0;
        
        /*
        // Imprimindo as matrizes originais
        System.out.println("Matriz original 1: ");
        System.out.println(primeira);
        System.out.println("Matriz original 2: ");
        System.out.println(segunda);
        */
        
        Matriz soma = primeira.soma(segunda);
        Matriz produto = primeira.prod(segunda);
        Matriz errada = primeira.soma(somaErro);
        Matriz errado = somaErro.prod(primeira);
        
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
