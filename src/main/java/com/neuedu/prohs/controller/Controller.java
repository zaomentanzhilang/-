package com.neuedu.prohs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/controller")
public class Controller {

    //    @RequestMapping("/show/{name}/{pwd}")
//    public String show(@PathVariable("name")String name, @PathVariable("pwd") String pwd){
//        return name+"\n\n\n\n\n\n\n\n\n\n"+pwd;
//    }
    @RequestMapping("/tou")
    public String tou(HttpServletRequest request, MultipartFile multipartFile) {
        // getServletContext()：Servlet上下文 服务器对象
//request.getServletContext().getRealPath("/");找到服务器所在的路径
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
//如果目标路径不存在，则新建一个路径 并创建一个与文件名相同的空文件
        String str = multipartFile.getOriginalFilename();
        String originExt = multipartFile.getOriginalFilename().substring(str.lastIndexOf("."));
        String newName = UUID.randomUUID().toString().replace("-", "") + originExt;
        File file = new File(path, newName);

        if (!file.exists()) {
            file.mkdirs();
        }
//将上传的二进制数据保存到目录路径下
        try {
            multipartFile.transferTo(file);
            System.out.println("文件上传成功");
        } catch (IOException e) {
            System.out.println("文件上传失败");
            e.printStackTrace();
        }
        return "";
    }

}
