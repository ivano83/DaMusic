package it.fivano.damusic.backend.model;

import java.io.Serializable;
import java.util.Date;

public class ReleaseExtraction implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symusic..release_extraction.id_release
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private Long idRelease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symusic..release_extraction.youtube
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private Boolean youtube;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symusic..release_extraction.youtube_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private Date youtubeDateExtraction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symusic..release_extraction.scenelog
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private Boolean scenelog;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symusic..release_extraction.scenelog_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private Date scenelogDateExtraction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symusic..release_extraction.beatport
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private Boolean beatport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symusic..release_extraction.beatport_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private Date beatportDateExtraction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table symusic..release_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symusic..release_extraction.id_release
     *
     * @return the value of symusic..release_extraction.id_release
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public Long getIdRelease() {
        return idRelease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symusic..release_extraction.id_release
     *
     * @param idRelease the value for symusic..release_extraction.id_release
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public void setIdRelease(Long idRelease) {
        this.idRelease = idRelease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symusic..release_extraction.youtube
     *
     * @return the value of symusic..release_extraction.youtube
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public Boolean getYoutube() {
        return youtube;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symusic..release_extraction.youtube
     *
     * @param youtube the value for symusic..release_extraction.youtube
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public void setYoutube(Boolean youtube) {
        this.youtube = youtube;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symusic..release_extraction.youtube_date_extraction
     *
     * @return the value of symusic..release_extraction.youtube_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public Date getYoutubeDateExtraction() {
        return youtubeDateExtraction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symusic..release_extraction.youtube_date_extraction
     *
     * @param youtubeDateExtraction the value for symusic..release_extraction.youtube_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public void setYoutubeDateExtraction(Date youtubeDateExtraction) {
        this.youtubeDateExtraction = youtubeDateExtraction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symusic..release_extraction.scenelog
     *
     * @return the value of symusic..release_extraction.scenelog
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public Boolean getScenelog() {
        return scenelog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symusic..release_extraction.scenelog
     *
     * @param scenelog the value for symusic..release_extraction.scenelog
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public void setScenelog(Boolean scenelog) {
        this.scenelog = scenelog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symusic..release_extraction.scenelog_date_extraction
     *
     * @return the value of symusic..release_extraction.scenelog_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public Date getScenelogDateExtraction() {
        return scenelogDateExtraction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symusic..release_extraction.scenelog_date_extraction
     *
     * @param scenelogDateExtraction the value for symusic..release_extraction.scenelog_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public void setScenelogDateExtraction(Date scenelogDateExtraction) {
        this.scenelogDateExtraction = scenelogDateExtraction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symusic..release_extraction.beatport
     *
     * @return the value of symusic..release_extraction.beatport
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public Boolean getBeatport() {
        return beatport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symusic..release_extraction.beatport
     *
     * @param beatport the value for symusic..release_extraction.beatport
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public void setBeatport(Boolean beatport) {
        this.beatport = beatport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symusic..release_extraction.beatport_date_extraction
     *
     * @return the value of symusic..release_extraction.beatport_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public Date getBeatportDateExtraction() {
        return beatportDateExtraction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symusic..release_extraction.beatport_date_extraction
     *
     * @param beatportDateExtraction the value for symusic..release_extraction.beatport_date_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    public void setBeatportDateExtraction(Date beatportDateExtraction) {
        this.beatportDateExtraction = beatportDateExtraction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symusic..release_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ReleaseExtraction other = (ReleaseExtraction) that;
        return (this.getIdRelease() == null ? other.getIdRelease() == null : this.getIdRelease().equals(other.getIdRelease()))
            && (this.getYoutube() == null ? other.getYoutube() == null : this.getYoutube().equals(other.getYoutube()))
            && (this.getYoutubeDateExtraction() == null ? other.getYoutubeDateExtraction() == null : this.getYoutubeDateExtraction().equals(other.getYoutubeDateExtraction()))
            && (this.getScenelog() == null ? other.getScenelog() == null : this.getScenelog().equals(other.getScenelog()))
            && (this.getScenelogDateExtraction() == null ? other.getScenelogDateExtraction() == null : this.getScenelogDateExtraction().equals(other.getScenelogDateExtraction()))
            && (this.getBeatport() == null ? other.getBeatport() == null : this.getBeatport().equals(other.getBeatport()))
            && (this.getBeatportDateExtraction() == null ? other.getBeatportDateExtraction() == null : this.getBeatportDateExtraction().equals(other.getBeatportDateExtraction()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table symusic..release_extraction
     *
     * @mbggenerated Wed Oct 09 21:16:21 CEST 2013
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdRelease() == null) ? 0 : getIdRelease().hashCode());
        result = prime * result + ((getYoutube() == null) ? 0 : getYoutube().hashCode());
        result = prime * result + ((getYoutubeDateExtraction() == null) ? 0 : getYoutubeDateExtraction().hashCode());
        result = prime * result + ((getScenelog() == null) ? 0 : getScenelog().hashCode());
        result = prime * result + ((getScenelogDateExtraction() == null) ? 0 : getScenelogDateExtraction().hashCode());
        result = prime * result + ((getBeatport() == null) ? 0 : getBeatport().hashCode());
        result = prime * result + ((getBeatportDateExtraction() == null) ? 0 : getBeatportDateExtraction().hashCode());
        return result;
    }
}