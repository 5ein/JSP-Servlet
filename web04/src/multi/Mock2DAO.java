package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Mock2DAO {

	public int insert(Mock2VO bag) {
		// 1) 가방을 받아서 변수에 넣어주세요.
		int result = 0;

		try {
			// 1.mySQL과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			// 2.mySQL에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			// 3. SQL문 부품(객체)으로 만들어주기
			String sql = "insert into mock2 values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			// 2) 가방에서 값들을 하나씩 꺼내쓰세요.
			ps.setString(1, bag.getId()); 
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getUsername());
			ps.setString(4, bag.getGender());
			ps.setString(5, bag.getEmail());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			// 4. SQL문 mySQL로 보내기
			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// 실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			// result = 0;
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}
}