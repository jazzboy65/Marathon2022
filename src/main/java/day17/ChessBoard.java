package day17;

public class ChessBoard {
    private final ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void chessBoardDefault() {
        for (ChessPiece[] chessPieces : chessBoard) {
            for (int j = 0; j < chessBoard.length; j++) {
                chessPieces[j] = ChessPiece.EMPTY;
            }
        }
    }

    public void arrangementOfFigures(ChessPiece chessPiece, int x, int y) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (i == x - 1 && j == y - 1) {
                    chessBoard[i][j] = chessPiece;
                }
            }
        }
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
