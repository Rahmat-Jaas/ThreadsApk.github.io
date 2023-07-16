package X;

import com.facebook.forker.Process;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.59e  reason: invalid class name and case insensitive filesystem */
public final class C885659e extends C98486Fs implements Iterable, C03740Kn {
    public static final C885659e A05 = new C885659e((Object) null, (Object) null, AnonymousClass0ZV.A00, 0, 0);
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final List A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C885659e(Object obj, Object obj2, List list) {
        this(obj, obj2, list, Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT);
        C04220Ms.A0B(list, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C885659e) {
                C885659e r5 = (C885659e) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((C18210wN.A04(this.A04) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A02)) * 31) + this.A01) * 31) + this.A00;
    }

    public final Iterator iterator() {
        return this.A04.listIterator();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LoadResult.Page(\n                    |   data size: ");
        List list = this.A04;
        A0s.append(list.size());
        A0s.append("\n                    |   first Item: ");
        A0s.append(AnonymousClass00J.A0D(list));
        A0s.append("\n                    |   last Item: ");
        A0s.append(AnonymousClass00J.A0F(list));
        A0s.append("\n                    |   nextKey: ");
        A0s.append(this.A02);
        A0s.append("\n                    |   prevKey: ");
        A0s.append(this.A03);
        A0s.append("\n                    |   itemsBefore: ");
        A0s.append(this.A01);
        A0s.append("\n                    |   itemsAfter: ");
        A0s.append(this.A00);
        return AnonymousClass4n8.A09(C18180wK.A0i("\n                    |) ", A0s), "|");
    }

    public C885659e(Object obj, Object obj2, List list, int i, int i2) {
        this.A04 = list;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A00 = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw C18190wL.A0a("itemsBefore cannot be negative");
        } else if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw C18190wL.A0a("itemsAfter cannot be negative");
        }
    }
}
