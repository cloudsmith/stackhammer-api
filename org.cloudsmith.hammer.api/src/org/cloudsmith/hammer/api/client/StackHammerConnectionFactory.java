/**
 * Copyright (c) 2012 Cloudsmith Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Thomas Hallgren (Cloudsmith Inc.) - initial API and implementation
 */

package org.cloudsmith.hammer.api.client;

import java.io.IOException;
import java.net.URL;

/**
 * Factory capable of creating connections
 */
public interface StackHammerConnectionFactory {
	StackHammerConnection createConnection(URL url) throws IOException;
}
