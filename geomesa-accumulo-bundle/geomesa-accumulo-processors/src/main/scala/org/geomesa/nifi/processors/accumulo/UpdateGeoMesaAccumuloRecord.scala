/***********************************************************************
 * Copyright (c) 2015-2022 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.geomesa.nifi.processors.accumulo

import org.apache.nifi.annotation.documentation.{DeprecationNotice, Tags}
import org.geomesa.nifi.datastore.processor.{RecordUpdateProcessor, UpdateGeoMesaRecord}

@Tags(Array("geomesa", "geo", "update", "records", "accumulo", "geotools"))
@DeprecationNotice(
  alternatives = Array(classOf[AccumuloDataStoreService], classOf[UpdateGeoMesaRecord]),
  reason = "Replaced with controller service for data store connections")
class UpdateGeoMesaAccumuloRecord extends AccumuloProcessor with RecordUpdateProcessor
