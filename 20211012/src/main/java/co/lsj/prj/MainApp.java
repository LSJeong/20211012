package co.lsj.prj;

import java.util.ArrayList;
import java.util.List;

import co.lsj.prj.board.service.BoardService;
import co.lsj.prj.board.service.BoardVO;
import co.lsj.prj.board.serviceImpl.BoardServiceImpl;
import co.lsj.prj.member.service.MemberService;
import co.lsj.prj.member.service.MemberVO;
import co.lsj.prj.member.serviceImpl.MemberServiceImpl;
import co.lsj.prj.menu.Menu;

public class MainApp {

	public static void main(String[] args) {
//		System.out.println("Hello~");
//		BoardService dao = new BoardServiceImpl(); // 서비스 호출
//		List<BoardVO> list = new ArrayList<BoardVO>();
		
//		list = dao.boardSelectList();
//		for(BoardVO vo : list) { //전체리스트 출력
//			System.out.println(vo.getBId() + " : " + vo.getBTitle());
//		}

		BoardVO vo = new BoardVO();
//		vo.setBId(2); // 2번글 가져오기
//		
//		vo = dao.boardSelect(vo);
//		System.out.println(vo.getBId());
//		System.out.println(vo.getBContents());

//		vo.setBWriter("관리자");
//		vo.setBTitle("Mybatis 테스트");
//		vo.setBContents("Mybatis는 sqlMapper로 dbms와 통신한다.");
//		int n = dao.boardInsert(vo);
//		if (n != 0) {
//			System.out.println(n + "행이 삽입되었습니다.");
//			list = dao.boardSelectList();
//			for (BoardVO board : list) { // 전체리스트 출력
//				System.out.println(board.getBId() + " : " + board.getBTitle());
//			}
//		}else {
//			System.out.println("입력 실패");
//		}
		
		
		//=========================member====================
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		MemberService dao = new MemberServiceImpl();
//		list = dao.memberSelectList();
//		
//		for(MemberVO member : list) {
//			System.out.println(member.getId() + " : " + member.getName());
//		}
//		
//		BoardService bs = new BoardServiceImpl();
//		List<BoardVO> boards = new ArrayList<BoardVO>();
//		boards = bs.boardSelectList();
//		
//		for(BoardVO board : boards) {
//			System.out.println(board.getBId() + " : " + board.getBContents());
//		}
		
		Menu menu = new Menu();
		menu.run();
	}

}
