package pl.dawidfiruzek.dagger2mvpexample.data;

/**
 * Created by Dawid Firuzek on 26.09.2016.
 */

import lombok.Getter;
import lombok.Setter;

public @Getter @Setter class Repository {
    private String name;
    private String fullName;
    private String description;
}
