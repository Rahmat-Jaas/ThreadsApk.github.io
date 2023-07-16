package X;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.instagram.login.callback.IDxLCallbacksShape165S0100000_1_I2;

/* renamed from: X.1lm  reason: invalid class name and case insensitive filesystem */
public final class C25091lm extends FR1 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass32O A01;
    public final /* synthetic */ C34640IcN A02;
    public final /* synthetic */ AnonymousClass3GT A03;
    public final /* synthetic */ AnonymousClass3Xi A04;
    public final /* synthetic */ C07530bf A05;
    public final /* synthetic */ AnonymousClass265 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public final int getRunnableId() {
        return 1981478238;
    }

    public C25091lm(View view, AnonymousClass32O r2, C34640IcN icN, AnonymousClass3GT r4, AnonymousClass3Xi r5, C07530bf r6, AnonymousClass265 r7, String str, String str2, String str3) {
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A00 = view;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A02 = icN;
        this.A03 = r4;
    }

    public final void A02(Exception exc) {
        C07530bf r2 = this.A05;
        String str = this.A06.A01;
        C62323Yh.A00(r2, Boolean.valueOf(AnonymousClass0wJ.A1Y(r2, str)), str, "client_auth_failed_other_error", "authentication request to FeO2 client failed", this.A08, "ar_code_sms", exc.getMessage(), TextUtils.join("\n", exc.getStackTrace()), (String) null, (String) null);
        this.A03.A00();
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C62323Yh r9 = C62323Yh.A00;
            C07530bf r7 = this.A05;
            AnonymousClass265 r8 = this.A06;
            String str2 = r8.A01;
            AnonymousClass3Xi r0 = this.A04;
            r9.A03(r7, str2, "client_auth_request_auth_service", "client sends auth response to server to authenticate", "optimistic_authentication_flow", "ar_code_sms");
            Context context = r0.A00;
            String str3 = this.A09;
            C32165H8c A062 = C63883iV.A06(context, r7, str3, "111111", this.A08, (String) null, str, this.A07);
            C34640IcN icN = this.A02;
            A062.A00 = new IDxLCallbacksShape165S0100000_1_I2(icN.getRootActivity(), (C11630kW) icN, (C84634tZ) new C70224Dh(icN.requireActivity()), this, r7, r8, AnonymousClass006.A01, str3);
            C31155GhB.A03(A062);
            return;
        }
        this.A03.A00();
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C62323Yh r11 = C62323Yh.A00;
        C07530bf r4 = this.A05;
        String str = this.A06.A01;
        AnonymousClass3Xi r0 = this.A04;
        r11.A03(r4, str, "client_auth_request_generate_auth_response", "authenticate query called to feo2 client", "optimistic_authentication_flow", "ar_code_sms");
        try {
            AnonymousClass3HT r3 = r0.A02;
            AnonymousClass32O r2 = this.A01;
            AnonymousClass32P r1 = new AnonymousClass32P(r2.A00);
            r2.A00 = C18180wK.A06();
            AnonymousClass32Q A002 = r3.A00(r1);
            if (A002 == null) {
                r11.A03(r4, str, "client_auth_response_not_found", "empty_auto_conf_authenticate_result", "optimistic_authentication_flow", "ar_code_sms");
                return null;
            }
            r11.A03(r4, str, "client_auth_response_found", (String) null, "optimistic_authentication_flow", "ar_code_sms");
            Lzj lzj = AnonymousClass3Xi.A07;
            Bundle bundle = A002.A00;
            if (bundle.containsKey("response")) {
                return lzj.A02(bundle.getByteArray("response"));
            }
            throw new IllegalStateException();
        } catch (AnonymousClass2AX | RemoteException | SecurityException e) {
            C62323Yh.A00(r4, Boolean.valueOf(AnonymousClass0wJ.A1Y(r4, str)), str, "client_auth_response_not_found", "auto_conf_client_authenticate_failed", "optimistic_authentication_flow", "ar_code_sms", e.getMessage(), TextUtils.join("\n", e.getStackTrace()), "authenticate_exception_caught", (String) null);
            C10450iM.A06("FeO2IntegrateHelper", "auto_conf_client_authenticate_failed", e);
            return null;
        }
    }

    public final void onFinish() {
        C18210wN.A0z(this.A00);
        super.onFinish();
    }

    public final void onStart() {
        C18240wQ.A0w(this.A00);
        super.onStart();
    }
}
