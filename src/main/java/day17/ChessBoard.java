package day17;

import day17.ChessPiece;

public class ChessBoard {
    private final ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (ChessPiece[] chessPieces : chessBoard) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessPieces[j].getNotation());
            }
            System.out.println();
        }
    }
}
