package com.gabriel.draw.model;


import com.gabriel.draw.service.LineRendererService;
import lombok.Data;
import com.gabriel.drawfx.model.Shape;
import java.awt.*;

/* added this class for the Ellipse shape
    follows structure of Line.java class
 */

@Data
public class Ellipse extends Shape {

    private int width;
    private int height;

    public Ellipse(Point start, int width, int height){
        super(start);
        this.width = width;
        this.height = height;
        this.setColor(Color.BLACK);
        this.setRendererService(new EllipseRendererService());
    }
}
