package X;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.08c  reason: invalid class name and case insensitive filesystem */
public final class C017008c implements AnonymousClass0F4 {
    public final AnonymousClass01Q A00;
    public final AnonymousClass012 A01;
    public final List A02 = new ArrayList(2);
    public final AnonymousClass0F2 A03;

    public final synchronized void A6m(C03170Es r2, AnonymousClass012 r3) {
        this.A02.add(r2);
    }

    public final boolean BhS() {
        return false;
    }

    public final C03170Es[] AV3(Parcelable parcelable, AnonymousClass01Q r5, C04650On r6) {
        C03170Es[] r0;
        AnonymousClass0F2 r02 = this.A03;
        r6.A00 = new AnonymousClass0QT(r02.A00, r02.A01);
        r6.A03 = true;
        synchronized (this) {
            List list = this.A02;
            r0 = (C03170Es[]) list.toArray(new C03170Es[list.size()]);
        }
        return r0;
    }

    public C017008c(AnonymousClass01Q r3, AnonymousClass012 r4, AnonymousClass0F2 r5) {
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r5;
    }

    public final AnonymousClass01Q AXy() {
        return this.A00;
    }

    public final AnonymousClass012 Arx() {
        return this.A01;
    }
}
