package com.github.axet.vget;

import java.io.File;
import java.net.URL;

import org.junit.Test;

public class DirectDownload {

    @Test
	public void testDownload() {
        try {

            VGet v = new VGet(new URL("http://www.youtube.com/watch?v=Nj6PFaDmp6c"), new File("./"));

            v.download();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
