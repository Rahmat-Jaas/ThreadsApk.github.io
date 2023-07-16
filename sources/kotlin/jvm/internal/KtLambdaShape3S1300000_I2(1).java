package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.fbpay.logging.LoggingContext;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

public class KtLambdaShape3S1300000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S1300000_I2(LoggingContext loggingContext, Long l, String str, Map map, int i) {
        super(1);
        this.A04 = i;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case Rfc3492Idn.tmax /*26*/:
                this.A01 = loggingContext;
                this.A03 = str;
                this.A02 = l;
                this.A00 = map;
                break;
            default:
                this.A02 = loggingContext;
                this.A03 = str;
                this.A00 = l;
                this.A01 = map;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0097, code lost:
        X.AnonymousClass7Hr.A04(r4, (com.fbpay.logging.LoggingContext) r0.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        X.C86114wI.A1C(r5, r4);
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        r3.A0A(r1, r2);
        r2 = (java.lang.Long) r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r2 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r3.A09("shipping_address_id", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        X.C86114wI.A1C(r5, r3);
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        X.C86114wI.A1G(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03c1, code lost:
        if (r2 != null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03c8, code lost:
        X.C86114wI.A1C(r5, r3);
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03cd, code lost:
        X.C86114wI.A1G(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03d0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03e8, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r5 = r25
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x03e9;
                case 1: goto L_0x03d1;
                case 2: goto L_0x03a1;
                case 3: goto L_0x0082;
                case 4: goto L_0x0009;
                case 5: goto L_0x037a;
                case 6: goto L_0x0359;
                case 7: goto L_0x032d;
                case 8: goto L_0x0082;
                case 9: goto L_0x006f;
                case 10: goto L_0x0009;
                case 11: goto L_0x006f;
                case 12: goto L_0x0009;
                case 13: goto L_0x02d6;
                case 14: goto L_0x0048;
                case 15: goto L_0x0048;
                case 16: goto L_0x0032;
                case 17: goto L_0x0032;
                case 18: goto L_0x0032;
                case 19: goto L_0x0009;
                case 20: goto L_0x0082;
                case 21: goto L_0x0082;
                case 22: goto L_0x006f;
                case 23: goto L_0x006f;
                case 24: goto L_0x0009;
                case 25: goto L_0x006f;
                case 26: goto L_0x0009;
                case 27: goto L_0x0288;
                case 28: goto L_0x0238;
                case 29: goto L_0x0208;
                case 30: goto L_0x01dd;
                case 31: goto L_0x011e;
                case 32: goto L_0x00e7;
                case 33: goto L_0x0498;
                case 34: goto L_0x046a;
                case 35: goto L_0x045b;
                case 36: goto L_0x00a4;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Da r3 = new X.5Da
            r3.<init>()
            java.lang.Object r1 = r0.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.AnonymousClass7Hr.A04(r3, r1)
            java.lang.String r2 = r0.A03
            java.lang.String r1 = "view_name"
        L_0x001b:
            r3.A0A(r1, r2)
            java.lang.Object r2 = r0.A02
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0029
            java.lang.String r1 = "shipping_address_id"
            r3.A09(r1, r2)
        L_0x0029:
            X.C86114wI.A1C(r5, r3)
            java.lang.Object r0 = r0.A00
        L_0x002e:
            X.C86114wI.A1G(r5, r0)
            return r5
        L_0x0032:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DV r4 = new X.5DV
            r4.<init>()
            java.lang.String r1 = r0.A03
            X.C86124wJ.A1K(r4, r1)
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "applied_discounts"
            r4.A0B(r1, r2)
            goto L_0x0097
        L_0x0048:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            java.lang.Object r3 = r0.A02
            com.fbpay.logging.LoggingContext r3 = (com.fbpay.logging.LoggingContext) r3
            X.6BP r1 = X.AnonymousClass6BP.A00(r5, r3)
            X.C86104wH.A1G(r1, r5)
            X.5Cv r4 = new X.5Cv
            r4.<init>()
            X.C86104wH.A1K(r4, r3)
            java.lang.Object r2 = r0.A00
            X.6B4 r2 = (X.AnonymousClass6B4) r2
            java.lang.String r1 = "autofill_data_type"
            r4.A04(r2, r1)
            X.AnonymousClass7Hr.A03(r4, r3)
            java.lang.String r1 = r0.A03
            X.C86124wJ.A1K(r4, r1)
            goto L_0x009e
        L_0x006f:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Da r3 = new X.5Da
            r3.<init>()
            java.lang.Object r1 = r0.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.AnonymousClass7Hr.A04(r3, r1)
            java.lang.String r2 = r0.A03
            java.lang.String r1 = "target_name"
            goto L_0x001b
        L_0x0082:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DV r4 = new X.5DV
            r4.<init>()
            java.lang.String r1 = r0.A03
            X.C86134wK.A1G(r4, r1)
            java.lang.Object r2 = r0.A00
            X.0V3 r2 = (X.AnonymousClass0V3) r2
            java.lang.String r1 = "discount"
            r4.A06(r2, r1)
        L_0x0097:
            java.lang.Object r1 = r0.A02
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.AnonymousClass7Hr.A04(r4, r1)
        L_0x009e:
            X.C86114wI.A1C(r5, r4)
            java.lang.Object r0 = r0.A01
            goto L_0x002e
        L_0x00a4:
            X.BKU r5 = (X.BKU) r5
            java.lang.Object r6 = r0.A00
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = (com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus) r6
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            java.lang.Object r3 = r0.A02
            X.65B r3 = (X.AnonymousClass65B) r3
            if (r6 != r1) goto L_0x00e3
            X.C04220Ms.A07(r5)
            X.AnonymousClass65B.A00(r5, r3)
        L_0x00b8:
            X.C04220Ms.A07(r5)
            java.lang.Object r1 = r0.A01
            X.9CN r1 = (X.AnonymousClass9CN) r1
            java.lang.Long r2 = r1.A02
            java.lang.String r1 = java.lang.String.valueOf(r2)
            X.BKU r5 = X.C19564AyQ.A01(r5, r1)
            X.Ah2 r4 = r3.A03
            java.lang.String r7 = java.lang.String.valueOf(r2)
            X.C2W r1 = r3.A04
            java.lang.String r8 = X.C86124wJ.A0x(r1)
            java.lang.String r9 = X.C86104wH.A0t(r1, r8)
            X.C04220Ms.A0A(r9)
            java.lang.String r10 = r0.A03
            r4.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x03e6
        L_0x00e3:
            X.AnonymousClass65B.A02(r3)
            goto L_0x00b8
        L_0x00e7:
            boolean r2 = X.AnonymousClass0wJ.A1X(r5)
            java.lang.Object r4 = r0.A00
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            boolean r1 = X.AnonymousClass7GH.A01(r4)
            if (r1 == 0) goto L_0x03e6
            if (r2 == 0) goto L_0x0119
            android.content.Context r2 = r4.requireContext()
            java.lang.Object r6 = r0.A02
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r2 = X.D6X.A00(r2, r6, r1)
            X.066 r1 = r4.getViewLifecycleOwner()
            java.lang.String r7 = r0.A03
            java.lang.Object r5 = r0.A01
            r8 = 31
            kotlin.jvm.internal.KtLambdaShape3S1300000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape3S1300000_I2
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.String) r7, (int) r8)
            r2.A02(r1, r7, r3)
            goto L_0x03e6
        L_0x0119:
            X.AnonymousClass7GH.A00(r4)
            goto L_0x03e6
        L_0x011e:
            X.DZc r5 = (X.C24772DZc) r5
            r4 = 0
            X.C04220Ms.A0B(r5, r4)
            java.lang.Object r3 = r0.A00
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            boolean r1 = X.AnonymousClass7GH.A01(r3)
            if (r1 == 0) goto L_0x03e6
            java.util.List r1 = r5.A00
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0140
            X.7zm r0 = new X.7zm
            r0.<init>(r3)
            X.C63643hy.A05(r0)
            goto L_0x03e6
        L_0x0140:
            java.lang.String r6 = r0.A03
            java.lang.Object r2 = r0.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r5 = r0.A01
            X.DsH r5 = (X.C25803DsH) r5
            X.Dsp r8 = X.C25567Do3.A02(r2)
            androidx.fragment.app.FragmentActivity r7 = r3.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            r10 = 0
            X.7bS r0 = new X.7bS
            r0.<init>(r2, r1, r4)
            X.7IU r1 = X.AnonymousClass7IU.A00(r0, r7)
            java.lang.Class<X.CBN> r0 = X.CBN.class
            X.3ak r13 = r1.A01(r0)
            X.CBN r13 = (X.CBN) r13
            X.FUH r0 = X.FUH.A00
            r13.A0G(r0)
            X.9zz r9 = X.C171799zz.A0h
            android.content.Context r0 = r3.requireContext()
            int r22 = X.AnonymousClass6X8.A00(r0)
            X.D3Q r11 = X.D3Q.PRE_CAPTURE
            X.D2O r14 = X.D2O.FEED_POST
            r23 = -1
            r12 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r8.A1d(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.Dsp r0 = X.C25567Do3.A02(r2)
            r0.A27(r6)
            r8.A2N(r4)
            X.E9w r1 = X.C24094D8r.A00(r2)
            X.D1c r0 = X.C23914D1c.EDITED_SAVED_DRAFT
            r1.A01(r0)
            X.Dnq r0 = X.AnonymousClass6R5.A00(r2)
            r0.A06()
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36319811118175677(0x8108ad000215bd, double:3.032133027050423E-306)
            boolean r0 = X.C63803iN.A0E(r7, r2, r0)
            X.AhJ r7 = X.AnonymousClass3LM.A01()
            androidx.fragment.app.FragmentActivity r8 = r3.requireActivity()
            if (r0 == 0) goto L_0x01c7
            r14 = 1
            r9 = r3
            r11 = r2
            r12 = r6
            r13 = r4
            r7.A03(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x03e6
        L_0x01c7:
            X.DZC r0 = r5.A04
            if (r0 == 0) goto L_0x01db
            X.D2O r0 = r0.A08
        L_0x01cd:
            r11 = r7
            r12 = r8
            r13 = r3
            r14 = r9
            r15 = r0
            r17 = r2
            r18 = r6
            r11.A02(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03e6
        L_0x01db:
            r0 = 0
            goto L_0x01cd
        L_0x01dd:
            int r3 = X.AnonymousClass0wJ.A04(r5)
            java.lang.Object r2 = r0.A00
            X.7yH r2 = (X.C134747yH) r2
            java.lang.String r1 = "learn_more_span"
            java.util.List r1 = r2.A08(r1, r3, r3)
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r1)
            X.7HE r1 = (X.AnonymousClass7HE) r1
            if (r1 == 0) goto L_0x03e6
            java.lang.Object r3 = r1.A02
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x03e6
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            X.0i6 r1 = (X.C10300i6) r1
            java.lang.String r0 = r0.A03
            X.C63493hb.A07(r2, r1, r3, r0)
            goto L_0x03e6
        L_0x0208:
            int r3 = X.AnonymousClass0wJ.A04(r5)
            java.lang.Object r2 = r0.A00
            X.7yH r2 = (X.C134747yH) r2
            java.lang.String r1 = "learn_more_span"
            java.util.List r1 = r2.A08(r1, r3, r3)
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r1)
            X.7HE r1 = (X.AnonymousClass7HE) r1
            if (r1 == 0) goto L_0x03e6
            java.lang.Object r1 = r1.A02
            if (r1 == 0) goto L_0x03e6
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.String r2 = r0.A03
            X.9wF r1 = X.C171209wF.A0t
            X.Jpy r0 = new X.Jpy
            r0.<init>((android.content.Context) r4, (com.instagram.service.session.UserSession) r3, (X.C171209wF) r1, (java.lang.String) r2)
            r0.A04()
            goto L_0x03e6
        L_0x0238:
            X.5I9 r5 = (X.AnonymousClass5I9) r5
            r4 = 0
            X.C04220Ms.A0B(r5, r4)
            X.5I9 r1 = X.AnonymousClass5I9.A06
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x024d
            java.lang.Object r0 = r0.A01
            X.C18240wQ.A1G(r0)
            goto L_0x03e6
        L_0x024d:
            java.lang.Object r1 = r0.A00
            X.4oM r1 = (X.C81784oM) r1
            java.lang.Object r1 = r1.getValue()
            X.7Zx r1 = (X.C123917Zx) r1
            r3 = 0
            if (r1 == 0) goto L_0x0260
            X.7AO r1 = r1.A03
            if (r1 == 0) goto L_0x0260
            java.lang.String r3 = r1.A02
        L_0x0260:
            X.75c r1 = r5.A04
            java.lang.String r2 = r1.A01
            boolean r1 = X.C04220Ms.A0I(r3, r2)
            if (r1 == 0) goto L_0x0272
            X.8pE r1 = r5.A03
            r0 = 1
            X.C147368pE.A04(r1, r0)
            goto L_0x03e6
        L_0x0272:
            java.lang.String r1 = r0.A03
            boolean r1 = X.C04220Ms.A0I(r1, r2)
            java.lang.Object r0 = r0.A02
            X.7KG r0 = (X.AnonymousClass7KG) r0
            if (r1 == 0) goto L_0x0283
            X.AnonymousClass7GG.A01(r0, r5)
            goto L_0x03e6
        L_0x0283:
            X.AnonymousClass7GG.A02(r0, r5, r4)
            goto L_0x03e6
        L_0x0288:
            r3 = 0
            X.C04220Ms.A0B(r5, r3)
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            java.lang.Object r6 = r0.A01
            com.fbpay.logging.LoggingContext r6 = (com.fbpay.logging.LoggingContext) r6
            java.lang.Object r1 = r0.A00
            java.util.List r8 = X.C18180wK.A0n(r1)
            java.lang.String r9 = r0.A03
            java.lang.String r1 = "PRE_WARM"
            boolean r12 = X.C04220Ms.A0I(r9, r1)
            java.lang.Object r0 = r0.A02
            X.7DP r0 = (X.AnonymousClass7DP) r0
            java.util.LinkedHashMap r7 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x02af
            X.AnonymousClass7Kr.A0B(r0, r7)
        L_0x02af:
            java.lang.String r0 = "error_message"
            r7.put(r0, r5)
            java.lang.String r10 = "checkout"
            X.C04220Ms.A0B(r6, r3)
            r11 = 1
            r0 = 3
            X.C04220Ms.A0B(r9, r0)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_load_ecpcheckoutcomponent_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 279(0x117, float:3.91E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.KtLambdaShape0S2310000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape0S2310000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.C128957ke.A04(r0, r6, r5)
            goto L_0x03e6
        L_0x02d6:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Cp r3 = new X.5Cp
            r3.<init>()
            java.lang.Object r1 = r0.A02
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.AnonymousClass7Hr.A04(r3, r1)
            java.lang.String r6 = r0.A03
            X.C86124wJ.A1K(r3, r6)
            java.lang.String r4 = "selected_contact"
            boolean r1 = X.C04220Ms.A0I(r6, r4)
            if (r1 != 0) goto L_0x030a
            java.lang.String r1 = "nux_contact"
            boolean r1 = X.C04220Ms.A0I(r6, r1)
            if (r1 != 0) goto L_0x030a
            java.lang.String r1 = "partial_pux"
            boolean r1 = X.C04220Ms.A0I(r6, r1)
            if (r1 != 0) goto L_0x030a
            X.6B8 r2 = X.AnonymousClass7Kr.A02(r6)
            java.lang.String r1 = "contact_type"
            r3.A04(r2, r1)
        L_0x030a:
            java.lang.String r1 = "edit_email"
            boolean r1 = X.C04220Ms.A0I(r6, r1)
            if (r1 != 0) goto L_0x0320
            java.lang.String r1 = "edit_phone"
            boolean r1 = X.C04220Ms.A0I(r6, r1)
            if (r1 != 0) goto L_0x0320
            boolean r1 = X.C04220Ms.A0I(r6, r4)
            if (r1 == 0) goto L_0x03c8
        L_0x0320:
            java.lang.Object r2 = r0.A00
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x03c8
            java.lang.String r1 = "contact_id"
            r3.A09(r1, r2)
            goto L_0x03c8
        L_0x032d:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5Da r3 = new X.5Da
            r3.<init>()
            java.lang.Object r1 = r0.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.AnonymousClass7Hr.A04(r3, r1)
            java.lang.String r2 = r0.A03
            X.C86134wK.A1G(r3, r2)
            java.lang.String r1 = "add_shipping_info"
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 != 0) goto L_0x0353
            java.lang.Object r2 = r0.A02
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0353
            java.lang.String r1 = "shipping_address_id"
            r3.A09(r1, r2)
        L_0x0353:
            X.C86114wI.A1C(r5, r3)
            java.lang.Object r0 = r0.A00
            goto L_0x03cd
        L_0x0359:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5DV r3 = new X.5DV
            r3.<init>()
            java.lang.String r1 = r0.A03
            X.C86134wK.A1G(r3, r1)
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "applied_discounts"
            r3.A0B(r1, r2)
            java.lang.Object r1 = r0.A02
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.C86104wH.A1K(r3, r1)
            X.5Cb r2 = X.AnonymousClass7Hr.A00(r1)
            goto L_0x03c3
        L_0x037a:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            java.lang.Object r4 = r0.A02
            com.fbpay.logging.LoggingContext r4 = (com.fbpay.logging.LoggingContext) r4
            X.6BP r1 = X.AnonymousClass6BP.A00(r5, r4)
            X.C86104wH.A1G(r1, r5)
            X.5Cv r3 = new X.5Cv
            r3.<init>()
            X.C86104wH.A1K(r3, r4)
            java.lang.Object r2 = r0.A00
            X.6B4 r2 = (X.AnonymousClass6B4) r2
            java.lang.String r1 = "autofill_data_type"
            r3.A04(r2, r1)
            X.AnonymousClass7Hr.A03(r3, r4)
            java.lang.String r1 = r0.A03
            X.C86134wK.A1G(r3, r1)
            goto L_0x03c8
        L_0x03a1:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r5
            X.5D9 r3 = new X.5D9
            r3.<init>()
            java.lang.Object r4 = r0.A02
            com.fbpay.logging.LoggingContext r4 = (com.fbpay.logging.LoggingContext) r4
            X.C86104wH.A1K(r3, r4)
            java.lang.String r1 = r0.A03
            X.C86124wJ.A1K(r3, r1)
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "address_fields"
            r3.A0B(r1, r2)
            X.5Cb r2 = X.AnonymousClass7Hr.A00(r4)
            if (r2 == 0) goto L_0x03c8
        L_0x03c3:
            java.lang.String r1 = "logging_policy"
            r3.A06(r2, r1)
        L_0x03c8:
            X.C86114wI.A1C(r5, r3)
            java.lang.Object r0 = r0.A01
        L_0x03cd:
            X.C86114wI.A1G(r5, r0)
            return r5
        L_0x03d1:
            X.8mi r4 = X.C86104wH.A0N(r5)
            java.lang.Object r3 = r0.A02
            X.Lbs r3 = (X.C40289Lbs) r3
            java.lang.String r2 = r0.A03
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A00
            java.util.Map r0 = (java.util.Map) r0
            r4.Cww(r3, r2, r1, r0)
        L_0x03e6:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x03e9:
            java.lang.Object r3 = r0.A01
            java.lang.Object r2 = r0.A02
            java.lang.Object r4 = r0.A00
            X.8lb r4 = (X.C146078lb) r4
            r1 = 5
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r2 = X.C86154wM.A15(r4, r2, r3, r1)
            java.lang.Object r3 = r2.invoke()
            if (r3 == 0) goto L_0x044d
            boolean r1 = r4.ABk(r3)
            if (r1 != 0) goto L_0x044d
            boolean r0 = r3 instanceof X.C147328pA
            if (r0 == 0) goto L_0x042f
            X.8pA r3 = (X.C147328pA) r3
            r0 = r3
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = (androidx.compose.runtime.ParcelableSnapshotMutableState) r0
            X.8fh r2 = r0.A01
            X.7WP r1 = X.AnonymousClass7WP.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>"
            X.C04220Ms.A0C(r1, r0)
            if (r2 == r1) goto L_0x0439
            X.7WR r1 = X.AnonymousClass7WR.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.C04220Ms.A0C(r1, r0)
            if (r2 == r1) goto L_0x0439
            X.7WQ r1 = X.AnonymousClass7WQ.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>"
            X.C04220Ms.A0C(r1, r0)
            if (r2 == r1) goto L_0x0439
            java.lang.String r0 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"
        L_0x042a:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x042f:
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            r1.append(r3)
            java.lang.String r0 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."
            goto L_0x0448
        L_0x0439:
            java.lang.String r0 = "MutableState containing "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.Object r0 = r3.getValue()
            r1.append(r0)
            java.lang.String r0 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."
        L_0x0448:
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            goto L_0x042a
        L_0x044d:
            java.lang.String r0 = r0.A03
            X.8fi r1 = r4.CaL(r0, r2)
            r0 = 9
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r5 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r5.<init>(r1, r0)
            return r5
        L_0x045b:
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            r0 = 746(0x2ea, float:1.045E-42)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x046a:
            r8 = 0
            X.C04220Ms.A0B(r5, r8)
            java.lang.Object r1 = r0.A00
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r0.A03
            java.io.File r1 = X.C86144wL.A0Z(r0)
            X.Gbr r0 = new X.Gbr
            r0.<init>(r1, r2, r3, r4, r6, r8)
            r0 = 745(0x2e9, float:1.044E-42)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0498:
            r1 = 0
            X.C04220Ms.A0B(r5, r1)
            java.lang.String r0 = r0.A03
            java.lang.CharSequence r0 = X.AnonymousClass8bP.A0L(r0)
            r0.toString()
            java.lang.String r0 = "sendMessage"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape3S1300000_I2.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S1300000_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        super(1);
        this.A04 = i;
        this.A00 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
