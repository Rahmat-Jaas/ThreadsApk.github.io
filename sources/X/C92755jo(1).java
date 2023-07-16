package X;

import android.os.Bundle;

/* renamed from: X.5jo  reason: invalid class name and case insensitive filesystem */
public final class C92755jo extends AnonymousClass56H implements C143648h5 {
    public AnonymousClass5qo A00;
    public C92835jw A01;

    public final boolean Bzy(Bundle bundle, int i, boolean z) {
        AnonymousClass5qo r0 = this.A00;
        if (r0 != null) {
            r0.dismiss();
        }
        return super.Bzy(bundle, i, z);
    }

    public final void A00() {
        super.A00();
        C86104wH.A1F(this, this.A01.A0A, 246);
        C86104wH.A1F(this, this.A01.A0B, 247);
        C86114wI.A1A(this, this.A01.A09, C86114wI.A0Q(this, 248), 275);
    }

    public final void A01() {
        super.A01();
        this.A01 = (C92835jw) this.A04;
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(526805403);
        super.onDestroyView();
        AnonymousClass5qo r0 = this.A00;
        if (r0 != null) {
            r0.dismiss();
        }
        C14030oh.A09(585951228, A02);
    }
}
