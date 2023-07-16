package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class WellbeingQuietTimeSubscriptionResponseImpl extends TreeJNI implements C81204nM {

    public final class IgSupervisedUserQuietTimeSettingsSubscribe extends TreeJNI implements C81204nM {

        public final class QuietTimeIntervalsForEnforcement extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"days", "end_time", "label", TraceFieldType.StartTime};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(QuietTimeIntervalsForEnforcement.class, "quiet_time_intervals_for_enforcement");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgSupervisedUserQuietTimeSettingsSubscribe.class, "ig_supervised_user_quiet_time_settings_subscribe(data:$input)");
    }
}
