package in.ineuron.Dao;
import java.util.List;
import java.util.Map;

import in.ineuron.model.*;

public interface IDAO {
	public int count();
	public String getrepoName(int i);
	public int saveApp(String name,String item,double sal);
	public List<customer1> getAllDetails();
	public Map<String,Object> getData(int no);
	public List<Map<String,Object>> getMapCust();

}
