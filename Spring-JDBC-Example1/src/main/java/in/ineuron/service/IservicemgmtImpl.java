package in.ineuron.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.Dao.IDAO;
import in.ineuron.model.customer1;

@Service
public class IservicemgmtImpl implements Iservicemgmt {
	@Autowired
	IDAO dao;

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dao.count();
	}
	public String getName(int i) {
		return dao.getrepoName(i);
	}
	public String save(String name, String item,double sal) {
		int i=dao.saveApp(name,item,sal);
		if(i==1)
			return "Success";
		else
			return "Failure";
	}
	@Override
	public List<customer1> getcustomer() {
		return dao.getAllDetails();
		// TODO Auto-generated method stub
		
	}
	@Override
	public Map<String, Object> getData1(int no) {
		// TODO Auto-generated method stub
		return dao.getData(no);
	}
	@Override
	public List<Map<String, Object>> getListData() {
		// TODO Auto-generated method stub
		return dao.getMapCust();
	}
	
	
	

}
