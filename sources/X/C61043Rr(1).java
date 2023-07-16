package X;

/* renamed from: X.3Rr  reason: invalid class name and case insensitive filesystem */
public final class C61043Rr {
    public final AnonymousClass601 A00;

    public static Object A00(AnonymousClass601 r5, C63893iY r6, C109326jp r7) {
        Object obj;
        AnonymousClass7HV A01;
        AnonymousClass7HV A012;
        AnonymousClass7HV A013;
        C41228M0s.A01("LispyEvaluation");
        AnonymousClass326.A04.incrementAndGet();
        AnonymousClass3HX r4 = r5.A00;
        if (!(r4 == null || (A013 = AnonymousClass7K7.A01(r4)) == null || !AnonymousClass7J1.A04())) {
            A013.A00++;
        }
        try {
            obj = AnonymousClass70N.A00(r6, r5, r7);
        } catch (AnonymousClass6C9 e) {
            C30967GcS.A01(r4, "BloksInterpreter", "Exception while evaluating Lispy Script", e, 0);
            obj = null;
        } catch (Throwable th) {
            C41228M0s.A00();
            if (!(r4 == null || (A012 = AnonymousClass7K7.A01(r4)) == null)) {
                A012.A05();
            }
            throw th;
        }
        C41228M0s.A00();
        if (!(r4 == null || (A01 = AnonymousClass7K7.A01(r4)) == null)) {
            A01.A05();
        }
        return obj;
    }

    public C61043Rr(AnonymousClass601 r1) {
        this.A00 = r1;
    }
}
