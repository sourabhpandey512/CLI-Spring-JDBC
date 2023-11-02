package in.ineuron.service;
import java.util.List;
import java.util.Map;

import in.ineuron.model.*;

public interface Iservicemgmt {
public int getCount();
public String getName(int i);
public String save(String name,String item, double sal);
public List<customer1> getcustomer();
public Map<String,Object> getData1(int no);
public List<Map<String,Object>> getListData();
}
