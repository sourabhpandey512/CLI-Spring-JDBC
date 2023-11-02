package in.ineuron;
import in.ineuron.model.*;
import java.util.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import in.ineuron.service.Iservicemgmt;
import in.ineuron.service.IservicemgmtImpl;
@SpringBootApplication
public class SpringJdbcExample1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcExample1Application.class, args);
		Iservicemgmt service=context.getBean(Iservicemgmt.class);
		System.out.println(service.getCount());
		System.out.println(service.getName(2));
		String s=service.save("mohan", "C lang", 22000.50);
		if(s.equals("Success"))
			System.out.println("Data Saved to database");
		else
			System.out.println("Data save Failed! Try again");
		List<customer1> cust=service.getcustomer();
		System.out.println(cust);
		for(customer1 customer:cust) {
			System.out.println(customer.getCust_id()+" "+customer.getCname()+" "+customer.getCitem()+" "+customer.getCamt());
		}
		Map<String,Object>map=service.getData1(2);
		System.out.println(map);
		for (Map.Entry<String, Object> entry : map.entrySet()) {
	        
	            System.out.println(entry.getKey()+" "+  entry.getValue());
		}
		List<Map<String,Object>> list=service.getListData();
		for(Map<String,Object> map1:list) {
			for(Map.Entry<String,Object> entry: map1.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		((ConfigurableApplicationContext) context).close();
	}

}
