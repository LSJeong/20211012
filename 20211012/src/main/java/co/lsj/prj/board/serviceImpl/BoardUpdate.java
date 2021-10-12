package co.lsj.prj.board.serviceImpl;

import java.util.Scanner;

import co.lsj.prj.board.service.BoardService;
import co.lsj.prj.board.service.BoardVO;
import co.lsj.prj.comm.Command;

public class BoardUpdate implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		System.out.println("========공지사항 수정==========");
		System.out.println("수정할 공지사항번호를 고르세요.");
		vo.setBId(scb.nextInt());scb.nextLine();
		System.out.println("수정할 내용을 입력하세요.");
		vo.setBContents(scb.nextLine());
		
		int n = boardService.boardUpdate(vo);
		if(n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		}else {
			System.out.println("수정 실패했습니다.");
		}

	}

}
