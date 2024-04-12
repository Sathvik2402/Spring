package com.nt.controller;


import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import com.nt.entity.Form;
import com.nt.entity.Root;
import com.nt.entity2.List;
import com.nt.validator.FieldsValidator;


@Controller
public class AppController {
	@Autowired
		private FieldsValidator fvalidator;

	
	@GetMapping("/")
	public String getWeather1(Map<String, Object> map,Model model) {
		model.addAttribute("form", new Form());
		String apiKey="5459fc65a8045f0fae1fa9ed93f1564a";
		String zcode="507001",ccode="IN";
		String uri="https://api.openweathermap.org/data/2.5/weather?zip="
				+ zcode
				+ ","
				+ ccode
				+ "&appid="
				+ apiKey
				+"&units=metric";
		RestTemplate rt=new RestTemplate();
		Root now=rt.getForObject(uri, Root.class);
		String hourly="https://api.openweathermap.org/data/2.5/forecast?lat="
				+ now.getCoord().getLat()
				+ "&lon="
				+ now.getCoord().getLon()
				+ "&appid="
				+ apiKey
				+"&units=metric";
		
		RestTemplate rt2=new RestTemplate();
		com.nt.entity2.Root n=rt2.getForObject(hourly, com.nt.entity2.Root.class);
		map.put("city", n.getCity().getName());
		int tc=0,fc=0,dc=0,wc=0,mc=0,mic=0,hc=0,pc=0,sc=0,idc=0,dtc=0;
		for (List li : n.getList()) {
			 tc++;fc++;dc++;wc++;mc++;mic++;hc++;pc++;sc++;idc++;dtc++;
			map.put("temp"+tc, li.getMain().getTemp());
			map.put("feel"+fc, li.getMain().getFeels_like());
			map.put("desc"+dc, li.getWeather().get(0).getDescription());
			map.put("wind"+wc, li.getWind().getSpeed());	
			map.put("max"+mc, li.getMain().getTemp_max());
			map.put("min"+mic, li.getMain().getTemp_min());
			map.put("hum"+hc, li.getMain().getHumidity());
			map.put("press"+pc, li.getMain().getPressure());
			map.put("sea"+sc, li.getMain().getSea_level());
			String icon=li.getWeather().get(0).getIcon();	
			String iconurl="https://openweathermap.org/img/wn/"+icon+"@4x.png";
			map.put("id"+idc, iconurl);
			map.put("dt"+dtc, li.getDt_txt());
		}
		return "glass";
	}
	
	@PostMapping("/glass") 
	public String getWeather2(Map<String, Object> map,@ModelAttribute("form") Form form,BindingResult errors ) {
		if(fvalidator.supports(Form.class)) {
			System.out.println("AppController.getWeather2()");
		fvalidator.validate(form, errors);
		if(errors.hasFieldErrors()) {
			System.out.println("AppController.getWeather2().ifField");
			
		String apiKey="5459fc65a8045f0fae1fa9ed93f1564a";
		String zcode="507001",ccode="IN";
		String uri="https://api.openweathermap.org/data/2.5/weather?zip="
				+ zcode
				+ ","
				+ ccode
				+ "&appid="
				+ apiKey
				+"&units=metric";
		RestTemplate rt=new RestTemplate();
		Root now=rt.getForObject(uri, Root.class);
		String hourly="https://api.openweathermap.org/data/2.5/forecast?lat="
				+ now.getCoord().getLat()
				+ "&lon="
				+ now.getCoord().getLon()
				+ "&appid="
				+ apiKey
				+"&units=metric";
		
		RestTemplate rt2=new RestTemplate();
		com.nt.entity2.Root n=rt2.getForObject(hourly, com.nt.entity2.Root.class);
		map.put("city", n.getCity().getName());
		int tc=0,fc=0,dc=0,wc=0,mc=0,mic=0,hc=0,pc=0,sc=0,idc=0,dtc=0;
		for (List li : n.getList()) {
			 tc++;fc++;dc++;wc++;mc++;mic++;hc++;pc++;sc++;idc++;dtc++;
			 System.out.println(li.getMain().getTemp());
			map.put("temp"+tc, li.getMain().getTemp());
			map.put("feel"+fc, li.getMain().getFeels_like());
			map.put("desc"+dc, li.getWeather().get(0).getDescription());
			map.put("wind"+wc, li.getWind().getSpeed());	
			map.put("max"+mc, li.getMain().getTemp_max());
			map.put("min"+mic, li.getMain().getTemp_min());
			map.put("hum"+hc, li.getMain().getHumidity());
			map.put("press"+pc, li.getMain().getPressure());
			map.put("sea"+sc, li.getMain().getSea_level());
			String icon=li.getWeather().get(0).getIcon();	
			String iconurl="https://openweathermap.org/img/wn/"+icon+"@4x.png";
			map.put("id"+idc, iconurl);
			map.put("dt"+dtc, li.getDt_txt());
			}
			return "/glass";
			
		}
		}
		String apiKey="5459fc65a8045f0fae1fa9ed93f1564a";
		String uri="https://api.openweathermap.org/data/2.5/weather?zip="
				+ form.getZcode()
				+ ","
				+ form.getCcode()
				+ "&appid="
				+ apiKey
				+"&units=metric";
		RestTemplate rt=new RestTemplate();
		Root now=rt.getForObject(uri, Root.class);
		String hourly="https://api.openweathermap.org/data/2.5/forecast?lat="
				+ now.getCoord().getLat()
				+ "&lon="
				+ now.getCoord().getLon()
				+ "&appid="
				+ apiKey
				+"&units=metric";
		RestTemplate rt2=new RestTemplate();
		com.nt.entity2.Root n=rt2.getForObject(hourly, com.nt.entity2.Root.class);
		
		map.put("city", n.getCity().getName());
		int tc=0,fc=0,dc=0,wc=0,mc=0,mic=0,hc=0,pc=0,sc=0,idc=0,dtc=0;
		for (List li : n.getList()) {
			 tc++;fc++;dc++;wc++;mc++;mic++;hc++;pc++;sc++;idc++;dtc++;
			map.put("temp"+tc, li.getMain().getTemp());
			map.put("feel"+fc, li.getMain().getFeels_like());
			map.put("desc"+dc, li.getWeather().get(0).getDescription());
			map.put("wind"+wc, li.getWind().getSpeed());	
			map.put("max"+mc, li.getMain().getTemp_max());
			map.put("min"+mic, li.getMain().getTemp_min());
			map.put("hum"+hc, li.getMain().getHumidity());
			map.put("press"+pc, li.getMain().getPressure());
			map.put("sea"+sc, li.getMain().getSea_level());
			String icon=li.getWeather().get(0).getIcon();	
			String iconurl="https://openweathermap.org/img/wn/"+icon+"@4x.png";
			map.put("id"+idc, iconurl);
			map.put("dt"+dtc, li.getDt_txt());
	}
	return "glass";
	}
	
}
