package X;

import androidx.paging.PagingConfig;
import java.util.List;

/* renamed from: X.6uX  reason: invalid class name and case insensitive filesystem */
public final class C115116uX {
    public final int A00;
    public final Integer A01;
    public final List A02;
    public final PagingConfig A03;

    public C115116uX(PagingConfig pagingConfig, Integer num, List list, int i) {
        C04220Ms.A0B(pagingConfig, 3);
        this.A02 = list;
        this.A01 = num;
        this.A03 = pagingConfig;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C115116uX) {
            C115116uX r4 = (C115116uX) obj;
            if (!C04220Ms.A0I(this.A02, r4.A02) || !C04220Ms.A0I(this.A01, r4.A01) || !C04220Ms.A0I(this.A03, r4.A03) || this.A00 != r4.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A03, this.A02.hashCode() + C18230wP.A05(this.A01)) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PagingState(pages=");
        A0s.append(this.A02);
        A0s.append(", anchorPosition=");
        A0s.append(this.A01);
        A0s.append(", config=");
        A0s.append(this.A03);
        A0s.append(", leadingPlaceholderCount=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
