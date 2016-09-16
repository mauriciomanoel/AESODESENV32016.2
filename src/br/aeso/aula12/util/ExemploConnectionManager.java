package br.aeso.aula12.util;

import java.sql.Connection;

public class ExemploConnectionManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = 
				ConnectionManager.getConnection(Database.MYSQL);
	}

}
