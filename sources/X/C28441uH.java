package X;

import android.os.Bundle;
import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1uH  reason: invalid class name and case insensitive filesystem */
public final class C28441uH extends C28451uI {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ AnonymousClass01V A03;
    public final /* synthetic */ C82804qI A04;
    public final /* synthetic */ RegFlowExtras A05;
    public final /* synthetic */ C07530bf A06;
    public final /* synthetic */ C313625r A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ AtomicInteger A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28441uH(android.os.Handler r12, androidx.fragment.app.Fragment r13, X.C34640IcN r14, X.C11630kW r15, X.AnonymousClass01V r16, X.C82804qI r17, X.C82824qK r18, com.instagram.registration.model.RegFlowExtras r19, com.instagram.registration.model.RegFlowExtras r20, X.C07530bf r21, X.C07530bf r22, X.C313625r r23, X.C313625r r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.String r27, java.util.concurrent.atomic.AtomicInteger r28, boolean r29, boolean r30) {
        /*
            r11 = this;
            r0 = r17
            r1 = r11
            r11.A04 = r0
            r0 = r16
            r11.A03 = r0
            r11.A01 = r14
            r0 = r20
            r11.A05 = r0
            r11.A02 = r15
            r11.A00 = r12
            r0 = r24
            r11.A07 = r0
            r0 = r28
            r11.A09 = r0
            r0 = r22
            r11.A06 = r0
            r0 = r26
            r11.A08 = r0
            r8 = r27
            r7 = r25
            r6 = r23
            r10 = r30
            r9 = r29
            r2 = r13
            r3 = r18
            r4 = r19
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28441uH.<init>(android.os.Handler, androidx.fragment.app.Fragment, X.IcN, X.0kW, X.01V, X.4qI, X.4qK, com.instagram.registration.model.RegFlowExtras, com.instagram.registration.model.RegFlowExtras, X.0bf, X.0bf, X.25r, X.25r, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.concurrent.atomic.AtomicInteger, boolean, boolean):void");
    }

    public final void A00(C22241Ty r8) {
        String errorMessage;
        int i;
        int A032 = C14030oh.A03(1757102981);
        C82804qI r5 = this.A04;
        if (r5 != null && !r8.A04 && r8.A05) {
            AnonymousClass01V r3 = this.A03;
            r3.markerAnnotate(4197923, "reg_existing_login", true);
            r3.markerEnd(4197923, 3);
            AnonymousClass3HF r1 = this.A04;
            if (r1 != null && r1.A00) {
                r1.A00();
            }
            String A0f = C18240wQ.A0f(C62983bG.A01(), r8.A03);
            if (A0f == null) {
                A0f = "";
            }
            String A0f2 = C18240wQ.A0f("profile_pic_url", r8.A03);
            if (A0f2 == null) {
                A0f2 = "";
            }
            r5.Csx(A0f, A0f2);
        } else if (!r8.A04 || r8.A01 == null) {
            C34640IcN icN = this.A01;
            if (icN.getContext() == null) {
                C10450iM.A03("Show error message when user is not returned from server during account creation", "Context is null");
                i = -800542966;
                C14030oh.A0A(i, A032);
            }
            this.A03.markerEnd(4197923, 3);
            if (r8.getErrorMessage() == null) {
                errorMessage = icN.getContext().getString(2131831662);
            } else {
                errorMessage = r8.getErrorMessage();
            }
            A04(errorMessage, AnonymousClass006.A00);
        } else {
            this.A03.markerPoint(4197923, "account_creation_success");
            super.A00(r8);
        }
        i = 467338185;
        C14030oh.A0A(i, A032);
    }

    public final void A02(UserSession userSession, User user) {
        super.A02(userSession, user);
        C34640IcN icN = this.A01;
        C67323zM.A08(icN.requireActivity(), this.A02, userSession);
        AnonymousClass3RH.A00 = null;
        AnonymousClass3Y3.A01(icN.requireContext());
    }

    public final void A03(User user) {
        super.A03(user);
        RegFlowExtras regFlowExtras = this.A05;
        regFlowExtras.A0Y = user.getId();
        String id = user.getId();
        Bundle A062 = C18180wK.A06();
        C18190wL.A13(A062, id);
        A062.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession A0V = C18180wK.A0V(A062);
        if (regFlowExtras.A0v) {
            C63533hk.A02(A0V).A0B(this.A02, A0V, AnonymousClass006.A1L, user.getId(), true);
        }
        this.A00.post(new AnonymousClass4Rk(this, user));
    }

    public final void onStart() {
        int A032 = C14030oh.A03(1953212707);
        AtomicInteger atomicInteger = this.A09;
        if (atomicInteger.get() == 1) {
            super.onStart();
        }
        C54272zB.A00(this.A06, this.A07, this.A08, Integer.valueOf(atomicInteger.get()), AnonymousClass2TS.A00(C67283zI.A00()));
        C14030oh.A0A(766946075, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1963038150);
        A00((C22241Ty) obj);
        C14030oh.A0A(404387296, A032);
    }
}
