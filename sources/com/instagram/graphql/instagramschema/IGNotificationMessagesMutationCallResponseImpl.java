package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGNotificationMessagesMutationCallResponseImpl extends TreeJNI implements C81204nM {

    public final class IgNotificationsMessageUserMutation extends TreeJNI implements C81204nM {

        public final class AdminText extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"token_ent_id", "user_action_type"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AdminText.class, "admin_text");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgNotificationsMessageUserMutation.class, "ig_notifications_message_user_mutation(input:$input)");
    }
}
