package it.geosolutions.opensdi2.persistence.derivated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "corner")
@Table(name = "corner")
@XmlRootElement(name = "corner")
public class Corner {

    @Id
    @Column(name = "corner")
    private Integer corner;
}