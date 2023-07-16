package X;

import java.util.List;

/* renamed from: X.5Ls  reason: invalid class name and case insensitive filesystem */
public final class C90365Ls extends AnonymousClass0Sf implements C147068nL {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90365Ls) {
                C90365Ls r5 = (C90365Ls) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AOQ() {
        return this.A02;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getId() {
        return this.A03;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A04, (((((C18180wK.A03(this.A03) + this.A01) * 31) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31);
    }

    public C90365Ls(String str, String str2, List list, int i, int i2) {
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str2;
        this.A04 = list;
    }
}
