package day17;

public enum ChessPiece {

    //White figures:

    KING_WHITE(100,"♔"),
    QUEEN_WHITE(9,"♕"),
    ROOK_WHITE(5,"♖"),
    BISHOP_WHITE(3.5,"♗"),
    KNIGHT_WHITE(3,"♘"),
    PAWN_WHITE(1,"♙"),

    //Black figures:

    KING_BLACK(100,"♚"),
    QUEEN_BLACK(9,"♛"),
    ROOK_BLACK(5,"♜"),
    BISHOP_BLACK(3.5,"♝"),
    KNIGHT_BLACK(3,"♞"),
    PAWN_BLACK(1,"♟"),

    //Empty:
    EMPTY(-1,"_");

    private final double value;
    private final String notation;

    ChessPiece(double value, String notation) {
        this.value = value;
        this.notation = notation;
    }

    public double getValue() {
        return value;
    }

    public String getNotation() {
        return notation;
    }

    @Override
    public String toString() {
        return notation + " ";
    }
}
