package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.TransparentModalActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3iE  reason: invalid class name and case insensitive filesystem */
public final class C63743iE {
    public int A00 = 0;
    public long A01 = 0;
    public SparseArray A02;
    public C127397h3 A03;
    public C127397h3 A04;
    public String A05;
    public Map A06;
    public final String A07;
    public final List A08 = AnonymousClass0wJ.A0v();
    public final Map A09 = AnonymousClass0wJ.A0y();
    public final Map A0A;

    public static Fragment A00(Context context, IgBloksScreenConfig igBloksScreenConfig, C63743iE r3, Map map) {
        r3.A04 = null;
        r3.A0G(map);
        return r3.A0B(context, igBloksScreenConfig);
    }

    public static C63743iE A05(String str, Map map, Map map2) {
        C63743iE r2 = new C63743iE(map, map2, str);
        r2.A00 = 719983200;
        r2.A05 = null;
        r2.A01 = 0;
        return r2;
    }

    public static void A0A(C63743iE r2, int i) {
        r2.A00 = i;
        r2.A05 = null;
        r2.A01 = 0;
    }

    public static C66843yQ A01(C63743iE r17, Object obj, String str) {
        C63743iE r0 = r17;
        Map map = r0.A0A;
        int i = r0.A00;
        List list = r0.A08;
        String str2 = r0.A05;
        C127397h3 r4 = r0.A03;
        return new C66843yQ(r0.A02, (C83284r8) null, (C83284r8) null, r4, str, str2, (HashMap) obj, list, r0.A09, map, map, -1, i, -1, -1, false, false);
    }

    public static C63743iE A04(String str, Map map, Map map2) {
        C63743iE r1 = new C63743iE(map, map2, str);
        r1.A00 = 719983200;
        return r1;
    }

    public static C63743iE A06(String str, Map map, Map map2) {
        return new C63743iE(map, map2, str);
    }

    public static void A07(Context context, IgBloksScreenConfig igBloksScreenConfig, C63743iE r3) {
        igBloksScreenConfig.A0O = AnonymousClass006.A01;
        r3.A0C(context, igBloksScreenConfig);
    }

