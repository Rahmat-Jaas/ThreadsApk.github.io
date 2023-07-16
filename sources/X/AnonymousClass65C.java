package X;

import com.instagram.shopping.model.destination.home.ProductFeedHeader;
import java.util.ArrayList;

/* renamed from: X.65C  reason: invalid class name */
public final class AnonymousClass65C extends C18203AbX {
    public ProductFeedHeader A00 = null;
    public String A01;
    public ArrayList A02;
    public boolean A03 = true;

    public AnonymousClass65C() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A02 = A0v;
        this.A01 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass65C) {
                AnonymousClass65C r5 = (AnonymousClass65C) obj;
                if (this.A03 != r5.A03 || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ProductFeedHeader A00() {
        return this.A00;
    }

    public final int hashCode() {
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return AnonymousClass0wJ.A05(this.A02, (((z ? 1 : 0) * true) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ShortcutButtonHscroll(isScrollEnabled=");
        A0s.append(this.A03);
        A0s.append(", header=");
        A0s.append(this.A00);
        A0s.append(C18170wI.A00(111));
        A0s.append(this.A02);
        A0s.append(AnonymousClass000.A00(523));
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
