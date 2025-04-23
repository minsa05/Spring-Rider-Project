package com.example.springrider.store.entity;

import com.example.springrider.common.entity.BaseEntity;
import com.example.springrider.user.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "store")
@AllArgsConstructor
@NoArgsConstructor
public class Store extends BaseEntity {

    private String name;
    private String address;
    private String category;
    private LocalDateTime openTime;
    private LocalDateTime closeTime;
    private Integer minOrderPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
