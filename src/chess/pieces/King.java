package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	private boolean CanMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().pieces(position);
		return p == null || isThereOpponentPiece(position);
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

		return mat;

	}

}