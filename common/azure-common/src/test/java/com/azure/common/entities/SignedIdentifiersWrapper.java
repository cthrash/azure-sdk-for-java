package com.azure.common.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "SignedIdentifiers")
public class SignedIdentifiersWrapper {
    @JacksonXmlProperty(localName = "SignedIdentifier")
    private final List<SignedIdentifierInner> signedIdentifiers;
    @JsonCreator
    public SignedIdentifiersWrapper(@JsonProperty("signedIdentifiers") List<SignedIdentifierInner> signedIdentifiers) {
        this.signedIdentifiers = signedIdentifiers;
    }
    /**
     * Get the SignedIdentifiers value.
     *
     * @return the SignedIdentifiers value
     */
    public List<SignedIdentifierInner> signedIdentifiers() {
        return signedIdentifiers;
    }
}