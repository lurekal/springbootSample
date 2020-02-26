package com.lurekal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lurekal.domain.Board;
import com.lurekal.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository boardRepo;
	
	public List<Board> getBoardList(){
		
		return (List<Board>) boardRepo.findAll();
	}
	
	public void insertBoard(Board board) {
		
		boardRepo.save(board);
		
	}
	public Board getBoard(Board board) {
		return null;
	}
	
	public void updateBoard(Board board) {
		
	}
	
	public void deleteBoard(Board board) {
		
	}

}
