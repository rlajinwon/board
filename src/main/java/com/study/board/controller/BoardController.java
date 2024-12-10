package com.study.board.controller;

import com.study.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController { //localhost:8080/board/write
    @GetMapping("/board/write")
    public String boardWriteFore(){
        String s = "boardwrite";
        return s;
    }
@PostMapping("/board/writepro")
    public String BoardWritePro(Board board){
    System.out.println(board.getTitle());

    String s = "";
    return s;

    }
}
