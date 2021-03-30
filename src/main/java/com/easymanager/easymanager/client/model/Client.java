package com.easymanager.easymanager.client.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@Generated
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CLIENT")
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String numDocument;

    private String numPhone;

    private String email;

    private String address;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}