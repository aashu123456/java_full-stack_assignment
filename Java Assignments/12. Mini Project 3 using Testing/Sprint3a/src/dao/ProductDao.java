package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import resource.DbResource;

public class ProductDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	Statement stmt;

	public List<Product> displayAllProduct() {

		List<Product> listOfProduct = new ArrayList<>();
		try {

			con = DbResource.getDbConnection();
			pstmt = con.prepareStatement("select * from products");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setStoredate(rs.getDate(4).toLocalDate()); // converting sql date into Local date format
				listOfProduct.add(p);
			}
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Primary Key issue" + e);

		} catch (Exception e) {
			System.err.println("SQL Related Exception  " + e);
		}
		return listOfProduct;

	}

	public int addProduct(Product pp) throws NumberFormatException, IOException {
		try {

			con = DbResource.getDbConnection();

			pstmt = con.prepareStatement("insert into product values(?,?,?,?)");

			pstmt.setInt(1, pp.getPid());
			pstmt.setString(2, pp.getPname());
			pstmt.setFloat(3, pp.getPrice());
			pstmt.setDate(4, Date.valueOf(pp.getStoredate())); // converting Local Date into sql date
			int res = pstmt.executeUpdate();
			return res;

		} catch (SQLException e) {
			System.err.println("SQL Related Exception " + e);
			return 0;
		}

	}

	public int updateProductPrice(Product pp) {
		try {
			con = DbResource.getDbConnection();
			pstmt = con.prepareStatement("update Product set price = ? where pid=?");
			pstmt.setFloat(1, pp.getPrice());
			pstmt.setInt(2, pp.getPid());
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {

			System.err.println("SQL Related Exception " + e);
			return 0;
		}

	}

	public int deleteProduct(Product pp) {
		try {
			con = DbResource.getDbConnection();
			pstmt = con.prepareStatement("delete from Product where pid=?");

			pstmt.setInt(1, pp.getPid());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {

			System.err.println("Exception " + e);
			return 0;
		}

	}

}
