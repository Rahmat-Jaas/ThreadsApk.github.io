package X;

import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0ri  reason: invalid class name and case insensitive filesystem */
public final class C15680ri implements C11720kh {
    public final C11590kS A00 = new C11590kS();

    public final void A0I(StringBuilder sb, String str) {
        int i = 0;
        while (true) {
            C11590kS r3 = this.A00;
            if (i < r3.A00) {
                sb.append(str);
                int i2 = i << 1;
                C11590kS.A00(r3, i, i2);
                ArrayList arrayList = r3.A01;
                sb.append((String) arrayList.get(i2));
                sb.append(" = ");
                int i3 = i2 + 1;
                C11590kS.A00(r3, i, i3);
                C11500kJ.A07(sb, str, arrayList.get(i3));
                sb.append(10);
                i++;
            } else {
                return;
            }
        }
    }

    public final AnalyticsEventDebugInfo CxC() {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(2);
        int i = 0;
        while (true) {
            C11590kS r3 = this.A00;
            if (i >= r3.A00) {
                return analyticsEventDebugInfo;
            }
            int i2 = i << 1;
            C11590kS.A00(r3, i, i2);
            ArrayList arrayList = r3.A01;
            int i3 = i2 + 1;
            C11590kS.A00(r3, i, i3);
            C11500kJ.A05(analyticsEventDebugInfo, arrayList.get(i3), (String) arrayList.get(i2));
            i++;
        }
    }

    public final Boolean A00(String str) {
        Object A01 = this.A00.A01(str);
        if (A01 == null) {
            return null;
        }
        if (A01 instanceof Boolean) {
            return (Boolean) A01;
        }
        AnonymousClass0LU.A0B("ExtraBundle", AnonymousClass00U.A0V("You are trying get value as Boolean from key: ", str, " but the value type is not Boolean. Please check again if you use it to log USL."));
        return null;
    }

    public final Double A01(String str) {
        Object A01 = this.A00.A01(str);
        if (A01 == null) {
            return null;
        }
        if (A01 instanceof Double) {
            return (Double) A01;
        }
        AnonymousClass0LU.A0B("ExtraBundle", AnonymousClass00U.A0V("You are trying get value as Double from key: ", str, " but the value type is not Double. Please check again if you use it to log USL."));
        return null;
    }

    public final Integer A02(String str) {
        Object A01 = this.A00.A01(str);
        if (A01 == null) {
            return null;
        }
        if (A01 instanceof Integer) {
            return (Integer) A01;
        }
        AnonymousClass0LU.A0B("ExtraBundle", AnonymousClass00U.A0V("You are trying get value as Integer from key: ", str, " but the value type is not Integer. Please check again if you use it to log USL."));
        return null;
    }

    public final Long A03(String str) {
        Object A01 = this.A00.A01(str);
        if (A01 == null) {
            return null;
        }
        if (A01 instanceof Long) {
            return (Long) A01;
        }
        AnonymousClass0LU.A0B("ExtraBundle", AnonymousClass00U.A0V("You are trying get value as Long from key: ", str, " but the value type is not Long. Please check again if you use it to log USL."));
        return null;
    }

    public final String A04(String str) {
        Object A01 = this.A00.A01(str);
        if (A01 == null) {
            return null;
        }
        if (A01 instanceof String) {
            return (String) A01;
        }
        AnonymousClass0LU.A0B("ExtraBundle", AnonymousClass00U.A0V("You are trying get value as String from key: ", str, " but the value type is not String. Please check again if you use it to log USL."));
        return null;
    }

    public final List A05(String str) {
        C15560rW r0 = (C15560rW) this.A00.A01(str);
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final void A06(AnonymousClass0KD r7) {
        C11590kS r5 = this.A00;
        int i = r5.A00;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 << 1;
            C11590kS.A00(r5, i2, i3);
            ArrayList arrayList = r5.A01;
            String str = (String) arrayList.get(i3);
            if (!str.isEmpty()) {
                int i4 = (i2 << 1) + 1;
                C11590kS.A00(r5, i2, i4);
                Object obj = arrayList.get(i4);
                if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    if (obj instanceof C15680ri) {
                        AnonymousClass0KD A02 = r7.A01.A02();
                        r7.A0D(A02, str);
                        ((C15680ri) obj).A06(A02);
                    } else if (obj instanceof C15560rW) {
                        C03590Jr A01 = r7.A01.A01();
                        r7.A0D(A01, str);
                        ((C15560rW) obj).A03(A01);
                    }
                }
                AnonymousClass0KD.A00(r7, obj, str);
            }
        }
    }

    public final void A07(C15680ri r2, String str) {
        this.A00.A02(str, r2);
    }

    public final void A08(C15560rW r2, String str) {
        this.A00.A02(str, r2);
    }

    public final void A09(Integer num, String str) {
        this.A00.A02(str, num);
    }

    public final void A0A(String str, Boolean bool) {
        this.A00.A02(str, bool);
    }

    public final void A0B(String str, Double d) {
        this.A00.A02(str, d);
    }

    public final void A0C(String str, Long l) {
        this.A00.A02(str, l);
    }

    public final void A0D(String str, String str2) {
        this.A00.A02(str, str2);
    }

    public final void A0E(String str, List list) {
        C15560rW r2 = new C15560rW();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.A04((String) it.next());
        }
        this.A00.A02(str, r2);
    }

    public final void A0F(String str, List list) {
        C15560rW r3 = new C15560rW();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r3.A00.add(((C11480kH) it.next()).A00());
        }
        this.A00.A02(str, r3);
    }

    public final void A0G(String str, List list) {
        C15560rW r3 = new C15560rW();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15680ri r1 = new C15680ri();
            r1.A0J((Map) it.next());
            r3.A00.add(r1);
        }
        this.A00.A02(str, r3);
    }

    public final void A0H(String str, String[] strArr) {
        C15560rW r3 = new C15560rW();
        for (String A04 : strArr) {
            r3.A04(A04);
        }
        this.A00.A02(str, r3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15680ri)) {
            return false;
        }
        return C002401c.A00(this.A00, ((C15680ri) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str;
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("{");
        int i = 0;
        while (true) {
            C11590kS r5 = this.A00;
            if (i < r5.A00) {
                int i2 = (i << 1) + 1;
                C11590kS.A00(r5, i, i2);
                ArrayList arrayList = r5.A01;
                Object obj = arrayList.get(i2);
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = "";
                }
                int i3 = i << 1;
                C11590kS.A00(r5, i, i3);
                StringWriter append = stringWriter.append((String) arrayList.get(i3)).append("=");
                if (str.isEmpty()) {
                    str = "null";
                }
                append.append(str);
                if (i < r5.A00 - 1) {
                    stringWriter.append(", ");
                }
                i++;
            } else {
                stringWriter.append("}");
                return stringWriter.toString();
            }
        }
    }

    public final void A0J(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A0D((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void A0K(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.A00.A02(entry.getKey().toString(), entry.getValue());
        }
    }

    public final void A0L(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) entry.getValue()) {
                arrayList.add(obj.toString());
            }
            A0E(entry.getKey().toString(), arrayList);
        }
    }

    public final void A0M(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A0D(entry.getKey().toString(), (String) entry.getValue());
        }
    }

    public final void A0N(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            this.A00.A02((String) entry.getKey(), value);
        }
    }

    public final void A0O(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A0E((String) entry.getKey(), (List) entry.getValue());
        }
    }
}
