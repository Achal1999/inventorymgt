package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionDemo;
import Entity.Products;

public class ProductDao 
{
	public void AddProduct(Products product) throws SQLException
	{
	  String sql = "insert into product(pId,pName,pItem,pCompanyName,pPrice) values (?,?,?,?,?)";
	 Connection con=ConnectionDemo.getConnection();
	 PreparedStatement ps=con.prepareStatement(sql);
	 ps.setInt(1,product.getPid());
	 ps.setString(2,product.getpName());
	 ps.setInt(3, product.getpItems());
	 ps.setString(4,product.getpCompanyName());
	ps.setString(5,product.getpPrice());
	 int i=ps.executeUpdate();
	 if(i>0)
	 {
		 System.out.println("product inserted sucessfully.....");
	 }
	 else
	 {
		 System.out.println("product not inserted Sucessfully.....");
	 }
	 
	}
	
	public void RemoveProduct(Products Products) throws SQLException
	{
		String sql="delete from product where pid=?";
		Connection con=ConnectionDemo.getConnection();
		 PreparedStatement ps=con.prepareStatement(sql);
		 ps.setInt(1, Products.getPid());
		 int i=ps.executeUpdate();
		 if(i>0)
		 {
			 System.out.println("product deleted sucessfully.....");
		 }
		 else
		 {
			 System.out.println("product not deleted Sucessfully.....");
		 }
		 
		}
	
	
	public List<Products> getAllUser() throws SQLException
	{
	  List<Products> user= new ArrayList<Products>();
	  String sql="select * from product";
	  Connection con=ConnectionDemo.getConnection();
	  PreparedStatement ps=con.prepareStatement(sql);
	  ResultSet rs = ps.executeQuery();
	  while(rs.next())
	  {
		  Products user1=new Products();
		  user1.setPid(rs.getInt(1));
		  user1.setpName(rs.getString(2));
		  user1.setpPrice(rs.getString(3));
		  user1.setpCompanyName(rs.getString(4));
		  user1.setpPrice(rs.getString(5));
		  user.add(user1);
	  }
	  return user;
	  
	  
	  
	  
	}	
	
	public void purchase(Products products) throws SQLException
	{
		String sql="UPDATE product where pId=? SET pItem = pItem - 1";
		Connection con=ConnectionDemo.getConnection();
		 PreparedStatement ps=con.prepareStatement(sql);
		 ps.setInt(1, products.getPid());

		
	}

	
	public void updateUser(Products product) {
		Connection con=ConnectionDemo.getConnection();
	    try {
	        PreparedStatement ps = con.prepareStatement("UPDATE product SET pName=?, pItem=?, pCompanyName=?, pPrice=? WHERE id=?");
	        ps.setInt(1,product.getPid());
	   	 ps.setString(2,product.getpName());
	   	 ps.setInt(3, product.getpItems());
	   	 ps.setString(4,product.getpCompanyName());
	   	ps.setString(5,product.getpPrice());
	        int i = ps.executeUpdate();

	      if(i == 1) {
	    	  System.out.println("product updated sucessfully.....");
	      }

	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }

		 System.out.println("product updation failed.....");
	}
	}


