/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;
import java.util.HashMap;
/**
 *
 * @author b1zon_000
 */
public class Time {
       private HashMap<String, Jogador> jogadores = new HashMap<>();
       
       public HashMap<String, Jogador> getJogador(){
              return jogadores;
       }
       public Jogador addjogador(String posicao,Jogador nome){
              return jogadores.put(posicao, nome);
       }
}
