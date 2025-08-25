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

    public Shape(Point location){
        this.location = location;
        this.end = new Point(location);
    }

    /* previous:
       this.setLocation(location);
       this.setEnd(end); */


    // added setters for Lombok issue (mainly for location and end)
    public void setLocation(Point location) {
        this.location = location;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setRendererService(RendererService rendererService) {
        this.rendererService = rendererService;
    }
}
