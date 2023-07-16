package com.instagram.fanclub.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchFanClubSubscriptionButtonInfoResponseImpl extends TreeJNI implements C81204nM {

    public final class Me extends TreeJNI implements C81204nM {

        public final class FanClubSubscriptionButtonInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"button_type", "can_viewer_see_button"};
            }

            public final class ButtonContent extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ButtonContent.class, "button_content");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FanClubSubscriptionButtonInfo.class, "fan_club_subscription_button_info(creator_id:$user_id)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Me.class, "me");
    }
}
