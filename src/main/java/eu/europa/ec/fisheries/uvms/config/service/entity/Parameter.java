/*
﻿Developed with the contribution of the European Commission - Directorate General for Maritime Affairs and Fisheries
© European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can
redistribute it and/or modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or any later version. The IFDM Suite is distributed in
the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. You should have received a
copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package eu.europa.ec.fisheries.uvms.config.service.entity;

import javax.persistence.*;
import java.io.Serializable;

import static eu.europa.ec.fisheries.uvms.config.service.entity.Parameter.*;

/**
 * The persistent class for the parameter database table.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = FIND_BY_ID, query = "SELECT p FROM Parameter p WHERE p.id = :id"),
        @NamedQuery(name = LIST_ALL_BY_IDS, query = "SELECT p FROM Parameter p WHERE p.id IN :ids"),
        @NamedQuery(name = LIST_ALL, query = "SELECT p FROM Parameter p"),
        @NamedQuery(name = DELETE_BY_ID, query = "DELETE FROM Parameter p WHERE p.id = :id"),
        @NamedQuery(name = DELETE_ALL, query = "DELETE FROM Parameter"),
        @NamedQuery(name = DELETE_BY_IDS_LIST, query = "DELETE FROM Parameter p WHERE p.id IN :ids"),
        @NamedQuery(name = COUNT, query = "SELECT count(*) FROM Parameter")

})
public class Parameter implements Serializable {

    public static final String FIND_BY_ID = "Parameter.findByName";
    public static final String LIST_ALL = "Parameter.listAll";
    public static final String LIST_ALL_BY_IDS = "Parameter.listAllByIds";
    public static final String DELETE_ALL = "Parameter.deleteAll";
    public static final String DELETE_BY_ID = "Parameter.deleteAllById";
    public static final String DELETE_BY_IDS_LIST = "Parameter.deleteAllByIdList";
    public static final String COUNT = "Parameter.countAll";


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "param_id")
    private String id;

    @Column(name = "param_value")
    private String value;

    @Column(name = "param_description")
    private String description;

    public String getParamId() {
        return this.id;
    }

    public void setParamId(String paramId) {
        this.id = paramId;
    }

    public String getParamValue() {
        return this.value;
    }

    public void setParamValue(String value) {
        this.value = value;
    }

    public String getParamDescription() {
        return this.description;
    }

    public void setParamDescription(String description) {
        this.description = description;
    }

}