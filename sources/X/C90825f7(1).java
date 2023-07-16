package X;

import android.view.View;

/* renamed from: X.5f7  reason: invalid class name and case insensitive filesystem */
public final class C90825f7 extends C127237gm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C28301F8q A01;

    public C90825f7(C28301F8q f8q, int i) {
        this.A01 = f8q;
        this.A00 = i;
    }

    public final void CLi(C25812DsR dsR) {
        View A08 = this.A01.A0B.A08();
        DON don = dsR.A09;
        A08.setRotation(((float) don.A00) * 10.0f);
        A08.setTranslationX(((float) don.A00) * ((float) this.A00));
        A08.setAlpha((float) don.A00);
    }
}
