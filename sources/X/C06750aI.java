package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0aI  reason: invalid class name and case insensitive filesystem */
public class C06750aI extends AnonymousClass0OP {
    public static final int A12(Comparable comparable, List list, int i) {
        int i2 = 0;
        A1B(list.size(), i);
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int A00 = AnonymousClass722.A00((Comparable) list.get(i4), comparable);
            if (A00 < 0) {
                i2 = i4 + 1;
            } else if (A00 <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int A13(List list, AnonymousClass0YY r5, int i) {
        int i2 = 0;
        A1B(list.size(), i);
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int intValue = ((Number) r5.invoke(list.get(i4))).intValue();
            if (intValue < 0) {
                i2 = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final ArrayList A14(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new AnonymousClass83W(objArr, true));
    }

    public static final List A16(List list) {
        C04220Ms.A0B(list, 0);
        int size = list.size();
        if (size == 0) {
            return AnonymousClass0ZV.A00;
        }
        if (size != 1) {
            return list;
        }
        List singletonList = Collections.singletonList(list.get(0));
        C04220Ms.A06(singletonList);
        return singletonList;
    }

    public static final List A17(Object... objArr) {
        C04220Ms.A0B(objArr, 0);
        if (objArr.length <= 0) {
            return AnonymousClass0ZV.A00;
        }
        List asList = Arrays.asList(objArr);
        C04220Ms.A06(asList);
        return asList;
    }

    public static final List A18(Object... objArr) {
        C04220Ms.A0B(objArr, 0);
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new AnonymousClass83W(objArr, true));
    }

    public static final void A1B(int i, int i2) {
        if (0 > i2) {
            throw new IllegalArgumentException(AnonymousClass00U.A0Z("fromIndex (", ") is greater than toIndex (", ").", 0, i2));
        } else if (i2 > i) {
            throw new IndexOutOfBoundsException(AnonymousClass00U.A0Z("toIndex (", ") is greater than size (", ").", i2, i));
        }
    }

    public static final List A15(Object obj) {
        if (obj == null) {
            return AnonymousClass0ZV.A00;
        }
        List singletonList = Collections.singletonList(obj);
        C04220Ms.A06(singletonList);
        return singletonList;
    }

    public static final void A19() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void A1A() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
