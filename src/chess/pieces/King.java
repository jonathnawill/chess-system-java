package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	private ChessMatch chessMatch;

	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public String toString() {
		return "R";
	}

	private boolean CanMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().pieces(position);
		return p == null || isThereOpponentPiece(position);
	}

	private boolean testRookCastling(Position position) {
		ChessPiece p = (ChessPiece) getBoard().pieces(position);
		return p != null && p instanceof Rook && p.getColor() == getColor() && getMoveCount() == 0;

	}

	//
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		int[] row = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] col = { -1, 0, 1, -1, 1, -1, 0, 1 };
		Position p = new Position(0, 0);

		for (int i = 0; i < 8; i++) {
			p.setValues(position.getRow() + row[i], position.getColumn() + col[i]);
			if (getBoard().positionExists(p) && CanMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}

		// movimento especial castling
		if (getMoveCount() == 0 && !chessMatch.getCheck()) {
			// rook pequeno
			Position posT1 = new Position(position.getRow(), position.getColumn() + 3);
			if (testRookCastling(posT1)) {
				Position p1 = new Position(position.getRow(), position.getColumn() + 1);
				Position p2 = new Position(position.getRow(), position.getColumn() + 2);
				if (getBoard().pieces(p1) == null && getBoard().pieces(p2) == null) {
					mat[position.getRow()][position.getColumn() + 2] = true;
				}
			}
			// rook grande
			Position posT2 = new Position(position.getRow(), position.getColumn() - 4);
			if (testRookCastling(posT2)) {
				Position p1 = new Position(position.getRow(), position.getColumn() - 1);
				Position p2 = new Position(position.getRow(), position.getColumn() - 2);
				Position p3 = new Position(position.getRow(), position.getColumn() - 3);
				if (getBoard().pieces(p1) == null && getBoard().pieces(p2) == null && getBoard().pieces(p3) == null) {
					mat[position.getRow()][position.getColumn() - 2] = true;
				}
			}

		}

		return mat;

	}

}