package com.example.demo;

import org.springframework.web.bind.annotation.	PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
// Modelクラスとは、Webページで使用するデータを管理するクラスです。
//import org.springframework.ui.Model;
//Modelは戻り値を持たないため、ビューから値が返ってくる場合には、 ModelAndView
import org.springframework.web.servlet.ModelAndView;

@Controller //コントローラーとして役割を持たせたクラスファイルという意味を持たせる注釈
public class DemoController {
	@RequestMapping("/{num}")//リクエストURLに対して、どのメソッドが処理するかを決める注釈
	public ModelAndView index(@PathVariable int num, ModelAndView mav) {//homeメソッドをString型で定義して、表示したい文字列をreturnする。
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		mav.addObject("msg", "sum=" + sum);
		mav.setViewName("index");
		return mav;
	}
}

// @Controllerの説明URL いくつか書き方の種類があったのでリクエストの種類が増えたら再読
// https://pointsandlines.jp/server-side/java/spring-boot-controller-request-mapping

// STS 4.10.0から「Web Developer Tools」が削除されている
// Eclipse マーケットプレースから、以下をダウンロードすると解決できる
// Eclipse Enterprise Java and Web Developer Tools


//テンプレートエンジンとはデータとテンプレートを合体させ、文字列を作る仕組みのこと

//addAttributeは、第一引数で名前を、第二引数で値を設定します。
//ビュー側で第一引数で指定した名前でデータを取り出します。