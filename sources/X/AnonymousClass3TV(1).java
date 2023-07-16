package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.3TV  reason: invalid class name */
public abstract class AnonymousClass3TV {
    public static void A00(Context context, TextView textView, String str) {
        textView.setTypeface(AnonymousClass794.A00().A05.A01(context, str, 0));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bd, code lost:
        r0 = android.graphics.Typeface.create(X.C09250f7.A05.A00(r4).A03(r1), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        if (r0 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface A01(android.content.Context r4, java.lang.String r5, int r6) {
        /*
            r3 = this;
            boolean r2 = X.AnonymousClass0wJ.A1Z(r4, r5)
            boolean r0 = X.AnonymousClass0hA.A08(r5)
            if (r0 != 0) goto L_0x0012
            int r0 = r5.hashCode()
            r1 = 3
            switch(r0) {
                case -2011024666: goto L_0x00b3;
                case -1905842875: goto L_0x00a8;
                case -1231384652: goto L_0x009d;
                case -966110952: goto L_0x0092;
                case -897884048: goto L_0x0087;
                case 66027140: goto L_0x0079;
                case 627451709: goto L_0x006e;
                case 685336781: goto L_0x005c;
                case 733669224: goto L_0x0051;
                case 1135625738: goto L_0x003f;
                case 1178287748: goto L_0x0034;
                case 1569568808: goto L_0x0026;
                case 2073814969: goto L_0x001a;
                default: goto L_0x0012;
            }
        L_0x0012:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r5, r6)
            X.C04220Ms.A06(r0)
        L_0x0019:
            return r0
        L_0x001a:
            java.lang.String r0 = "Courier Prime Bold"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0B
            goto L_0x00bd
        L_0x0026:
            java.lang.String r0 = "Instagram Sans Condensed"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            if (r6 != 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0N
            goto L_0x00bd
        L_0x0034:
            java.lang.String r0 = "Optimistic Text App Bold"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0Y
            goto L_0x00bd
        L_0x003f:
            java.lang.String r0 = "Old Standard TT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            if (r6 == r2) goto L_0x004e
            if (r6 == r1) goto L_0x004e
            X.0fG r1 = X.C09340fG.A0U
            goto L_0x00bd
        L_0x004e:
            X.0fG r1 = X.C09340fG.A0V
            goto L_0x00bd
        L_0x0051:
            java.lang.String r0 = "Montserrat Extra Bold Italic"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0Q
            goto L_0x00bd
        L_0x005c:
            java.lang.String r0 = "Montserrat"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            if (r6 == r2) goto L_0x006b
            if (r6 == r1) goto L_0x006b
            X.0fG r1 = X.C09340fG.A0S
            goto L_0x00bd
        L_0x006b:
            X.0fG r1 = X.C09340fG.A0R
            goto L_0x00bd
        L_0x006e:
            java.lang.String r0 = "Optimistic Text App Regular"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0a
            goto L_0x00bd
        L_0x0079:
            java.lang.String r0 = "Didot"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 2
            if (r6 != r0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0D
            goto L_0x00bd
        L_0x0087:
            java.lang.String r0 = "Optimistic Display App"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0W
            goto L_0x00bd
        L_0x0092:
            java.lang.String r0 = "Barlow Semi Bold"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A08
            goto L_0x00bd
        L_0x009d:
            java.lang.String r0 = "Optimistic Text App Medium"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0Z
            goto L_0x00bd
        L_0x00a8:
            java.lang.String r0 = "Optimistic Display App Medium"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0X
            goto L_0x00bd
        L_0x00b3:
            java.lang.String r0 = "Aveny T Medium"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.0fG r1 = X.C09340fG.A0M
        L_0x00bd:
            X.0f8 r0 = X.C09250f7.A05
            X.0f7 r0 = r0.A00(r4)
            android.graphics.Typeface r0 = r0.A03(r1)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r6)
            if (r0 != 0) goto L_0x0019
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TV.A01(android.content.Context, java.lang.String, int):android.graphics.Typeface");
    }
}
