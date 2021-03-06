package ch.heigvd.gen.monopoly.board.square;

import ch.heigvd.gen.monopoly.player.Player;

/**
 * Cette classe représente une case basique du jeux Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 05.05.2019
 */
public class RegularSquare extends Square {
    /**
     * Constructeur
     *
     * @param name Nom de la case
     */
    public RegularSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        // On ne fait rien sur une case basique
    }
}
