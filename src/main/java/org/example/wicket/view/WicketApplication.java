package org.example.wicket.view;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.example.wicket.view.pages.Home;

public class WicketApplication extends WebApplication {

    @Override
    public Class<Home> getHomePage() {

        return Home.class; // return default page
    }

    @Override
    protected void init() {

        super.init();
        addComponentInstantiationListener(new SpringComponentInjector(this));

    }

}