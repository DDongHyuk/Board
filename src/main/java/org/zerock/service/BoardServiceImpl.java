package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	// 등록
	@Override
	public void register(BoardVO board) {
		
		log.info("register...." + board);
		
		mapper.insertSelectKey(board);
		
	}
	
	// 조회
	@Override
	public BoardVO get(Long bno) {
		
		log.info("get...." + bno);
		
		return mapper.read(bno);
	}
	
	// 수정
	@Override
	public boolean modify(BoardVO board) {
		
		log.info("modify...." + board);
		
		return mapper.update(board) == 1;
	}
	
	// 삭제
	@Override
	public boolean remove(long bno) {
		
		log.info("remove...." + bno);
		
		
		return mapper.delete(bno) == 1;
	}
	
	// 목록
/*	
	@Override
	public List<BoardVO> getList() {
		
		log.info("getList.......");
		
		return mapper.getList();
	}
*/	
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		
		log.info("get List with criteria:" + cri);
		
		return mapper.getListWithPaging(cri);
	}
	
	// 게시글 수
	@Override
	public int getTotal(Criteria cri) {
		
		log.info("get total count");
		
		return mapper.getTotalCount(cri);
	}
}
