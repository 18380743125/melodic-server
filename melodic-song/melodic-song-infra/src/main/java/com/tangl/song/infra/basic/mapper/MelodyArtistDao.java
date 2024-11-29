package com.tangl.song.infra.basic.mapper;

import com.tangl.song.infra.basic.entity.MelodyArtist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 歌手信息表(MelodyArtist)表数据库访问层
 */
public interface MelodyArtistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MelodyArtist queryById(Integer id);

    /**
     * 统计总行数
     *
     * @param melodyArtist 查询条件
     * @return 总行数
     */
    int countByCondition(MelodyArtist melodyArtist);

    /**
     * 分页条件查询歌手信息
     */
    List<MelodyArtist> queryPage(MelodyArtist artist, @Param("offset") int offset, @Param("pageSize") Integer pageSize);

    /**
     * 新增数据
     *
     * @param melodyArtist 实例对象
     * @return 影响行数
     */
    int insert(MelodyArtist melodyArtist);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MelodyArtist> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MelodyArtist> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MelodyArtist> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MelodyArtist> entities);

    /**
     * 修改数据
     *
     * @param melodyArtist 实例对象
     * @return 影响行数
     */
    int update(MelodyArtist melodyArtist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

