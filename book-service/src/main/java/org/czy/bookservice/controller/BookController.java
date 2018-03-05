package org.czy.bookservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Book Service
 *
 * @author 曹子钰, 2018/3/5
 */
@RestController
public class BookController {
    @GetMapping("/")
    public String index() {
        return "books";
    }
}
