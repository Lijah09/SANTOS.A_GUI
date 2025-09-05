package com.gabriel.draw.service;

import com.gabriel.draw.model.Ellipse;
import com.gabriel.drawfx.service.RendererService;
import com.gabriel.drawfx.model.Shape;

import java.awt.*;

/*
    added this class for rendering the Ellipse
    follows structure of LineRendererService.java class
 */

public class EllipseRendererService implements RendererService {

    @Override
    public void render(Graphics g, Shape shape, boolean xor) {
        Ellipse ellipse = (Ellipse) shape;

        if (xor) {
            g.setXORMode(((Graphics2D) g).getBackground());
            g.setColor(shape.getColor());
        } else {
            g.setPaintMode();
            g.setColor(shape.getColor());
        }

        /*
        do the same for rectangle
         */

        // diagonal coordinates & dimentions
        int x = Math.min(ellipse.getLocation().x, ellipse.getEnd().x);
        int y = Math.min(ellipse.getLocation().y, ellipse.getEnd().y);
        int width = Math.abs(ellipse.getEnd().x - ellipse.getLocation().x);
        int height = Math.abs(ellipse.getEnd().y - ellipse.getLocation().y);

        // implementation of diagonal coordinates & dimentions
        g.drawOval(x, y, width, height);
    }
}