package me.spacemex.chess.pieces;

import me.spacemex.chess.board.Board;
import me.spacemex.chess.board.Move;
import me.spacemex.chess.enums.Alliance;

import java.util.Collection;

public class Pawn extends Piece{
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {};
    Pawn(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {
        return null;
    }
}
