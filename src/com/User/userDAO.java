package com.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.DB.DBDAO;

public class userDAO {

	private static userDAO instance = null;
	//싱글톤 정적변수
	private static DBDAO db = DBDAO.getInstance();
	
	private Connection conn = null;
	private Statement statement;
	private PreparedStatement pstmt= null;
	private ResultSet rs = null;
	
	
	//싱글톤 패턴
	public static userDAO getInstance() {
		if(instance == null)
			instance = new userDAO();
		
		return instance;
	}
	
	//private 로 기본 생성자 차단
	private userDAO() { }
	
	//회원가입 메소드
	public List<String> getData(String userId, String password) {
		List<String> dataList = null;
		try {
			conn = db.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery("select * from Login where userId = " + userId + " and password = " + password);

			if(rs.next()) {
				dataList = new ArrayList<>();
				do {
					dataList.add(rs.getString("id"));
					dataList.add(rs.getString("userId"));
					dataList.add(rs.getString("password"));
				}while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataList;
	}
}
