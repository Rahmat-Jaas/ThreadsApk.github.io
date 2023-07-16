package X;

import android.graphics.RectF;

/* renamed from: X.6td  reason: invalid class name and case insensitive filesystem */
public final class C114626td {
    public final RectF A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114626td) {
                C114626td r5 = (C114626td) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SingleHandPredictionData(gesture=");
        A0s.append(this.A01);
        A0s.append(", boundingBox=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114626td(RectF rectF, String str) {
        this.A01 = str;
        this.A00 = rectF;
    }
}
