package svc;

import static db.JdbcUtil.close;
import static db.JdbcUtil.getConnection;

import java.sql.Connection;

import dao.DeliveryDAO;

public class CheakAndroidIDService {

	public int selectAndroidID() {
		Connection con = getConnection();
		DeliveryDAO deliveryDAO = DeliveryDAO.getinstance();
		deliveryDAO.setConnection(con);
		
		int checkAndroidID=deliveryDAO.selectAndroidID();
		close(con);
		return checkAndroidID;
	}

}
