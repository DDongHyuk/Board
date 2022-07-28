package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	
	// 등록
	public void register(BoardVO board);
	
	// 조회
	public BoardVO get(Long bno);
	
	// 수정
	public boolean modify(BoardVO board);
	
	// 삭제
	public boolean remove(long bno);
	
	// 목록
//	public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
	
	// 게시글 수
	public int getTotal(Criteria cri);

	
}
