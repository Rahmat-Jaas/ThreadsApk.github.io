package X;

/* renamed from: X.3TO  reason: invalid class name */
public final class AnonymousClass3TO {
    public int A00;
    public C013306f A01 = new C013306f();
    public C013306f A02 = new C013306f();
    public C013306f A03 = new C013306f();
    public C013306f A04 = new C013306f();
    public C013306f A05 = new C013306f();
    public C013306f A06 = new C013306f();
    public C013306f A07 = new C013306f();
    public C001000m A08 = new C001000m();
    public AnonymousClass34K A09;
    public String A0A;

    public static void A00(AnonymousClass3TO r8, Long l, Object obj, String str) {
        C013306f r4 = r8.A04;
        Number number = (Number) r4.get(str);
        if (number != null) {
            long longValue = l.longValue() - number.longValue();
            r4.remove(str);
            if (r8.A00 == 0) {
                r8.A05.put(str, obj);
                if (longValue >= 0) {
                    r8.A0A.getClass();
                    obj.getClass();
                    AnonymousClass3SG r2 = new AnonymousClass3SG(obj, r8.A08.contains(str));
                    r8.A09.A00.Bcu(r2, r2.A01);
                    return;
                }
                return;
            }
            long j = longValue;
            C013306f r5 = r8.A06;
            Number number2 = (Number) r5.get(str);
            if (number2 != null) {
                j = Math.max(number2.longValue(), longValue);
            }
            r5.put(str, Long.valueOf(j));
            long j2 = longValue;
            C013306f r52 = r8.A07;
            Number number3 = (Number) r52.get(str);
            if (number3 != null) {
                j2 = longValue + number3.longValue();
            }
            r52.put(str, Long.valueOf(j2));
            C013306f r1 = r8.A02;
            if (!r1.containsKey(str)) {
                r1.put(str, Long.valueOf(longValue));
            }
            r8.A03.put(str, Long.valueOf(longValue));
            if (r8.A00 == 1) {
                r8.A05.put(str, obj);
            }
        }
    }
}
