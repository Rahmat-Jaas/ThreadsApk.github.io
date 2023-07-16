package X;

import java.util.List;

/* renamed from: X.6vx  reason: invalid class name and case insensitive filesystem */
public final class C115816vx {
    public static final void A00(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(AnonymousClass00U.A0Z("Index ", " is out of bounds. The list has ", " elements.", i, size));
        }
    }

    public static final void A01(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw C18190wL.A0a(AnonymousClass00U.A0Z("Indices are out of order. fromIndex (", ") is greater than toIndex (", ").", i, i2));
        } else if (i < 0) {
            throw new IndexOutOfBoundsException(AnonymousClass00U.A0S("fromIndex (", ") is less than 0.", i));
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException(C86134wK.A0l(i2, size, "toIndex (", ") is more than than the list size ("));
        }
    }
}
