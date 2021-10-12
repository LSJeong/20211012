package co.lsj.prj.board.serviceImpl;

import java.util.Scanner;

import co.lsj.prj.board.service.BoardService;
import co.lsj.prj.board.service.BoardVO;
import co.lsj.prj.comm.Command;

public class BoardInsert implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("========공지사항 등록==========");
		System.out.println("작성자 이름을 입력해주세요.");
		vo.setBWriter(scb.nextLine());
		System.out.println("제목을 입력해주세요.");
		vo.setBTitle(scb.nextLine());
		System.out.println("내용을 입력해주세요.");
		vo.setBContents(scb.nextLine());
		
		int n = boardService.boardInsert(vo);
		if(n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		}else {
			System.out.println("삽입 실패했습니다.");
		}
		
	}

}
