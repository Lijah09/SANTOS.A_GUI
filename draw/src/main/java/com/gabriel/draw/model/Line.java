package com.gabriel.draw.model;


import com.gabriel.draw.service.LineRendererService;
import lombok.Data;
import com.gabriel.drawfx.model.Shape;
import java.awt.*;


@Data
public class Line extends Shape {

    public Line(Point start, Point end){
        super(start, end);
        this.setColor(Color.BLACK); // color should not be set since it's the default
        this.setRendererService(new LineRendererService());
    }
}
