package it.geosolutions.opensdi2.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "alt_herbaceous_relative_cover")
@Table(name = "alt_herbaceous_relative_cover")
@XmlRootElement(name = "alt_herbaceous_relative_cover")
public class AltHerbaceousRelativeCover {

    @Id
    @Column(name = "view_id")
    private Integer viewId;

    @Column(name = "plot_no")
    private String plotNo;

    @Column(name = "species")
    private String species;

    @Column(name = "relative_cover")
    private Double relativeCover;

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Double getRelativeCover() {
        return relativeCover;
    }

    public void setRelativeCover(Double relativeCover) {
        this.relativeCover = relativeCover;
    }
}