package test.보류;

import java.util.List;

public class BoardServiceImpl implements PostService<Board> {

	@Override
	public List<Board> list(Board t) throws Exception {
		List<Board> list = Main.boardList;
		return list;
	}

	@Override
	public Board select(Board t) throws Exception {
		int boardNo = t.getBoard_no();
		for (Board board : Main.boardList) {
			if( boardNo == t.getBoard_no() ) {
				return board;
			}
		}
		return null;
	}

	@Override
	public boolean insert(Board t) throws Exception {
		return Main.boardList.add(t);
	}

	@Override
	public boolean update(Board t) throws Exception {
		int boardNo = t.getBoard_no();
		for (Board board : Main.boardList) {
			if( boardNo == t.getBoard_no() ) {
				board = t;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Board t) throws Exception {
		int boardNo = t.getBoard_no();
		for (Board board : Main.boardList) {
			if( boardNo == t.getBoard_no() ) {
				Main.boardList.remove(board);
				return true;
			}
		}
		return false;
	}

}
