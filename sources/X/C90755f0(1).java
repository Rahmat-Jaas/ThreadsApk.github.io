package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.5f0  reason: invalid class name and case insensitive filesystem */
public final class C90755f0 extends AnonymousClass55v {
    public final /* synthetic */ I5H A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90755f0(View view, I5H i5h, int i, boolean z) {
        super(view, i, z);
        this.A00 = i5h;
    }

    public final boolean A0M(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.A0M(view, i, bundle);
        }
        I5H i5h = this.A00;
        int length = i5h.getText().length();
        if (length > 0) {
            i5h.setSelection(length);
        }
        return I5H.A03(i5h);
    }
}
