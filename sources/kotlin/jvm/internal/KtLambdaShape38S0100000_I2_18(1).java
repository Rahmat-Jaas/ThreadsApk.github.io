package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape38S0100000_I2_18 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape38S0100000_I2_18(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e1, code lost:
        return X.C63803iN.A05(X.C18180wK.A0J(r3), r3, 36320670112553116L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r3.getBoolean(X.AnonymousClass000.A00(r0), r1) != r2) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0118, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x008a;
                case 2: goto L_0x008d;
                case 3: goto L_0x0005;
                case 4: goto L_0x02a8;
                case 5: goto L_0x0094;
                case 6: goto L_0x02a8;
                case 7: goto L_0x02a8;
                case 8: goto L_0x000e;
                case 9: goto L_0x00a4;
                case 10: goto L_0x008a;
                case 11: goto L_0x008d;
                case 12: goto L_0x0005;
                case 13: goto L_0x00ad;
                case 14: goto L_0x00c3;
                case 15: goto L_0x00ce;
                case 16: goto L_0x02a8;
                case 17: goto L_0x008a;
                case 18: goto L_0x008d;
                case 19: goto L_0x0005;
                case 20: goto L_0x00e2;
                case 21: goto L_0x00f0;
                case 22: goto L_0x00fd;
                case 23: goto L_0x008a;
                case 24: goto L_0x008d;
                case 25: goto L_0x0005;
                case 26: goto L_0x011a;
                case 27: goto L_0x02a8;
                case 28: goto L_0x0128;
                case 29: goto L_0x008a;
                case 30: goto L_0x008d;
                case 31: goto L_0x0005;
                case 32: goto L_0x02a8;
                case 33: goto L_0x0138;
                case 34: goto L_0x0143;
                case 35: goto L_0x0153;
                case 36: goto L_0x01dc;
                case 37: goto L_0x0232;
                case 38: goto L_0x0027;
                case 39: goto L_0x0243;
                case 40: goto L_0x003a;
                case 41: goto L_0x025c;
                case 42: goto L_0x026d;
                case 43: goto L_0x02a8;
                case 44: goto L_0x028c;
                case 45: goto L_0x02a8;
                case 46: goto L_0x02a8;
                case 47: goto L_0x0051;
                case 48: goto L_0x02a8;
                case 49: goto L_0x02a8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r4 = X.C18180wK.A0H(r0)
        L_0x000d:
            return r4
        L_0x000e:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            r0 = 308(0x134, float:4.32E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r4 = r1.getParcelable(r0)
            if (r4 != 0) goto L_0x000d
            java.lang.String r0 = "BrandedContentDisclosureArgs not provided, please use newInstance method to set arguments"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0027:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "entry_point"
            java.lang.String r4 = r1.getString(r0)
            if (r4 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x003a:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            r0 = 567(0x237, float:7.95E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            if (r4 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0051:
            java.lang.Object r1 = r10.A00
            X.1Y3 r1 = (X.AnonymousClass1Y3) r1
            X.0Oa r0 = r1.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.Dnj r2 = X.AnonymousClass6VR.A00(r0)
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "user_id"
            java.lang.String r0 = r1.getString(r0)
            com.instagram.user.model.User r4 = r2.A03(r0)
            if (r4 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0074:
            java.lang.Object r4 = r10.A00
            X.60V r4 = (X.AnonymousClass60V) r4
            com.instagram.service.session.UserSession r3 = r4.A04
            X.IcN r2 = r4.A02
            r0 = -1
            X.7wk r1 = new X.7wk
            r1.<init>(r2, r0)
            X.0kW r0 = r4.A03
            X.DeI r4 = new X.DeI
            r4.<init>(r0, r1, r3)
            return r4
        L_0x008a:
            java.lang.Object r4 = r10.A00
            return r4
        L_0x008d:
            java.lang.Object r0 = r10.A00
            java.lang.Object r4 = X.C86144wL.A0j(r0)
            return r4
        L_0x0094:
            java.lang.Object r0 = r10.A00
            X.CUa r0 = (X.C22319CUa) r0
            X.0Oa r0 = r0.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.7aq r4 = new X.7aq
            r4.<init>(r0)
            return r4
        L_0x00a4:
            java.lang.Object r0 = r10.A00
            X.CR9 r0 = (X.CR9) r0
            com.instagram.service.session.UserSession r3 = r0.A08()
            goto L_0x00d4
        L_0x00ad:
            java.lang.Object r2 = r10.A00
            X.CUy r2 = (X.C22334CUy) r2
            com.instagram.service.session.UserSession r1 = r2.A08()
            X.0Oa r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs r0 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs) r0
            X.7bR r4 = new X.7bR
            r4.<init>(r0, r2, r1)
            return r4
        L_0x00c3:
            java.lang.Object r1 = r10.A00
            X.CBO r1 = (X.CBO) r1
            r0 = 0
            X.CBO.A01(r1, r0)
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x00ce:
            java.lang.Object r0 = r10.A00
            X.CBO r0 = (X.CBO) r0
            com.instagram.service.session.UserSession r3 = r0.A04
        L_0x00d4:
            X.0TJ r2 = X.C18180wK.A0J(r3)
            r0 = 36320670112553116(0x8109750010189c, double:3.032676258553608E-306)
            java.lang.Boolean r4 = X.C63803iN.A05(r2, r3, r0)
            return r4
        L_0x00e2:
            java.lang.Object r0 = r10.A00
            X.CUY r0 = (X.CUY) r0
            com.instagram.service.session.UserSession r0 = r0.A03()
            X.7as r4 = new X.7as
            r4.<init>(r0)
            return r4
        L_0x00f0:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r3 = r0.mArguments
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0118
            r0 = 383(0x17f, float:5.37E-43)
            goto L_0x0109
        L_0x00fd:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r3 = r0.mArguments
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0118
            r0 = 955(0x3bb, float:1.338E-42)
        L_0x0109:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.getBoolean(r0, r1)
            if (r0 != r2) goto L_0x0118
        L_0x0113:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L_0x0118:
            r2 = 0
            goto L_0x0113
        L_0x011a:
            java.lang.Object r0 = r10.A00
            X.CUY r0 = (X.CUY) r0
            com.instagram.service.session.UserSession r0 = r0.A03()
            X.7ar r4 = new X.7ar
            r4.<init>(r0)
            return r4
        L_0x0128:
            java.lang.Object r0 = r10.A00
            X.1be r0 = (X.C22941be) r0
            X.0Oa r0 = r0.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.CDB r4 = new X.CDB
            r4.<init>(r0)
            return r4
        L_0x0138:
            java.lang.Object r0 = r10.A00
            X.1be r0 = (X.C22941be) r0
            X.0ZU r0 = r0.A01
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x0143:
            java.lang.Object r1 = r10.A00
            X.1be r1 = (X.C22941be) r1
            X.0Oa r0 = r1.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.7bE r4 = new X.7bE
            r4.<init>(r1, r0)
            return r4
        L_0x0153:
            X.0Ok r1 = X.C06810aP.A01
            java.lang.Object r5 = r10.A00
            X.1bP r5 = (X.AnonymousClass1bP) r5
            X.0Oa r2 = r5.A02
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r0.A3a()
            if (r0 != 0) goto L_0x01d4
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x01d4
            r0 = 1
            r5.A00 = r0
            r0 = 858(0x35a, float:1.202E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.1o2 r0 = X.AnonymousClass1o2.A01(r0)
            r0.A06()
            X.C62883b4.A01()
            android.content.Context r1 = r5.requireContext()
            java.lang.Class<com.instagram.business.activity.BusinessConversionActivity> r0 = com.instagram.business.activity.BusinessConversionActivity.class
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r1, r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            java.lang.String r1 = r0.token
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            kotlin.Pair r6 = X.C18180wK.A0p(r0, r1)
            r2 = 0
            java.lang.String r1 = "entry_point"
            r0 = 854(0x356, float:1.197E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            kotlin.Pair r3 = X.C18180wK.A0p(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 79
            java.lang.String r0 = X.C18170wI.A00(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r6, r3, r2, r0}
            android.os.Bundle r0 = X.C98316Fa.A00(r0)
            r4.putExtras(r0)
            r0 = 16
            X.C10650ih.A0E(r4, r5, r0)
        L_0x01d1:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x01d4:
            X.0m7 r0 = r5.getParentFragmentManager()
            r0.A0d()
            goto L_0x01d1
        L_0x01dc:
            java.lang.Object r6 = r10.A00
            X.5x7 r6 = (X.AnonymousClass5x7) r6
            android.content.Context r0 = r6.requireContext()
            X.AgL r2 = X.C150388wA.A00(r0)
            android.content.Context r4 = r6.requireContext()
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            X.0Oa r0 = r6.A0A
            com.instagram.service.session.UserSession r8 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r6.A05
            java.lang.String r9 = X.C86114wI.A0r(r0)
            X.60V r3 = new X.60V
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A01(r3)
            X.9Xk r0 = new X.9Xk
            r0.<init>()
            r2.A01(r0)
            X.60A r0 = new X.60A
            r0.<init>()
            r2.A01(r0)
            android.content.Context r1 = r6.requireContext()
            X.60H r0 = new X.60H
            r0.<init>(r1)
            r2.A01(r0)
            android.content.Context r1 = r6.requireContext()
            X.60R r0 = new X.60R
            r0.<init>(r1, r6)
            r2.A01(r0)
            X.8wA r4 = r2.A00()
            return r4
        L_0x0232:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            r0 = 787(0x313, float:1.103E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x0243:
            java.lang.Object r2 = r10.A00
            X.5x7 r2 = (X.AnonymousClass5x7) r2
            X.0Oa r0 = r2.A0A
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.Awj r1 = X.C19462Awj.A01(r0)
            X.0Oa r0 = r2.A07
            java.lang.String r0 = X.C18200wM.A0q(r0)
            X.BKU r4 = r1.A05(r0)
            return r4
        L_0x025c:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            r0 = 58
            java.lang.String r0 = X.I17.A00(r0)
            android.os.Parcelable r4 = r1.getParcelable(r0)
            return r4
        L_0x026d:
            java.lang.Object r2 = r10.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.os.Bundle r0 = r2.requireArguments()
            java.lang.String r1 = "notification_type"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x028a
            android.os.Bundle r0 = r2.requireArguments()
            int r0 = r0.getInt(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x028a:
            r4 = 0
            return r4
        L_0x028c:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "ad_detail"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x02a3
            X.MMo r0 = X.C18180wK.A0L(r0)
            X.6mg r4 = X.AnonymousClass6P8.parseFromJson(r0)
            return r4
        L_0x02a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x02a8:
            X.0RG r1 = X.AnonymousClass0RA.A0C
            java.lang.Object r0 = r10.A00
            android.os.Bundle r0 = X.C18230wP.A0D(r0)
            com.instagram.service.session.UserSession r4 = r1.A06(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18.invoke():java.lang.Object");
    }
}
