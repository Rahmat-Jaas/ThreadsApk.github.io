package X;

import com.facebook.dcp.model.Feature$Companion;
import kotlinx.serialization.Serializable;

@Serializable(with = C1372987e.class)
/* renamed from: X.5I2  reason: invalid class name */
public final class AnonymousClass5I2 extends AnonymousClass0Sf {
    public static final Feature$Companion Companion = new Feature$Companion();
    public final int A00;
    public final String A01;

    public AnonymousClass5I2(String str, int i) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I2) {
                AnonymousClass5I2 r5 = (AnonymousClass5I2) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A01) + this.A00;
    }
}
