package com.restaurant.tastyhub;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import com.restaurant.tastyhub.entity.Menu;
import com.restaurant.tastyhub.entity.Order;
import com.restaurant.tastyhub.repository.MenuRepository;
import com.restaurant.tastyhub.repository.OrderRepository;
import com.restaurant.tastyhub.repository.UserRepository;

@Controller

public class HomeController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/menu")
	public String showMenu(Model model) {
		model.addAttribute("menuList", menuRepository.findAll());
		return "menu";
	}
	@GetMapping("/order/{id}")
	public String orderFood(@PathVariable Long id) {
		Menu menu = menuRepository.findById(id).orElse(null);
		if(menu != null) {
		Order order = new Order();
		order.setItemName(menu.getItemName());
		order.setPrice(menu.getPrice());
		orderRepository.save(order);
		}
		return "redirect:/order";
	}
	
	

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/order")
	public String order() {
		return "order";
	}
	@GetMapping("/success")
	public String success() {
		return "success";
	}
}
