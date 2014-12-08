import utfpr.dainf.if62c.pratica.Time;
import utfpr.dainf.if62c.pratica.Jogador;
import java.util.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {
    public static void main(String[] args) {
          Jogador jogador1 = new Jogador(1,"Fulano");
          Jogador jogador2 = new Jogador(2,"Cicrano");
          Jogador jogador3 = new Jogador(3,"Jão");
          Jogador jogador4 = new Jogador(4,"Bastião");
          Jogador jogador5 = new Jogador(5,"Loid");
          Jogador jogador6 = new Jogador(6,"Mario");
          Time time1 = new Time();
          Time time2 = new Time();
          
          time1.addjogador("goleiro", jogador1);
          time1.addjogador("zagueiro", jogador2);
          time1.addjogador("atacante", jogador3);
          time2.addjogador("goleiro", jogador4);
          time2.addjogador("zagueiro", jogador5);
          time2.addjogador("atacante", jogador6);
          
          System.out.println("Posição    Time 1        Time 2");
    
        /*  Set<String> keySet = time1.getJogador();
        
          for (String key : keySet) {
               System.out.println(key + "    " 
                    + time1.get(key).toString() 
                    + " " + time1.get(key).toString());
          }*/
    }
}
