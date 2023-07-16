package com.instagram.bloks.util;

import X.AnonymousClass099;
import X.AnonymousClass1eT;
import X.AnonymousClass314;
import X.C57523Bj;
import android.app.Dialog;
import ch.boye.httpclientandroidlib.util.LangUtils;

public class IDxACallbackShape31S0200000_1_I2 extends AnonymousClass1eT {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape31S0200000_1_I2(int i, int i2, Object obj, Object obj2) {
        super(false);
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void A01() {
        Dialog dialog;
        Object obj;
        switch (this.A02) {
            case 6:
                AnonymousClass314.A00 = false;
                return;
            case 7:
            case 8:
            case 9:
            case 10:
                obj = this.A00;
                break;
            case 13:
                dialog = (Dialog) this.A01;
                if (dialog == null) {
                    return;
                }
                break;
            case 14:
            case LangUtils.HASH_SEED /*17*/:
                obj = this.A01;
                break;
            case 15:
                ((C57523Bj) this.A00).A00 = false;
                return;
            case 18:
                ((AnonymousClass099) this.A01).A07();
                return;
            default:
                return;
        }
        dialog = (Dialog) obj;
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        X.C63813iO.A03(r3, r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
        X.C63813iO.A03(r3, r2, 2131831662, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017b, code lost:
        X.C10450iM.A03(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass3XX r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x01b4;
                case 1: goto L_0x019a;
                case 2: goto L_0x0005;
                case 3: goto L_0x005f;
                case 4: goto L_0x017f;
                case 5: goto L_0x001a;
                case 6: goto L_0x014f;
                case 7: goto L_0x013d;
                case 8: goto L_0x0132;
                case 9: goto L_0x013d;
                case 10: goto L_0x0132;
                case 11: goto L_0x00f3;
                case 12: goto L_0x0006;
                case 13: goto L_0x00e3;
                case 14: goto L_0x00cf;
                case 15: goto L_0x0005;
                case 16: goto L_0x00b1;
                case 17: goto L_0x00a0;
                case 18: goto L_0x006d;
                case 19: goto L_0x0067;
                case 20: goto L_0x005f;
                case 21: goto L_0x005f;
                case 22: goto L_0x005f;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x005a;
                case 26: goto L_0x004e;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r7.A01
            X.3iU r2 = (X.C63873iU) r2
            r2.onFinish()
            java.lang.Throwable r1 = r8.A01
            if (r1 == 0) goto L_0x0005
            X.3XX r0 = new X.3XX
            r0.<init>((java.lang.Throwable) r1)
            r2.onFail(r0)
            return
        L_0x001a:
            r1 = 0
            X.C04220Ms.A0B(r8, r1)
            java.lang.Object r5 = r7.A01
            X.3VG r5 = (X.AnonymousClass3VG) r5
            r5.A03()
            java.lang.String r4 = r8.toString()
            boolean r0 = r5 instanceof X.C26141q7
            if (r0 == 0) goto L_0x0005
            X.1q7 r5 = (X.C26141q7) r5
            X.C04220Ms.A0B(r4, r1)
            X.49s r3 = r5.A01
            java.lang.String r2 = r5.A05
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            X.29X r0 = X.AnonymousClass29X.INITIAL_ASYNC_CONTROLLER_REQUEST_ERROR
            X.C697149s.A00(r0, r3, r4, r2, r1)
            X.01V r2 = r5.A00
            r1 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r0 = "initial_async_controller_request_failure"
            r2.markerPoint(r1, r0)
            return
        L_0x004e:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r0 = r7.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C62973bE.A02(r0, r8)
            return
        L_0x005a:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            return
        L_0x005f:
            java.lang.Object r0 = r7.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A19(r0)
            return
        L_0x0067:
            java.lang.Object r0 = r7.A01
            X.C18250wR.A1C(r0)
            return
        L_0x006d:
            java.lang.Throwable r2 = r8.A01
            boolean r0 = X.AnonymousClass0wJ.A1W(r2)
            java.lang.String r1 = "Unable to fetch Restrict NUX action"
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "PrivacyOptionsController"
            X.C10450iM.A06(r0, r1, r2)
        L_0x007c:
            java.lang.Object r3 = r7.A00
            X.3aX r3 = (X.C62693aX) r3
            androidx.fragment.app.FragmentActivity r1 = r3.A03
            com.instagram.service.session.UserSession r0 = r3.A05
            X.Drz r2 = X.C18180wK.A0Q(r1, r0)
            X.JXd r0 = X.C36480JXd.A02
            r0.A01()
            X.CTd r0 = r3.A04
            android.os.Bundle r1 = r0.mArguments
            com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment r0 = new com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment
            r0.<init>()
            X.C18180wK.A0x(r1, r0, r2)
            return
        L_0x009a:
            java.lang.String r0 = "PrivacyOptionsController"
            X.C10450iM.A03(r0, r1)
            goto L_0x007c
        L_0x00a0:
            java.lang.Object r0 = r7.A00
            X.3Ug r0 = (X.C61573Ug) r0
            X.1dm r0 = r0.A02
            android.content.Context r3 = X.C18230wP.A0A(r0)
            r2 = 2131826864(0x7f1118b0, float:1.9286624E38)
            r1 = 0
            java.lang.String r0 = "open_help_screen_failed"
            goto L_0x00df
        L_0x00b1:
            r3 = 0
            X.C04220Ms.A0B(r8, r3)
            java.lang.Object r0 = r7.A01
            X.3z5 r0 = (X.C67193z5) r0
            X.CTd r0 = r0.A02
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x00ca
            java.lang.String r1 = "business_age_gating_failed"
            r0 = 2131826864(0x7f1118b0, float:1.9286624E38)
            X.C63813iO.A03(r2, r1, r0, r3)
            return
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00cf:
            java.lang.Object r0 = r7.A00
            X.3TE r0 = (X.AnonymousClass3TE) r0
            X.1dm r0 = r0.A05
            android.content.Context r3 = X.C18230wP.A0A(r0)
            r2 = 2131826864(0x7f1118b0, float:1.9286624E38)
            r1 = 0
            java.lang.String r0 = "bloks_action_failed"
        L_0x00df:
            X.C63813iO.A03(r3, r0, r2, r1)
            return
        L_0x00e3:
            java.lang.Throwable r2 = r8.A01
            boolean r1 = X.AnonymousClass0wJ.A1W(r2)
            java.lang.String r3 = "Unable to fetch bloks action"
            java.lang.String r0 = "OpenBloksActionHandler"
            if (r1 == 0) goto L_0x017b
            X.C10450iM.A06(r0, r3, r2)
            return
        L_0x00f3:
            java.lang.Object r4 = r7.A00
            com.instagram.nux.activity.BloksSignedOutFragmentActivity r4 = (com.instagram.nux.activity.BloksSignedOutFragmentActivity) r4
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A09
            boolean r0 = r1.get()
            r2 = 0
            if (r0 == 0) goto L_0x0105
            r0 = 1
            r1.compareAndSet(r0, r2)
            return
        L_0x0105:
            X.01V r1 = X.AnonymousClass01V.A0p
            java.lang.String r0 = "1"
            r3 = 896612552(0x357138c8, float:8.9862124E-7)
            r1.A0Y(r3, r2, r0)
            java.lang.Throwable r0 = r8.A01
            java.lang.String r2 = "failure_reason"
            X.01V r1 = X.AnonymousClass01V.A0p
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r0.toString()
        L_0x011b:
            r1.markerAnnotate((int) r3, (java.lang.String) r2, (java.lang.String) r0)
            X.01V r1 = X.AnonymousClass01V.A0p
            r0 = 3
            r1.markerEnd(r3, r0)
            android.os.Handler r1 = r4.A07
            java.lang.Runnable r0 = r4.A08
            r1.removeCallbacks(r0)
            com.instagram.nux.activity.BloksSignedOutFragmentActivity.A04(r4)
            return
        L_0x012f:
            java.lang.String r0 = "unknown"
            goto L_0x011b
        L_0x0132:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r3 = r0.requireContext()
            java.lang.String r2 = "open_similar_user_failed"
            goto L_0x0147
        L_0x013d:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r3 = r0.requireContext()
            java.lang.String r2 = "open_possible_scammer_bottom_sheet"
        L_0x0147:
            r1 = 2131831662(0x7f112b6e, float:1.9296356E38)
            r0 = 0
            X.C63813iO.A03(r3, r2, r1, r0)
            return
        L_0x014f:
            r3 = 0
            X.C04220Ms.A0B(r8, r3)
            java.lang.Object r4 = r7.A00
            X.IcN r4 = (X.C34640IcN) r4
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L_0x0165
            java.lang.String r1 = "igtv_network_request_generic_load_error"
            r0 = 2131828860(0x7f11207c, float:1.9290673E38)
            X.C63813iO.A03(r2, r1, r0, r3)
        L_0x0165:
            java.lang.Throwable r1 = r8.A01
            boolean r0 = X.AnonymousClass0wJ.A1W(r1)
            java.lang.String r3 = "Unable to fetch bloks action"
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = r4.getModuleName()
            X.C10450iM.A06(r0, r3, r1)
            return
        L_0x0177:
            java.lang.String r0 = r4.getModuleName()
        L_0x017b:
            X.C10450iM.A03(r0, r3)
            return
        L_0x017f:
            java.lang.String r1 = "FeedbackUtil"
            java.lang.String r0 = "Failed to trigger Sentry Block / Restriction unified Bloks dialog"
            X.C10450iM.A03(r1, r0)
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.0m7 r1 = r0.getSupportFragmentManager()
            java.lang.Object r0 = r7.A00
            X.45U r0 = (X.AnonymousClass45U) r0
            android.os.Bundle r0 = X.C62463a4.A00(r0)
            X.C62463a4.A01(r0, r1)
            return
        L_0x019a:
            java.lang.Object r2 = r7.A00
            X.42s r2 = (X.C682042s) r2
            androidx.fragment.app.Fragment r0 = r2.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131826864(0x7f1118b0, float:1.9286624E38)
            X.C63813iO.A00(r1, r0)
            X.1ju r0 = r2.A06
            r0.A00()
            r0 = 0
            X.C682042s.A02(r2, r0)
            return
        L_0x01b4:
            java.lang.Object r2 = r7.A00
            X.1cM r2 = (X.AnonymousClass1cM) r2
            android.content.Context r1 = r2.getContext()
            r0 = 2131826864(0x7f1118b0, float:1.9286624E38)
            X.C63813iO.A00(r1, r0)
            X.1ju r0 = r2.A0D
            if (r0 == 0) goto L_0x01c9
            r0.A00()
        L_0x01c9:
            r6 = 0
            X.0i6 r1 = r2.A0E
            java.lang.String r3 = r2.A0F
            java.lang.String r4 = X.AnonymousClass1cM.A00(r2)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r2.A0A
            java.lang.String r5 = r0.A08
            java.lang.String r2 = "create_page"
            X.AnonymousClass3L1.A01(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2.A03(X.3XX):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        X.C33492Fx.A00(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0242, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0245, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0259, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x025c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A04(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0246;
                case 2: goto L_0x003d;
                case 3: goto L_0x0175;
                case 4: goto L_0x006b;
                case 5: goto L_0x0186;
                case 6: goto L_0x0081;
                case 7: goto L_0x008a;
                case 8: goto L_0x008a;
                case 9: goto L_0x009c;
                case 10: goto L_0x009c;
                case 11: goto L_0x00ae;
                case 12: goto L_0x00e9;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010e;
                case 15: goto L_0x0005;
                case 16: goto L_0x0125;
                case 17: goto L_0x012f;
                case 18: goto L_0x01bd;
                case 19: goto L_0x0146;
                case 20: goto L_0x01e9;
                case 21: goto L_0x01fa;
                case 22: goto L_0x020b;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x021c;
                case 26: goto L_0x015e;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r1 = r9.A01
            X.7qT r1 = (X.C130667qT) r1
        L_0x000b:
            X.C33492Fx.A00(r1, r10)
        L_0x000e:
            return
        L_0x000f:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r2 = r9.A00
            X.1cM r2 = (X.AnonymousClass1cM) r2
            r8 = 1
            X.0i6 r3 = r2.A0E
            java.lang.String r5 = r2.A0F
            java.lang.String r6 = X.AnonymousClass1cM.A00(r2)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r2.A0A
            java.lang.String r7 = r0.A08
            java.lang.String r4 = "create_page"
            X.AnonymousClass3L1.A01(r3, r4, r5, r6, r7, r8)
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "EXTRA_FORCE_FETCH_FB_PAGES"
            r1.putBoolean(r0, r8)
            java.lang.Object r0 = r9.A01
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r10)
            X.1ju r0 = r2.A0D
            if (r0 == 0) goto L_0x000e
            goto L_0x0259
        L_0x003d:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r4 = r9.A00
            X.49w r4 = (X.C697449w) r4
            r1 = 0
            r4.A02 = r1
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x000e
            X.0i6 r3 = r4.A06
            boolean r0 = r3.hasEnded()
            if (r0 != 0) goto L_0x000e
            r2 = 1
            r4.A04 = r2
            r4.A05 = r1
            java.lang.Object r1 = r9.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.43Q r0 = new X.43Q
            r0.<init>(r9)
            X.7qT r1 = X.C18220wO.A0T(r1, r0, r3)
            r1.A00 = r2
            goto L_0x000b
        L_0x006b:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A00
            X.45U r0 = (X.AnonymousClass45U) r0
            X.0i6 r2 = r0.A00
            java.lang.Object r1 = r9.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.43S r0 = new X.43S
            r0.<init>(r9)
            X.7qT r1 = X.C18220wO.A0T(r1, r0, r2)
            goto L_0x000b
        L_0x0081:
            X.3St r10 = X.C61733Vd.A00(r10)
            java.lang.Object r1 = r9.A01
            X.7qT r1 = (X.C130667qT) r1
            goto L_0x000b
        L_0x008a:
            X.3St r10 = X.C61733Vd.A00(r10)
            java.lang.Object r0 = r9.A01
            X.CRV r0 = (X.CRV) r0
            X.0Oa r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.7qT r1 = (X.C130667qT) r1
            goto L_0x000b
        L_0x009c:
            X.3St r10 = X.C61733Vd.A00(r10)
            java.lang.Object r0 = r9.A01
            X.CUX r0 = (X.CUX) r0
            X.0Oa r0 = r0.A09
            java.lang.Object r1 = r0.getValue()
            X.7qT r1 = (X.C130667qT) r1
            goto L_0x000b
        L_0x00ae:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r4 = r9.A00
            com.instagram.nux.activity.BloksSignedOutFragmentActivity r4 = (com.instagram.nux.activity.BloksSignedOutFragmentActivity) r4
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A09
            boolean r0 = r1.get()
            r3 = 0
            if (r0 == 0) goto L_0x00c2
            r0 = 1
            r1.compareAndSet(r0, r3)
            return
        L_0x00c2:
            android.os.Handler r1 = r4.A07
            java.lang.Runnable r0 = r4.A08
            r1.removeCallbacks(r0)
            X.01V r2 = X.AnonymousClass01V.A0p
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "1"
            r2.A0Y(r1, r3, r0)
            java.lang.Object r0 = r9.A01
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r10)
            X.3Bx r2 = r4.A00
            if (r2 == 0) goto L_0x000e
            android.os.Handler r1 = r2.A03
            X.4OA r0 = new X.4OA
            r0.<init>(r2)
            r1.post(r0)
            return
        L_0x00e9:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A01
            X.3iU r0 = (X.C63873iU) r0
            r0.onFinish()
            java.lang.Object r1 = r9.A00
            X.1ca r1 = (X.C23151ca) r1
            X.0bf r0 = r1.A0B
            X.7qT r1 = X.C18230wP.A0S(r1, r0)
            goto L_0x000b
        L_0x00fe:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A00
            X.4Ip r0 = (X.C71384Ip) r0
            com.instagram.service.session.UserSession r1 = r0.A01
            X.IcN r0 = r0.A00
            X.7qT r1 = X.C18230wP.A0S(r0, r1)
            goto L_0x000b
        L_0x010e:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A00
            X.3TE r0 = (X.AnonymousClass3TE) r0
            com.instagram.service.session.UserSession r3 = r0.A04
            X.1dm r2 = r0.A05
            X.43f r1 = new X.43f
            r1.<init>(r9)
            X.GbW r0 = r0.A03
            X.7qT r1 = X.C130667qT.A01(r2, r1, r3, r0)
            goto L_0x000b
        L_0x0125:
            X.3St r10 = X.C61733Vd.A00(r10)
            java.lang.Object r1 = r9.A00
            X.7qT r1 = (X.C130667qT) r1
            goto L_0x000b
        L_0x012f:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A00
            X.3Ug r0 = (X.C61573Ug) r0
            com.instagram.service.session.UserSession r3 = r0.A01
            X.1dm r2 = r0.A02
            X.43h r1 = new X.43h
            r1.<init>(r9)
            X.GbW r0 = r0.A00
            X.7qT r1 = X.C130667qT.A01(r2, r1, r3, r0)
            goto L_0x000b
        L_0x0146:
            X.3St r10 = (X.C61323St) r10
            X.4Q8 r2 = new X.4Q8
            r2.<init>(r9)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.C63643hy.A06(r2, r0)
            java.lang.Object r1 = r9.A00
            X.1xe r1 = (X.C29261xe) r1
            com.instagram.service.session.UserSession r0 = r1.A02
            X.7qT r1 = X.C18230wP.A0S(r1, r0)
            goto L_0x000b
        L_0x015e:
            X.3St r10 = X.C61733Vd.A00(r10)
            java.lang.Object r2 = r9.A01
            X.0i6 r2 = (X.C10300i6) r2
            java.lang.Object r1 = r9.A00
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.44Q r0 = X.AnonymousClass44Q.A00
            X.7qT r1 = X.C18220wO.A0T(r1, r0, r2)
            r0 = 1
            r1.A00 = r0
            goto L_0x000b
        L_0x0175:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A01
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r10)
            java.lang.Object r1 = r9.A00
            X.1b7 r1 = (X.AnonymousClass1b7) r1
            r0 = 1
            r1.A01 = r0
            return
        L_0x0186:
            X.3St r1 = X.C61733Vd.A00(r10)
            java.lang.Object r0 = r9.A00
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r1)
            java.lang.Object r5 = r9.A01
            X.3VG r5 = (X.AnonymousClass3VG) r5
            boolean r0 = r5 instanceof X.C26131q6
            if (r0 == 0) goto L_0x019d
            r5.A03()
            return
        L_0x019d:
            X.1q7 r5 = (X.C26141q7) r5
            X.49s r4 = r5.A01
            java.lang.String r3 = r5.A05
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.29X r1 = X.AnonymousClass29X.INITIAL_ASYNC_CONTROLLER_REQUEST_SUCCESS
            java.lang.String r0 = ""
            X.C697149s.A00(r1, r4, r0, r3, r2)
            X.01V r2 = r5.A00
            r1 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r0 = "initial_async_controller_request_success"
            r2.markerPoint(r1, r0)
            return
        L_0x01bd:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A00
            X.3aX r0 = (X.C62693aX) r0
            com.instagram.service.session.UserSession r3 = r0.A05
            X.CTd r2 = r0.A04
            X.43i r1 = new X.43i
            r1.<init>(r9)
            r0 = 0
            X.7qT r0 = X.C130667qT.A01(r2, r1, r3, r0)
            X.C33492Fx.A00(r0, r10)
            android.content.SharedPreferences r3 = X.C28161tl.A04(r3)
            java.lang.String r2 = "nelson_nux_shown_count"
            int r0 = X.C18190wL.A04(r3, r2)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r3.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            goto L_0x0242
        L_0x01e9:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A01
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r10)
            java.lang.Object r1 = r9.A00
            X.1b8 r1 = (X.AnonymousClass1b8) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x01fa:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A01
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r10)
            java.lang.Object r1 = r9.A00
            X.1b9 r1 = (X.AnonymousClass1b9) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x020b:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r0 = r9.A01
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r10)
            java.lang.Object r1 = r9.A00
            X.1bA r1 = (X.AnonymousClass1bA) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x021c:
            X.3St r2 = X.C61733Vd.A00(r10)
            java.lang.Object r3 = r9.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r1 = r9.A00
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.44P r0 = X.AnonymousClass44P.A00
            X.7qT r0 = X.C18220wO.A0T(r1, r0, r3)
            X.C33492Fx.A00(r0, r2)
            X.3am r0 = X.C63043bN.A01
            r2 = 1
            android.content.SharedPreferences r0 = r0.A06(r3)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "HAS_SEEN_SUPERVISION_UPSELL"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x0242:
            r0.apply()
            return
        L_0x0246:
            X.3St r10 = (X.C61323St) r10
            java.lang.Object r1 = r9.A00
            X.42s r1 = (X.C682042s) r1
            r0 = 1
            X.C682042s.A02(r1, r0)
            java.lang.Object r0 = r9.A01
            X.7qT r0 = (X.C130667qT) r0
            X.C33492Fx.A00(r0, r10)
            X.1ju r0 = r1.A06
        L_0x0259:
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2.A04(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape31S0200000_1_I2(int i, Object obj, Object obj2) {
        super(false);
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
