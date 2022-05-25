package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Flowers.Flower;
import Servlets.LabCRUDInterface;

public class SqlCRUD implements LabCRUDInterface<Flower> {
	
	Connection connection;
	
	public SqlCRUD() {
		this.connection = new Connect().getCon();
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Flower t) {
		try(PreparedStatement st = connection.prepareStatement("INSERT INTO flower (name, img, description) "
				+ "VALUES (?, ?, ?)")) {
			st.setString(1, t.getName());
			st.setString(2, t.getImg());
			st.setString(3, t.getDescription());
			
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Flower> read() {
		List<Flower> list = new ArrayList<>();
		
		try(Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM flower;");) {
			while(rs.next()) {
				list.add(new Flower(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void update(int id, Flower t) {
		try(PreparedStatement st = connection.prepareStatement("UPDATE flower"
				+ "SET \"name\"=?, \"img\"=?, \"description\"=? WHERE id=?;")) {
			st.setString(1, t.getName());
			st.setString(2, t.getImg());
			st.setString(3, t.getDescription());
			st.setInt(3, id);
			
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		
		try(PreparedStatement st = connection.prepareStatement("DELETE FROM flower WHERE id=?;")) {
			st.setInt(1, id);
			
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
