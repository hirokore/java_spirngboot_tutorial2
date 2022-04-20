package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller //コントローラーとして役割を持たせたクラスファイルという意味を持たせる注釈
public class DemoController {
	@RequestMapping("/")//リクエストURLに対して、どのメソッドが処理するかを決める注釈
	public String index() {//homeメソッドをString型で定義して、表示したい文字列をreturnする。
		return "Index";
	}
}

// @Controllerの説明URL いくつか書き方の種類があったのでリクエストの種類が増えたら再読
// https://pointsandlines.jp/server-side/java/spring-boot-controller-request-mapping

// STS 4.10.0から「Web Developer Tools」が削除されている
// Eclipse マーケットプレースから、以下をダウンロードすると解決できる
// Eclipse Enterprise Java and Web Developer Tools


//テンプレートエンジンとはデータとテンプレートを合体させ、文字列を作る仕組みのこと