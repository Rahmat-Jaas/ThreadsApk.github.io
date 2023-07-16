package X;

import android.view.View;

/* renamed from: X.7go  reason: invalid class name and case insensitive filesystem */
public final class C127257go implements C27927Evd {
    public final /* synthetic */ C112756q8 A00;
    public final /* synthetic */ AnonymousClass0ZU A01;
    public final /* synthetic */ C04180Mo A02;

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLg(C25812DsR dsR) {
    }

    public final void CLh(C25812DsR dsR) {
    }

    public C127257go(C112756q8 r1, AnonymousClass0ZU r2, C04180Mo r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void CLi(C25812DsR dsR) {
        if (dsR != null) {
            C04180Mo r6 = this.A02;
            C112756q8 r5 = this.A00;
            AnonymousClass0ZU r7 = this.A01;
            if (!r6.A00 && Math.abs(dsR.A09.A00) > 0.5d) {
                View view = r5.A00;
                view.setScaleX(view.getScaleX() * ((float) -1));
                r7.invoke();
                r6.A00 = true;
                ((C25812DsR) C18190wL.A0f(r5.A03)).A0F(this);
            }
        }
    }
}
