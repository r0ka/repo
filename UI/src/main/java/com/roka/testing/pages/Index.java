package com.roka.testing.pages;

import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.BeginRender;

/**
 * Created by roka on 19.02.14.
 */
public class Index {

    @BeginRender
    void renderMessage(MarkupWriter writer)
    {
        writer.write("Bonjour from HelloWorld component.");
    }
}
