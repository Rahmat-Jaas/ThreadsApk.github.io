package com.instagram.fanclub.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SendSubscriptionNotificationResponseImpl extends TreeJNI implements C81204nM {

    public final class XigIgFanClubSendSubscriptionNotification extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigIgFanClubSendSubscriptionNotification.class, "xig_ig_fan_club_send_subscription_notification(params:$input)");
    }
}
