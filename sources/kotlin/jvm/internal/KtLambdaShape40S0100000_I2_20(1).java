package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape40S0100000_I2_20 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape40S0100000_I2_20(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
        if (r2.getBoolean(r0) != r1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0124, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bf, code lost:
        return java.lang.Boolean.valueOf(X.C18240wQ.A1S(r0, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x003c;
                case 2: goto L_0x000e;
                case 3: goto L_0x0052;
                case 4: goto L_0x0069;
                case 5: goto L_0x0079;
                case 6: goto L_0x001d;
                case 7: goto L_0x008d;
                case 8: goto L_0x00a3;
                case 9: goto L_0x00ad;
                case 10: goto L_0x00b7;
                case 11: goto L_0x00c1;
                case 12: goto L_0x00cb;
                case 13: goto L_0x00cb;
                case 14: goto L_0x00d7;
                case 15: goto L_0x00e8;
                case 16: goto L_0x00fe;
                case 17: goto L_0x010a;
                case 18: goto L_0x0126;
                case 19: goto L_0x0129;
                case 20: goto L_0x0005;
                case 21: goto L_0x0132;
                case 22: goto L_0x0129;
                case 23: goto L_0x0005;
                case 24: goto L_0x014e;
                case 25: goto L_0x0164;
                case 26: goto L_0x017f;
                case 27: goto L_0x0188;
                case 28: goto L_0x0194;
                case 29: goto L_0x019b;
                case 30: goto L_0x0194;
                case 31: goto L_0x019b;
                case 32: goto L_0x01a6;
                case 33: goto L_0x01af;
                case 34: goto L_0x0126;
                case 35: goto L_0x0129;
                case 36: goto L_0x0005;
                case 37: goto L_0x01c0;
                case 38: goto L_0x0126;
                case 39: goto L_0x0129;
                case 40: goto L_0x0005;
                case 41: goto L_0x01d0;
                case 42: goto L_0x01e0;
                case 43: goto L_0x01ea;
                case 44: goto L_0x01fb;
                case 45: goto L_0x020c;
                case 46: goto L_0x021d;
                case 47: goto L_0x022e;
                case 48: goto L_0x0239;
                case 49: goto L_0x024b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r3 = X.C18180wK.A0H(r0)
        L_0x000d:
            return r3
        L_0x000e:
            java.lang.Object r0 = r14.A00
            android.app.Activity r0 = (android.app.Activity) r0
            android.os.Bundle r3 = X.C18190wL.A0C(r0)
            if (r3 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x001d:
            java.lang.Object r0 = r14.A00
            android.app.Activity r0 = (android.app.Activity) r0
            android.os.Bundle r3 = X.C18190wL.A0C(r0)
            if (r3 != 0) goto L_0x000d
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x002c:
            java.lang.Object r0 = r14.A00
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0Oa r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            java.lang.String r1 = "sign_up_suma_entry"
            goto L_0x01b7
        L_0x003c:
            X.0RG r1 = X.AnonymousClass0RA.A0C
            java.lang.Object r0 = r14.A00
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0Oa r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.C04220Ms.A06(r0)
            X.0i6 r3 = r1.A02(r0)
            return r3
        L_0x0052:
            java.lang.Object r2 = r14.A00
            com.instagram.business.activity.BusinessConversionActivity r2 = (com.instagram.business.activity.BusinessConversionActivity) r2
            X.0Oa r0 = r2.A0E
            java.lang.Object r1 = r0.getValue()
            X.33f r1 = (X.C554433f) r1
            X.3Db r0 = new X.3Db
            r0.<init>()
            X.3GN r3 = new X.3GN
            r3.<init>(r2, r2, r0, r1)
            return r3
        L_0x0069:
            java.lang.Object r0 = r14.A00
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0Oa r0 = r0.A0A
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.33f r3 = new X.33f
            r3.<init>(r0)
            return r3
        L_0x0079:
            java.lang.Object r0 = r14.A00
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "EXTRA_DISABLE_ACTIVITY_TRANSITION_ANIMATION"
            r0 = 0
            boolean r0 = r2.getBooleanExtra(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x008d:
            X.0RG r1 = X.AnonymousClass0RA.A0C
            java.lang.Object r0 = r14.A00
            com.instagram.business.activity.FbConnectPageActivity r0 = (com.instagram.business.activity.FbConnectPageActivity) r0
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.C04220Ms.A06(r0)
            com.instagram.service.session.UserSession r3 = r1.A06(r0)
            return r3
        L_0x00a3:
            java.lang.Object r0 = r14.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.Jjm r3 = new X.Jjm
            r3.<init>(r0)
            return r3
        L_0x00ad:
            java.lang.Object r0 = r14.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.49p r3 = new X.49p
            r3.<init>(r0)
            return r3
        L_0x00b7:
            java.lang.Object r0 = r14.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.KKH r3 = new X.KKH
            r3.<init>(r0)
            return r3
        L_0x00c1:
            java.lang.Object r0 = r14.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.49o r3 = new X.49o
            r3.<init>(r0)
            return r3
        L_0x00cb:
            java.lang.Object r0 = r14.A00
            X.JmP r0 = (X.C37202JmP) r0
            java.util.List r0 = r0.A04
            r0.clear()
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x00d7:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x00e6
            java.lang.String r0 = "coupon_offer_id"
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x00e6:
            r3 = 0
            return r3
        L_0x00e8:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x00f9
            java.lang.String r0 = "entry_point"
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L_0x00f9
            return r3
        L_0x00f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00fe:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x0124
            java.lang.String r0 = "is_ctwa_coupon_aymt"
            goto L_0x0119
        L_0x010a:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x0124
            r0 = 273(0x111, float:3.83E-43)
            java.lang.String r0 = X.I17.A00(r0)
        L_0x0119:
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r1) goto L_0x0124
        L_0x011f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L_0x0124:
            r1 = 0
            goto L_0x011f
        L_0x0126:
            java.lang.Object r3 = r14.A00
            return r3
        L_0x0129:
            java.lang.Object r0 = r14.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x0132:
            java.lang.Object r0 = r14.A00
            X.CRO r0 = (X.CRO) r0
            X.0Oa r0 = r0.A06
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.FEED
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.REEL
            com.instagram.model.mediatype.ProductType[] r0 = new com.instagram.model.mediatype.ProductType[]{r1, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            X.3xH r3 = new X.3xH
            r3.<init>(r2, r0)
            return r3
        L_0x014e:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x015f
            java.lang.String r0 = "media_picker_tab_position"
            java.lang.Integer r3 = X.C18210wN.A0T(r1, r0)
            if (r3 == 0) goto L_0x015f
            return r3
        L_0x015f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0164:
            java.lang.Object r5 = r14.A00
            X.CTB r5 = (X.CTB) r5
            android.content.Context r4 = r5.requireContext()
            X.0Oa r0 = r5.A0A
            com.instagram.service.session.UserSession r7 = X.AnonymousClass0wJ.A0X(r0)
            r6 = 0
            r9 = 1
            r10 = 0
            X.9sx r3 = new X.9sx
            r8 = r6
            r11 = r9
            r12 = r10
            r13 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x017f:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.requireParentFragment()
            return r3
        L_0x0188:
            java.lang.Object r0 = r14.A00
            X.CaY r0 = (X.C22479CaY) r0
            com.instagram.service.session.UserSession r0 = r0.A03
            X.Ac1 r3 = new X.Ac1
            r3.<init>(r0)
            return r3
        L_0x0194:
            java.lang.Object r0 = r14.A00
            X.06B r3 = X.C18230wP.A0K(r0)
            return r3
        L_0x019b:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            X.8nS r3 = r0.getDefaultViewModelProviderFactory()
            return r3
        L_0x01a6:
            java.lang.Object r0 = r14.A00
            android.os.Bundle r0 = X.C18230wP.A0D(r0)
            java.lang.String r1 = "ARG_DISABLE_BACK_BUTTON"
            goto L_0x01b7
        L_0x01af:
            java.lang.Object r0 = r14.A00
            android.os.Bundle r0 = X.C18230wP.A0D(r0)
            java.lang.String r1 = "ARG_POP_TO_SELF_PROFILE_WHEN_DONE"
        L_0x01b7:
            boolean r0 = X.C18240wQ.A1S(r0, r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x01c0:
            java.lang.Object r0 = r14.A00
            X.1Za r0 = (X.C22681Za) r0
            X.0Oa r0 = r0.A02
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3wn r3 = new X.3wn
            r3.<init>(r0)
            return r3
        L_0x01d0:
            java.lang.Object r0 = r14.A00
            X.1ZD r0 = (X.AnonymousClass1ZD) r0
            X.0Oa r0 = r0.A00
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3wo r3 = new X.3wo
            r3.<init>(r0)
            return r3
        L_0x01e0:
            java.lang.Object r0 = r14.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.3BI r3 = new X.3BI
            r3.<init>(r0)
            return r3
        L_0x01ea:
            java.lang.Object r2 = r14.A00
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            X.3I4 r0 = new X.3I4
            r0.<init>(r2, r1)
            X.42P r3 = new X.42P
            r3.<init>(r0, r2)
            return r3
        L_0x01fb:
            java.lang.Object r2 = r14.A00
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            X.3I4 r0 = new X.3I4
            r0.<init>(r2, r1)
            X.42Q r3 = new X.42Q
            r3.<init>(r0, r2)
            return r3
        L_0x020c:
            java.lang.Object r2 = r14.A00
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Integer r1 = X.AnonymousClass006.A00
            X.3I4 r0 = new X.3I4
            r0.<init>(r2, r1)
            X.42R r3 = new X.42R
            r3.<init>(r0, r2)
            return r3
        L_0x021d:
            java.lang.Object r2 = r14.A00
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Integer r1 = X.AnonymousClass006.A01
            X.3I4 r0 = new X.3I4
            r0.<init>(r2, r1)
            X.42S r3 = new X.42S
            r3.<init>(r0, r2)
            return r3
        L_0x022e:
            java.lang.Object r0 = r14.A00
            X.37f r0 = (X.C564437f) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            X.3aR r3 = X.AnonymousClass2KC.A00(r0)
            return r3
        L_0x0239:
            java.lang.Object r0 = r14.A00
            X.37f r0 = (X.C564437f) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.46a r0 = X.C689346a.A00
            r1.CWx(r0)
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x024b:
            java.lang.Object r0 = r14.A00
            X.3I4 r0 = (X.AnonymousClass3I4) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            X.3aR r3 = X.AnonymousClass2KC.A00(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20.invoke():java.lang.Object");
    }
}
