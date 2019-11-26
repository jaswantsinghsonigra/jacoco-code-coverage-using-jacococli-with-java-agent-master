package org.broonix.controller;

import junit.framework.Assert;
import org.broonix.DemoStarterApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by: Brooks Lyrette
 * Date: 2016-01-21.
 */
public class DemoControllerTest extends DemoStarterApplicationTests {

    @Autowired
    private DemoController demoController;

    @Test
    public void testDemoController() throws Exception {
        ModelAndView mav = demoController.showHomepage();
        Assert.assertEquals("home", mav.getViewName());
    }
}
