package web;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 스프링 부트 테스트와 junit 사이의 연결자 역할
@WebMvcTest(controllers=HelloController.class) // 여러 스프링 테스트 어노테이션 중 Web에 집중하는 어노테이션
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 Bean을 주입 받음
    private MockMvc mvc; // 웹 API를 테스트 할 때 사용 (HTTP, GET, POST ...)

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello="hello";

        // MockMvc를 통해 /hello 주소로 HTTP GET 요청, 흔한 200/404/500 등의 상태 검증(여기서는 OK(200)인지 확인), 내용을 검증하고 Controller에서 hello를 리턴하기 때문에 이 값이 맞는지 검증
        mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));
    }
}
