package com.tangl.song.infra.basic.service.impl;

import com.tangl.song.infra.basic.entity.MelodyArtist;
import com.tangl.song.infra.basic.mapper.MelodyArtistMapper;
import com.tangl.song.infra.basic.service.MelodyArtistService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 歌手信息表(MelodyArtist)表服务实现类
 */
@Service("melodyArtistService")
public class MelodyArtistServiceImpl implements MelodyArtistService {

    @Resource
    private MelodyArtistMapper melodyArtistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MelodyArtist queryById(Integer id) {
        return this.melodyArtistDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param melodyArtist 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(MelodyArtist melodyArtist) {
        return this.melodyArtistDao.insert(melodyArtist);
    }

    /**
     * 修改数据
     *
     * @param melodyArtist 实例对象
     * @return 实例对象
     */
    @Override
    public int update(MelodyArtist melodyArtist) {
        return this.melodyArtistDao.update(melodyArtist);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.melodyArtistDao.deleteById(id) > 0;
    }

    /**
     * 根据条件查询数量
     */
    @Override
    public int countByCondition(MelodyArtist artist) {
        return this.melodyArtistDao.countByCondition(artist);
    }

    /**
     * 分页条件查询歌手信息
     */
    @Override
    public List<MelodyArtist> queryPage(MelodyArtist artist, int offset, Integer pageSize) {
        return this.melodyArtistDao.queryPage(artist, offset, pageSize);
    }
}
