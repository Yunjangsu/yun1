package com.mysite.jangsu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import com.mysite.jangsu.user.SiteUser;
import com.mysite.jangsu.user.UserRepository;  // <== 이거 import 해야 함
import java.util.Optional;

@Controller
public class MainController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final UserRepository userRepository;

    // 생성자 주입
    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/jangsu")
    @ResponseBody
    public String index() {
        return "안녕하세요 JSTEST입니다";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

    @GetMapping("/traffic-news")
    public String trafficNews() {
        return "traffic_news";  // traffic_news.html 로 이동
    }
}
