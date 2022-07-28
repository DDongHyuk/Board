package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno>0")
	/*게시판 목록*/
	public List<BoardVO> getList();
	
	// 추가
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	
	/*게시판 등록*/
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	/*게시판 조회*/
	public BoardVO read(Long bno);
	
	/*게시판 삭제*/
	public int delete(Long bno);
	
	/*게시판 수정*/
	public int update(BoardVO board);
	
	// 게시물의 수
	public int getTotalCount(Criteria cri);
	

	
}