package co.lsj.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.lsj.prj.comm.Command;
import co.lsj.prj.member.service.MemberService;
import co.lsj.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println("========회원정보 검색==========");
		System.out.println("검색할 회원 ID를 입력하세요.");
		vo.setId(scb.nextLine());
		vo = memberService.memberSelect(vo);

		System.out.print(vo.getId() + " : ");
		System.out.print(vo.getName() + " : ");
		System.out.print(vo.getPassword() + " : ");
		System.out.print(vo.getTel() + " : ");
		System.out.print(vo.getAddress() + " : ");
		System.out.println(vo.getAuthor());


	}

}
