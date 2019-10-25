package controller;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import pojo.UploadFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping("/uploadFile")
    public ModelAndView upload(HttpServletRequest request, UploadFile file) throws IOException {
        /*步骤：
            创建一个唯一的文件名，防止多次上传将原文件覆盖掉。
            创建文件对象，用来接收 MultipartFile 的数据
            将 MultipartFile  拷贝一份，保留到指定目录
        */
        String newName = RandomStringUtils.randomAlphabetic(10);
        String newFileName = newName + ".jpg";

        File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);
        newFile.getParentFile().mkdirs();

        file.getImage().transferTo(newFile);

        ModelAndView mav = new ModelAndView("show");
        mav.addObject("fileName", newFileName);
        return mav;
    }
}
