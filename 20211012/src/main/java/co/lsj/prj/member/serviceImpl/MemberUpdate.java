package co.lsj.prj.member.serviceImpl;

import java.util.Scanner;

import co.lsj.prj.comm.Command;
import co.lsj.prj.member.service.MemberService;
import co.lsj.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("========회원정보 수정==========");
		System.out.println("수정할 회원 ID를 입력하세요.");
		vo.setId(scb.nextLine());
		System.out.println("이름을 입력하세요.");
		vo.setName(scb.nextLine());
		System.out.println("비밀번호를 입력하세요.");
		vo.setPassword(scb.nextLine());
		System.out.println("전화번호를 입력하세요.");
		vo.setTel(scb.nextLine());
		System.out.println("주소를 입력하세요.");
		vo.setAddress(scb.nextLine());
		
		int n = memberService.memberInsert(vo);
		if(n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		}else {
			System.out.println("수정 실패했습니다.");
		}

	}

}
