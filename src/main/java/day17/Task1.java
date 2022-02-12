package day17;


public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] figures = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for(ChessPiece figure: figures) {
            System.out.print(figure);
        }
    }
}