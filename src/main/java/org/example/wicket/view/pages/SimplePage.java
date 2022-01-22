package org.example.wicket.view.pages;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.example.wicket.service.HelloService;

public class SimplePage extends WebPage {

    @SpringBean
    private HelloService helloService;

    public SimplePage(final PageParameters parameters) {

        add(new Label("msg", helloService.getHelloWorldMsg()));

    }

}