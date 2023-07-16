package X;

import android.view.View;

/* renamed from: X.7RC  reason: invalid class name */
public final class AnonymousClass7RC implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass5A8 A00;
    public final /* synthetic */ Float A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass7RC(AnonymousClass5A8 r1, Float f, String str, String str2) {
        this.A01 = f;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(220441908);
        Float f = this.A01;
        if (f != null) {
            AnonymousClass5A8 r0 = this.A00;
            E6Z.A00(new C22812Cgd(this.A03, this.A02, r0.A01, f.floatValue()), r0.A00);
        }
        C14030oh.A0C(-1439727568, A05);
    }
}
