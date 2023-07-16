package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5I1  reason: invalid class name */
public final class AnonymousClass5I1 extends AnonymousClass0Sf {
    public final AnonymousClass5HQ A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I1) {
                AnonymousClass5I1 r5 = (AnonymousClass5I1) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A04 = C18210wN.A04(this.A00);
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "ContainingThread";
        } else {
            str = "ReplyThreads";
        }
        return A04 + C86144wL.A0B(str, intValue);
    }

    public AnonymousClass5I1(AnonymousClass5HQ r1, Integer num) {
        AnonymousClass0wJ.A1O(r1, num);
        this.A00 = r1;
        this.A01 = num;
    }

    public static List A00(Iterator it) {
        return ((AnonymousClass5I1) it.next()).A00.A03;
    }
}
