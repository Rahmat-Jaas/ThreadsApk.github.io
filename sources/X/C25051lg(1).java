package X;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.1lg  reason: invalid class name and case insensitive filesystem */
public final class C25051lg extends FR1 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ C63873iU A02;
    public final /* synthetic */ AnonymousClass3GT A03;
    public final /* synthetic */ AnonymousClass3Xi A04;
    public final /* synthetic */ C07530bf A05;
    public final /* synthetic */ AnonymousClass265 A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;

    public final int getRunnableId() {
        return 1200830798;
    }

    public C25051lg(View view, C34640IcN icN, C63873iU r3, AnonymousClass3GT r4, AnonymousClass3Xi r5, C07530bf r6, AnonymousClass265 r7, Boolean bool, String str) {
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A08 = str;
        this.A07 = bool;
        this.A01 = icN;
        this.A00 = view;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void A02(Exception exc) {
        C07530bf r2 = this.A05;
        String str = this.A06.A01;
        C62323Yh.A00(r2, Boolean.valueOf(AnonymousClass0wJ.A1Y(r2, str)), str, "client_start_request_fail", "client start request to FeO2 fails", (String) null, exc.getMessage(), TextUtils.join("\n", exc.getStackTrace()), (String) null, (String) null, (String) null);
        this.A03.A01();
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C62323Yh r4 = C62323Yh.A00;
            C07530bf r6 = this.A05;
            AnonymousClass265 r7 = this.A06;
            r4.A02(r6, r7.A01, "client_start_request_query_verifier", "client sends start message to server to query verifier");
            AnonymousClass3Xi r5 = this.A04;
            Context context = r5.A00;
            String str2 = this.A08;
            Boolean bool = this.A07;
            boolean booleanValue = bool.booleanValue();
            C32165H8c A012 = C63883iV.A01(context, r6, false, bool, str2, str, true, false);
            A012.A00 = new AnonymousClass1iS(this.A00, this.A01, this.A02, r5, r6, r7, str, str2, booleanValue);
            C31155GhB.A03(A012);
            return;
        }
        this.A03.A01();
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C62323Yh r3 = C62323Yh.A00;
        C07530bf r4 = this.A05;
        String str = this.A06.A01;
        r3.A01(r4, str, "client_start_generate_start_message");
        try {
            AnonymousClass3E9 A002 = AnonymousClass3UG.A00(this.A04.A02);
            if (A002 == null) {
                r3.A02(r4, str, "client_start_message_not_found", "empty_auto_conf_start_query_result");
                return null;
            }
            r3.A01(r4, str, "client_start_message_found");
            return AnonymousClass3Xi.A07.A02(A002.A00());
        } catch (AnonymousClass2AX | RemoteException | SecurityException e) {
            C62323Yh.A00(r4, Boolean.valueOf(AnonymousClass0wJ.A1Y(r4, str)), str, "client_start_message_not_found", "auto_conf_client_start_query_failed", (String) null, e.getMessage(), TextUtils.join("\n", e.getStackTrace()), (String) null, (String) null, (String) null);
            C10450iM.A06("FeO2IntegrateHelper", "auto_conf_client_start_query_failed", e);
            return null;
        }
    }
}
