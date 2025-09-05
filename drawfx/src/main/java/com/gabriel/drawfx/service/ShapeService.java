package com.gabriel.drawfx.service;

import com.gabriel.drawfx.model.Shape;

import java.util.List;


public interface ShapeService {

    // frame encapsulates everything in the app
    void create(Shape shape);
    void update(Shape shape);
    void delete(Shape shape);
    List<Shape> getAll();
    Shape get(Shape shape);
}

