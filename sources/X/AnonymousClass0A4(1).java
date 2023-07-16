package X;

/* renamed from: X.0A4  reason: invalid class name */
public final class AnonymousClass0A4 extends AnonymousClass0DX {
    public final C002000x A00;

    public AnonymousClass0A4(C002000x r2) {
        C002000x r0 = new C002000x();
        this.A00 = r0;
        r0.A08(r2);
    }

    /* renamed from: A05 */
    public final AnonymousClass0A6 A03() {
        AnonymousClass0A6 r6 = new AnonymousClass0A6();
        C002000x r5 = this.A00;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            Object[] objArr = r5.A02;
            int i2 = i << 1;
            Object obj = objArr[i2];
            r6.A00.put(obj, ((AnonymousClass0DX) objArr[i2 + 1]).A03());
            r6.A01.put(obj, Boolean.FALSE);
        }
        return r6;
    }

    /* renamed from: A06 */
    public final boolean A04(AnonymousClass0A6 r8) {
        boolean z;
        AnonymousClass0DZ.A00(r8);
        C002000x r6 = r8.A00;
        int size = r6.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Class cls = (Class) r6.A02[i << 1];
            AnonymousClass0DX r1 = (AnonymousClass0DX) this.A00.get(cls);
            if (r1 != null) {
                z = r1.A04(r8.A04(cls));
            } else {
                z = false;
            }
            r8.A07(cls, z);
            z2 |= z;
        }
        return z2;
    }
}
