package X;

import android.app.Activity;
import android.content.Context;
import android.widget.EditText;
import com.facebook.redex.IDxCCallbackShape124S0300000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.1rF  reason: invalid class name and case insensitive filesystem */
public final class C26811rF extends C24431ij {
    public Activity A00;
    public Context A01;
    public C84634tZ A02;
    public C07530bf A03;
    public AnonymousClass265 A04;
    public final /* synthetic */ AnonymousClass1c4 A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26811rF(android.app.Activity r14, android.net.Uri r15, X.C11630kW r16, X.C84634tZ r17, X.AnonymousClass1c4 r18, X.C07530bf r19, X.AnonymousClass265 r20, java.lang.Integer r21) {
        /*
            r13 = this;
            r6 = 0
            r1 = r13
            r0 = r18
            r13.A05 = r0
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r6
            r11 = r6
            r12 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r14
            android.content.Context r0 = r14.getApplicationContext()
            r13.A01 = r0
            r13.A02 = r5
            r13.A04 = r8
            r13.A03 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26811rF.<init>(android.app.Activity, android.net.Uri, X.0kW, X.4tZ, X.1c4, X.0bf, X.265, java.lang.Integer):void");
    }

    public final void A03(UserSession userSession, User user) {
        String A0n;
        AnonymousClass1c4 r1 = this.A05;
        String BK7 = user.BK7();
        EditText editText = r1.A02;
        if (editText == null) {
            A0n = null;
        } else {
            A0n = AnonymousClass0wJ.A0n(editText);
        }
        C551031t.A00(r1, userSession, user.B4M(), new IDxCCallbackShape124S0300000_1_I2(1, userSession, user, this), AnonymousClass265.A17, BK7, A0n, false);
    }

    public static void A00(C26811rF r0, UserSession userSession, User user) {
        super.A03(userSession, user);
    }

    public final void A02(C26641qy r8) {
        int i;
        int A032 = C14030oh.A03(396259598);
        int A033 = C14030oh.A03(-1062797401);
        AnonymousClass269 r0 = AnonymousClass269.A0T;
        C07530bf r6 = this.A03;
        C18180wK.A1K(r0.A0B(r6).A06((C313625r) null, this.A04), r6);
        E2V.A03(this.A00).setIsLoading(false);
        if (r8.A02) {
            this.A02.CM6(r8, r6);
            i = 551409831;
        } else {
            super.A02(r8);
            Context context = this.A01;
            if (context != null) {
                C63813iO.A0A(context, 2131832177, 0);
            }
            i = -1858998121;
        }
        C14030oh.A0A(i, A033);
        AnonymousClass1c4 r1 = this.A05;
        if (AnonymousClass1c4.A03(r1)) {
            C07530bf r2 = r1.A07;
            String str = r1.A08;
            C04220Ms.A0B(r2, 0);
            C35782Ou.A00(AnonymousClass2A5.A03, r2, str, (HashMap) null);
        }
        C14030oh.A0A(1633892559, A032);
    }

    public final void onFail(AnonymousClass3XX r8) {
        String str;
        HashMap A0y;
        int A032 = C14030oh.A03(-2002449920);
        int A033 = C14030oh.A03(370792861);
        AnonymousClass269 r0 = AnonymousClass269.A0S;
        C07530bf r2 = this.A03;
        C18180wK.A1K(r0.A0B(r2).A06((C313625r) null, this.A04), r2);
        E2V.A03(this.A00).setIsLoading(false);
        Object obj = r8.A00;
        if (obj == null) {
            C63813iO.A00(this.A01, 2131834837);
        }
        super.onFail(r8);
        C14030oh.A0A(1664773803, A033);
        AnonymousClass1c4 r1 = this.A05;
        if (AnonymousClass1c4.A03(r1)) {
            C07530bf r4 = r1.A07;
            if (obj != null) {
                String errorMessage = ((AnonymousClass1j3) obj).getErrorMessage();
                str = r1.A08;
                C04220Ms.A0B(r4, 0);
                A0y = AnonymousClass0wJ.A0y();
                A0y.put("exception", errorMessage);
            } else {
                str = r1.A08;
                C04220Ms.A0B(r4, 0);
                A0y = AnonymousClass0wJ.A0y();
                A0y.put("exception", (Object) null);
            }
            C35782Ou.A00(AnonymousClass2A5.A02, r4, str, A0y);
        }
        C14030oh.A0A(1925035875, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(1040291915);
        super.onStart();
        E2V.A03(this.A00).setIsLoading(true);
        C14030oh.A0A(795864463, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(-123856867, C63873iU.A04(this, obj, -554310235));
    }
}
