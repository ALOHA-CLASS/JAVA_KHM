package test.보류;

import java.util.Date;

public class Reply extends Post {
	
	public Reply() {
		
	}

	public Reply(int reply_no, int board_no, String content, String writer) {
		this.reply_no = reply_no;
		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
	}

	public int getReply_no() {
		return reply_no;
	}

	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public Date getUpd_date() {
		return upd_date;
	}

	public void setUpd_date(Date upd_date) {
		this.upd_date = upd_date;
	}

	@Override
	public String toString() {
		return "Reply [reply_no=" + reply_no + ", board_no=" + board_no + ", content=" + content + ", writer=" + writer
				+ ", reg_date=" + reg_date + ", upd_date=" + upd_date + "]";
	}
	
	

}
