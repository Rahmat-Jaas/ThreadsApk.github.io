package X;

import com.facebook.graphql.impls.NotificationHubQueryResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7ez  reason: invalid class name and case insensitive filesystem */
public final class C126337ez implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "NotificationHubQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), NotificationHubQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_business_payments_notification_hub");
    }
}
