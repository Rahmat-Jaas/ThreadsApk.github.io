package X;

/* renamed from: X.07m  reason: invalid class name and case insensitive filesystem */
public final class C016007m extends AnonymousClass0DX {
    public volatile C02880Dg A00;

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new AnonymousClass07p();
    }

    public final /* bridge */ /* synthetic */ boolean A04(AnonymousClass0DW r4) {
        boolean z;
        AnonymousClass07p r42 = (AnonymousClass07p) r4;
        synchronized (this) {
            if (r42 == null) {
                throw new IllegalArgumentException("Null value passed to getSnapshot!");
            } else if (this.A00 == null) {
                z = false;
            } else {
                z = this.A00.BCd(r42);
            }
        }
        return z;
    }
}
