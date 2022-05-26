package com.globalrecruit.globalrecruit.controller;

public class MainController {


    @Controller

    public class MainController {

        @RequestMapping("/index")

//@ResponseBody 不能加此标签，加上此标签，return "/index"将以字符串格式返回给页面

        public String index(){

            return "/index";

        }

    }


}
