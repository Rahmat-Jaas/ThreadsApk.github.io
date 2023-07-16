package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.redex.IDxOTaskShape113S0300000_1_I2;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1hw  reason: invalid class name and case insensitive filesystem */
public final class C24341hw extends C63873iU {
    public final /* synthetic */ C34640IcN A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ C82824qK A02;
    public final /* synthetic */ RegFlowExtras A03;
    public final /* synthetic */ Context A04;
    public final /* synthetic */ Handler A05;
    public final /* synthetic */ C24721jv A06;
    public final /* synthetic */ C07530bf A07;

    public C24341hw(Context context, Handler handler, C34640IcN icN, C11630kW r4, C82824qK r5, RegFlowExtras regFlowExtras, C24721jv r7, C07530bf r8) {
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = regFlowExtras;
        this.A04 = context;
        this.A05 = handler;
        this.A00 = icN;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1790732151);
        C26651qz r6 = (C26651qz) obj;
        int A033 = C14030oh.A03(948633966);
        super.onSuccess(r6);
        User user = r6.A05;
        user.A29(0);
        C18210wN.A1K(user);
        C07530bf r8 = this.A07;
        String id = user.getId();
        C04220Ms.A0B(r8, 0);
        AnonymousClass0wJ.A1O("facebook", "consumer");
        C04220Ms.A0B(id, 3);
        C54252z9.A00(r8, (Integer) null, "facebook", "consumer", id, (String) null).Bb4();
        synchronized (AnonymousClass3XU.A00(r8).A00) {
        }
        Context context = this.A04;
        UserSession A034 = C67323zM.A03(context, (C11630kW) null, r8, user, (String) null, false);
        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18310802792522733L) && C49332rD.A00(r8).A00 != null && !C62433Zv.A02(C24751jz.A0B, A034, "ig_android_growth_sdk_token_fbig_login")) {
            C67363zQ.A0B(C49332rD.A00(r8).A00, A034);
        }
        C35692Ol.A00(A034).A04(C24751jz.A0B, (C83954sG) null, "ig_fb_log_in");
        C33292Fd.A00(context, A034).A01(C306622k.REGISTRATION);
        if (r6.A0H) {
            C31155GhB.A03(new IDxOTaskShape113S0300000_1_I2(1, this, user, A034));
        } else {
            C24721jv r0 = this.A06;
            if (r0 != null) {
                r0.A00();
            }
            this.A05.post(new AnonymousClass4Rl(this, user));
        }
        C14030oh.A0A(-1742482053, A033);
        C14030oh.A0A(-1417390864, A032);
    }

    public final void onFail(AnonymousClass3XX r25) {
        String str;
        String str2;
        C82824qK r4;
        String str3;
        int A032 = C14030oh.A03(-9740028);
        C24721jv r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass3XX r42 = r25;
        Object obj = r42.A00;
        if (obj != null) {
            C26651qz r02 = (C26651qz) obj;
            if (!r02.isFeedbackRequired() && (r4 = this.A02) != null) {
                AnonymousClass3SN r1 = r02.A01;
                if (r1 != null) {
                    str3 = r1.A00;
                } else {
                    str3 = null;
                }
                r4.Cth(str3, AnonymousClass006.A01);
            }
            C07530bf r5 = this.A07;
            AnonymousClass3SN r12 = r02.A01;
            if (r12 != null) {
                str = r12.A01;
            } else {
                str = null;
            }
            if (r12 != null) {
                str2 = r12.A00;
            } else {
                str2 = null;
            }
            Boolean A0Y = C18180wK.A0Y();
            String status = r02.getStatus();
            Boolean valueOf = Boolean.valueOf(r02.isCheckpointRequired());
            Boolean valueOf2 = Boolean.valueOf(r02.isConsentRequired());
            Boolean valueOf3 = Boolean.valueOf(r02.isFeedbackRequired());
            Boolean valueOf4 = Boolean.valueOf(r02.isLoginRequired());
            Boolean valueOf5 = Boolean.valueOf(r02.isNoContent());
            Boolean valueOf6 = Boolean.valueOf(r02.isViolatingBrandedContentPolicy());
            Integer valueOf7 = Integer.valueOf(r02.mStatusCode);
            String str4 = r02.mErrorType;
            String errorMessage = r02.getErrorMessage();
            C04220Ms.A0B(r5, 0);
            C54262zA.A00(r5, A0Y, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, (Boolean) null, (Integer) null, valueOf7, "facebook", str, str2, status, (String) null, str4, errorMessage, (String) null);
        } else {
            C82824qK r2 = this.A02;
            if (r2 != null) {
                r2.Cth(this.A04.getString(2131831662), AnonymousClass006.A00);
            }
            Throwable th = r42.A01;
            if (th != null) {
                String A0q = C18220wO.A0q(th);
                C10450iM.A03(C24751jz.__redex_internal_original_name, AnonymousClass00U.A0d("Exception ", A0q, ": ", th.getMessage()));
                C07530bf r52 = this.A07;
                C04220Ms.A0B(r52, 0);
                C54262zA.A00(r52, false, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, "facebook", (String) null, (String) null, A0q, (String) null, (String) null, (String) null, (String) null);
            }
        }
        C14030oh.A0A(-372351473, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(97928716);
        super.onStart();
        C24721jv r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
        C07530bf r3 = this.A07;
        C313625r r2 = C313625r.A03;
        Integer A022 = this.A03.A02();
        C04220Ms.A0B(r3, 0);
        C54272zB.A00(r3, r2, A022, (Integer) null, (String) null);
        C14030oh.A0A(-672705688, A032);
    }
}
