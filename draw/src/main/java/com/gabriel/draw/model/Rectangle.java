package com.gabriel.draw.model;


import com.gabriel.draw.service.LineRendererService;
import lombok.Data;
import com.gabriel.drawfx.model.Shape;
import java.awt.*;

/*
    added this class for the Rectangle shape
    follows structure of Line.java class
 */

@Data
public class Rectangle extends Shape {

    public Rectangle(Point start, Point end) {
        super(start);
        this.setEnd(end);
        this.setColor(Color.BLACK); // pick a default color
        this.setRendererService(new RectangleRendererService());
    }
}
