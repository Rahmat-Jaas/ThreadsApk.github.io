package X;

import java.util.List;

/* renamed from: X.6u7  reason: invalid class name and case insensitive filesystem */
public final class C114916u7 {
    public Float A00;
    public List A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114916u7) {
                C114916u7 r5 = (C114916u7) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ParametricSliderDataModel(sliderColor=");
        A0s.append(this.A02);
        A0s.append(", sliderValue=");
        A0s.append(this.A00);
        A0s.append(", gradientColors=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114916u7(Float f, String str, List list) {
        this.A02 = str;
        this.A00 = f;
        this.A01 = list;
    }
}
