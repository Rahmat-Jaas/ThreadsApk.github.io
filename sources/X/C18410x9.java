package X;

import android.database.DataSetObserver;

/* renamed from: X.0x9  reason: invalid class name and case insensitive filesystem */
public final class C18410x9 extends DataSetObserver {
    public final /* synthetic */ AnonymousClass3G8 A00;

    public C18410x9(AnonymousClass3G8 r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        AnonymousClass3G8 r2 = this.A00;
        r2.A00(r2.A03, r2.A04.getItemCount());
    }
}
