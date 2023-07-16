package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.pando.TreeJNI;
import com.instagram.ondevicetech.graphql.AndroidAppHistoryPlistQueryResponseImpl;
import com.instagram.ondevicetech.graphql.IGOnDeviceAppHistoryPrivacyQueryResponseImpl;

/* renamed from: X.4Ro  reason: invalid class name and case insensitive filesystem */
public final class C73224Ro implements Runnable {
    public final /* synthetic */ AnonymousClass5z0 A00;
    public final /* synthetic */ C692247j A01;

    public C73224Ro(AnonymousClass5z0 r1, C692247j r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        TreeJNI treeValue;
        TreeJNI treeValue2;
        C692247j r3 = this.A01;
        TreeJNI treeJNI = (TreeJNI) this.A00.A01;
        if (treeJNI != null && (treeValue = treeJNI.getTreeValue("ig_on_device_app_history_privacy", IGOnDeviceAppHistoryPrivacyQueryResponseImpl.IgOnDeviceAppHistoryPrivacy.class)) != null && (treeValue2 = treeValue.getTreeValue("data", IGOnDeviceAppHistoryPrivacyQueryResponseImpl.IgOnDeviceAppHistoryPrivacy.Data.class)) != null && treeValue2.hasFieldValue("is_eligible") && treeValue2.getBooleanValue("is_eligible")) {
            AnonymousClass3WK.A01(r3.A05).A07(C18230wP.A0N(new PandoGraphQLRequest(C63233h2.A01(), "AndroidAppHistoryPlistQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), AndroidAppHistoryPlistQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_android_app_history_plist_query")), C63873iU.A06(r3, 116));
        }
    }
}
