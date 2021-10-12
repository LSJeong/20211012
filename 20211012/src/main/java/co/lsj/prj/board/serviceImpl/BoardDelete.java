package co.lsj.prj.board.serviceImpl;

import java.util.Scanner;

import co.lsj.prj.board.service.BoardService;
import co.lsj.prj.board.service.BoardVO;
import co.lsj.prj.comm.Command;

public class BoardDelete implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		System.out.println("========공지사항 삭제==========");
		BoardVO vo = new BoardVO();
		System.out.println("삭제할 공지사항 번호를 선택해주세요.");
		vo.setBId(scb.nextInt());
		
		int n = boardService.boardDelete(vo);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제 실패했습니다.");
		}

	}

}
