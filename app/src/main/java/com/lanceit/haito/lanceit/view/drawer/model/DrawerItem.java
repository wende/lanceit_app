package com.lanceit.haito.lanceit.view.drawer.model;

public class DrawerItem {

    private String title;
    private int icon;
    private String count = "0";
    // boolean to set visiblity of the counter
    private boolean isCounterVisible = false;

    public DrawerItem(String title, int icon){
        this.title = title;
        this.icon = icon;
    }

    public DrawerItem(String title, int icon, boolean isCounterVisible,String count) {
        this.title = title;
        this.icon = icon;
        this.count = count;
        this.isCounterVisible = isCounterVisible;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public boolean isCounterVisible() {
        return isCounterVisible;
    }

    public void setIsCounterVisible(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }

}
