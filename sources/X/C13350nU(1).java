package X;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0nU  reason: invalid class name and case insensitive filesystem */
public final class C13350nU implements AnonymousClass0A2 {
    public final C15730rn A00;
    public final boolean A01;
    public final C11660kZ A02;
    public final Integer A03;

    public final boolean isSampled() {
        return true;
    }

    public final void A5c(String str, Boolean bool) {
        this.A00.A09(str, bool);
    }

    public final void A5v(String str, Double d) {
        this.A00.A0A(str, d);
    }

    public final void A62(C021109v r4, String str) {
        C15730rn r0;
        String str2;
        if (r4 == null) {
            r0 = this.A00;
            str2 = null;
        } else {
            Object value = r4.getValue();
            if (value instanceof String) {
                r0 = this.A00;
                str2 = (String) value;
            } else if (value instanceof Integer) {
                this.A00.A08((Integer) value, str);
                return;
            } else if (value instanceof Long) {
                this.A00.A0C(str, (Long) value);
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass00U.A0L("Enum type expects String, Integer or Long, but got: ", value.toString()));
            }
        }
        r0.A0D(str, str2);
    }

    public final void A69(String str, Float f) {
        this.A00.A0B(str, f);
    }

    public final void A6J(String str, Integer num) {
        this.A00.A08(num, str);
    }

    public final void A6b(String str, Long l) {
        this.A00.A0C(str, l);
    }

    public final void A6d(String str, Map map) {
        C15680ri r0;
        C15730rn r1 = this.A00;
        if (map != null) {
            r0 = C11500kJ.A01(map);
        } else {
            r0 = null;
        }
        r1.A05(r0, str);
    }

    public final void A6i(String str, Object obj) {
        String str2;
        if (obj == null) {
            str2 = null;
        } else if (obj instanceof Integer) {
            A6J(str, (Integer) obj);
            return;
        } else if (obj instanceof Long) {
            A6b(str, (Long) obj);
            return;
        } else if (obj instanceof Boolean) {
            A5c(str, (Boolean) obj);
            return;
        } else if (obj instanceof String) {
            str2 = (String) obj;
        } else if (obj instanceof Float) {
            A69(str, (Float) obj);
            return;
        } else if (obj instanceof Double) {
            A5v(str, (Double) obj);
            return;
        } else if (obj instanceof Map) {
            A6d(str, (Map) obj);
            return;
        } else if (obj instanceof Set) {
            A7d((Set) obj, str);
            return;
        } else if (obj instanceof List) {
            A7u(str, (List) obj);
            return;
        } else if (obj instanceof C021109v) {
            A62((C021109v) obj, str);
            return;
        } else if (obj instanceof AnonymousClass0V3) {
            A7j((AnonymousClass0V3) obj, str);
            return;
        } else {
            throw new RuntimeException("Not supported on IG yet.");
        }
        A7i(str, str2);
    }

    public final void A7c(AnonymousClass0A0 r3, String str) {
        if (r3 == null) {
            this.A00.A0D(str, (String) null);
        } else {
            A6i(str, r3.D7I());
        }
    }

    public final void A7d(Set set, String str) {
        C15560rW r0;
        C15730rn r1 = this.A00;
        if (set != null) {
            r0 = C11500kJ.A02(set);
        } else {
            r0 = null;
        }
        r1.A06(r0, str);
    }

    public final void A7i(String str, String str2) {
        this.A00.A0D(str, str2);
    }

    public final void A7j(AnonymousClass0V3 r3, String str) {
        C15680ri r0;
        C15730rn r1 = this.A00;
        if (r3 != null) {
            r0 = C11500kJ.A01(r3.A00);
        } else {
            r0 = null;
        }
        r1.A05(r0, str);
    }

    public final void A7u(String str, List list) {
        C15560rW r0;
        C15730rn r1 = this.A00;
        if (list != null) {
            r0 = C11500kJ.A02(list);
        } else {
            r0 = null;
        }
        r1.A06(r0, str);
    }

    public final void Bb4() {
        C15730rn r3 = this.A00;
        C11560kP r0 = C11560kP.USL_ENABLED;
        EnumSet enumSet = r3.A06;
        enumSet.add(r0);
        if (this.A01) {
            enumSet.add(C11560kP.IS_LOGGED_FROM_VIEWPOINT);
        }
        Integer num = this.A03;
        Integer num2 = AnonymousClass006.A01;
        C11660kZ r02 = this.A02;
        if (num == num2) {
            r02.Ce1(r3);
        } else {
            r02.Cd7(r3);
        }
    }

    public C13350nU(C15730rn r1, C11660kZ r2, Integer num, boolean z) {
        this.A02 = r2;
        this.A00 = r1;
        this.A03 = num;
        this.A01 = z;
    }
}
