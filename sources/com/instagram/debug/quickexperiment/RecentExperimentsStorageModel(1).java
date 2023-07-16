package com.instagram.debug.quickexperiment;

import X.AnonymousClass0wJ;
import X.C07950cU;
import X.C18190wL;
import X.C18200wM;
import java.util.Iterator;
import java.util.List;

public class RecentExperimentsStorageModel {
    public List recentExperimentParameterNames;
    public List recentExperimentParameters;
    public List recentUniverseNames;

    public List getRecentExperimentParameters() {
        return C18200wM.A0s(this.recentExperimentParameters);
    }

    public RecentExperimentsStorageModel(List list) {
        this.recentExperimentParameters = AnonymousClass0wJ.A0v();
        this.recentExperimentParameterNames = AnonymousClass0wJ.A0v();
        this.recentUniverseNames = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C07950cU r2 = (C07950cU) it.next();
            this.recentExperimentParameterNames.add(r2.mName);
            this.recentUniverseNames.add(r2.mUniverseName);
        }
    }

    public RecentExperimentsStorageModel postprocess() {
        this.recentExperimentParameters = AnonymousClass0wJ.A0v();
        for (int i = 0; i < this.recentExperimentParameterNames.size(); i++) {
            String A0p = C18190wL.A0p(this.recentExperimentParameterNames, i);
            String A0p2 = C18190wL.A0p(this.recentUniverseNames, i);
            Iterator it = QuickExperimentHelper.getAllExperiments().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C07950cU r1 = (C07950cU) it.next();
                if (A0p.equals(r1.mName) && A0p2.equals(r1.mUniverseName)) {
                    this.recentExperimentParameters.add(r1);
                    break;
                }
            }
        }
        return this;
    }

    public RecentExperimentsStorageModel() {
        this.recentExperimentParameters = AnonymousClass0wJ.A0v();
    }
}
