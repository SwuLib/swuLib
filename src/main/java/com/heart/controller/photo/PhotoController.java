package com.heart.controller.photo;

import com.heart.dto.PhotoDto;
import com.heart.service.phtoto.PhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.Log4jConfigListener;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
@Controller
public class PhotoController {

    @Resource(name = "photoService")
    PhotoService photoService;

    @RequestMapping("/gallery")
    public ModelAndView showGallery() {
        System.out.println("showGallery coming...");
        ModelAndView mv = new ModelAndView("gallery");
        List<PhotoDto> photoDtos = photoService.getGalleryPhoto();
        mv.addObject("photoDtos",photoDtos);
        return mv;
    }

}
