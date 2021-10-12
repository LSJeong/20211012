package co.lsj.prj.member.serviceImpl;

import java.util.Scanner;

import co.lsj.prj.comm.Command;
import co.lsj.prj.member.service.MemberService;
import co.lsj.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("========회원정보 삭제==========");
		System.out.println("삭제할 회원 아이디를 입력해주세요.");
		vo.setId(scb.nextLine());
		
		int n = memberService.memberDelete(vo);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제 실패했습니다.");
		}

	}

}
