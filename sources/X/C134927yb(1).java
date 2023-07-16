package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7yb  reason: invalid class name and case insensitive filesystem */
public final class C134927yb implements Iterable, C03740Kn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ArrayList A04 = AnonymousClass0wJ.A0v();
    public boolean A05;
    public int[] A06 = new int[0];
    public Object[] A07 = new Object[0];

    public final int A00(C104036b8 r3) {
        C04220Ms.A0B(r3, 0);
        if (!this.A05) {
            int i = r3.A00;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw C18190wL.A0a("Anchor refers to a group that was removed");
        }
        AnonymousClass7J4.A02("Use active SlotWriter to determine anchor location instead");
        throw null;
    }

    public final AnonymousClass7AV A01() {
        if (!this.A05) {
            this.A01++;
            return new AnonymousClass7AV(this);
        }
        throw C18180wK.A0a("Cannot read while a writer is pending");
    }

    public final C122137Ks A02() {
        String str;
        if (!(!this.A05)) {
            str = "Cannot start a writer when another writer is pending";
        } else if (this.A01 <= 0) {
            this.A05 = true;
            this.A03++;
            return new C122137Ks(this);
        } else {
            str = "Cannot start a writer when a reader is pending";
        }
        AnonymousClass7J4.A02(str);
        throw null;
    }

    public final Iterator iterator() {
        return new AnonymousClass847(this, 0, this.A00);
    }
}
