package com.ajinkya.axxesscodingapp.interfaces;

import java.util.List;

public interface CustomSearchItemListener {

    int pageNo();

    void itemClicked(int adapterPosition);

    void errorMessage(String message);

    String getSearchText();
}
