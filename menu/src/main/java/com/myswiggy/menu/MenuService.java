package com.myswiggy.menu;

import java.util.List;

public interface MenuService {
    List<MenuPojo> getMenuByRestaurant(String id);

    MenuPojo addMenuToRestaurant(MenuPojo menuPojo);
}
