package test.보류;

import java.util.List;

public class ReplyServiceImpl implements PostService<Reply> {

	@Override
	public List<Reply> list(Reply t) throws Exception {
		List<Reply> list = Main.replyList;
		return list;
	}

	@Override
	public Reply select(Reply t) throws Exception {
		int replyNo = t.getReply_no();
		for (Reply reply : Main.replyList) {
			if( replyNo == reply.getReply_no() ) {
				return reply;
			}
		}
		return null;
	}

	@Override
	public boolean insert(Reply t) throws Exception {
		return Main.replyList.add(t);
	}

	@Override
	public boolean update(Reply t) throws Exception {
		int replyNo = t.getReply_no();
		for (Reply reply : Main.replyList) {
			if( replyNo == reply.getReply_no() ) {
				reply = t;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Reply t) throws Exception {
		int replyNo = t.getReply_no();
		for (Reply reply : Main.replyList) {
			if( replyNo == reply.getReply_no() ) {
				Main.replyList.remove(reply);
				return true;
			}
		}
		return false;
	}

}
