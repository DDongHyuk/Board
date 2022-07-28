package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
	
	private Long rno;    // 댓글 번호
	private Long bno;    // 글 번호
	 
	private String reply;     // 댓글 
	private String replyer;   // 작성자
	private Date replyDate;   // 등록 날짜
	private Date updateDate;  // 수정 날짜
}
