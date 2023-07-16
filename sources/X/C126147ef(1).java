package X;

import android.content.res.Resources;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7ef  reason: invalid class name and case insensitive filesystem */
public final class C126147ef implements L2Z {
    public final Resources A00;
    public final IHN A01;
    public final C142098do A02;
    public final Map A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            C126147ef r4 = (C126147ef) obj;
            if (this.A00 != r4.A00 || !AnonymousClass6GW.A00(this.A02, r4.A02) || !AnonymousClass6GW.A00(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A00)));
    }

    public /* synthetic */ C126147ef(Resources resources, IHN ihn, C142098do r5) {
        LinkedHashMap A0y = C18220wO.A0y();
        C04220Ms.A0B(ihn, 3);
        this.A00 = resources;
        this.A02 = r5;
        this.A01 = ihn;
        this.A03 = A0y;
    }
}
