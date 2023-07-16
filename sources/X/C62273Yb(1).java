package X;

import android.net.Uri;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.3Yb  reason: invalid class name and case insensitive filesystem */
public abstract class C62273Yb {
    public final Uri A00;
    public final C15460rM A01;
    public final String A02;
    public final AnonymousClass3HH A03;
    public final C307822y A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C62273Yb)) {
            return false;
        }
        C62273Yb r4 = (C62273Yb) obj;
        if (!this.A00.equals(r4.A00)) {
            return false;
        }
        AnonymousClass3HH r1 = this.A03;
        AnonymousClass3HH r0 = r4.A03;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
        } else if (!r1.equals(r0)) {
            return false;
        }
        C15460rM r12 = this.A01;
        C15460rM r02 = r4.A01;
        if (r12 == null) {
            if (r02 != null) {
                return false;
            }
        } else if (!r12.equals(r02)) {
            return false;
        }
        if (this.A02.equals(r4.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A03, this.A04, this.A01});
    }

    public C62273Yb(C307822y r3) {
        this.A00 = Uri.EMPTY;
        this.A03 = null;
        this.A04 = r3;
        this.A02 = "";
        this.A01 = null;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (obj == ((C62273Yb) next).A04) {
            abstractCollection.add(next);
        }
    }

    public C62273Yb(C15460rM r2, String str, String str2, AnonymousClass3HH r5, C307822y r6) {
        this.A00 = C18210wN.A0A(str);
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = str2;
        this.A01 = r2;
    }
}
