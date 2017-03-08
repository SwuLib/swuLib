package com.heart.dao.photoDao;

import com.heart.dto.PhotoDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * Created by Administrator on 2017/3/7.
 */
@Repository("photoDao")
public interface PhotoDao {

    /**
     * 通过图片ID来获取图片
     * @param pID
     * @return
     */
    public PhotoDto loadPhotoById(@Param("pid") int pID);

    /**
     * 通过类型来获取图片列表
     * @param pType
     * @return
     */
    public List<PhotoDto> loadPhotoListByType(@Param("ptype") int pType);

}
