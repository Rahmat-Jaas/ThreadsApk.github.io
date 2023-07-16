package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Function;

/* renamed from: X.0Lk  reason: invalid class name and case insensitive filesystem */
public final class C03940Lk {
    public static Collection A00(Object obj) {
        if (!(obj instanceof C03740Kn) || (obj instanceof AnonymousClass0AC)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e) {
                C04220Ms.A0F(C03940Lk.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    public static List A01(Object obj) {
        if (!(obj instanceof C03740Kn) || (obj instanceof AnonymousClass028)) {
            try {
                return (List) obj;
            } catch (ClassCastException e) {
                C04220Ms.A0F(C03940Lk.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableList");
            throw null;
        }
    }

    public static Map A02(Object obj) {
        if (!(obj instanceof C03740Kn) || (obj instanceof AnonymousClass0WC)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e) {
                C04220Ms.A0F(C03940Lk.class.getName(), e);
                throw e;
            }
        } else {
            A04(obj, "kotlin.collections.MutableMap");
            throw null;
        }
    }

    public static void A03(Object obj, int i) {
        if (obj != null && !A05(i, obj)) {
            A04(obj, AnonymousClass00U.A0J("kotlin.jvm.functions.Function", i));
            throw null;
        }
    }

    public static void A04(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(AnonymousClass00U.A0V(name, " cannot be cast to ", str));
        C04220Ms.A0F(C03940Lk.class.getName(), classCastException);
        throw classCastException;
    }

    public static boolean A05(int i, Object obj) {
        int i2;
        if (obj instanceof Function) {
            if (obj instanceof C05920Wy) {
                i2 = ((C05920Wy) obj).getArity();
            } else if (obj instanceof AnonymousClass0ZU) {
                i2 = 0;
            } else if (obj instanceof AnonymousClass0YY) {
                i2 = 1;
            } else if (obj instanceof AnonymousClass0YP) {
                i2 = 2;
            } else if (obj instanceof AnonymousClass0YM) {
                i2 = 3;
            } else if (obj instanceof AnonymousClass0YC) {
                i2 = 4;
            } else if (obj instanceof AnonymousClass0Y0) {
                i2 = 5;
            } else if (obj instanceof C06080Xo) {
                i2 = 6;
            } else if (obj instanceof C06070Xn) {
                i2 = 7;
            } else if (obj instanceof AnonymousClass0XZ) {
                i2 = 8;
            } else if (obj instanceof AnonymousClass0XO) {
                i2 = 9;
            } else if (obj instanceof AnonymousClass0ZL) {
                i2 = 10;
            } else if (obj instanceof AnonymousClass0ZK) {
                i2 = 11;
            } else if (obj instanceof AnonymousClass0Z3) {
                i2 = 13;
            } else if (obj instanceof C06360Yz) {
                i2 = 14;
            } else if (obj instanceof C06340Yx) {
                i2 = 15;
            } else if (obj instanceof C06330Yw) {
                i2 = 16;
            } else if (obj instanceof C06260Yl) {
                i2 = 17;
            } else if (obj instanceof C06190Ya) {
                i2 = 18;
            } else if (obj instanceof AnonymousClass0YZ) {
                i2 = 19;
            } else if (obj instanceof AnonymousClass0YT) {
                i2 = 20;
            } else {
                i2 = -1;
                if (obj instanceof AnonymousClass0YR) {
                    i2 = 21;
                }
            }
            if (i2 != i) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A06(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof C03740Kn) || (obj instanceof AnonymousClass028)) {
            return true;
        }
        return false;
    }

    public static boolean A07(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof C03740Kn) || (obj instanceof AnonymousClass0WV)) {
            return true;
        }
        return false;
    }
}
