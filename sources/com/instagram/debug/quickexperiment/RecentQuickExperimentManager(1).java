package com.instagram.debug.quickexperiment;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.C07950cU;
import X.C09120et;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import java.io.IOException;
import java.util.List;

public class RecentQuickExperimentManager {
    public static final int NUM_RECENT_EXPERIMENTS = 5;
    public static final Class TAG = RecentQuickExperimentManager.class;

    public static void save(List list) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel(list);
        try {
            C09120et A02 = C09120et.A02();
            C18240wQ.A1D(A02.A1x, RecentExperimentsStorageModel__JsonHelper.serializeToJson(recentExperimentsStorageModel));
        } catch (IOException e) {
            AnonymousClass0LU.A03(TAG, "failed to save Recent Experiments json", e);
        }
    }

    public static List getRecentExperimentParameters() {
        String A0j = C18200wM.A0j(C09120et.A02().A1x);
        if (A0j == null) {
            return AnonymousClass0wJ.A0v();
        }
        try {
            return C18200wM.A0s(RecentExperimentsStorageModel__JsonHelper.parseFromJson(C18180wK.A0L(A0j)).recentExperimentParameters);
        } catch (IOException unused) {
            return AnonymousClass0wJ.A0v();
        }
    }

    public static void markRecentExperimentParameter(C07950cU r3) {
        List recentExperimentParameters = getRecentExperimentParameters();
        recentExperimentParameters.remove(r3);
        if (recentExperimentParameters.size() == 5) {
            recentExperimentParameters.remove(4);
        }
        recentExperimentParameters.add(0, r3);
        save(recentExperimentParameters);
    }
}
