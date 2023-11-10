package org.youcode.progresstracker.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "objectives")
public class Objective {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String name,status;
    @Getter
    @Setter
    private Date createdDate,endDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Getter
    @Setter
    private User user;


    @Getter
    @Setter
    @OneToMany(mappedBy = "objective", cascade = CascadeType.ALL)
    private List<Task> tasks;

}
