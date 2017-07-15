package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Ilchenko on 15.07.2017.
 */
public interface ISavable {
    List<String> write();

    void read(List<String> saveValues);
}
