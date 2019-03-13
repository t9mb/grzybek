package com.grzybek.grzybek.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localization {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 10000)
    public String comment;
    private double localizationNorth;
    private double localizationEast;
    private Boolean isPrivate;
    @Enumerated(EnumType.STRING)
    private Ecology ecology;
    private Integer adminMark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Grzyb grzyb;

}
