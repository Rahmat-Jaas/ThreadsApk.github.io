package X;

import java.util.List;

/* renamed from: X.0AD  reason: invalid class name */
public final class AnonymousClass0AD implements C03630Kb {
    public final int A00;
    public final List A01;
    public final AnonymousClass0AD A02;
    public final AnonymousClass0JX A03;

    public final String toString() {
        return AnonymousClass00U.A0L(A01(false), " (Kotlin reflection is not available)");
    }

    public static final String A00(AnonymousClass0FL r6) {
        String str;
        StringBuilder sb;
        String str2;
        Integer num = r6.A00;
        if (num == null) {
            return "*";
        }
        AnonymousClass0AD r3 = r6.A01;
        AnonymousClass0AD r1 = r3;
        if (r3 == null) {
            r1 = null;
        }
        if (r1 == null || (str = r1.A01(true)) == null) {
            str = String.valueOf(r3);
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return str;
        }
        if (intValue == 1) {
            sb = new StringBuilder();
            str2 = "in ";
        } else if (intValue == 2) {
            sb = new StringBuilder();
            str2 = "out ";
        } else {
            throw new AnonymousClass4VZ();
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    private final String A01(boolean z) {
        String obj;
        String A0H;
        StringBuilder sb;
        char c;
        AnonymousClass0W7 r2;
        AnonymousClass0JX r3 = this.A03;
        if (!(r3 instanceof AnonymousClass0W7) || (r2 = (AnonymousClass0W7) r3) == null) {
            obj = r3.toString();
        } else {
            Class A002 = AnonymousClass724.A00(r2);
            if ((this.A00 & 4) != 0) {
                obj = "kotlin.Nothing";
            } else if (A002.isArray()) {
                if (A002.equals(boolean[].class)) {
                    obj = "kotlin.BooleanArray";
                } else if (A002.equals(char[].class)) {
                    obj = "kotlin.CharArray";
                } else if (A002.equals(byte[].class)) {
                    obj = "kotlin.ByteArray";
                } else if (A002.equals(short[].class)) {
                    obj = "kotlin.ShortArray";
                } else if (A002.equals(int[].class)) {
                    obj = "kotlin.IntArray";
                } else if (A002.equals(float[].class)) {
                    obj = "kotlin.FloatArray";
                } else if (A002.equals(long[].class)) {
                    obj = "kotlin.LongArray";
                } else if (A002.equals(double[].class)) {
                    obj = "kotlin.DoubleArray";
                } else {
                    obj = "kotlin.Array";
                }
            } else if (!z || !A002.isPrimitive()) {
                obj = A002.getName();
            } else {
                C04220Ms.A0C(r3, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                obj = AnonymousClass724.A01(r2).getName();
            }
        }
        List list = this.A01;
        String str = "";
        if (list.isEmpty()) {
            A0H = str;
        } else {
            A0H = AnonymousClass00J.A0H(", ", "<", ">", list, new AnonymousClass029(this), 24);
        }
        if ((this.A00 & 1) != 0) {
            str = "?";
        }
        String A0V = AnonymousClass00U.A0V(obj, A0H, str);
        AnonymousClass0AD r1 = this.A02;
        if (r1 == null) {
            return A0V;
        }
        String A012 = r1.A01(true);
        if (C04220Ms.A0I(A012, A0V)) {
            return A0V;
        }
        if (C04220Ms.A0I(A012, AnonymousClass00U.A0A(A0V, '?'))) {
            sb = new StringBuilder();
            sb.append(A0V);
            c = '!';
        } else {
            sb = new StringBuilder("(");
            sb.append(A0V);
            sb.append("..");
            sb.append(A012);
            c = ')';
        }
        sb.append(c);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0AD) {
            AnonymousClass0AD r4 = (AnonymousClass0AD) obj;
            if (!C04220Ms.A0I(this.A03, r4.A03) || !C04220Ms.A0I(this.A01, r4.A01) || !C04220Ms.A0I(this.A02, r4.A02) || this.A00 != r4.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.A03.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    public AnonymousClass0AD(List list, AnonymousClass0AD r2, AnonymousClass0JX r3, int i) {
        this.A03 = r3;
        this.A01 = list;
        this.A02 = r2;
        this.A00 = i;
    }

    public final List getAnnotations() {
        return AnonymousClass0ZV.A00;
    }
}
