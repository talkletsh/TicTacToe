package com.example.myapplication;

public class Presenter {


    private Logic model;
    private IView view;


    public Presenter (IView view)
    {
        this.model = new Logic();

    }


}
