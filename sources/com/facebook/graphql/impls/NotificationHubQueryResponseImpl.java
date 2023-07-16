package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class NotificationHubQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbBusinessPaymentsNotificationHub extends TreeJNI implements C81204nM {

        public final class Notifications extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{NotificationFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Notifications.class, "notifications(fe_id:$fe_id,filter_notifications_for_subtypes:$subtypes_to_filter,session_id:$session_id)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbBusinessPaymentsNotificationHub.class, "xfb_business_payments_notification_hub(interface_type:$interface_type,view_name:$view_name)");
    }
}
