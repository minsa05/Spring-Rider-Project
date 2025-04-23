package com.example.springrider.menu.entity;

import com.example.springrider.common.entity.BaseEntity;
import com.example.springrider.store.entity.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "menu")
@AllArgsConstructor
@NoArgsConstructor
public class Menu extends BaseEntity {

    private String name;
    private Integer price;
    private String contents;
    private String category;
    private Boolean isWithdraw;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

}
