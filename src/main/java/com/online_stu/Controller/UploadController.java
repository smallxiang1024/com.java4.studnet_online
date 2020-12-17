/**
 * @ClassName UploadController
 * @description
 * @updateRemark
 * @author ljh
 * @updateUser
 * @createDate 2020/12/9 17:31
 * @updateDate 2020/12/9 17:31
 * @version 1.0
 **/
package com.online_stu.Controller;

import com.sun.naming.internal.FactoryEnumeration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 @author ljh
 @create 2020-12-09-17:31
 **/
@Controller
public class UploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String getViewUpload(){
        return "upload";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(MultipartFile file) throws IOException {
        System.out.println("文件名字"+file.getName());
        System.out.println("文件原名字"+file.getOriginalFilename());

        file.transferTo(new File("E:\\haha", file.getOriginalFilename()));
        return "upSuccess";
    }
}
