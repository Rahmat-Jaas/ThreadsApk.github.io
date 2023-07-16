package X;

/* renamed from: X.06T  reason: invalid class name */
public final class AnonymousClass06T implements C02940Dm {
    public final C002000x A00 = new C002000x();

    public final /* bridge */ /* synthetic */ void Cdb(AnonymousClass0DW r6, C02930Dl r7) {
        AnonymousClass0A6 r62 = (AnonymousClass0A6) r6;
        int i = 0;
        while (true) {
            C002000x r3 = this.A00;
            if (i < r3.size()) {
                Class cls = (Class) r3.A02[i << 1];
                if (r62.A08(cls)) {
                    ((C02940Dm) r3.get(cls)).Cdb(r62.A04(cls), r7);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
