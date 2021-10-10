package com.example.training;

import java.util.*;
import java.util.List;

import com.example.training.Member;

public class MemberService {
	HashMap<String,List<Member>> details;
	 
	 public MemberService() {
		 details=new HashMap<>();
		 
		 details.put("Bhagya",  Arrays.asList(new Member(101,"Bharat","Saideep")));
		 details.put("Ramesh", Arrays.asList(new Member(102,"Breaking India","Rajat")));
	 }
	 public List<Member> findByMember(String memberName) {
		 return details.get(memberName);
	 }

}
