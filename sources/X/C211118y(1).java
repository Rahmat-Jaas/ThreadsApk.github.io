package X;

/* renamed from: X.18y  reason: invalid class name and case insensitive filesystem */
public final class C211118y extends AnonymousClass0Sf implements C41882MfV {
    public final C61353Sw A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C211118y) && C04220Ms.A0I(this.A00, ((C211118y) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.A03.size());
    }

    public C211118y(C61353Sw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C04220Ms.A0I(obj, this);
    }
}
