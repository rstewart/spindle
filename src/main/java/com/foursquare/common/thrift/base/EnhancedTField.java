//  Copyright 2012 Foursquare Labs Inc. All Rights Reserved

package com.foursquare.common.thrift.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.protocol.TField;

/**
 * Complicated thrift protocols may require extra information. E.g., the BSONProtocol needs to know that it should
 * map a binary thrift field to an ObjectId, instead of to a regular BSON binary field.
 * We provide this information in this TField subclass.
 */
public class EnhancedTField extends TField {
  public final Map<String, String> enhancedTypes;
  public final Map<String, String> annotations;

  public EnhancedTField() {
    super();
    this.enhancedTypes = new HashMap<String, String>();
    this.annotations = new HashMap<String, String>();
  }

  public EnhancedTField(String n, byte t, short i, Map<String, String> enhancedTypes, Map<String, String> annotations) {
    super(n, t, i);
    this.enhancedTypes = enhancedTypes;
    this.annotations = annotations;
  }
}
