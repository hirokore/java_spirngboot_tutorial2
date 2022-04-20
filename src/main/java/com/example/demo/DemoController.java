package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller //コントローラーとして役割を持たせたクラスファイルという意味を持たせる注釈
public class DemoController {
	@RequestMapping("/")//リクエストURLに対して、どのメソッドが処理するかを決める注釈
	String home() {//homeメソッドをString型で定義して、表示したい文字列をreturnする。
		return "Hello Spring";
	}
}
