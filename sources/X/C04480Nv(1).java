package X;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;

/* renamed from: X.0Nv  reason: invalid class name and case insensitive filesystem */
public final class C04480Nv extends C02290Ao {
    public final /* bridge */ /* synthetic */ C02280An A06(C02280An r5, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AnonymousClass0AV A02 = AnonymousClass0M3.A01().A02(byteArrayOutputStream);
        if (A02.A0B(this)) {
            Iterator it = this.A07.iterator();
            if (!it.hasNext()) {
                return new AnonymousClass0OS(A02, this, byteArrayOutputStream);
            }
            it.next();
            throw new NullPointerException("onBatchCreated");
        }
        throw new IllegalStateException("Couldn't lock newly created batch");
    }

    public final /* bridge */ /* synthetic */ Object A07() {
        C02280An r0 = this.A02;
        if (r0 == null) {
            return null;
        }
        return ((AnonymousClass0OS) r0).A00;
    }

    public C04480Nv(AnonymousClass0AG r1, AnonymousClass0AU r2, AnonymousClass0LI r3, int i, int i2, int i3) {
        super(r1, r2, r3, i, i2, i3);
    }
}
