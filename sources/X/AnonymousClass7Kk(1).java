package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import java.text.NumberFormat;
import java.text.ParseException;

/* renamed from: X.7Kk  reason: invalid class name */
public final class AnonymousClass7Kk {
    public static final ThreadLocal A00 = new AnonymousClass890("#dp");
    public static final ThreadLocal A01 = new AnonymousClass890("#%");
    public static final ThreadLocal A02 = new AnonymousClass890("#px");
    public static final ThreadLocal A03 = new AnonymousClass890("#sp");

    public static float A00(String str) {
        try {
            return A03(str, A01) * 100.0f;
        } catch (ParseException e) {
            throw new C29721zB(AnonymousClass00U.A0L("can't parse pixel value: ", str), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return A03(str, A02);
            }
            if (str.endsWith("sp")) {
                return (float) Math.round(A03(str, A03) * C18230wP.A0E(C18230wP.A08()).scaledDensity);
            }
            if (C86144wL.A1Y(str)) {
                return A00(str);
            }
            return (float) Math.round(A03(str, A00) * (((float) C18230wP.A0E(C18230wP.A08()).densityDpi) / 160.0f));
        } catch (ParseException e) {
            throw new C29721zB(AnonymousClass00U.A0L("can't parse pixel value: ", str), e);
        }
    }

    public static float A02(String str) {
        try {
            return A03(str, A03);
        } catch (ParseException e) {
            throw new C29721zB(AnonymousClass00U.A0L("can't parse scaled pixel value: ", str), e);
        }
    }

    public static int A06(String str) {
        if (str.equals("adjust_hidden")) {
            return 32;
        }
        if (str.equals(C18170wI.A00(791))) {
            return 16;
        }
        throw C86124wJ.A0c("can't parse unknown mode: ", str);
    }

    public static C1199177p A0C(String str) {
        float A012;
        Integer num;
        if ("auto".equalsIgnoreCase(str)) {
            return C1199177p.A02;
        }
        if (C86144wL.A1Y(str)) {
            A012 = Float.parseFloat(str.substring(0, str.length() - 1));
            num = AnonymousClass006.A01;
        } else {
            A012 = A01(str);
            num = AnonymousClass006.A00;
        }
        return new C1199177p(num, A012);
    }

    public static float A03(String str, ThreadLocal threadLocal) {
        return ((NumberFormat) threadLocal.get()).parse(str).floatValue();
    }

    public static int A04(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new C29721zB(AnonymousClass00U.A0L("can't parse color value: ", str), e);
        }
    }

    public static int A05(String str) {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                break;
            case 3154575:
                if (str.equals("full")) {
                    return 0;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    return 3;
                }
                break;
        }
        throw C86124wJ.A0c("Can't parse unknown datetime format: ", str);
    }

    public static int A07(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return 8388613;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 8388611;
                }
                break;
        }
        throw C86124wJ.A0c("can't parse unknown textAlign: ", str);
    }

    public static int A08(String str) {
        switch (str.hashCode()) {
            case 3212:
                if (str.equals("dp")) {
                    return 1;
                }
                break;
            case 3592:
                if (str.equals("px")) {
                    return 0;
                }
                break;
            case 3677:
                if (str.equals("sp")) {
                    return 2;
                }
                break;
        }
        throw C86124wJ.A0c("can't parse unknown textUniSize: ", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r8.equals("bold") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        X.C30967GcS.A02("text_style_ignored", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        throw X.C86124wJ.A0c("can't parse unknown typeface: ", r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A09(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            java.lang.String r7 = "semibold"
            java.lang.String r6 = "light"
            java.lang.String r5 = "heavy"
            r4 = 3
            java.lang.String r3 = "normal"
            java.lang.String r2 = "medium"
            java.lang.String r1 = "bold"
            switch(r0) {
                case -1178781136: goto L_0x0072;
                case -1078030475: goto L_0x005f;
                case -1039745817: goto L_0x0045;
                case 3029637: goto L_0x003e;
                case 99152071: goto L_0x0031;
                case 102970646: goto L_0x004c;
                case 1223860979: goto L_0x001b;
                case 1734741290: goto L_0x0028;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.String r0 = "can't parse unknown typeface: "
            X.1zB r0 = X.C86124wJ.A0c(r0, r8)
            throw r0
        L_0x001b:
            boolean r0 = r8.equals(r7)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass00U.A0V(r7, r0, r1)
            goto L_0x006b
        L_0x0028:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x0014
        L_0x0031:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass00U.A0V(r5, r0, r1)
            goto L_0x006b
        L_0x003e:
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x0070
            goto L_0x0014
        L_0x0045:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x005d
            goto L_0x0014
        L_0x004c:
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass00U.A0V(r6, r0, r3)
            java.lang.String r0 = "text_style_ignored"
            X.C30967GcS.A02(r0, r1)
        L_0x005d:
            r4 = 0
            return r4
        L_0x005f:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r0, r1)
        L_0x006b:
            java.lang.String r0 = "text_style_ignored"
            X.C30967GcS.A02(r0, r1)
        L_0x0070:
            r4 = 1
        L_0x0071:
            return r4
        L_0x0072:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4 = 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Kk.A09(java.lang.String):int");
    }

    public static GradientDrawable.Orientation A0A(String str) {
        switch (str.hashCode()) {
            case -1451623918:
                if (str.equals("bottom_left_to_top_right")) {
                    return GradientDrawable.Orientation.BL_TR;
                }
                break;
            case -1118360059:
                if (str.equals("top_to_bottom")) {
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                break;
            case 404498110:
                if (str.equals("top_left_to_bottom_right")) {
                    return GradientDrawable.Orientation.TL_BR;
                }
                break;
            case 1553519760:
                if (str.equals("left_to_right")) {
                    return GradientDrawable.Orientation.LEFT_RIGHT;
                }
                break;
        }
        throw C86124wJ.A0c("can't parse orientation value: ", str);
    }

    public static ImageView.ScaleType A0B(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return ImageView.ScaleType.FIT_XY;
                }
                break;
            case 94852023:
                if (str.equals("cover")) {
                    return ImageView.ScaleType.CENTER_CROP;
                }
                break;
            case 951526612:
                if (str.equals(I17.A00(216))) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
                break;
        }
        throw C86124wJ.A0c("can't parse unknown scaleType: ", str);
    }
}
