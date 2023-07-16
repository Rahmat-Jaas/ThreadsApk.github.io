package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.ondevicetech.graphql.IGOnDeviceAppHistoryPrivacyQueryResponseImpl;

/* renamed from: X.4Pg  reason: invalid class name and case insensitive filesystem */
public final class C72674Pg implements Runnable {
    public final /* synthetic */ C692247j A00;

    public C72674Pg(C692247j r1) {
        this.A00 = r1;
    }

    public final void run() {
        C692247j r3 = this.A00;
        long j = r3.A02.getLong("last_upload_time_in_sec", -1);
        if (j == -1 || C18200wM.A0A() - j > r3.A00) {
            AnonymousClass3WK.A01(r3.A05).A07(C18230wP.A0N(new PandoGraphQLRequest(C63233h2.A01(), "IGOnDeviceAppHistoryPrivacyQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), IGOnDeviceAppHistoryPrivacyQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_on_device_app_history_privacy")), C63873iU.A06(r3, 115));
        }
    }
}
