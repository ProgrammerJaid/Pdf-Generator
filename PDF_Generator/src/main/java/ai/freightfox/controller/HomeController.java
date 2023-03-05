package ai.freightfox.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ai.freightfox.entity.Buyer;
import ai.freightfox.entity.InfoDTO;
import ai.freightfox.entity.Item;
import ai.freightfox.entity.Seller;
import ai.freightfox.service.PdfGenerationService;

@Controller
public class HomeController {

	@Autowired private PdfGenerationService service;
	
	@Autowired private Buyer buyer;
	
	@Autowired private Seller seller;
	
	@PostMapping("/")
	public String createPDF(@RequestBody InfoDTO infoDto,Model model) {
		
		buyer.setBuyerAddress(infoDto.getBuyerAddress());
		buyer.setBuyerGstin(infoDto.getBuyerGstin());
		buyer.setBuyerName(infoDto.getBuyerName());
		
		seller.setSellerAddress(infoDto.getSellerAddress());
		seller.setSellerGstin(infoDto.getSellerGstin());
		seller.setSellerName(infoDto.getSellerName());
		
		Map<String,Object> mp = new HashMap<>();
		mp.put("seller", seller);
		mp.put("buyer", buyer);
		mp.put("items",infoDto.getItems());
		
		model.addAttribute("seller", seller);
		model.addAttribute("buyer",buyer);
		model.addAttribute("items", infoDto.getItems());
		
		service.generatePdfFile("pdfTemplate", mp, "mydocument_" + LocalDateTime.now()
						.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".pdf");

		return "pdfTemplate";
	}
	
	@GetMapping("/")
	public String createPDF1(Model model) {
		
		Buyer buyer = new Buyer();
		buyer.setBuyerName("Vedant Computers");
		buyer.setBuyerGstin("29AABBCCDD131ZD");
		buyer.setBuyerAddress("New Delhi, India");
		
		Map<String,Object> mp = new HashMap<>();
		mp.put("buyer", buyer);
		
		model.addAttribute("buyer", buyer);
		
		Seller seller = new Seller();
		seller.setSellerAddress("New Delhi, India");
		seller.setSellerGstin("29AABBCCDD121ZD");
		seller.setSellerName("XYZ Pvt. Ltd.");
		
		model.addAttribute("seller",seller);
		
		mp.put("seller",seller);
		
		List<Item> items = new ArrayList<>();
		items.add(new Item("Product 1","12 Nos",123.00,1467.00));
		model.addAttribute("items", items);
		mp.put("items", items);
		
		service.generatePdfFile("pdfTemplate", mp, "mydocument_" + LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".pdf");
		
		return "pdfTemplate";
	}
	
}
