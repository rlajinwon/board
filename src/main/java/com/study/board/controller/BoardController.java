package com.study.board.controller;

import com.study.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController { //localhost:8080/board/write
    @GetMapping("/board/write")
    public String boardWriteFore(){
        return "boardwrite";
    }
@PostMapping("/board/writepro")
    public String BoardWritePro(Board board){
    System.out.println(board.getTitle());


        return " ";
    }
}
