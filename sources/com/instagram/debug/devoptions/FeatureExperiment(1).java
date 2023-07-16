package com.instagram.debug.devoptions;

public interface FeatureExperiment {
    String getHumanName();

    Object getHumanValue();

    String getName();

    void setExperiment(Object obj);

    void setHumanName(String str);

    void setName(String str);
}
