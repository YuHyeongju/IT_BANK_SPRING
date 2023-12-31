package com.itbank.service;

import org.springframework.stereotype.Service;

import com.itbank.dto.AccountDTO;


@Service
public class QuizService {
	private AccountDTO[] db = new AccountDTO[] { 
			new AccountDTO("itbank", "it", "여행"),
			new AccountDTO("user", "1234", "테스트"), 
			new AccountDTO("root", "qwe", "관리자") };

	public AccountDTO login(AccountDTO user) {

		for (AccountDTO row : db) {
			String userId = user.getId();
			String userPw = user.getPw();
			
			String dbId = row.getId();
			String dbPw = row.getPw();
			
			if(dbId.equals(userId) && dbPw.equals(userPw)) {
				return row;
			}
		}
		
		return null;
		
	}
}
