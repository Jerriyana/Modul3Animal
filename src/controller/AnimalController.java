package controller;
import model.*;
import view.*;

public class AnimalController {
    private Animal model;
    private AnimalView view;

    public AnimalController(Animal model, AnimalView view) {
        this.model = model;
        this.view = view;
    }

    public void showSound() {
        view.displaySound(model.printSound());
    }

    public void showMove() {
        view.displayMove(model.move());
    }

    public void showMoveWithDistance(int distance) {
        view.displayMove(model.move(distance));
    }

    public void showAliveStatus() {
        view.displayAlive(model.isAlive());
    }

    public void showData() {
        view.displayData(model.printData());
    }
}