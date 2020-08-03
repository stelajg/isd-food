package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Menu;
import com.isdfood.isdproject.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.DayOfWeek;
import java.util.List;

public interface MenuRepository {
    int addMenu(Menu menu);

    List<Menu> viewMenus();

    default int addMenu(Integer price, Provider provider, Boolean isActive, String urlImage, DayOfWeek dayOfWeek) {
        return addMenu(new Menu(price, provider, isActive, urlImage, dayOfWeek));
    }
}
