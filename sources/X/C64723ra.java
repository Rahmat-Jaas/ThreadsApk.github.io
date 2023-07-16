package X;

import android.view.View;

/* renamed from: X.3ra  reason: invalid class name and case insensitive filesystem */
public final class C64723ra implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C18458Afp A02;
    public final /* synthetic */ EBU A03;
    public final /* synthetic */ C57993Dj A04;
    public final /* synthetic */ C28161tl A05;
    public final /* synthetic */ Object A06;

    public C64723ra(View view, C18458Afp afp, EBU ebu, C57993Dj r4, C28161tl r5, Object obj, int i) {
        this.A05 = r5;
        this.A00 = i;
        this.A04 = r4;
        this.A01 = view;
        this.A06 = obj;
        this.A03 = ebu;
        this.A02 = afp;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(-1354801925);
        AnonymousClass0wJ.A11(C28161tl.A02(this.A05), "zero_rating_explore_video_nux_count", this.A00 + 1);
        C57993Dj r1 = this.A04;
        if (this.A06 instanceof BKU) {
            r1.A00();
        }
        C14030oh.A0C(1203375089, A052);
    }
}
