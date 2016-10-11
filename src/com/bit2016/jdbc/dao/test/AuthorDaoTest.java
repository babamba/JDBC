package com.bit2016.jdbc.dao.test;

import java.util.List;

import com.bit2016.jdbc.dao.AuthorDao;
import com.bit2016.jdbc.vo.AuthorVo;

public class AuthorDaoTest {

	public static void main(String[] args) {
		// insert test
		// insertTest();

		// delete Test
		// deleteTest();
		
		// update Test
		updateTest();
		
		// getList test
		getListTest();
	}
	
	public static void updateTest() {
		AuthorVo vo = new AuthorVo();
		vo.setNo(6L);
		vo.setName( "안대혁" );
		
		new AuthorDao().update(vo);
	}
	
	public static void deleteTest() {
		AuthorDao dao = new AuthorDao();
		dao.delete( 1L );
		dao.delete( 2L );
		dao.delete( 3L );
		dao.delete( 4L );
	}
	
	public static void getListTest() {
		AuthorDao dao = new AuthorDao();
		List<AuthorVo> list = dao.getList();
		
		System.out.println( "===========================" );
		for( AuthorVo vo : list ) {
			//System.out.println( vo.getNo() + ":" + vo.getName());
			System.out.println( vo );
		}
		System.out.println( "===========================" );
	}
	
	public static void insertTest() {
		
		AuthorDao dao = new AuthorDao();
		
		// mock data
		AuthorVo vo1 = new AuthorVo();
		vo1.setName( "맹자" );
		dao.insert(vo1);
		
		AuthorVo vo2 = new AuthorVo();
		vo2.setName( "노자" );
		dao.insert(vo2);
		
		AuthorVo vo3 = new AuthorVo();
		vo3.setName( "장자" );
		dao.insert(vo3);		
		
	}

}
