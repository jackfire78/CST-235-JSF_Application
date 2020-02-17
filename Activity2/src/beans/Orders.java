package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {
	List<Order> orders = new ArrayList<Order>();

	public Orders() {
		orders.add(new Order("00000001","Product1",(float)1.00,1));
		orders.add(new Order("00000002","Product2",(float)2.00,2));
		orders.add(new Order("00000003","Product3",(float)3.00,3));
		orders.add(new Order("00000004","Product4",(float)4.00,4));
		orders.add(new Order("00000005","Product5",(float)5.00,5));
		orders.add(new Order("00000006","Product6",(float)6.00,6));
		orders.add(new Order("00000007","Product7",(float)7.00,7));
		orders.add(new Order("00000008","Product8",(float)8.00,8));
		orders.add(new Order("00000009","Product9",(float)9.00,9));
		orders.add(new Order("000000010","Product10",(float)10.00,10));
	}
	
    //return list
	public List<Order> getList() {
		return orders;
	}

	//set list
	public void setList(List<Order> orders) {
		this.orders = orders;
	}
}


