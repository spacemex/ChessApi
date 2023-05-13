package me.spacemex.chess.pieces;

import me.spacemex.chess.board.Board;
import me.spacemex.chess.board.Move;
import me.spacemex.chess.enums.Alliance;

import java.util.Collection;

public abstract class Piece {
    protected final int piecePosition;
    protected final Alliance pieceAlliance;

    Piece(final int piecePosition, final Alliance pieceAlliance){
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
    }
    public Alliance getPieceAlliance(){
        return this.pieceAlliance;
    }
    public abstract Collection<Move> calculateLegalMoves(final Board board);
}
