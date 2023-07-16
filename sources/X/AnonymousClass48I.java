package X;

import android.view.View;

/* renamed from: X.48I  reason: invalid class name */
public final class AnonymousClass48I implements C41882MfV {
    public final int A00;
    public final View.OnClickListener A01;

    public /* synthetic */ AnonymousClass48I(int i) {
        C65173sU r0 = C65173sU.A00;
        this.A00 = i;
        this.A01 = r0;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass48I r3 = (AnonymousClass48I) obj;
        C04220Ms.A0B(r3, 0);
        return AnonymousClass0wJ.A1T(this.A00, r3.A00);
    }
}
