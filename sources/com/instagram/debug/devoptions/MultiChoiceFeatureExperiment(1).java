package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MultiChoiceFeatureExperiment implements FeatureExperiment {
    public static final Companion Companion = new Companion();
    public String humanName = "";
    public String name = "";
    public final List rootExperiments;

    public MultiChoiceFeatureExperiment(List list) {
        C04220Ms.A0B(list, 1);
        this.rootExperiments = list;
    }

    public void setExperiment(String str) {
        Object obj;
        C04220Ms.A0B(str, 0);
        Iterator it = this.rootExperiments.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C04220Ms.A0I(((FeatureExperiment) obj).getName(), str)) {
                break;
            }
        }
        FeatureExperiment featureExperiment = (FeatureExperiment) obj;
        if (featureExperiment != null) {
            featureExperiment.setExperiment(C18180wK.A0Y());
        }
    }

    public void setHumanName(String str) {
        C04220Ms.A0B(str, 0);
        this.humanName = str;
    }

    public void setName(String str) {
        C04220Ms.A0B(str, 0);
        this.name = str;
    }

    public final class Companion {
        public final MultiChoiceFeatureExperiment create(String str, String str2, List list) {
            AnonymousClass0wJ.A1N(str, str2);
            C04220Ms.A0B(list, 2);
            MultiChoiceFeatureExperiment multiChoiceFeatureExperiment = new MultiChoiceFeatureExperiment(list);
            multiChoiceFeatureExperiment.setHumanName(str);
            multiChoiceFeatureExperiment.setName(str2);
            return multiChoiceFeatureExperiment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public String getHumanName() {
        return this.humanName;
    }

    public String getHumanValue() {
        Object obj;
        String humanName2;
        Iterator it = this.rootExperiments.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass0wJ.A1X(((FeatureExperiment) obj).getHumanValue())) {
                break;
            }
        }
        FeatureExperiment featureExperiment = (FeatureExperiment) obj;
        if (featureExperiment == null || (humanName2 = featureExperiment.getHumanName()) == null) {
            return "unassigned";
        }
        return humanName2;
    }

    public String getName() {
        return this.name;
    }

    public final List getPossibleValues() {
        return this.rootExperiments;
    }
}
