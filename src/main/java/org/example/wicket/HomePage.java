package org.example.wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;

    private int counter = 0;

    public HomePage() {
        IModel<Integer> counterModel = new AbstractReadOnlyModel<Integer>() {
            private static final long serialVersionUID = 1L;

            @Override
            public Integer getObject() {
                return counter;
            }
        };

        Label label = new Label("counter", counterModel);
        add(label);

        Link<Void> link = new Link<Void>("increment") {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick() {
                counter++;
            }
        };
        add(link);
    }
}