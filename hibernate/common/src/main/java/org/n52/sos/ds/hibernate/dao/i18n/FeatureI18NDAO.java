/**
 * Copyright (C) 2012-2016 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.sos.ds.hibernate.dao.i18n;

import org.hibernate.Session;
import org.n52.sos.ds.hibernate.dao.FeatureOfInterestDAO;
import org.n52.sos.ds.hibernate.entities.FeatureOfInterest;
import org.n52.sos.ds.hibernate.entities.i18n.HibernateI18NFeatureOfInterestMetadata;
import org.n52.sos.i18n.metadata.I18NFeatureMetadata;


public class FeatureI18NDAO extends AbstractHibernateI18NDAO<FeatureOfInterest, I18NFeatureMetadata, HibernateI18NFeatureOfInterestMetadata> {

    @Override
    protected FeatureOfInterest getEntity(String id, Session session) {
        return new FeatureOfInterestDAO().getFeatureOfInterest(id, session);
    }

    @Override
    protected Class<HibernateI18NFeatureOfInterestMetadata> getHibernateEntityClass() {
        return HibernateI18NFeatureOfInterestMetadata.class;
    }

    @Override
    protected HibernateI18NFeatureOfInterestMetadata createHibernateObject() {
        return new HibernateI18NFeatureOfInterestMetadata();
    }

    @Override
    protected I18NFeatureMetadata createSosObject(String id) {
        return new I18NFeatureMetadata(id);
    }

    @Override
    public Class<I18NFeatureMetadata> getType() {
        return I18NFeatureMetadata.class;
    }

}
