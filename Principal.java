/*
 * TODO 1: Crie uma classe interna de nome 'SistemaPapelaria'.
 * TODO 2: Crie as classes internas de nome: 'MaterialEscolar', 'Caixa', 'Empregado'
 * TODO 3: SistemaPapelaria: defina um atributo do tipo 'List<MaterialEscolar>'.
 * TODO 4: SistemaPapelaria: inicialize o atributo no método iniciar.
 * TODO 5: Repita os TODO3 e TODO4 para incluir outros 2 (dois) atributos:
 *           List<Caixa>
 *           List<Empregado>
 * TODO 6: Principal: instancie um objeto 'SistemaPapelaria' no metodo iniciar.
 */
package aula25exercicios;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    //TODO1
    public class SistemaPapelaria{
        List<MaterialEscolar> lmaterial;
        List<Caixa> lcaixa;
        List<Empregado> lempregado;
                
        public void iniciar(){
            lmaterial = new ArrayList<>();
            lcaixa = new ArrayList<>();
            lempregado = new ArrayList<>();
        }
    }
    //TODO2
    public class MaterialEscolar{
        
    }
    public class Caixa{
        
    }
    public class Empregado{
        
    }
    //TODO3
    
    //TODO4
    
    //TODO5
    
    public void iniciar(){
        SistemaPapelaria sys = new SistemaPapelaria();
        sys.iniciar();
    }
    
    public static void mainw(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}
