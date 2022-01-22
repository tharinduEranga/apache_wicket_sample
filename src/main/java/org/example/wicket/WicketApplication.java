package org.example.wicket;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

public class WicketApplication extends WebApplication {

    @Override
    public Class<HelloWorld> getHomePage() {

        return HelloWorld.class; // return default page
    }

    @Override
    protected void init() {

        super.init();
        addComponentInstantiationListener(new SpringComponentInjector(this));

    }

}