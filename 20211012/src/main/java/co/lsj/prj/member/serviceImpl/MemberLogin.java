package co.lsj.prj.member.serviceImpl;

import co.lsj.prj.comm.Command;
import co.lsj.prj.member.service.MemberService;
import co.lsj.prj.member.service.MemberVO;

public class MemberLogin implements Command {

	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		vo.setId("lsj");
		vo.setPassword("1234");
		
		vo = memberService.loginCheck(vo);
		
		System.out.println(vo.getName() + " : " + vo.getAuthor());
	

	}

}
