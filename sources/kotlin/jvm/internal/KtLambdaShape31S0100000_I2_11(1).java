package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape31S0100000_I2_11 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape31S0100000_I2_11(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c4, code lost:
        return X.C18240wQ.A0X(X.C18180wK.A1W((X.C18240wQ.A00(r0.getValue()) > com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (X.C18240wQ.A00(r0.getValue()) == com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02de, code lost:
        if (X.C134747yH.A02(((X.AnonymousClass7HD) r8.A00).A01) > 0) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02e0, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0321, code lost:
        if ((r3.A01 + r3.A02) <= r2) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0327, code lost:
        return java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0328, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012f, code lost:
        if (((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) X.C86104wH.A0f(r8.A00)).A00 == X.AnonymousClass68G.LOADING) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0182, code lost:
        if (r0 != null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c0, code lost:
        if (r0 != null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c2, code lost:
        r5 = r0.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0215, code lost:
        if (r1 > 0.999999f) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021d, code lost:
        return java.lang.Float.valueOf(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x009d;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00b5;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00da;
                case 6: goto L_0x00ef;
                case 7: goto L_0x00fd;
                case 8: goto L_0x0107;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x032a;
                case 12: goto L_0x0111;
                case 13: goto L_0x0118;
                case 14: goto L_0x032a;
                case 15: goto L_0x02e2;
                case 16: goto L_0x0118;
                case 17: goto L_0x0123;
                case 18: goto L_0x0005;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0133;
                case 24: goto L_0x013f;
                case 25: goto L_0x0005;
                case 26: goto L_0x014b;
                case 27: goto L_0x0189;
                case 28: goto L_0x01ca;
                case 29: goto L_0x000d;
                case 30: goto L_0x0222;
                case 31: goto L_0x022c;
                case 32: goto L_0x0005;
                case 33: goto L_0x0253;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x025e;
                case 37: goto L_0x0267;
                case 38: goto L_0x027d;
                case 39: goto L_0x0005;
                case 40: goto L_0x0298;
                case 41: goto L_0x0005;
                case 42: goto L_0x02a4;
                case 43: goto L_0x02ab;
                case 44: goto L_0x0033;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x02c5;
                case 48: goto L_0x02d4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.C18240wQ.A1G(r0)
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x000c:
            return r2
        L_0x000d:
            java.lang.Object r3 = r8.A00
            X.7A5 r3 = (X.AnonymousClass7A5) r3
            X.8pE r0 = r3.A03
            java.lang.Object r2 = r0.getValue()
            if (r2 != 0) goto L_0x000c
            X.8pE r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0349
            float r2 = r0.floatValue()
            X.8pE r0 = r3.A04
            java.lang.Object r1 = r0.getValue()
            r0 = 0
            java.lang.Object r2 = X.AnonymousClass7A5.A00(r3, r1, r2, r0)
            return r2
        L_0x0033:
            java.lang.Object r0 = r8.A00
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            java.util.List r0 = X.C147158nU.A00(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x003f:
            boolean r0 = r7.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0087
            java.lang.Object r6 = r7.next()
            r5 = r6
            X.8cc r5 = (X.AnonymousClass8cc) r5
            X.7VH r5 = (X.AnonymousClass7VH) r5
            java.lang.Object r4 = r5.A03
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "single_media"
            r3 = 0
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r0, r3)
            if (r0 != 0) goto L_0x0076
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "carousel"
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r0, r3)
            if (r0 != 0) goto L_0x0076
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "quote_post_media_preview"
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r0, r3)
            if (r0 == 0) goto L_0x003f
        L_0x0076:
            int r0 = r5.A01
            if (r0 < 0) goto L_0x003f
        L_0x007a:
            X.8cc r6 = (X.AnonymousClass8cc) r6
            if (r6 == 0) goto L_0x000c
            X.7VH r6 = (X.AnonymousClass7VH) r6
            int r0 = r6.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0087:
            r6 = r2
            goto L_0x007a
        L_0x0089:
            java.lang.Object r0 = r8.A00
            X.Ca9 r0 = (X.C22454Ca9) r0
            X.Djl r0 = r0.A00
            com.instagram.service.session.UserSession r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36322641501494727(0x810b4000001dc7, double:3.033922972858429E-306)
            java.lang.Boolean r2 = X.C63803iN.A05(r2, r3, r0)
            return r2
        L_0x009d:
            java.lang.Object r0 = r8.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.EA4 r2 = new X.EA4
            r2.<init>(r0)
            return r2
        L_0x00a7:
            java.lang.Object r0 = r8.A00
            X.4yK r0 = (X.AnonymousClass4yK) r0
            android.content.Context r1 = r0.A07
            r0 = 2131232598(0x7f080756, float:1.808131E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            return r2
        L_0x00b5:
            java.lang.Object r0 = r8.A00
            X.4yK r0 = (X.AnonymousClass4yK) r0
            android.content.Context r1 = r0.A07
            r0 = 2131230911(0x7f0800bf, float:1.8077888E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            return r2
        L_0x00c3:
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            int[] r0 = X.C29929Fwf.A06
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>(r1, r0)
            java.lang.Object r1 = r8.A00
            X.4yK r1 = (X.AnonymousClass4yK) r1
            r0 = 1
            r2.setShape(r0)
            float r0 = r1.A02
            r2.setCornerRadius(r0)
            return r2
        L_0x00da:
            java.lang.Object r2 = r8.A00
            X.4yK r2 = (X.AnonymousClass4yK) r2
            android.content.Context r1 = r2.A07
            r0 = 2131099683(0x7f060023, float:1.7811726E38)
            int r1 = r1.getColor(r0)
            int r0 = r2.A05
            X.4xP r2 = new X.4xP
            r2.<init>(r1, r0)
            return r2
        L_0x00ef:
            java.lang.Object r0 = r8.A00
            X.4yK r0 = (X.AnonymousClass4yK) r0
            android.content.Context r1 = r0.A07
            r0 = 2131230920(0x7f0800c8, float:1.8077906E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            return r2
        L_0x00fd:
            java.lang.Object r0 = r8.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.G9L r2 = new X.G9L
            r2.<init>(r0)
            return r2
        L_0x0107:
            java.lang.Object r0 = r8.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.GCt r2 = new X.GCt
            r2.<init>(r0)
            return r2
        L_0x0111:
            java.lang.Object r0 = r8.A00
            java.lang.Object r2 = X.C86104wH.A0f(r0)
            return r2
        L_0x0118:
            java.lang.Object r1 = r8.A00
            X.56Y r1 = (X.AnonymousClass56Y) r1
            r0 = 0
            r1.A0A(r0)
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0123:
            java.lang.Object r0 = r8.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r0
            java.lang.Object r1 = r0.A00
            X.68G r0 = X.AnonymousClass68G.LOADING
            if (r1 != r0) goto L_0x0328
            goto L_0x02e0
        L_0x0133:
            java.lang.Object r1 = r8.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = ""
            r1.invoke(r0)
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x013f:
            java.lang.Object r0 = r8.A00
            X.5HT r0 = (X.AnonymousClass5HT) r0
            X.0ZU r0 = r0.A03
            r0.invoke()
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x014b:
            java.lang.Object r0 = r8.A00
            X.7A5 r0 = (X.AnonymousClass7A5) r0
            X.8pE r0 = r0.A02
            java.util.Iterator r2 = X.C86114wI.A0u(r0)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0185
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
        L_0x0167:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017e
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r1 = java.lang.Math.max(r1, r0)
            goto L_0x0167
        L_0x017e:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x0185
            goto L_0x01c2
        L_0x0185:
            r5 = 2139095040(0x7f800000, float:Infinity)
            goto L_0x0219
        L_0x0189:
            java.lang.Object r0 = r8.A00
            X.7A5 r0 = (X.AnonymousClass7A5) r0
            X.8pE r0 = r0.A02
            java.util.Iterator r2 = X.C86114wI.A0u(r0)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c7
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
        L_0x01a5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r1 = java.lang.Math.min(r1, r0)
            goto L_0x01a5
        L_0x01bc:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x01c7
        L_0x01c2:
            float r5 = r0.floatValue()
            goto L_0x0219
        L_0x01c7:
            r5 = -8388608(0xffffffffff800000, float:-Infinity)
            goto L_0x0219
        L_0x01ca:
            java.lang.Object r6 = r8.A00
            X.7A5 r6 = (X.AnonymousClass7A5) r6
            X.8pE r2 = r6.A02
            java.util.Map r1 = X.C86154wM.A0t(r2)
            X.8pE r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r1)
            r5 = 0
            if (r0 == 0) goto L_0x0220
            float r4 = r0.floatValue()
        L_0x01e5:
            java.util.Map r1 = X.C86154wM.A0t(r2)
            X.4oM r0 = r6.A09
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r1)
            if (r0 == 0) goto L_0x021e
            float r3 = r0.floatValue()
        L_0x01f9:
            float r3 = r3 - r4
            float r0 = java.lang.Math.abs(r3)
            r2 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0217
            float r1 = r6.A01()
            float r1 = r1 - r4
            float r1 = r1 / r3
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0219
            r0 = 1065353199(0x3f7fffef, float:0.999999)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r5 = r1
            if (r0 <= 0) goto L_0x0219
        L_0x0217:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0219:
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            return r2
        L_0x021e:
            r3 = 0
            goto L_0x01f9
        L_0x0220:
            r4 = 0
            goto L_0x01e5
        L_0x0222:
            java.lang.Object r0 = r8.A00
            X.C18240wQ.A1G(r0)
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            return r2
        L_0x022c:
            java.lang.Object r2 = r8.A00
            X.6kr r2 = (X.C109936kr) r2
            X.8nV r1 = r2.A00
            if (r1 == 0) goto L_0x023f
            float r0 = X.AnonymousClass7GX.A02
            float r0 = r1.CxL(r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x023f:
            java.lang.String r0 = "The density on ModalBottomSheetState ("
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r2)
            java.lang.String r0 = ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0253:
            java.lang.Object r1 = r8.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 0
            X.C147368pE.A04(r1, r0)
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x025e:
            java.lang.Object r0 = r8.A00
            X.7JH r0 = (X.AnonymousClass7JH) r0
            java.lang.Object r2 = X.AnonymousClass7JH.A01(r0)
            return r2
        L_0x0267:
            java.lang.Object r0 = r8.A00
            X.6my r0 = (X.C111216my) r0
            X.8pE r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            return r2
        L_0x027d:
            java.lang.Object r0 = r8.A00
            X.5Hn r0 = (X.C89915Hn) r0
            long r2 = r0.A01
            float r0 = X.AnonymousClass7KC.A01(r2)
            int r1 = X.AnonymousClass8bA.A02(r0)
            float r0 = X.AnonymousClass7KC.A02(r2)
            int r0 = X.AnonymousClass8bA.A02(r0)
            X.7Eg r2 = X.AnonymousClass7Hh.A04(r1, r0)
            return r2
        L_0x0298:
            java.lang.Object r1 = r8.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.20g r0 = X.C302420g.Dismissed
            r1.invoke(r0)
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x02a4:
            java.lang.Object r0 = r8.A00
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r0 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r0
            X.8pE r0 = r0.A03
            goto L_0x02b1
        L_0x02ab:
            java.lang.Object r0 = r8.A00
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r0 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r0
            X.8pE r0 = r0.A04
        L_0x02b1:
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            java.lang.Boolean r2 = X.C18240wQ.A0X(r0)
            return r2
        L_0x02c5:
            android.content.Context r1 = X.C10600ic.A00
            X.C04220Ms.A06(r1)
            java.lang.Object r0 = r8.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.EAS r2 = new X.EAS
            r2.<init>(r1, r0)
            return r2
        L_0x02d4:
            java.lang.Object r0 = r8.A00
            X.7HD r0 = (X.AnonymousClass7HD) r0
            X.7yH r0 = r0.A01
            int r0 = X.C134747yH.A02(r0)
            if (r0 <= 0) goto L_0x0328
        L_0x02e0:
            r6 = 1
            goto L_0x0323
        L_0x02e2:
            java.lang.Object r0 = r8.A00
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.8nU r5 = r0.A02()
            java.util.List r0 = r5.BLp()
            int r4 = r5.BHd()
            r6 = 1
            if (r4 == 0) goto L_0x0328
            java.lang.Object r1 = X.AnonymousClass00J.A0C(r0)
            X.8cc r1 = (X.AnonymousClass8cc) r1
            java.lang.Object r3 = X.AnonymousClass00J.A0E(r0)
            X.8cc r3 = (X.AnonymousClass8cc) r3
            int r2 = r5.BLd()
            int r0 = r5.BLh()
            int r2 = r2 - r0
            X.7VH r1 = (X.AnonymousClass7VH) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0323
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0323
            X.7VH r3 = (X.AnonymousClass7VH) r3
            int r0 = r3.A00
            int r0 = r0 + 1
            if (r0 != r4) goto L_0x0323
            int r1 = r3.A01
            int r0 = r3.A02
            int r1 = r1 + r0
            if (r1 <= r2) goto L_0x0328
        L_0x0323:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            return r2
        L_0x0328:
            r6 = 0
            goto L_0x0323
        L_0x032a:
            java.lang.Object r4 = r8.A00
            X.56Y r4 = (X.AnonymousClass56Y) r4
            com.instagram.newsfeed.data.ActivityPagedData r0 = r4.A01
            if (r0 == 0) goto L_0x0346
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0346
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r2 = 0
            r0 = 33
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r1.<init>(r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
        L_0x0346:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0349:
            X.8pE r0 = r3.A04
            java.lang.Object r2 = r0.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11.invoke():java.lang.Object");
    }
}
