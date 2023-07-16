package X;

import java.util.List;

/* renamed from: X.18i  reason: invalid class name */
public final class AnonymousClass18i extends AnonymousClass0Sf implements C21552BwG {
    public final String A00;
    public final List A01;

    public final AnonymousClass18i D26(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass18i D27(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18i) {
                AnonymousClass18i r5 = (AnonymousClass18i) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18180wK.A03(this.A00));
    }

    public AnonymousClass18i(String str, List list) {
        AnonymousClass0wJ.A1O(str, list);
        this.A00 = str;
        this.A01 = list;
    }
}
