package X;

import android.content.res.Resources;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.7Cg  reason: invalid class name and case insensitive filesystem */
public final class C120737Cg {
    public static final Set A00 = ImmutableSet.A04(new Object[]{Locale.CHINA, Locale.TAIWAN, Locale.JAPAN, Locale.KOREA}, 4);

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r4 >= r13) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.res.Resources r16, java.lang.Integer r17, java.lang.Integer r18, boolean r19, boolean r20, boolean r21) {
        /*
            r1 = r17
            if (r17 != 0) goto L_0x0007
            java.lang.String r0 = ""
            return r0
        L_0x0007:
            int r6 = r1.intValue()
            int r4 = r18.intValue()
            if (r6 >= r4) goto L_0x001e
            java.util.Locale r0 = X.C31103Gfm.A02()
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance(r0)
            java.lang.String r0 = r0.format(r1)
            return r0
        L_0x001e:
            java.util.Locale r10 = X.C31103Gfm.A02()
            java.util.Set r1 = A00
            java.util.Locale r0 = X.C31103Gfm.A02()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0135
            java.lang.Integer r8 = X.AnonymousClass006.A00
        L_0x0030:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r15 = 1
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r8 != r0) goto L_0x0052
            double r4 = (double) r4
            r0 = 4
            double r0 = (double) r0
            double r13 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            double r4 = (double) r6
            r0 = 3
            double r0 = (double) r0
            double r11 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0052
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            java.lang.String r9 = "%d"
            if (r0 == 0) goto L_0x00ad
            double r4 = (double) r6
            r0 = 3
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r4 / r0
            int r0 = (int) r4
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.String r11 = java.lang.String.format(r10, r9, r0)
            r8 = 3
        L_0x0069:
            r0 = 3
            java.lang.String r2 = "%s"
            if (r8 == r0) goto L_0x00a4
            r0 = 4
            if (r8 == r0) goto L_0x00a0
            r0 = 6
            if (r8 == r0) goto L_0x0097
            r0 = 8
            if (r8 == r0) goto L_0x0093
            r0 = 9
            if (r8 != r0) goto L_0x0139
            r1 = 2131835936(0x7f113c20, float:1.9305025E38)
            if (r19 == 0) goto L_0x0084
            r1 = 2131835937(0x7f113c21, float:1.9305027E38)
        L_0x0084:
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            java.lang.String r0 = X.C18180wK.A0j(r2, r0)
            r2 = r16
            java.lang.String r0 = X.C18190wL.A0h(r2, r0, r1)
            return r0
        L_0x0093:
            r1 = 2131835938(0x7f113c22, float:1.9305029E38)
            goto L_0x0084
        L_0x0097:
            r1 = 2131835939(0x7f113c23, float:1.930503E38)
            if (r19 == 0) goto L_0x0084
            r1 = 2131835940(0x7f113c24, float:1.9305033E38)
            goto L_0x0084
        L_0x00a0:
            r1 = 2131835941(0x7f113c25, float:1.9305035E38)
            goto L_0x0084
        L_0x00a4:
            r1 = 2131835942(0x7f113c26, float:1.9305037E38)
            if (r19 == 0) goto L_0x0084
            r1 = 2131835943(0x7f113c27, float:1.9305039E38)
            goto L_0x0084
        L_0x00ad:
            double r6 = (double) r6
            int r13 = r8.intValue()
            if (r13 == 0) goto L_0x0133
            r8 = 3
        L_0x00b5:
            double r0 = (double) r8
            double r4 = java.lang.Math.pow(r2, r0)
            double r11 = java.lang.Math.log10(r6)
            double r11 = java.lang.Math.floor(r11)
            double r11 = r11 / r0
            double r0 = java.lang.Math.floor(r11)
            double r0 = java.lang.Math.pow(r4, r0)
            double r4 = r6 / r0
            if (r20 == 0) goto L_0x0129
            int r8 = r8 - r15
            double r0 = (double) r8
            double r8 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x011a
            double r0 = java.lang.Math.floor(r4)
        L_0x00dd:
            double r4 = r0 * r2
            double r4 = java.lang.Math.floor(r4)
            int r8 = (int) r4
            int r4 = r8 % 10
            if (r4 != 0) goto L_0x0117
            java.lang.String r4 = "%.0f"
        L_0x00ea:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r11 = java.lang.String.format(r10, r4, r0)
        L_0x00f6:
            r8 = 0
            r10 = 1
        L_0x00f8:
            if (r13 == 0) goto L_0x0115
            r9 = 3
        L_0x00fb:
            int r1 = r9 + r8
            if (r13 == 0) goto L_0x0112
            r0 = 9
        L_0x0101:
            if (r1 > r0) goto L_0x0069
            double r4 = (double) r10
            double r0 = (double) r9
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r4 * r0
            int r10 = (int) r4
            double r4 = (double) r10
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0069
            int r8 = r8 + r9
            goto L_0x00f8
        L_0x0112:
            r0 = 8
            goto L_0x0101
        L_0x0115:
            r9 = 4
            goto L_0x00fb
        L_0x0117:
            java.lang.String r4 = "%.1f"
            goto L_0x00ea
        L_0x011a:
            double r4 = r4 * r2
            if (r21 == 0) goto L_0x0124
            long r4 = java.lang.Math.round(r4)
            double r0 = (double) r4
        L_0x0122:
            double r0 = r0 / r2
            goto L_0x00dd
        L_0x0124:
            double r0 = java.lang.Math.floor(r4)
            goto L_0x0122
        L_0x0129:
            int r0 = (int) r4
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.String r11 = java.lang.String.format(r10, r9, r0)
            goto L_0x00f6
        L_0x0133:
            r8 = 4
            goto L_0x00b5
        L_0x0135:
            java.lang.Integer r8 = X.AnonymousClass006.A01
            goto L_0x0030
        L_0x0139:
            java.lang.String r0 = "Invalid multiplier: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r8)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120737Cg.A00(android.content.res.Resources, java.lang.Integer, java.lang.Integer, boolean, boolean, boolean):java.lang.String");
    }

    public static String A01(Resources resources, Integer num, boolean z) {
        return A00(resources, num, 10000, z, true, false);
    }
}
