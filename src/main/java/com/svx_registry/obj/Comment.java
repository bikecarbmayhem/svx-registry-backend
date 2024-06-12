package com.svx_registry.obj;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private int id;

    private int frame;

    private String authorName;

    private LocalDate timestamp;

    private String text;

}
