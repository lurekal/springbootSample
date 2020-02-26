package com.lurekal.controller;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lurekal.domain.Board;
import com.lurekal.service.BoardService;



@RestController
public class MainController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/main")
	public List<Board> getBoardList(){
		
		List <Board> boardlist = boardService.getBoardList();
	
		return boardlist;
	}
	
	
	@GetMapping("/add")
	public String insertBoard(){
		
		for(int i =0;i<=200;i++) {
			Board board = new Board();
			board.setTitle(i+"제목입니다.");
			board.setContent(i+"번째 내용입니다");
			board.setWriter("유저"+i);
			board.setCreateDate(new Date());
			board.setCnt(0L);
			
			boardService.insertBoard(board);
			
		}
		
	
	
		return "suc";
	}


}
