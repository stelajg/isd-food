package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Menu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenuDataAccess implements MenuRepository {

    List<Menu> menuList = new ArrayList<>();

    @Override
    public int addMenu(Menu menu) {
        menuList.add(menu);
        return 1;
    }

    @Override
    public List<Menu> viewMenus() {
        return menuList;
    }
}
