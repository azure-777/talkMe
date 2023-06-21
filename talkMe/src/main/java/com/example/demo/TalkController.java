package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TalkController {

	//スタート画面の表示かつ初期表示
	@RequestMapping("/")
	public String start() {
		return "start.html";
	}

	//お題画面の表示
	@RequestMapping("/talk")
	public String talk() {
		return "talk.html";
	}

}
