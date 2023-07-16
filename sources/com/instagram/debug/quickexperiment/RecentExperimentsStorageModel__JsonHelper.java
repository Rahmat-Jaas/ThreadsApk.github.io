package com.instagram.debug.quickexperiment;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18230wP;
import X.C18987Aon;
import X.C25563Dnz;
import X.C27627Eqe;
import X.C40318LcR;
import X.MMo;
import X.MMp;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

public final class RecentExperimentsStorageModel__JsonHelper {
    public static RecentExperimentsStorageModel parseFromJson(MMo mMo) {
        return (RecentExperimentsStorageModel) C25563Dnz.A02(mMo, new C27627Eqe() {
            public RecentExperimentsStorageModel invoke(MMo mMo) {
                return RecentExperimentsStorageModel__JsonHelper.unsafeParseFromJson(mMo);
            }
        });
    }

    public static boolean processSingleField(RecentExperimentsStorageModel recentExperimentsStorageModel, String str, MMo mMo) {
        ArrayList arrayList = null;
        if ("parameterNames".equals(str)) {
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = AnonymousClass0wJ.A0v();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    AnonymousClass0wJ.A1F(mMo, arrayList);
                }
            }
            recentExperimentsStorageModel.recentExperimentParameterNames = arrayList;
            return true;
        } else if (!"universeNames".equals(str)) {
            return false;
        } else {
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = AnonymousClass0wJ.A0v();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    AnonymousClass0wJ.A1F(mMo, arrayList);
                }
            }
            recentExperimentsStorageModel.recentUniverseNames = arrayList;
            return true;
        }
    }

    public static RecentExperimentsStorageModel unsafeParseFromJson(MMo mMo) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel();
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            processSingleField(recentExperimentsStorageModel, AnonymousClass0wJ.A0q(mMo), mMo);
            mMo.A0x();
        }
        recentExperimentsStorageModel.postprocess();
        return recentExperimentsStorageModel;
    }

    public static String serializeToJson(RecentExperimentsStorageModel recentExperimentsStorageModel) {
        StringWriter A0d = C18230wP.A0d();
        MMp A04 = C18987Aon.A00.A04(A0d);
        serializeToJson(A04, recentExperimentsStorageModel, true);
        A04.close();
        return A0d.toString();
    }

    public static RecentExperimentsStorageModel parseFromJson(String str) {
        return parseFromJson(C18180wK.A0L(str));
    }

    public static void serializeToJson(MMp mMp, RecentExperimentsStorageModel recentExperimentsStorageModel, boolean z) {
        if (z) {
            mMp.A0J();
        }
        if (recentExperimentsStorageModel.recentExperimentParameterNames != null) {
            mMp.A0U("parameterNames");
            mMp.A0I();
            Iterator it = recentExperimentsStorageModel.recentExperimentParameterNames.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                if (A0k != null) {
                    mMp.A0Y(A0k);
                }
            }
            mMp.A0F();
        }
        if (recentExperimentsStorageModel.recentUniverseNames != null) {
            mMp.A0U("universeNames");
            mMp.A0I();
            Iterator it2 = recentExperimentsStorageModel.recentUniverseNames.iterator();
            while (it2.hasNext()) {
                String A0k2 = C18180wK.A0k(it2);
                if (A0k2 != null) {
                    mMp.A0Y(A0k2);
                }
            }
            mMp.A0F();
        }
        if (z) {
            mMp.A0G();
        }
    }
}
