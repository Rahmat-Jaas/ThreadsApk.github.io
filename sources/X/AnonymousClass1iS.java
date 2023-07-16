package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.login.handler.IDxCListenerShape166S0100000_1_I2;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1iS  reason: invalid class name */
public final class AnonymousClass1iS extends C63873iU {
    public View A00;
    public C63873iU A01;
    public final C34640IcN A02;
    public final C07530bf A03;
    public final AnonymousClass265 A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final /* synthetic */ AnonymousClass3Xi A08;

    public AnonymousClass1iS(View view, C34640IcN icN, C63873iU r3, AnonymousClass3Xi r4, C07530bf r5, AnonymousClass265 r6, String str, String str2, boolean z) {
        this.A08 = r4;
        this.A03 = r5;
        this.A05 = str;
        this.A02 = icN;
        this.A04 = r6;
        this.A06 = str2;
        this.A00 = view;
        this.A01 = r3;
        this.A07 = z;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(2114135370);
        AnonymousClass1U5 r1 = (AnonymousClass1U5) obj;
        int A033 = C14030oh.A03(1621121557);
        AnonymousClass3V1 r0 = new AnonymousClass3V1();
        r0.A01();
        Bundle A062 = C18180wK.A06();
        A062.putAll(r0.A00);
        String str = r1.A04;
        String str2 = r1.A02;
        boolean z = r1.A0A;
        if (str != null) {
            if (str.equals("registration_flow")) {
                C34640IcN icN = this.A02;
                if (icN.getActivity() != null && icN.isResumed()) {
                    if (r1.A08) {
                        if (str2 != null) {
                            C62323Yh.A00.A03(this.A03, this.A04.A01, "client_reg_reg_start_message_received", "received register start message from server", str, "ar_code_sms");
                        }
                        if (!this.A07) {
                            C63463hW.A03();
                            String str3 = this.A06;
                            C07530bf r6 = this.A03;
                            Fragment A002 = C61753Vf.A00(A062, (RegFlowExtras) null, str3, str3, this.A05, str2, "IgSessionManager.LOGGED_OUT_TOKEN", z, false);
                            C25786Drz A0Q = C18180wK.A0Q(icN.requireActivity(), r6);
                            A0Q.A03 = A002;
                            A0Q.A0B = true;
                            A0Q.A05();
                            C63103bV.A03.A03(icN.getActivity(), r6, (C82814qJ) A002, this.A04, r1.A05);
                        }
                    }
                }
                C14030oh.A0A(-883015274, A033);
                C14030oh.A0A(-2107409633, A032);
            } else if (str.equals("optimistic_authentication_flow")) {
                String str4 = r1.A00;
                if (str4 == null) {
                    C07530bf r10 = this.A03;
                    AnonymousClass265 r3 = this.A04;
                    String str5 = r3.A01;
                    AnonymousClass3Xi r12 = this.A08;
                    C62323Yh.A00(r10, Boolean.valueOf(AnonymousClass0wJ.A1Y(r10, str5)), str5, "client_auth_failed_empty_auth_data", "no auth data received from server", str, "ar_code_sms", (String) null, (String) null, "empty_auth_data_auth", (String) null);
                    String str6 = this.A05;
                    String str7 = this.A06;
                    AnonymousClass3Xi.A00(this.A02, this.A01, r12, r10, r3, str6, str7, this.A07);
                } else {
                    AnonymousClass3Xi r11 = this.A08;
                    C07530bf r102 = this.A03;
                    String str8 = this.A06;
                    C34640IcN icN2 = this.A02;
                    AnonymousClass265 r7 = this.A04;
                    View view = this.A00;
                    IDxCListenerShape166S0100000_1_I2 iDxCListenerShape166S0100000_1_I2 = new IDxCListenerShape166S0100000_1_I2(this, 1);
                    String str9 = r1.A01;
                    AnonymousClass32O r122 = new AnonymousClass32O();
                    r122.A00.putByteArray("challenge", AnonymousClass3Xi.A07.A03(str4));
                    r122.A00.putBoolean("useDebugKey", false);
                    AnonymousClass32O r16 = r122;
                    C34640IcN icN3 = icN2;
                    View view2 = view;
                    C31155GhB.A03(new C25091lm(view2, r16, icN3, iDxCListenerShape166S0100000_1_I2, r11, r102, r7, str8, str, str9));
                }
                C14030oh.A0A(-883015274, A033);
                C14030oh.A0A(-2107409633, A032);
            }
        }
        this.A01.onSuccess(r1);
        C14030oh.A0A(-883015274, A033);
        C14030oh.A0A(-2107409633, A032);
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(-1758094163);
        this.A01.onFail(r3);
        C14030oh.A0A(-515857668, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-695859316);
        this.A01.onFinish();
        C14030oh.A0A(-122833426, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(964825274);
        this.A01.onStart();
        C14030oh.A0A(-601067634, A032);
    }
}
