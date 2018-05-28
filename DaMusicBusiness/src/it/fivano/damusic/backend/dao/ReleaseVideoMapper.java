package it.fivano.damusic.backend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import it.fivano.damusic.backend.model.ReleaseVideo;
import it.fivano.damusic.backend.model.ReleaseVideoExample;

public interface ReleaseVideoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int countByExample(ReleaseVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int deleteByExample(ReleaseVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int deleteByPrimaryKey(Long idReleaseVideo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int insert(ReleaseVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int insertSelective(ReleaseVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	List<ReleaseVideo> selectByExample(ReleaseVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	ReleaseVideo selectByPrimaryKey(Long idReleaseVideo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int updateByExampleSelective(@Param("record") ReleaseVideo record,
			@Param("example") ReleaseVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int updateByExample(@Param("record") ReleaseVideo record,
			@Param("example") ReleaseVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int updateByPrimaryKeySelective(ReleaseVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table symusic..release_video
	 * @mbggenerated  Mon Sep 09 23:13:41 CEST 2013
	 */
	int updateByPrimaryKey(ReleaseVideo record);
}