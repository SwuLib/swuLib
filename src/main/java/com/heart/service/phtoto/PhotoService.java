package com.heart.service.phtoto;

import com.heart.dto.PhotoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
public interface PhotoService {

    /**
     * 获取生活风采照片墙
     * @return
     */
    public List<PhotoDto> getGalleryPhoto();

}
