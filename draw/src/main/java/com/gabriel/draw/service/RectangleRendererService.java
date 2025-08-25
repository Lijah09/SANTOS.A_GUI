package com.gabriel.draw.service;

import com.gabriel.draw.model.Line;
import com.gabriel.drawfx.service.RendererService;
import com.gabriel.drawfx.model.Shape;

import java.awt.*;

/*
    added this class for rendering the Rectangle
    follows structure of LineRendererService.java class
 */


public class EllipseRendererService implements RendererService {

    @Override
    public void render(Graphics g, Shape shape, boolean xor) {
        Rectangle rect = (Rectangle) shape;
        g.setXORMode(shape.getColor());
        g.drawRect(
                rect.getTopLeftX(),
                rect.getTopLeftY(),
                rect.getWidth(),
                rect.getHeight()
        );
    }
}