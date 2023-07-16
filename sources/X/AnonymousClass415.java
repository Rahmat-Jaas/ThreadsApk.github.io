package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.415  reason: invalid class name */
public final /* synthetic */ class AnonymousClass415 implements C143758hG {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C10300i6 A01;
    public final /* synthetic */ AnonymousClass3YF A02;
    public final /* synthetic */ C82664q4 A03;
    public final /* synthetic */ C82664q4 A04;
    public final /* synthetic */ AnonymousClass265 A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass415(Activity activity, C10300i6 r2, AnonymousClass3YF r3, C82664q4 r4, C82664q4 r5, AnonymousClass265 r6, boolean z) {
        this.A02 = r3;
        this.A00 = activity;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A06 = z;
    }

    public final void CH9(C82014ow r23) {
        C84484tD r1;
        String str;
        AnonymousClass4SO r0;
        AnonymousClass356 r5;
        String str2;
        String str3;
        String str4;
        String str5;
        AnonymousClass3YF r12 = this.A02;
        Activity activity = this.A00;
        AnonymousClass265 r4 = this.A05;
        C82664q4 r6 = this.A03;
        C82664q4 r2 = this.A04;
        C10300i6 r02 = this.A01;
        boolean z = this.A06;
        C85774vk r8 = (C85774vk) r23;
        AnonymousClass7lN r3 = r12.A00;
        if (r3 == null) {
            r1 = r12.A01;
            if (r1 != null) {
                str = "ApiClientWrapper not bound";
            } else {
                return;
            }
        } else if (r8 == null) {
            r1 = r12.A01;
            if (r1 != null) {
                str = "credentialRequestResult null";
            } else {
                return;
            }
        } else {
            Status BDf = r8.BDf();
            if (BDf != null) {
                PendingIntent pendingIntent = BDf.A02;
                if (pendingIntent == null || BDf.A01 != 6) {
                    int i = BDf.A01;
                    if (i == 0) {
                        if (!z) {
                            if (r4 == null) {
                                str3 = null;
                            } else {
                                str3 = r4.A01;
                            }
                            int A002 = C63533hk.A00(r02);
                            AnonymousClass7lN r22 = r12.A00;
                            r22.getClass();
                            boolean A1T = AnonymousClass0wJ.A1T(r22.A01, 10);
                            C04220Ms.A0B(r02, 0);
                            long currentTimeMillis = System.currentTimeMillis();
                            long A012 = AnonymousClass269.A01();
                            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r02), "ig_android_smart_lock_auto_sign_in"), 782);
                            AnonymousClass269.A05(A0I);
                            C18180wK.A19(A0I);
                            C18190wL.A1G(A0I, currentTimeMillis, A012);
                            C18200wM.A1K(A0I, (double) A012);
                            C18190wL.A1I(A0I, str3);
                            C18180wK.A1G(A0I);
                            A0I.A0S("num_one_tap_accounts", C18230wP.A0f(A002));
                            A0I.A0Q("is_auto_login_enable", Boolean.valueOf(A1T));
                            boolean z2 = true;
                            A0I.A0Q("has_status", true);
                            if (pendingIntent == null) {
                                z2 = false;
                            }
                            A0I.A0Q("has_resolution", Boolean.valueOf(z2));
                            A0I.A0S(TraceFieldType.StatusCode, C18230wP.A0f(i));
                            Boolean A0Z = C18190wL.A0Z(A0I, TraceFieldType.StatusMessage, BDf.A04, false);
                            A0I.A0Q("status_is_cancelled", A0Z);
                            A0I.A0Q("status_is_success", true);
                            A0I.A0Q("status_is_interrupted", A0Z);
                            A0I.Bb4();
                        }
                        r5 = new AnonymousClass356(new AnonymousClass355(((AnonymousClass412) r8).A00));
                        r0 = new AnonymousClass4SO(activity, r6, r5);
                        activity.runOnUiThread(r0);
                        return;
                    }
                } else {
                    try {
                        C26981ra r16 = new C26981ra(r02, r2, r12.A01, r4, z);
                        List list = r12.A04;
                        synchronized (list) {
                            list.add(r16);
                        }
                        BDf.A00(activity, r16.A00);
                        if (z) {
                            C04220Ms.A0B(r02, 0);
                            AnonymousClass3LL.A00(r02, "login_smartlock_impression", "login_smart_lock", "smartlock", (String) null, (String) null, (HashMap) null);
                            return;
                        }
                        if (r4 == null) {
                            str5 = null;
                        } else {
                            str5 = r4.A01;
                        }
                        int A003 = C63533hk.A00(r02);
                        boolean A1T2 = AnonymousClass0wJ.A1T(r3.A01, 10);
                        C04220Ms.A0B(r02, 0);
                        C63523hf.A00(BDf, r02, str5, A003, A1T2);
                        return;
                    } catch (IntentSender.SendIntentException unused) {
                        C63523hf r14 = C63523hf.A00;
                        if (r4 == null) {
                            str4 = null;
                        } else {
                            str4 = r4.A01;
                        }
                        r14.A06(BDf, r02, str4, "start_resolution", "send_intent_exception", C63533hk.A00(r02), AnonymousClass0wJ.A1T(r3.A01, 10));
                        r0 = new AnonymousClass4SO(activity, r2, new AnonymousClass356((AnonymousClass355) null));
                    }
                }
            }
            r5 = null;
            if (!z) {
                C63523hf r142 = C63523hf.A00;
                if (r4 == null) {
                    str2 = null;
                } else {
                    str2 = r4.A01;
                }
                r142.A06(BDf, r02, str2, "handle_ig_credentials_response", "invalid_status", C63533hk.A00(r02), AnonymousClass0wJ.A1T(r3.A01, 10));
            }
            r0 = new AnonymousClass4SO(activity, r6, r5);
            activity.runOnUiThread(r0);
            return;
        }
        r1.BNe(str);
    }
}
