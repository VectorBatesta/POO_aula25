package aula25;

import java.util.ArrayList;
import java.util.List;

public class Aula25 {
    List<Produto> lp;
    List<Caixa> lc;
    List<Empregado> le;
    
    public abstract class Facade{
        public abstract void iniciar();
    }
    
    public class Produto extends Facade{
        public void iniciar(){
            System.out.println("PRODUTOW");
        }
    }
    public class Caixa extends Facade{
        public void iniciar(){
            System.out.println("CAIXOW");
        }
    }
    public class Empregado extends Facade{
        public void iniciar(){
            System.out.println("EMPREGADOW");
        }
    }
    
    //facade
    public void iniciar(){
        lp = new ArrayList<>();
        lc = new ArrayList<>();
        le = new ArrayList<>();
        
        Facade setor = new Produto();
        setor.iniciar();
        
        setor = new Caixa();
        setor.iniciar();
        
        setor = new Empregado();
        setor.iniciar();
    }
    
    public static void main(String[] args) {
        Aula25 principal = new Aula25();
        principal.iniciar();
    }
    
}
