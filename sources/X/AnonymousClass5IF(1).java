package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2;
import com.instagram.api.schemas.LineType;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5IF  reason: invalid class name */
public final class AnonymousClass5IF extends AnonymousClass0Sf {
    public final KtCSuperShape6S0100000_I2 A00;
    public final LineType A01;
    public final C142388em A02;
    public final User A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IF) {
                AnonymousClass5IF r5 = (AnonymousClass5IF) obj;
                if (this.A01 != r5.A01 || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || this.A07 != r5.A07 || this.A05 != r5.A05 || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = (((AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A01))) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A02)) * 31;
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A05;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        if (!this.A06) {
            i = 0;
        }
        return i3 + i;
    }

    public AnonymousClass5IF(KtCSuperShape6S0100000_I2 ktCSuperShape6S0100000_I2, LineType lineType, C142388em r4, User user, List list, boolean z, boolean z2, boolean z3) {
        AnonymousClass0wJ.A1O(lineType, ktCSuperShape6S0100000_I2);
        C04220Ms.A0B(list, 3);
        this.A01 = lineType;
        this.A00 = ktCSuperShape6S0100000_I2;
        this.A04 = list;
        this.A03 = user;
        this.A02 = r4;
        this.A07 = z;
        this.A05 = z2;
        this.A06 = z3;
    }

    public static KtCSuperShape6S0100000_I2 A00(Iterator it) {
        return ((AnonymousClass5IF) it.next()).A00;
    }
}
