package utfpr.ct.dainf.if62c.pratica;

/**
 * Representa uma matriz de valores {@code double}.
 * @author Wilson Horstmeyer Bogadao <wilson@utfpr.edu.br>
 */
public class Matriz {
    
    // a matriz representada por esta classe
    private final double[][] mat;
    
    /**
     * Construtor que aloca a matriz.
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
     */
    public Matriz(int m, int n) throws MatrizInvalidaException {
        
        try {
        if(m<=0 || n<=0)
            throw new MatrizInvalidaException(m, n);

        } catch (MatrizInvalidaException ex) {
            System.out.println("Ocorreu um erro de: "
            + ex.getLocalizedMessage());
        }
        mat = new double[m][n];
    }
    
    /**
     * Retorna a matriz representada por esta classe.
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat;
    }
    
    /**
     * Retorna a matriz transposta.
     * @return A matriz transposta.
     */
    public Matriz getTransposta() throws MatrizInvalidaException {
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser somada
     * @return A soma das matrizes
     */
    public Matriz soma(Matriz m) throws SomaMatrizesIncompativeisException, 
            MatrizInvalidaException {   

        try{
        if(mat.length != m.mat.length ||mat[0].length != m.mat[0].length)
            throw new SomaMatrizesIncompativeisException(this, m);
        
        Matriz retornada;
        retornada = new Matriz(mat.length,mat[0].length);
        
        for(int i=0;i < mat.length ;i++)
            for(int j=0;j < mat[0].length ;j++)
                retornada.mat[i][j] = m.mat[i][j] + mat[i][j];
        
        return retornada;
        
        } catch (SomaMatrizesIncompativeisException ex) {
            System.out.println("Ocorreu um erro de: "
            + ex.getLocalizedMessage());
        } catch (MatrizInvalidaException ex2) {
            System.out.println("Ocorreu um erro de: "
            + ex2.getLocalizedMessage());
        }
        
        return null;
    }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     * @param m A matriz a ser multiplicada
     * @return O produto das matrizes
     */
    public Matriz prod(Matriz m) throws ProdMatrizesIncompativeisException,
            MatrizInvalidaException {
        int i, j, k;
       
        try {
        if(mat.length != m.mat[0].length)
            throw new ProdMatrizesIncompativeisException(m, this);
        Matriz Produto = new Matriz(mat.length, m.mat[0].length);
       
        for (i=0; i < mat.length; i++)
            for (j = 0; j < m.mat[0].length; j++)
                for(k = 0 ; k < mat[0].length ; k++) {
                    Produto.mat[i][j] += mat[i][k] * m.mat[k][j];
                }
       
        return Produto;
        } catch (ProdMatrizesIncompativeisException ex) {
            System.out.println("Ocorreu um erro de: "
            + ex.getLocalizedMessage());
        } catch (MatrizInvalidaException ex2) {
            System.out.println("Ocorreu um erro de: "
            + ex2.getLocalizedMessage());
        }
        
        return null;
    }

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }

    
}
