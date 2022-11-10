package aula25exercicios;

/**
 * TODO 1: Principal: Crie uma classe interna abstrata 'MaterialEscolar'
 * TODO 2: MaterialEscolar: crie os metodos abstratos 'marca' e 'tamanho', sem argumentos.
 * TODO 3: Principal: Crie as classes internas 'Lapis' e 'Borracha' que 
 *                     sejam subclasse da classe 'MaterialEscolar'
 * TODO 4: Lapis: implemente os métodos abstratos herdados para imprimir
 *                 a marca e o tamanho.
 * TODO 5: Borracha: implemente os métodos abstratos herdados para imprimir
 *                 a marca e o tamanho.
 * TODO 6: Utilize polimorfismo para mudar o tipo do objeto 'materialEscolar',
 *          com a atribuição de uma nova 'Borracha'. 
 * TODO 7: Adicione o novo objeto 'materialEscolar' ah lista.
 *         
 */

import java.util.List;
import java.util.ArrayList;
public class Principal4 {

    public class SistemaPapelaria{
        List<MaterialEscolar> lm;
        List<Caixa> lc;
        List<Empregado> le;
        
        public void iniciar(){
            lm = new ArrayList<>();
            lc = new ArrayList<>();
            le = new ArrayList<>();
        }
    }
    
    public abstract class MaterialEscolar{
        public abstract void marca();
        public abstract void tamanho();
    }
    public class Lapis extends MaterialEscolar{
        public void marca(){
            System.out.println("bic");
        }
        public void tamanho(){
            System.out.println("30 cm");
        }
    }
    public class Borracha extends MaterialEscolar{
        public void marca(){
            System.out.println("boc");
        }
        public void tamanho(){
            System.out.println("3 cm");
        }
    }
    
    public class Caixa{
    }
    
    public class Empregado{
    }
    
    
    public void iniciar(){
        SistemaPapelaria sp = new SistemaPapelaria();
        sp.iniciar();
        
        MaterialEscolar materialEscolar = new Borracha();
        sp.lm.add(materialEscolar);
    }
    public static void main(String[] args) {
        Principal4 principal = new Principal4();
        principal.iniciar();        
    }
}
