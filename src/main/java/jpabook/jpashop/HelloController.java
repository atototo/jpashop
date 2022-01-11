package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName : jpabook.jpashop
 * fileName : HelloController
 * author : isbn8
 * date : 2022-01-07
 * description :
 * ===========================================================
 * DATE          AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-01-07       isbn8         최초 생성
 */
@Controller
public class HelloController {

   @GetMapping("hello")
   public String hello(Model model) {

      //model : data 를 view 에 넘겨주는 model
      model.addAttribute("data", "hello!!!!!");
      return "hello";   //resources/templates/hello.html
   }
}
