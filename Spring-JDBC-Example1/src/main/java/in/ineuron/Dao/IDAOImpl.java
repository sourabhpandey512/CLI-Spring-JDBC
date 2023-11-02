package in.ineuron.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import in.ineuron.model.customer1;
@Repository
public class IDAOImpl implements IDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String COUNT_QUERY="select count(*) from customer1";
	private static final String GETNAME_QUERY="select cname from customer1 where cust_id=?";
	private static final String GET_QUERY="insert into customer1(cname,citem,camt)values(?,?,?)";
	private static final String GET_Customer="select cname,citem,camt from customer1";
	private static final String GET_ALL_Customer="select * from customer1";
	private static final String GET_THE_Customer="select * from customer1 where cust_id=?";

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(COUNT_QUERY,Integer.class);
	}
	public String getrepoName(int i) {
		return jdbcTemplate.queryForObject(GETNAME_QUERY,String.class,i);
		
	}
	public int saveApp(String name,String item,double sal) {
		return jdbcTemplate.update(GET_QUERY,name,item,sal);
		
	}
	@Override
	public List<customer1> getAllDetails() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(GET_ALL_Customer,new RowMapper<customer1>(){
			public customer1 mapRow(ResultSet rs,int rowNum)throws SQLException{
				customer1 cust=new customer1();
				cust.setCust_id(rs.getInt(1));
				cust.setCname(rs.getString(2));
				cust.setCitem(rs.getString(3));
				cust.setCamt(rs.getDouble(4));
				return cust;
				
			}
			
		});
	}
	@Override
	public Map<String, Object> getData(int no) {
		// TODO Auto-generated method stub
		Map<String,Object> map=jdbcTemplate.queryForMap(GET_THE_Customer,no);
		return map;
	}
	@Override
	public List<Map<String, Object>> getMapCust() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list=jdbcTemplate.queryForList(GET_Customer);
		return list;
	}
	
	

}
