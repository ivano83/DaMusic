package it.fivano.damusic.backend.model;

import java.io.Serializable;

public class ReleaseRating extends ReleaseRatingKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_rating.star
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    private Integer star;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_rating.number_of_change
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    private Integer numberOfChange;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_rating.star
     *
     * @return the value of release_rating.star
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public Integer getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_rating.star
     *
     * @param star the value for release_rating.star
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_rating.number_of_change
     *
     * @return the value of release_rating.number_of_change
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public Integer getNumberOfChange() {
        return numberOfChange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_rating.number_of_change
     *
     * @param numberOfChange the value for release_rating.number_of_change
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    public void setNumberOfChange(Integer numberOfChange) {
        this.numberOfChange = numberOfChange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
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
        ReleaseRating other = (ReleaseRating) that;
        return (this.getIdUser() == null ? other.getIdUser() == null : this.getIdUser().equals(other.getIdUser()))
            && (this.getIdRelease() == null ? other.getIdRelease() == null : this.getIdRelease().equals(other.getIdRelease()))
            && (this.getStar() == null ? other.getStar() == null : this.getStar().equals(other.getStar()))
            && (this.getNumberOfChange() == null ? other.getNumberOfChange() == null : this.getNumberOfChange().equals(other.getNumberOfChange()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release_rating
     *
     * @mbggenerated Sun Sep 01 01:31:17 CEST 2013
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdUser() == null) ? 0 : getIdUser().hashCode());
        result = prime * result + ((getIdRelease() == null) ? 0 : getIdRelease().hashCode());
        result = prime * result + ((getStar() == null) ? 0 : getStar().hashCode());
        result = prime * result + ((getNumberOfChange() == null) ? 0 : getNumberOfChange().hashCode());
        return result;
    }
}