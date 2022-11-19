/*
 * Maven Launch4j Plugin
 * Copyright (c) 2006 Paul Jungwirth
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package com.akathist.maven.plugins.launch4j;

import net.sf.launch4j.config.Msg;


/**
 * Details about messages you can pass.
 */
public class Messages {

    String startupErr;

    @Deprecated
    String bundledJreErr;

    String jreVersionErr;

    String launcherErr;

    String instanceAlreadyExistsMsg;

    String jreNotFoundErr;


    Msg toL4j() {
        Msg ret = new Msg();

        ret.setStartupErr(startupErr);
        ret.setJreVersionErr(jreVersionErr);
        ret.setLauncherErr(launcherErr);
        ret.setInstanceAlreadyExistsMsg(instanceAlreadyExistsMsg);

        /* since Launch4j 3.50 */
        ret.setJreNotFoundErr(jreNotFoundErr);
        return ret;
    }

}
