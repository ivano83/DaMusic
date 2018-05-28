package it.fivano.damusic.backend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import it.fivano.damusic.backend.model.PopularKey;
import it.fivano.damusic.backend.model.PopularKeyExample;

public interface PopularKeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    long countByExample(PopularKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int deleteByExample(PopularKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int deleteByPrimaryKey(Long idPopularKey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int insert(PopularKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int insertSelective(PopularKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    List<PopularKey> selectByExample(PopularKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    PopularKey selectByPrimaryKey(Long idPopularKey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int updateByExampleSelective(@Param("record") PopularKey record, @Param("example") PopularKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int updateByExample(@Param("record") PopularKey record, @Param("example") PopularKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int updateByPrimaryKeySelective(PopularKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table popular_key
     *
     * @mbg.generated Sun Jan 28 11:41:27 CET 2018
     */
    int updateByPrimaryKey(PopularKey record);
}