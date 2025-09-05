package com.gabriel.drawfx.model;

import com.gabriel.drawfx.service.RendererService;
import lombok.Data;

import java.awt.*;
@Data
public abstract class Shape {
    private Point location;
    private Point end;
    private Color color;
    private RendererService rendererService;

    public Shape(Point start, Point end){
        this.setLocation(start);
        this.setEnd(end);
        this.color = Color.BLACK;
    }

    /* previous:
       this.setLocation(location);
       this.setEnd(end); */
}
