
package org.gitlab4j.api.models;

import org.gitlab4j.api.utils.JacksonJson;

public class SamlGroupLink {

    private String name;

    private AccessLevel accessLevel;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public AccessLevel getAccessLevel() {
       return accessLevel;
    }

    public void setAccessLevel(AccessLevel aAccessLevel) {
        accessLevel = aAccessLevel;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}
