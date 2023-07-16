package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape77S0100000_I2_57 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape77S0100000_I2_57(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        X.C147368pE.A04(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016c, code lost:
        if (X.AnonymousClass0wJ.A04(r2.A03.getValue()) == X.AnonymousClass0wJ.A04(r2.A01.getValue())) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017d, code lost:
        if (r0 != 0) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0184, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0185, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0201, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 1: goto L_0x019a;
                case 2: goto L_0x018d;
                case 3: goto L_0x01f7;
                case 4: goto L_0x0187;
                case 5: goto L_0x0187;
                case 6: goto L_0x016f;
                case 7: goto L_0x0154;
                case 8: goto L_0x01d3;
                case 9: goto L_0x0141;
                case 10: goto L_0x0130;
                case 11: goto L_0x012d;
                case 12: goto L_0x0126;
                case 13: goto L_0x0005;
                case 14: goto L_0x011c;
                case 15: goto L_0x0112;
                case 16: goto L_0x0187;
                case 17: goto L_0x0108;
                case 18: goto L_0x00d4;
                case 19: goto L_0x00ff;
                case 20: goto L_0x00f6;
                case 21: goto L_0x00ed;
                case 22: goto L_0x00e4;
                case 23: goto L_0x00da;
                case 24: goto L_0x00d4;
                case 25: goto L_0x0187;
                case 26: goto L_0x00c4;
                case 27: goto L_0x012d;
                case 28: goto L_0x0126;
                case 29: goto L_0x0005;
                case 30: goto L_0x00bb;
                case 31: goto L_0x009c;
                case 32: goto L_0x0095;
                case 33: goto L_0x012d;
                case 34: goto L_0x0126;
                case 35: goto L_0x0005;
                case 36: goto L_0x0088;
                case 37: goto L_0x004e;
                case 38: goto L_0x0045;
                case 39: goto L_0x0045;
                case 40: goto L_0x0045;
                case 41: goto L_0x003b;
                case 42: goto L_0x012d;
                case 43: goto L_0x0126;
                case 44: goto L_0x0005;
                case 45: goto L_0x0088;
                case 46: goto L_0x002b;
                case 47: goto L_0x000e;
                case 48: goto L_0x0088;
                case 49: goto L_0x0088;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r3 = X.C18180wK.A0H(r0)
            return r3
        L_0x000e:
            java.lang.Object r3 = r9.A00
            X.CjF r3 = (X.C22957CjF) r3
            android.view.View r0 = r3.itemView
            android.view.LayoutInflater r2 = X.C18180wK.A0C(r0)
            r1 = 2131493914(0x7f0c041a, float:1.8611322E38)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r0 = r3.A01
            android.view.View r3 = X.AnonymousClass0wJ.A0H(r2, r0, r1)
            r0 = 96
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r3, r0)
            return r3
        L_0x002b:
            java.lang.Object r0 = r9.A00
            X.CR5 r0 = (X.CR5) r0
            X.0Oa r0 = r0.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.B4L r3 = new X.B4L
            r3.<init>(r0)
            return r3
        L_0x003b:
            java.lang.Object r1 = r9.A00
            r0 = 21
            com.facebook.redex.IDxObjectShape278S0100000_3_I2 r3 = new com.facebook.redex.IDxObjectShape278S0100000_3_I2
            r3.<init>(r1, r0)
            return r3
        L_0x0045:
            java.lang.Object r0 = r9.A00
            X.Jqm r0 = (X.C37383Jqm) r0
            r0.A06()
            goto L_0x01ff
        L_0x004e:
            java.lang.Object r5 = r9.A00
            X.5wu r5 = (X.AnonymousClass5wu) r5
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "arg_notifications_click_point"
            java.lang.String r4 = r1.getString(r0)
            java.lang.String r0 = "arg_group_profile_id"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x0083
            X.0Oa r1 = r5.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r1)
            com.instagram.user.model.User r2 = X.C18210wN.A0P(r0, r2)
            if (r2 == 0) goto L_0x007e
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r1)
            java.lang.String r0 = r5.A00
            X.7be r3 = new X.7be
            r3.<init>(r1, r2, r0, r4)
            return r3
        L_0x007e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x0083:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x0088:
            X.0RG r1 = X.AnonymousClass0RA.A0C
            java.lang.Object r0 = r9.A00
            android.os.Bundle r0 = X.C18230wP.A0D(r0)
            com.instagram.service.session.UserSession r3 = r1.A06(r0)
            return r3
        L_0x0095:
            java.lang.Object r0 = r9.A00
            X.56W r0 = (X.AnonymousClass56W) r0
            java.lang.String r3 = r0.A03
            return r3
        L_0x009c:
            java.lang.Object r0 = r9.A00
            X.76o r0 = (X.C1197176o) r0
            X.59Y r2 = r0.A02
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x00ac
            r1 = 3
            java.lang.String r0 = "Paging"
            android.util.Log.isLoggable(r0, r1)
        L_0x00ac:
            X.8dY r0 = r2.A02
            if (r0 == 0) goto L_0x01ff
            X.7cM r0 = (X.C125067cM) r0
            X.77a r1 = r0.A00
            kotlin.Unit r0 = kotlin.Unit.A00
            r1.A00(r0)
            goto L_0x01ff
        L_0x00bb:
            java.lang.Object r1 = r9.A00
            r0 = 2
            com.facebook.redex.IDxFactoryShape558S0100000_2_I2 r3 = new com.facebook.redex.IDxFactoryShape558S0100000_2_I2
            r3.<init>(r1, r0)
            return r3
        L_0x00c4:
            java.lang.Object r1 = r9.A00
            androidx.compose.foundation.lazy.LazyListState r1 = (androidx.compose.foundation.lazy.LazyListState) r1
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x0185
            int r0 = r1.A01()
            goto L_0x017d
        L_0x00d4:
            java.lang.Object r1 = r9.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 0
            goto L_0x0117
        L_0x00da:
            java.lang.Object r1 = r9.A00
            X.56W r1 = (X.AnonymousClass56W) r1
            r0 = 0
            r1.A0J(r0)
            goto L_0x01ff
        L_0x00e4:
            java.lang.Object r0 = r9.A00
            X.56W r0 = (X.AnonymousClass56W) r0
            r0.A0C()
            goto L_0x01ff
        L_0x00ed:
            java.lang.Object r0 = r9.A00
            X.56W r0 = (X.AnonymousClass56W) r0
            r0.A09()
            goto L_0x01ff
        L_0x00f6:
            java.lang.Object r0 = r9.A00
            X.56W r0 = (X.AnonymousClass56W) r0
            r0.A0B()
            goto L_0x01ff
        L_0x00ff:
            java.lang.Object r0 = r9.A00
            X.56W r0 = (X.AnonymousClass56W) r0
            r0.A0A()
            goto L_0x01ff
        L_0x0108:
            java.lang.Object r1 = r9.A00
            X.56W r1 = (X.AnonymousClass56W) r1
            r0 = 0
            r1.A0H(r0)
            goto L_0x01ff
        L_0x0112:
            java.lang.Object r1 = r9.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 1
        L_0x0117:
            X.C147368pE.A04(r1, r0)
            goto L_0x01ff
        L_0x011c:
            java.lang.Object r0 = r9.A00
            X.5xW r0 = (X.AnonymousClass5xW) r0
            X.3xy r3 = new X.3xy
            r3.<init>(r0)
            return r3
        L_0x0126:
            java.lang.Object r0 = r9.A00
            java.lang.Object r3 = X.C86144wL.A0j(r0)
            return r3
        L_0x012d:
            java.lang.Object r3 = r9.A00
            return r3
        L_0x0130:
            java.lang.Object r1 = r9.A00
            X.5xW r1 = (X.AnonymousClass5xW) r1
            X.0Oa r0 = r1.A06
            java.lang.Object r0 = r0.getValue()
            X.56W r0 = (X.AnonymousClass56W) r0
            r0.A0E(r1)
            goto L_0x01ff
        L_0x0141:
            java.lang.Object r0 = r9.A00
            X.5xW r0 = (X.AnonymousClass5xW) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A05
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.AnonymousClass710.A00(r1, r0)
            goto L_0x01ff
        L_0x0154:
            java.lang.Object r2 = r9.A00
            X.7Ub r2 = (X.C122847Ub) r2
            X.8pE r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            X.8pE r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r1 != r0) goto L_0x0185
            goto L_0x017f
        L_0x016f:
            java.lang.Object r0 = r9.A00
            X.7Ub r0 = (X.C122847Ub) r0
            X.8pE r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
        L_0x017d:
            if (r0 != 0) goto L_0x0185
        L_0x017f:
            r0 = 1
        L_0x0180:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0185:
            r0 = 0
            goto L_0x0180
        L_0x0187:
            java.lang.Object r0 = r9.A00
            X.C18240wQ.A1G(r0)
            goto L_0x01ff
        L_0x018d:
            java.lang.Object r0 = r9.A00
            androidx.compose.foundation.pager.PagerState r0 = (androidx.compose.foundation.pager.PagerState) r0
            int r0 = r0.A05()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x019a:
            java.lang.Object r2 = r9.A00
            X.5xS r2 = (X.AnonymousClass5xS) r2
            android.content.Context r4 = r2.requireContext()
            X.0Oa r0 = r2.A01
            com.instagram.service.session.UserSession r5 = X.AnonymousClass0wJ.A0X(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "ARG_GROUP_PROFILE_ID"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x01ce
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "ARG_GROUP_PROFILE_THEME_ID"
            java.lang.String r7 = r1.getString(r0)
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "ARG_GROUP_PROFILE_PRIVATE"
            boolean r8 = r1.getBoolean(r0)
            X.7bh r3 = new X.7bh
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x01ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x01d3:
            java.lang.Object r0 = r9.A00
            X.5xW r0 = (X.AnonymousClass5xW) r0
            X.4tU r4 = r0.A00
            if (r4 != 0) goto L_0x01e2
            java.lang.String r0 = "captureFlowHelper"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x01e2:
            X.FeI r3 = X.C28923FeI.PROFILE_PHOTO
            X.DsX r2 = new X.DsX
            r2.<init>(r3)
            r0 = 0
            r2.A05 = r0
            com.instagram.model.creation.MediaCaptureConfig r1 = new com.instagram.model.creation.MediaCaptureConfig
            r1.<init>((X.C25818DsX) r2)
            X.9vX r0 = X.C170769vX.GROUP_PROFILE_CREATION
            r4.Cvr(r0, r1, r3)
            goto L_0x01ff
        L_0x01f7:
            java.lang.Object r1 = r9.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            r0 = 0
            r1.invoke(r0)
        L_0x01ff:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57.invoke():java.lang.Object");
    }
}
