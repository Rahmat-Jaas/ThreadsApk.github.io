package X;

import android.graphics.RectF;

/* renamed from: X.6uk  reason: invalid class name and case insensitive filesystem */
public final class C115246uk {
    public final RectF A00;
    public final RectF A01;
    public final RectF A02;
    public final AnonymousClass68p A03;
    public final C971768f A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115246uk) {
                C115246uk r5 = (C115246uk) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || this.A04 != r5.A04 || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A03, AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A02)))));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TooltipPositionInfo(tooltipRect=");
        A0s.append(this.A02);
        A0s.append(", contentRect=");
        A0s.append(this.A01);
        A0s.append(", arrowRect=");
        A0s.append(this.A00);
        A0s.append(", tooltipPosition=");
        A0s.append(this.A04);
        A0s.append(", arrowLocation=");
        return C86104wH.A0y(this.A03, A0s);
    }

    public C115246uk(RectF rectF, RectF rectF2, RectF rectF3, AnonymousClass68p r4, C971768f r5) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = rectF3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
