package com.instagram.debug.devoptions;

public interface Variant {
    String getHumanName();

    String getName();

    boolean isActive();

    void setHumanName(String str);

    void setName(String str);

    void setOverrides();
}