    public final Fragment A0B(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        Map map = this.A06;
        String str = this.A07;
        C66843yQ A012 = A01(this, map, str);
        long j = this.A01;
        Context context2 = context;
        M4x.A02(context2, igBloksScreenConfig.A04(), str, this.A05, map, j);
        AnonymousClass794.A00().A02();
        return AnonymousClass3TU.A00(A012, igBloksScreenConfig);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        r8.A09(r4, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        r1 = com.instagram.barcelona.R.anim.right_in;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        r0 = com.instagram.barcelona.R.anim.left_out;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.content.Context r18, com.instagram.bloks.hosting.IgBloksScreenConfig r19) {
        /*
            r17 = this;
            r1 = r17
            java.util.Map r14 = r1.A06
            java.lang.String r12 = r1.A07
            X.3yQ r4 = A01(r1, r14, r12)
            r10 = r18
            r3 = r19
            if (r19 == 0) goto L_0x0023
            java.lang.String r0 = "BKDataFetcher.fetch"
            X.C41228M0s.A01(r0)
            long r15 = r1.A01
            java.lang.String r13 = r1.A05
            X.18u r11 = r3.A04()
            X.M4x.A02(r10, r11, r12, r13, r14, r15)
            X.C41228M0s.A00()
        L_0x0023:
            X.794 r0 = X.AnonymousClass794.A00()
            r0.A02()
            X.7h3 r7 = r1.A03
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r9 = X.C10050he.A00(r10, r0)
            androidx.fragment.app.FragmentActivity r9 = (androidx.fragment.app.FragmentActivity) r9
            if (r9 == 0) goto L_0x0110
            boolean r0 = r9.isFinishing()
            r6 = 3
            r5 = 1
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r9 instanceof X.C81324nb
            if (r0 == 0) goto L_0x00aa
            X.1c8 r1 = X.AnonymousClass3TU.A00(r4, r3)
            X.0i6 r0 = r3.A0C
            X.Drz r8 = X.C18180wK.A0Q(r9, r0)
            r8.A03 = r1
            java.lang.Integer r1 = r3.A0O
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 == r0) goto L_0x0070
            int r0 = r1.intValue()
            if (r0 == r5) goto L_0x00a6
            if (r0 == r6) goto L_0x00a3
            switch(r0) {
                case 2: goto L_0x009f;
                default: goto L_0x005f;
            }
        L_0x005f:
            r4 = 0
        L_0x0060:
            switch(r0) {
                case 2: goto L_0x0095;
                default: goto L_0x0063;
            }
        L_0x0063:
            r2 = 0
            switch(r0) {
                case 2: goto L_0x0098;
                default: goto L_0x0067;
            }
        L_0x0067:
            r1 = 0
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x009b
            r0 = 0
        L_0x006d:
            r8.A09(r4, r2, r1, r0)
        L_0x0070:
            java.lang.String r0 = r3.A0Q
            if (r0 != 0) goto L_0x0080
            if (r7 == 0) goto L_0x0086
            boolean r0 = X.C63763iI.A0D(r7)
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = X.C63763iI.A09(r7)
        L_0x0080:
            if (r0 == 0) goto L_0x0086
            r8.A07 = r0
            r8.A09 = r0
        L_0x0086:
            java.util.Map r1 = r3.A0W
            if (r1 == 0) goto L_0x0091
            X.41v r0 = new X.41v
            r0.<init>(r1)
            r8.A04 = r0
        L_0x0091:
            r8.A05()
            return
        L_0x0095:
            r2 = 2130772061(0x7f01005d, float:1.714723E38)
        L_0x0098:
            r1 = 2130772059(0x7f01005b, float:1.7147226E38)
        L_0x009b:
            r0 = 2130772046(0x7f01004e, float:1.71472E38)
            goto L_0x006d
        L_0x009f:
            r4 = 2130772044(0x7f01004c, float:1.7147195E38)
            goto L_0x0060
        L_0x00a3:
            r8.A0D = r5
            goto L_0x0070
        L_0x00a6:
            r8.A08()
            goto L_0x0070
        L_0x00aa:
            android.os.Bundle r8 = X.C18180wK.A06()
            com.instagram.bloks.hosting.IgBloksScreenConfig.A03(r8, r3)
            X.0i6 r7 = r3.A0C
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326524151998067(0x810ec800012673, double:3.03637837667092E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r7, r0)
            boolean r0 = r0.booleanValue()
            X.C66843yQ.A03(r8, r4, r0)
            X.0i6 r2 = r3.A0C
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "bloks"
            X.3iT r4 = X.C63863iT.A02(r9, r8, r2, r1, r0)
            java.lang.Integer r1 = r3.A0O
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 == r0) goto L_0x00f4
            int r0 = r1.intValue()
            if (r0 == r5) goto L_0x010c
            if (r0 == r6) goto L_0x0108
            switch(r0) {
                case 2: goto L_0x0104;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            r3 = 0
        L_0x00e1:
            switch(r0) {
                case 2: goto L_0x0100;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            switch(r0) {
                case 2: goto L_0x00fc;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x00f8
            r0 = 0
        L_0x00ee:
            int[] r0 = new int[]{r3, r2, r1, r0}
            r4.A0F = r0
        L_0x00f4:
            r4.A0I(r10)
            return
        L_0x00f8:
            r0 = 2130772046(0x7f01004e, float:1.71472E38)
            goto L_0x00ee
        L_0x00fc:
            r1 = 2130772059(0x7f01005b, float:1.7147226E38)
            goto L_0x00e9
        L_0x0100:
            r2 = 2130772061(0x7f01005d, float:1.714723E38)
            goto L_0x00e5
        L_0x0104:
            r3 = 2130772044(0x7f01004c, float:1.7147195E38)
            goto L_0x00e1
        L_0x0108:
            r4.A0F()
            goto L_0x00f4
        L_0x010c:
            r4.A0G()
            goto L_0x00f4
        L_0x0110:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63743iE.A0C(android.content.Context, com.instagram.bloks.hosting.IgBloksScreenConfig):void");
    }

    public final void A0D(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        Map map = this.A06;
        String str = this.A07;
        Map map2 = this.A0A;
        int i = this.A00;
        List list = this.A08;
        String str2 = this.A05;
        C127397h3 r11 = this.A03;
        C66843yQ r7 = new C66843yQ(this.A02, (C83284r8) null, (C83284r8) null, r11, str, str2, (HashMap) map, list, this.A09, map2, map2, -1, i, -1, -1, false, false);
        long j = this.A01;
        IgBloksScreenConfig igBloksScreenConfig2 = igBloksScreenConfig;
        Context context2 = context;
        Context context3 = context2;
        M4x.A02(context3, igBloksScreenConfig2.A04(), str, this.A05, map, j);
        AnonymousClass794.A00().A02();
        Activity activity = (Activity) C10050he.A00(context2, FragmentActivity.class);
        if (activity != null) {
            Bundle A062 = C18180wK.A06();
            C18180wK.A0w(A062, igBloksScreenConfig2.A0C);
            IgBloksScreenConfig.A03(A062, igBloksScreenConfig2);
            C66843yQ.A03(A062, r7, C63803iN.A05(AnonymousClass0TJ.A05, igBloksScreenConfig2.A0C, 36326524151998067L).booleanValue());
            if (!(activity instanceof C33540Hpa)) {
                Bundle A063 = C18180wK.A06();
                A063.putString("bottom_sheet_content_fragment", "bloks");
                A063.putBundle("bloks_screen_config", A062);
                C63863iT.A08(activity, A063, igBloksScreenConfig2.A0C, TransparentModalActivity.class, "bottom_sheet");
                return;
            }
            C23221cn r3 = new C23221cn();
            C37383Jqm A002 = M6q.A08(activity, igBloksScreenConfig2.A0C, (C36311JPd) null, (C36311JPd) null, r3, igBloksScreenConfig2.A0S, (String) null, 50, igBloksScreenConfig2.A00, false).A00();
            r3.A0C = A002;
            r3.setArguments(A062);
            C37383Jqm.A00(activity, r3, A002);
            return;
        }
        throw new IllegalStateException();
    }

    public final void A0E(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        A0F(context, igBloksScreenConfig, (C82374pW) null, 32);
    }

    public final void A0F(Context context, IgBloksScreenConfig igBloksScreenConfig, C82374pW r17, int i) {
        Map map = this.A06;
        String str = this.A07;
        String A0r = C18220wO.A0r("params", map);
        if (A0r != null) {
            try {
                HashMap hashMap = (HashMap) new C40114LNz().A05(A0r, HashMap.class);
                if (hashMap != null) {
                    map = C32282Bc.A00(hashMap);
                    C66843yQ A012 = A01(this, map, str);
                    long j = this.A01;
                    IgBloksScreenConfig igBloksScreenConfig2 = igBloksScreenConfig;
                    Context context2 = context;
                    M4x.A02(context2, igBloksScreenConfig2.A04(), str, this.A05, map, j);
                    AnonymousClass794.A00().A02().A01(context, A012, igBloksScreenConfig2, this.A03, r17, str, i);
                }
            } catch (IOException unused) {
                C30967GcS.A02("RequestParamsUtil", "Error converting request params to server params");
            }
        }
        C30967GcS.A02("RequestParamFormatter", "Expected to find params map in formattedParams");
        C66843yQ A0122 = A01(this, map, str);
        long j2 = this.A01;
        IgBloksScreenConfig igBloksScreenConfig22 = igBloksScreenConfig;
        Context context22 = context;
        M4x.A02(context22, igBloksScreenConfig22.A04(), str, this.A05, map, j2);
        AnonymousClass794.A00().A02().A01(context, A0122, igBloksScreenConfig22, this.A03, r17, str, i);
    }

    public final void A0G(Map map) {
        this.A09.putAll(map);
    }

    public C63743iE(Map map, Map map2, String str) {
        this.A07 = str;
        this.A06 = map;
        this.A0A = map2;
    }

    public static C63743iE A02(String str, Map map) {
        return new C63743iE(map, AnonymousClass0wJ.A0y(), str);
    }

    public static C63743iE A03(String str, Map map, Map map2) {
        C63743iE r2 = new C63743iE(C37067Jjv.A02(map), map2, str);
        r2.A00 = 719983200;
        r2.A05 = null;
        r2.A01 = 0;
        return r2;
    }

    public static void A08(Context context, IgBloksScreenConfig igBloksScreenConfig, C63743iE r3, int i) {
        igBloksScreenConfig.A0S = context.getString(i);
        r3.A0C(context, igBloksScreenConfig);
    }

    public static void A09(Context context, IgBloksScreenConfig igBloksScreenConfig, C63743iE r3, int i) {
        igBloksScreenConfig.A0S = context.getString(i);
        igBloksScreenConfig.A0O = AnonymousClass006.A01;
        r3.A0C(context, igBloksScreenConfig);
    }
}
