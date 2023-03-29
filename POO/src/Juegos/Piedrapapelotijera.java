package Juegos;
import java.util.Random;
import java.util.Scanner;

public class Piedrapapelotijera implements Juego {

    //attributes

    private int pOT,eleccion;
    private String nPlayer;

    Scanner captura=new Scanner(System.in);
    //prompts

        public void iniciar() {
            System.out.print("Ingrese el nombre del player:");
            nPlayer=captura .next();
        }

        public void jugar() {
            System.out.println(nPlayer+" haga su elección \n 1.Piedra \n 2.Papel \n 3.Tijeras");
            eleccion=captura .nextInt();

            Random aleatorio=new Random();
            pOT=aleatorio .nextInt(3)+1;

            System.out.println("Let's Check out...");
        }

        public void finalizar() {
            if (pOT==1 && eleccion==3 || pOT==2 && eleccion==1 || pOT==3 && eleccion==2 || pOT==3 && eleccion==1) {
                System.out.println("You win! "+nPlayer);
            }else if(eleccion==1 && pOT==3 || eleccion==2 && pOT==1 || eleccion==3 && pOT==2 || pOT==3 && eleccion==1){
                System.out.println("Gameover "+nPlayer);
            }else if(pOT==eleccion){
                System.out.println("Empate");
            }
        }
    }