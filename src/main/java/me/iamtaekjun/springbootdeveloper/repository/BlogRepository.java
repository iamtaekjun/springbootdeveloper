package me.iamtaekjun.springbootdeveloper.repository;

import me.iamtaekjun.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
