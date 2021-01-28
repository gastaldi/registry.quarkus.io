package io.quarkus.registry.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.databind.JsonNode;
import org.hibernate.annotations.NaturalId;

@Entity
public class PlatformExtension extends BaseEntity {

    @ManyToOne(optional = false)
    @NaturalId
    public PlatformRelease platformRelease;

    @ManyToOne(optional = false)
    @NaturalId
    public ExtensionRelease extensionRelease;

    @Column(columnDefinition = "json")
    public JsonNode metadata;
}
