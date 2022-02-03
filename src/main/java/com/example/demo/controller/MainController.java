package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import java.util.ArrayList;
// import java.util.List;

import com.example.demo.DatasouceConfigFromAppProperties;
import com.example.demo.AddressConfigFromYml;
import com.example.demo.UIConfigFromSettingsProperties;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.PropertySource;

// // 外部のプロパティファイルを登録する
// @Configuration
// @PropertySource("file:${app.home}/settings.properties}")

@Controller
public class MainController 
{
	// application.ymlから設定読み込み
	@Autowired
	private AddressConfigFromYml addressConfig;

	// application.propertiesから設定読み込み
	@Autowired
	private DatasouceConfigFromAppProperties dataConfig;

	// Setting.propertiesから設定読み込み
	@Autowired
	private UIConfigFromSettingsProperties uiConfig;

    @RequestMapping("/hello")
	public String index(Model model, @RequestParam(name = "param", required = false) String urlParam) 
	{
		// 設定情報を画面に送信
		model.addAttribute("urlParam", urlParam);
		model.addAttribute("countory", addressConfig.getCountry());
		model.addAttribute("address", addressConfig.getAddress());
		model.addAttribute("city", addressConfig.getCity());
		model.addAttribute("postcode", addressConfig.getPostcode());
		model.addAttribute("username", dataConfig.getUsername());
		model.addAttribute("password", dataConfig.getPassword());
		model.addAttribute("interval", uiConfig.getInterval());
		model.addAttribute("sleepTime", uiConfig.getSleepTime());

		// 画面表示
		return "hello";
	}
}
