package com.example.demo;

//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
// Modelクラスとは、Webページで使用するデータを管理するクラスです。
//import org.springframework.ui.Model;
//Modelは戻り値を持たないため、ビューから値が返ってくる場合には、 ModelAndView
import org.springframework.web.servlet.ModelAndView;

@Controller //コントローラーとして役割を持たせたクラスファイルという意味を持たせる注釈
public class DemoController {
	@RequestMapping(value = "/", method=RequestMethod.GET)//リクエストURLに対して、どのメソッドが処理するかを決める注釈
	public ModelAndView index(ModelAndView mav) {//homeメソッドをString型で定義して、表示したい文字列をreturnする。
		mav.setViewName("index");
		mav.addObject("msg", "お名前を入力してください");
		return mav;
	}
	@RequestMapping(value = "/", method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str, ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg","こんにちは" + str + "さん！");
		mav.addObject("value", str);
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

//ブラウザからURLを指定された場合には、GETで処理されるので、indexメソッドが処理され
//次にHTMLから送信された場合には、POSTを指定していますので、sendメソッドが処理されます。