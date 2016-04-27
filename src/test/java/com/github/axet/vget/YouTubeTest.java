package com.github.axet.vget;

import org.junit.Test;

public class YouTubeTest {

	@Test
	public void testYoutubeDownload() {
		AppManagedDownload.main(new String[] { "https://www.youtube.com/watch?v=E8rpY2FwKkY", "./" });
	}
}
