package X;

import android.graphics.Color;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0gd  reason: invalid class name and case insensitive filesystem */
public final class C09760gd {
    public static int A04(int i) {
        float[] fArr = new float[3];
        C31163GhW.A09(i, fArr);
        float A00 = (float) ((A00(((double) Color.red(i)) / 255.0d) * 0.2126d) + (A00(((double) Color.green(i)) / 255.0d) * 0.7152d) + (A00(((double) Color.blue(i)) / 255.0d) * 0.0722d));
        if (i == -1) {
            return -16777216;
        }
        if (i == -16777216) {
            return -1;
        }
        double d = (double) A00;
        if (d > 0.45d && i != -144548) {
            fArr[1] = 0.1f;
        }
        float f = 1.0f - ((1.0f - fArr[2]) / 9.0f);
        fArr[2] = f;
        if (d > 0.45d && i != -144548) {
            fArr[2] = (float) (((double) f) - 0.85d);
        }
        return C31163GhW.A07(fArr);
    }

    public static int A07(int i, float f) {
        return (i & 16777215) | (((int) (f * 255.0f)) << 24);
    }

    public static int A08(int i, int i2) {
        float[] fArr = new float[3];
        if (((double) (((float) Color.alpha(i)) / 255.0f)) >= 0.3d && A01(i) <= 0.85f) {
            return i2;
        }
        Color.colorToHSV(i, fArr);
        if (fArr[0] == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return -16777216;
        }
        fArr[1] = 1.0f;
        fArr[2] = 0.4f;
        return Color.HSVToColor(fArr);
    }

    public static int A09(int i, int i2) {
        float f;
        float f2 = (float) i;
        if (f2 > 127.5f) {
            float f3 = 255.0f - f2;
            float f4 = f2 - f3;
            f = (((float) i2) * (f3 / 127.5f)) + f4;
        } else {
            f = ((float) i2) * (f2 / 127.5f);
        }
        return (int) f;
    }

    public static int A0A(int i, int i2, int i3, int i4) {
        boolean z = false;
        if (i3 < i4) {
            z = true;
        }
        C002801h.A03(z);
        float[] fArr = new float[3];
        float[] fArr2 = new float[3];
        C31163GhW.A09(i, fArr);
        C31163GhW.A09(i2, fArr2);
        float f = fArr[1];
        float f2 = f - fArr2[1];
        float f3 = (float) (i4 - 1);
        float f4 = (float) i3;
        fArr[1] = f - ((f2 / f3) * f4);
        fArr[2] = fArr[2] - (f4 * ((fArr[2] - fArr2[2]) / f3));
        return C31163GhW.A07(fArr);
    }

    public static int A03(int i) {
        return Color.argb(Math.round(153.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int A06(int i, float f) {
        return A07(i, f * (((float) (i >>> 24)) / 255.0f));
    }

    public static int A0B(String str, int i) {
        if (str == null) {
            return i;
        }
        int parseLong = (int) Long.parseLong(str.substring(1), 16);
        return ((parseLong & 255) << 24) | (parseLong >>> 8);
    }

    public static float A01(int i) {
        return ((((((float) Color.red(i)) / 255.0f) * 299.0f) + ((((float) Color.green(i)) / 255.0f) * 587.0f)) + ((((float) Color.blue(i)) / 255.0f) * 114.0f)) / 1000.0f;
    }

    public static int A02(float f, int i, int i2) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        return Color.argb(alpha + ((int) (((float) (Color.alpha(i2) - alpha)) * f)), red + ((int) (((float) (Color.red(i2) - red)) * f)), green + ((int) (((float) (Color.green(i2) - green)) * f)), blue + ((int) (((float) (Color.blue(i2) - blue)) * f)));
    }

    public static int A05(int i) {
        if (((double) A01(i)) < 0.25d) {
            return A07(-1, 0.25f);
        }
        return Color.rgb(Math.max(Color.red(i) - 30, 0), Math.max(Color.green(i) - 30, 0), Math.max(Color.blue(i) - 30, 0));
    }

    public static int A0C(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Color.parseColor(str);
            }
            return i;
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }

    public static String A0D(int i) {
        return AnonymousClass00U.A0d("#", A0G(Integer.toHexString(Color.red(i))), A0G(Integer.toHexString(Color.green(i))), A0G(Integer.toHexString(Color.blue(i))));
    }

    public static String A0E(int i) {
        return StringFormatUtil.formatStrLocaleSafe("#%06x", (Object) Integer.valueOf(i & 16777215));
    }

    public static String A0F(int i) {
        return AnonymousClass00U.A0h("#", A0G(Integer.toHexString(Color.red(i))), A0G(Integer.toHexString(Color.green(i))), A0G(Integer.toHexString(Color.blue(i))), A0G(Integer.toHexString(Color.alpha(i))));
    }

    public static String A0G(String str) {
        if (str.length() < 2) {
            return AnonymousClass00U.A0L("0", str);
        }
        return str;
    }

    public static double A00(double d) {
        if (d > 0.03928d) {
            return Math.pow((d + 0.054999999701976776d) / 1.0549999475479126d, 2.4000000953674316d);
        }
        return d / 12.92d;
    }
}
