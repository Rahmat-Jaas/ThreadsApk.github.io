package com.facebook.redex;

import X.C83234r0;

public class IDxFCollectorShape20S1200000_1_I2 implements C83234r0 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxFCollectorShape20S1200000_1_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        X.AnonymousClass0OU.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        r0 = X.C25641DpK.A00(r9, r0, r3);
        r5.A00 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r4.emit(r0, r5) != r6) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0165, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r9, X.C146958n9 r10) {
        /*
            r8 = this;
            int r0 = r8.A03
            switch(r0) {
                case 0: goto L_0x0153;
                case 1: goto L_0x009c;
                case 2: goto L_0x0048;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 40
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7.A00(r3, r10)
            if (r0 == 0) goto L_0x002b
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r7) goto L_0x0074
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x002b:
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7
            r5.<init>(r8, r10, r3)
            goto L_0x001b
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r4 = r8.A01
            X.4r0 r4 = (X.C83234r0) r4
            X.6Pk r9 = (X.C100976Pk) r9
            java.lang.Object r2 = r8.A00
            java.lang.String r1 = r8.A02
            r0 = 44
            kotlin.jvm.internal.KtLambdaShape6S1100000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape6S1100000_I2
            r3.<init>(r1, r2, r0)
            java.lang.String r0 = "Unable to update room."
            goto L_0x008f
        L_0x0048:
            r3 = 38
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7.A00(r3, r10)
            if (r0 == 0) goto L_0x006e
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x005e:
            java.lang.Object r1 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 == r7) goto L_0x0074
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x006e:
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7
            r5.<init>(r8, r10, r3)
            goto L_0x005e
        L_0x0074:
            X.AnonymousClass0OU.A00(r1)
            goto L_0x0163
        L_0x0079:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r4 = r8.A01
            X.4r0 r4 = (X.C83234r0) r4
            X.6Pk r9 = (X.C100976Pk) r9
            java.lang.Object r2 = r8.A00
            java.lang.String r1 = r8.A02
            r0 = 43
            kotlin.jvm.internal.KtLambdaShape6S1100000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape6S1100000_I2
            r3.<init>(r1, r2, r0)
            java.lang.String r0 = "Unable to resolve link."
        L_0x008f:
            X.DCa r0 = X.C25641DpK.A00(r9, r0, r3)
            r5.A00 = r7
            java.lang.Object r0 = r4.emit(r0, r5)
            if (r0 != r6) goto L_0x0163
            return r6
        L_0x009c:
            X.2OF r9 = (X.AnonymousClass2OF) r9
            X.1pe r0 = X.C25911pe.A00
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r5 = r8.A01
            X.1bS r5 = (X.AnonymousClass1bS) r5
            X.0Oa r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r0 = (com.instagram.fanclub.gifting.FanClubGiftingViewModel) r0
            java.lang.Object r3 = r8.A00
            java.lang.String r2 = r8.A02
            X.490 r0 = r0.A01
            java.util.Map r1 = r0.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r3, r2)
            r1.remove(r0)
            X.C18220wO.A18(r5)
            X.0Oa r0 = r5.A04
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.C18180wK.A06()
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.AnonymousClass3W9.A02(r2, r0)
            X.0Oa r0 = r5.A02
            java.lang.String r1 = X.C18200wM.A0q(r0)
            java.lang.String r0 = "recipient_user_id"
            r2.putString(r0, r1)
            X.0Oa r0 = r5.A01
            java.lang.String r1 = X.C18200wM.A0q(r0)
            java.lang.String r0 = "origin"
            r2.putString(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r0 = "fan_club_gifting_sent"
            X.3iT r1 = X.C63863iT.A05(r1, r2, r4, r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            r1.A0I(r0)
            goto L_0x0163
        L_0x00ff:
            boolean r0 = r9 instanceof X.C25871pa
            if (r0 == 0) goto L_0x0163
            X.1pa r9 = (X.C25871pa) r9
            X.Lbs r1 = r9.A00
            X.Lbs r0 = X.C40289Lbs.SERVER_QUOTING_FAILED
            if (r1 != r0) goto L_0x012e
            java.lang.Object r3 = r8.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r3)
            r0 = 2131836069(0x7f113ca5, float:1.9305294E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A02 = r0
            r0 = 2131827116(0x7f1119ac, float:1.9287136E38)
            X.C18230wP.A1B(r3, r2, r0)
            r1 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 63
        L_0x0127:
            X.C18180wK.A1O(r2, r3, r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
            goto L_0x0163
        L_0x012e:
            X.Lbs r0 = X.C40289Lbs.USER_CANCELLED_PAYMENT
            if (r1 == r0) goto L_0x0163
            X.Lbs r0 = X.C40289Lbs.USER_PAYMENT_FAILED
            if (r1 == r0) goto L_0x0163
            java.lang.Object r3 = r8.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r3)
            r0 = 2131827118(0x7f1119ae, float:1.928714E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A02 = r0
            r0 = 2131827117(0x7f1119ad, float:1.9287138E38)
            X.C18230wP.A1B(r3, r2, r0)
            r1 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 64
            goto L_0x0127
        L_0x0153:
            X.1pf r0 = X.C25921pf.A00
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0166
            java.lang.Object r1 = r8.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.22o r0 = X.C307022o.SUBSCRIBE_IN_PROGRESS
            r1.A02 = r0
        L_0x0163:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x0166:
            X.1pc r0 = X.C25891pc.A00
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x0163
            X.1pd r0 = X.C25901pd.A00
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            r1 = 1
            if (r0 != 0) goto L_0x01a7
            X.1pb r0 = X.C25881pb.A00
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r9 instanceof X.C25871pa
            if (r0 != 0) goto L_0x01a7
            X.1pe r0 = X.C25911pe.A00
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0163
            java.lang.Object r2 = r8.A00
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r2.A2e(r1)
        L_0x0192:
            java.lang.Object r1 = r8.A01
            X.490 r1 = (X.AnonymousClass490) r1
            com.instagram.service.session.UserSession r0 = r1.A01
            r2.A1t(r0)
            java.util.Map r1 = r1.A02
            java.lang.String r0 = r8.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r2, r0)
            r1.remove(r0)
            goto L_0x0163
        L_0x01a7:
            java.lang.Object r2 = r8.A00
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r2.A1f()
            goto L_0x0192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape20S1200000_1_I2.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
