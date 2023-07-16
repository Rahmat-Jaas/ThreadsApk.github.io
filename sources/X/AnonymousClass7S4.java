package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.7S4  reason: invalid class name */
public final class AnonymousClass7S4 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass5z9 A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ C127397h3 A03;
    public final /* synthetic */ C109326jp A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass7S4(View view, AnonymousClass5z9 r2, AnonymousClass3HX r3, C127397h3 r4, C109326jp r5, boolean z, boolean z2) {
        this.A01 = r2;
        this.A06 = z;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A06) {
            C146408mC r1 = (C146408mC) this.A00;
            r1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            r1.setChecked(this.A05);
            r1.setOnCheckedChangeListener(this);
        }
        C109326jp r4 = this.A04;
        if (r4 != null) {
            C127397h3 r3 = this.A03;
            AnonymousClass3VO A0d = C86124wJ.A0d(r3);
            A0d.A03(Boolean.valueOf(z), 1);
            AnonymousClass3HX r0 = this.A02;
            A0d.A03(r0, 2);
            C122047Jt.A07(r0, r3, A0d, r4);
        }
    }
}
