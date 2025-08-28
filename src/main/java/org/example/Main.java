package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!🍀💖");


        Jugador jugador = new Jugador("a", 10000, "jugador");
        Jugador jugador2 = new Jugador("b", 10000, "jugador");

        Crupier crupier = new Crupier();

        Baraja baraja = new Baraja();
        baraja.llenarBaraja();
        System.out.println(baraja);

        jugador.pedirCarta(baraja.removerCarta(baraja.getBaraja().getFirst()));
        jugador.pedirCarta(baraja.removerCarta(baraja.getBaraja().getFirst()));


        crupier.pedirCarta(new Carta(Palo.Diamante, "A", 11));
        crupier.pedirCarta(new Carta(Palo.Diamante, "A", 11));

        crupier.jugar(baraja);

        Juego juego = new Juego();
        juego.iniciarJuego();

    }


}



