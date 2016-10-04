package com.controllers;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.beans.ItemsList;
import com.beans.Login;
import com.beans.MakeOrder;
import com.beans.Registration;
import com.service.ItemService;
import com.service.LoginService;
import com.service.MakeOrderService;
import com.service.RegistrationService;



@Controller
public class RPLBController {
	
	@Autowired
    private LoginService loginService;
	@Autowired
	private RegistrationService registerService; 
	@Autowired
	private ItemService itemService; 
	@Autowired
	private MakeOrderService makeOrderService; 

 
	public void setMakeOrderService(MakeOrderService makeOrderService) {
		this.makeOrderService = makeOrderService;
	}

	public void setRegisterService(RegistrationService registerService) {
		this.registerService = registerService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	


	@RequestMapping(value="/insert.htm", method = RequestMethod.POST)
    public ModelAndView insert(@ModelAttribute("cmdUser") Login User,HttpServletRequest request) 
    {
    	System.out.println("In Controller.....Before");
    
        String role=loginService.validateUser(User);
        int userId=loginService.customerId(User);
        String username=User.getUserName();
        System.out.println(role);
        if(role.equalsIgnoreCase("customer")){
        	 request.getSession().setAttribute("userId",userId);
             request.getSession().setAttribute("username",username);
        	return new ModelAndView("customerHomepage");
        }
        else if(role.equalsIgnoreCase("admin")){
        	 request.getSession().setAttribute("userId",userId);
             request.getSession().setAttribute("username",username);
        	return new ModelAndView("adminHomePage");
        }
        else{
        	return new ModelAndView("invalidPage");
        }
    }
       
        	
	@RequestMapping(value="/customer.htm", method = RequestMethod.GET)
    public ModelAndView insert11(ModelMap model) 
    {
    	List itemlist=itemService.itemList();
    	
    	model.addAttribute("itemlist", itemlist);
    	System.out.println(itemlist);
       return new ModelAndView("viewitem");
    }
       
    
	
	@RequestMapping(value="/register.htm", method = RequestMethod.POST)
    public ModelAndView insert1(@ModelAttribute("regCmd") Registration register) 
    {
    	System.out.println("In Controller.....Before");
        int userid=registerService.insertCustomer(register);
        System.out.println("In Controller.....After");
        loginService.insertUser(register);
        System.out.println("login and registration updated");
        return new ModelAndView("login");
    }
		
	
	
	@RequestMapping(value="/makeorder.htm", method = RequestMethod.GET)
    public ModelAndView insert111(@ModelAttribute("makeOrder") ItemsList item,@RequestParam("itemid") int itemid,ModelMap model) 
    {
		System.out.println("into controller.....");
		System.out.println(itemid);
		
		model.addAttribute("itemid", itemid);
		//makeOrderService.insertOrder(order);
       return new ModelAndView("quantity");
    }
	
	static int count=2056;
	@RequestMapping(value="/makeorderquantity.htm", method = RequestMethod.GET)
    public ModelAndView insert1111(@ModelAttribute("makeOrder1") MakeOrder order,@RequestParam("itemid") int itemid,@RequestParam("userquantity") int userquantity,HttpServletRequest request) 
    {
		System.out.println("make quantity contreoller");
		System.out.println(itemid);
		System.out.println((userquantity));
		int userid=(int)request.getSession().getAttribute("userId");
		order.setUserid(userid);
		System.out.println(userid);
		List l=itemService.itemList();
		Iterator m=l.iterator();
	     while(m.hasNext()){
	    	 ItemsList i=(ItemsList)m.next();
	    	 if(i.getItemId()==itemid){
	    		 System.out.println(i);
	    	     order.setItem(i.getItemName());
	    	     order.setItemid(itemid);
	    	     order.setQuantity(userquantity);
	    	     order.setCost(i.getItemCost());
	    	     order.setTotalcost(i.getItemCost()*userquantity);
	    	     order.setOrderstatus("processing");
	    	     order.setOrderid(count++);
	    	     System.out.println(order);
	    	     if(userquantity<=i.getQuantity()){
	    	     makeOrderService.insertOrder(order);	
	    	     itemService.updatequantity(i,userquantity);
	    	     }
	    	     else return new ModelAndView("outofstock");
	    	 }
	     }
		
       return new ModelAndView("successPage");
    }
	

	
	@RequestMapping(value="/vieworder.htm", method = RequestMethod.GET)
    public ModelAndView insert10(ModelMap model,HttpServletRequest request) 
    {
		int userid=(int)request.getSession().getAttribute("userId");
		System.out.println("in controller of view oreder!!!!!!!!");
		System.out.println(userid);
    	List l=makeOrderService.viewOrder(userid);
    	System.out.println(l);
    	model.addAttribute("list", l);
    	
       return new ModelAndView("vieworder");
    }
	
	

	@RequestMapping(value="/items.htm", method = RequestMethod.GET)
    public ModelAndView insert01(ModelMap model) 
    {
    	List itemlist=itemService.itemList();	
    	model.addAttribute("itemlist", itemlist);
    	System.out.println(itemlist);
       return new ModelAndView("modifyitems");
    }
	
	
	@RequestMapping(value="/updateitem.htm", method = RequestMethod.GET)
    public ModelAndView insert001(@ModelAttribute("makeOrder") ItemsList item,@RequestParam("itemid") int itemid,ModelMap model) 
    {
		System.out.println("into controller.....");
		System.out.println(itemid);
		System.out.println(item);
       return new ModelAndView("edititem");
    }
	
	
	
	@RequestMapping(value="/viewcustomer.htm", method = RequestMethod.GET)
    public ModelAndView insert101(ModelMap model) 
    {
		List customerList=registerService.getCustomerDetails();
    	model.addAttribute("customerlist", customerList);
    	System.out.println(customerList);
       return new ModelAndView("viewcustomer");
    }
	
	
	
	
	@RequestMapping(value="/enteritems.htm", method = RequestMethod.GET)
    public String insert1001(ModelMap model) 
    {
       return "enteritems";
    }
	
	
	@RequestMapping(value="/insertitem.htm", method = RequestMethod.GET)
    public String insert10001(ModelMap model,HttpServletRequest request,@ModelAttribute("itemCmd") ItemsList item) 
    {
		System.out.println("first");
		if(request.getParameter("itemid")!=null && item.getItemName()!="" && item.getItemType()!="" && request.getParameter("itemcost")!=null && request.getParameter("quantity1")!=null){
		itemService.insertItem(item);
		return "adminSuccessPage";
		}
		else{
			return "invalidDetails";
		}
	
       
    }
	
	
	@RequestMapping(value="/viewadminorder.htm", method = RequestMethod.GET)
    public ModelAndView insert0221(ModelMap model) 
    {
    	List orders=makeOrderService.getProcessingOrders();
    	model.addAttribute("orders",orders);
    	System.out.println("orders to be"+orders);
       return new ModelAndView("viewadminorder");
    }
	
	
	
	@RequestMapping(value="/orderapproval.htm", method = RequestMethod.GET)
    public String insert02221(ModelMap model,@RequestParam("orderid") int orderid) 
    {
		System.out.println(orderid);
		model.addAttribute("orderid", orderid);
       return "orderapproval";
    }
	
	
	@RequestMapping(value="/approvalsuccess.htm", method = RequestMethod.GET)
    public String insert022221(ModelMap model,@RequestParam("orderid") int orderid,@RequestParam("status") String status) 
    {
		System.out.println(orderid);
		System.out.println(status);
		makeOrderService.updateOrderStatus(status, orderid);
       return "adminSuccessPage";
    }

	@RequestMapping(value="/viewitem1.htm", method = RequestMethod.GET)
    public String insert022221(ModelMap model) 
    {
		List r=itemService.itemList();
		model.addAttribute("itemlist", r);
	   return "edititem";
    }
	
	
	
	
	@RequestMapping(value="/updateItem.htm", method = RequestMethod.GET)
    public String insert02222221(ModelMap model,@ModelAttribute("itemCmd") ItemsList item) 
    {
		System.out.println("first");
		System.out.println(item);
		itemService.modifyItem(item);
		System.out.println("last");
	   return "adminSuccessPage";
    }
	
	
	@RequestMapping(value="/modify.htm", method = RequestMethod.GET)
    public ModelAndView insert22221(ModelMap model,@RequestParam("itemid1") int itemid,HttpServletRequest request,ItemsList il) 
    {
		System.out.println("1");
		if(request.getParameter("itemid1")!=null){
		System.out.println("2");
			if("modify".equalsIgnoreCase(request.getParameter("modify"))){
			List i=itemService.itemList();
			Iterator item=i.iterator();
			while(item.hasNext()){
				ItemsList l=(ItemsList)item.next();
				
				if(l.getItemId()==itemid){
					System.out.println(l);	
					model.addAttribute("item",l);
					break;
				}
			}
			System.out.println("going to view");
			System.out.println();
		   return new ModelAndView("edititem1");	
			}
		if("delete".equalsIgnoreCase("delete")){
			itemService.deleteItem(itemid);
			return new ModelAndView("adminSuccessPage");
		}
    }
		return new ModelAndView("invalidDetails");
    }
	
	
	
	
	
	
	
	
	@RequestMapping(value="/customerhome.htm", method = RequestMethod.GET)
    public String insert02221(ModelMap model,HttpServletRequest request) 
    {
	
	   return "customerHomepage";
    }
	

	
	@RequestMapping(value="/adminhome.htm", method = RequestMethod.GET)
    public String insert022221(ModelMap model,HttpServletRequest request) 
    {
		
	   return "adminHomePage";
    }
	
	

	
	@RequestMapping(value="/logout.htm", method = RequestMethod.GET)
    public String insert02233221(ModelMap model,HttpServletRequest request) 
    {
		System.out.println(request.getSession().getAttribute("userId"));
		request.getSession(false).invalidate();
		//HttpSession session=request.getSession(false);
		//session.invalidate();
		System.out.println(request.getSession().getAttribute("userId"));
	   return "login";
    }
	
	
	
	
	
}
