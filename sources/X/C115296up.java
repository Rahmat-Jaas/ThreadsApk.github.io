package X;

import android.graphics.drawable.Drawable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.6up  reason: invalid class name and case insensitive filesystem */
public final class C115296up {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final C115136uZ A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115296up) {
                C115296up r5 = (C115296up) obj;
                if (!(C04220Ms.A0I(this.A03, r5.A03) && this.A02 == r5.A02 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && this.A05 == r5.A05 && C04220Ms.A0I(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A052 = C86104wH.A05(C86104wH.A05(((AnonymousClass0wJ.A03(this.A03) * 31) + this.A02) * 31, this.A00), this.A01);
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return C86124wJ.A0J(str, intValue, A052) + C18200wM.A07(this.A04);
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("TooltipAttributes(backgroundDrawable=");
        A0s.append(this.A03);
        A0s.append(", borderColor=");
        A0s.append(this.A02);
        A0s.append(", borderWidth=");
        A0s.append(this.A00);
        A0s.append(", cornerRadius=");
        A0s.append(this.A01);
        A0s.append(", arrowType=");
        switch (this.A05.intValue()) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        A0s.append(str);
        A0s.append(", shadow=");
        return C86104wH.A0y(this.A04, A0s);
    }

    public C115296up(Drawable drawable, C115136uZ r2, Integer num, float f, float f2, int i) {
        this.A03 = drawable;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = num;
        this.A04 = r2;
    }
}
