package io.github.mixaniki.entity;


import io.github.mixaniki.entity.validation.groups.ValidationGroups;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Teams")
public class Team {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Null(groups = ValidationGroups.Create.class)
    @NotNull(groups = ValidationGroups.Update.class)
    @Column(name = "id")
    private Long id;
    @NotBlank
    @Column(name = "team_name", length = 30)
    private String teamName;
    @NotBlank
    @Column(name = "short_name", length = 30)
    private String shortName;
    @Column(name = "stadium_name")
    private String stadiumName;
    @Column(name = "logo_path", length = 1024, nullable = true)
    private String logo;
    @Column(name = "coach_name")
    private String coachName;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private City city;

}
