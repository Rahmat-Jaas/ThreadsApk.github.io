package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass601;
import X.BKU;
import X.C109326jp;
import X.C11630kW;
import X.C13330nS;
import X.C18180wK;
import X.C26573ELw;
import X.C39777Kzl;
import android.app.Activity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxCBackShape137S0200000_1_I2 implements C39777Kzl {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCBackShape137S0200000_1_I2(AnonymousClass601 r1, C109326jp r2, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A01 = r2;
            this.A00 = r1;
        } else {
            this.A00 = r2;
            this.A01 = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0121, code lost:
        r1 = X.C63893iY.A01;
        r0 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0125, code lost:
        X.C61043Rr.A00((X.AnonymousClass601) r0, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        r0.A0G();
        r0.A0I(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r2 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0033;
                case 2: goto L_0x0038;
                case 3: goto L_0x011d;
                case 4: goto L_0x010a;
                case 5: goto L_0x0044;
                case 6: goto L_0x0067;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r1 = "dictionary_manager_entrypoint"
            java.lang.String r0 = "upsell"
            r3.putString(r1, r0)
            java.lang.Object r2 = r13.A01
            X.0i6 r2 = (X.C10300i6) r2
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.Object r4 = r13.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r0 = "muted_words_dictionary_manager"
            X.3iT r0 = X.C63863iT.A02(r4, r3, r2, r1, r0)
        L_0x0020:
            r0.A0G()
            r0.A0I(r4)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r2 = r13.A00
            X.6jp r2 = (X.C109326jp) r2
            if (r2 == 0) goto L_0x0026
            X.3iY r1 = X.C63893iY.A01
            java.lang.Object r0 = r13.A01
            goto L_0x0125
        L_0x0033:
            java.lang.Object r2 = r13.A01
            X.6jp r2 = (X.C109326jp) r2
            goto L_0x0040
        L_0x0038:
            java.lang.Object r0 = r13.A01
            X.7h3 r0 = (X.C127397h3) r0
            X.6jp r2 = X.C18230wP.A0V(r0)
        L_0x0040:
            if (r2 == 0) goto L_0x0026
            goto L_0x0121
        L_0x0044:
            java.lang.Object r3 = r13.A01
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.Object r4 = r13.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r1 = "not_interested"
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "dictionary_manager_entrypoint"
            r2.putString(r0, r1)
            java.lang.String r1 = "ig_muted_words_posts"
            java.lang.String r0 = "dictionary_manager_surface_name"
            r2.putString(r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "muted_words_dictionary_manager"
            X.3iT r0 = X.C63863iT.A02(r4, r2, r3, r1, r0)
            goto L_0x0020
        L_0x0067:
            java.lang.Object r4 = r13.A01
            X.ELw r4 = (X.C26573ELw) r4
            java.lang.Object r0 = r13.A00
            com.instagram.pendingmedia.model.PendingMedia r0 = (com.instagram.pendingmedia.model.PendingMedia) r0
            X.BKU r9 = r0.A10
            X.C04220Ms.A06(r9)
            androidx.fragment.app.Fragment r7 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment"
            X.C04220Ms.A0C(r7, r0)
            X.IcN r7 = (X.C34640IcN) r7
            com.instagram.service.session.UserSession r11 = r4.A04
            X.C2o r10 = r4.A03
            boolean r0 = r9.A4B()
            java.lang.String r3 = "clips_upload_success_snackbar"
            java.lang.String r2 = "feed_upload_success_snackbar"
            r12 = r2
            if (r0 == 0) goto L_0x008d
            r12 = r3
        L_0x008d:
            boolean r0 = r7.isVisible()
            if (r0 == 0) goto L_0x00b5
            X.0m7 r8 = r7.mFragmentManager
            androidx.fragment.app.FragmentActivity r6 = r7.getActivity()
            r6.getClass()
            X.1uQ r5 = new X.1uQ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            if (r8 == 0) goto L_0x00a6
            X.C61873Wd.A02(r8)
        L_0x00a6:
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            java.lang.String r0 = r10.getModuleName()
            X.H8c r0 = X.C63413hR.A00(r9, r11, r1, r0)
            r0.A00 = r5
            r7.schedule(r0)
        L_0x00b5:
            X.0kW r6 = r4.A02
            java.lang.String r5 = r9.A0N
            X.C04220Ms.A06(r5)
            X.BKN r0 = r9.A0f
            com.instagram.user.model.User r0 = r0.A1i
            if (r0 == 0) goto L_0x0108
            java.lang.String r4 = r0.getId()
        L_0x00c6:
            boolean r0 = r9.A4B()
            if (r0 != 0) goto L_0x00cd
            r3 = r2
        L_0x00cd:
            X.0nS r1 = X.C13330nS.A01(r6, r11)
            java.lang.String r0 = "share_sheet_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2695(0xa87, float:3.776E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0026
            X.C18180wK.A1C(r2, r6)
            java.lang.String r0 = "share_location"
            X.C18250wR.A10(r2, r0, r3, r5)
            java.lang.String r0 = "media_owner_id"
            r2.A0T(r0, r4)
            X.C18190wL.A1L(r2)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r11)
            java.lang.Integer r0 = r0.A0o()
            java.lang.Long r1 = X.C18220wO.A0e(r0)
            java.lang.String r0 = "following_count"
            r2.A0S(r0, r1)
            r2.Bb4()
            return
        L_0x0108:
            r4 = 0
            goto L_0x00c6
        L_0x010a:
            java.lang.Object r1 = r13.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.C04220Ms.A0C(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r13.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.C54522za.A00(r1, r0)
            return
        L_0x011d:
            java.lang.Object r2 = r13.A01
            X.6jp r2 = (X.C109326jp) r2
        L_0x0121:
            X.3iY r1 = X.C63893iY.A01
            java.lang.Object r0 = r13.A00
        L_0x0125:
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCBackShape137S0200000_1_I2.onButtonClick(android.view.View):void");
    }

    public final void onDismiss() {
    }

    public final void onShow() {
        String str;
        Long l;
        if (6 - this.A02 == 0) {
            BKU bku = ((PendingMedia) this.A00).A10;
            C26573ELw eLw = (C26573ELw) this.A01;
            UserSession userSession = eLw.A04;
            C11630kW r5 = eLw.A02;
            String str2 = null;
            if (bku != null) {
                str = bku.A0N;
                User user = bku.A0f.A1i;
                if (user != null) {
                    str2 = user.getId();
                }
            } else {
                str = null;
            }
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, userSession), "external_share_prompt_reshare_toast_impression"), 601);
            if (AnonymousClass0wJ.A1U(A0I)) {
                if (str == null) {
                    str = "";
                }
                A0I.A0T("media_id", str);
                if (str2 != null) {
                    l = AnonymousClass0wJ.A0d(str2);
                } else {
                    l = null;
                }
                A0I.A0S("media_owner_id", l);
                C18180wK.A1C(A0I, r5);
                A0I.Bb4();
            }
        }
    }

    public IDxCBackShape137S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public IDxCBackShape137S0200000_1_I2(Activity activity, UserSession userSession, int i) {
        this.A02 = i;
        this.A01 = userSession;
        this.A00 = activity;
    }
}
