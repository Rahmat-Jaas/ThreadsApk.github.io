package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.54A  reason: invalid class name */
public final class AnonymousClass54A extends C98146Ej implements Iterable, C03740Kn {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final String A07;
    public final List A08;
    public final List A09;

    public AnonymousClass54A(String str, List list, List list2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        C04220Ms.A0B(str, 1);
        this.A07 = str;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A09 = list;
        this.A08 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof AnonymousClass54A)) {
                AnonymousClass54A r5 = (AnonymousClass54A) obj;
                if (!(C04220Ms.A0I(this.A07, r5.A07) && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A06 == r5.A06 && C04220Ms.A0I(this.A09, r5.A09) && C04220Ms.A0I(this.A08, r5.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A08, AnonymousClass0wJ.A05(this.A09, C86104wH.A05(C86104wH.A05(C86104wH.A05(C86104wH.A05(C86104wH.A05(C86104wH.A05(C86104wH.A05(C18180wK.A03(this.A07), this.A02), this.A00), this.A01), this.A03), this.A04), this.A05), this.A06)));
    }

    public final Iterator iterator() {
        return new AnonymousClass840(this);
    }

    public AnonymousClass54A() {
        this("", C102766Wl.A00, AnonymousClass0ZV.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
