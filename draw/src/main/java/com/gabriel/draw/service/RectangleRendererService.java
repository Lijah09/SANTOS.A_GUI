package com.gabriel.draw.service;

import com.gabriel.draw.model.Rectangle;
import com.gabriel.drawfx.service.RendererService;
import com.gabriel.drawfx.model.Shape;

import java.awt.*;

/*
    added this class for rendering the Rectangle
    follows structure of LineRendererService.java class
 */


public class RectangleRendererService implements RendererService {


    @Override
    public void render(Graphics g, Shape shape, boolean xor) {
        Rectangle rectangle = (Rectangle) shape;
        if (xor) {
            g.setXORMode(((Graphics2D) g).getBackground());
            g.setColor(shape.getColor());
        } else {
            g.setPaintMode();
            g.setColor(shape.getColor());
        }

        // diagonal coordinates & dimentions
        int x = Math.min(rectangle.getLocation().x, rectangle.getEnd().x);
        int y = Math.min(rectangle.getLocation().y, rectangle.getEnd().y);
        int w = Math.abs(rectangle.getEnd().x - rectangle.getLocation().x);
        int h = Math.abs(rectangle.getEnd().y - rectangle.getLocation().y);

        // implementation of diagonal coordinates & dimentions
        g.drawRect(x, y, w, h);
    }
}