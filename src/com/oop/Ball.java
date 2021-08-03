package com.oop;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Ball {
   float starting_x_cord;
   float speed_unit;
   float diameter;
   float starting_y_cord;
}
