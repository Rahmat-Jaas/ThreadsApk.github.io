package com.instagram.fanclub.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SetSubscriptionNotificationTimeResponseImpl extends TreeJNI implements C81204nM {

    public final class XigIgFanClubSetSubscriptionNotificationTime extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id", "notification_time"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigIgFanClubSetSubscriptionNotificationTime.class, "xig_ig_fan_club_set_subscription_notification_time(params:$input)");
    }
}
