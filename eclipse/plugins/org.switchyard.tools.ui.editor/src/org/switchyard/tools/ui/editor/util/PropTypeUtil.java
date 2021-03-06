/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.util;

/**
 * @author bfitzpat
 * 
 */
public final class PropTypeUtil {

    private PropTypeUtil() {
        // private constructor
    }
    
    /**
     * @param value Integer, String, or Long
     * @return String value
     */
    public static String getPropValueString(Object value) {
        if (value != null) {
            if (value instanceof String) {
                return (String)value;
            } else if (value instanceof Integer) {
                return ((Integer)value).toString();
            } else if (value instanceof Long) {
                return ((Long)value).toString();
            }
        }
        return null;
    }
        
}
