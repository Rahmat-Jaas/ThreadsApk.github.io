package X;

import java.util.List;

/* renamed from: X.3ID  reason: invalid class name */
public final class AnonymousClass3ID {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3ID)) {
            return false;
        }
        AnonymousClass3ID r4 = (AnonymousClass3ID) obj;
        if (!C04220Ms.A0I(this.A02, r4.A02) || !C04220Ms.A0I(this.A00, r4.A00) || !C04220Ms.A0I(this.A01, r4.A01) || !C04220Ms.A0I(this.A03, r4.A03)) {
            return false;
        }
        return C04220Ms.A0I(this.A04, r4.A04);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A04, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A07(this.A00, C18180wK.A03(this.A02)))));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ForeignKey{referenceTable='");
        A0s.append(this.A02);
        A0s.append("', onDelete='");
        A0s.append(this.A00);
        A0s.append(" +', onUpdate='");
        A0s.append(this.A01);
        A0s.append("', columnNames=");
        A0s.append(this.A03);
        A0s.append(", referenceColumnNames=");
        A0s.append(this.A04);
        return C18190wL.A0o(A0s);
    }

    public AnonymousClass3ID(String str, String str2, String str3, List list, List list2) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, list);
        C04220Ms.A0B(list2, 5);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }
}
