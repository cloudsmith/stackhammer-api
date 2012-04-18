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
package org.cloudsmith.hammer.api.model;

import java.util.List;

public class DiagnosticWithChildren extends Diagnostic {
	private static final long serialVersionUID = -4408267341796117187L;

	private List<Diagnostic> children;

	public List<Diagnostic> getChildren() {
		return children;
	}
}