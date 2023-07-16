package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import com.instagram.barcelona.R;

/* renamed from: X.7CF  reason: invalid class name */
public final class AnonymousClass7CF {
    public static final int[][] A00 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A06;
        int defaultColor;
        int colorForState;
        int i = -7829368;
        if (num != null) {
            A06 = num.intValue();
        } else {
            A06 = C86114wI.A06(context.getTheme(), R.attr.colorControlActivated, -7829368);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorSwitchThumbNormal});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (num2 != null) {
            defaultColor = num2.intValue();
        } else if (colorStateList == null) {
            defaultColor = -7829368;
        } else {
            defaultColor = colorStateList.getDefaultColor();
        }
        if (num3 != null) {
            colorForState = num3.intValue();
        } else if (colorStateList == null) {
            colorForState = -7829368;
        } else {
            colorForState = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        if (num4 != null) {
            i = num4.intValue();
        } else if (colorStateList != null) {
            i = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        return new ColorStateList(A00, new int[]{A06, defaultColor, colorForState, i});
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int A06;
        int A062;
        int A063;
        int A064;
        if (num != null) {
            A06 = num.intValue();
        } else {
            A06 = C86114wI.A06(context.getTheme(), 16843818, -7829368);
        }
        if (num2 != null) {
            A062 = num2.intValue();
        } else {
            A062 = C86114wI.A06(context.getTheme(), 16842800, -7829368);
        }
        if (num3 != null) {
            A063 = num3.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            A063 = C31163GhW.A06(obtainStyledAttributes.getColor(0, -7829368), Math.round(((float) Color.alpha(A06)) * 0.25f));
            obtainStyledAttributes.recycle();
        }
        if (num4 != null) {
            A064 = num4.intValue();
        } else {
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
            A064 = C31163GhW.A06(obtainStyledAttributes2.getColor(0, -7829368), Math.round(((float) Color.alpha(A062)) * 0.25f));
            obtainStyledAttributes2.recycle();
        }
        return new ColorStateList(A00, new int[]{A06, A062, A063, A064});
    }
}
