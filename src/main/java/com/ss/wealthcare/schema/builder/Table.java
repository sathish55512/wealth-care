package com.ss.wealthcare.schema.builder;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "table")
public class Table
{
    @XmlAttribute(name = "name")
    String name;
    @XmlAttribute(name = "display-name")
    String displayName;
    @XmlElement(name = "column")
    List<Column> columns;

    public String getName()
    {
	return name;
    }

    public String getDisplayName()
    {
	return displayName;
    }

    public List<Column> getColumns()
    {
	return columns;
    }
}
