package com.tangl.song.infra.basic.service;

import com.tangl.song.infra.basic.entity.MelodyArtist;

import java.util.List;

/**
 * 歌手信息表(MelodyArtist)表服务接口
 */
public interface MelodyArtistService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MelodyArtist queryById(Integer id);

    /**
     * 新增数据
     *
     * @param melodyArtist 实例对象
     * @return 实例对象
     */
    int insert(MelodyArtist melodyArtist);

    /**
     * 修改数据
     *
     * @param melodyArtist 实例对象
     * @return 实例对象
     */
    int update(MelodyArtist melodyArtist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 根据条件查询数量
     */
    int countByCondition(MelodyArtist artist);

    /**
     * 分页条件查询歌手信息
     */
    List<MelodyArtist> queryPage(MelodyArtist artist, int offset, Integer pageSize);
}
