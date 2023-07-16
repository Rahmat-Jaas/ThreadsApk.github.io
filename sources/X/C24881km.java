package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.1km  reason: invalid class name and case insensitive filesystem */
public final class C24881km extends AnonymousClass1lO {
    public final C84844tx A00;
    public final AnonymousClass4JW A01;

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        this.A01.AAl(this.A00, ((AnonymousClass1lC) mfV).A00, (C202513v) m5o);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C202513v(this.A01.Bhn(layoutInflater, viewGroup));
    }

    public final Class modelClass() {
        return AnonymousClass1lC.class;
    }

    public C24881km(C11630kW r2, C84844tx r3) {
        this.A00 = r3;
        this.A01 = new AnonymousClass4JW(r2);
    }
}
