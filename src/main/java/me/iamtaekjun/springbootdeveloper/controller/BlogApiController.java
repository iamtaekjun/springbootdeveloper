package me.iamtaekjun.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.iamtaekjun.springbootdeveloper.domain.Article;
import me.iamtaekjun.springbootdeveloper.dto.AddArticleRequest;
import me.iamtaekjun.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    // HTTP 메서드가 POST일 때 전달받은 URL와 동일하면 메서드로 매핑
    @PostMapping("/api/articles")
    // 요청 본문 값 매핑
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }
}
