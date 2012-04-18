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
package org.cloudsmith.hammer.api.json;

import java.io.BufferedReader;
import java.lang.reflect.Type;

public interface JSONAdapter {
	<V> V fromJson(BufferedReader reader, Type type) throws JSONException;

	String toJson(Object object) throws JSONException;
}