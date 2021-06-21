package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    //@Column(name = "todoOrder", nullable = false) // "todoOrder" 부분에서 오류발생, h2database가 연결되어있지 않아 발생하는 오류로 추측
    @Column(nullable = false)
    private Long order;

    @Column(nullable = false)
    private Boolean completed;

}
