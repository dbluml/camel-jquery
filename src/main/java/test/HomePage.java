/*
 * Copyright 2008 Kindleit Technologies. All rights reserved. This file, all
 * proprietary knowledge and algorithms it details are the sole property of
 * Kindleit Technologies unless otherwise specified. The software this file
 * belong with is the confidential and proprietary information of Kindleit
 * Technologies. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with Kindleit.
 */


package test;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import wicket.contrib.gmap.GMap2;

/** Page is responsible of
 * @author rhansen@kindleit.net
 *
 */
public class HomePage extends WebPage {

  public HomePage() {
    add(new Label("hello", "Hello Wicket"));
    add(new GMap2("gmap","ABQIAAAAMOTASLIpQ8dhFWFg0eBQHRSj5mCQuQolMUxXcCrL8TLyG1TK7RRIlI3nDqvrnwX_-SPxR1Y75ejaUA"));
  }

}
