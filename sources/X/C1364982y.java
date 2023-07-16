package X;

/* renamed from: X.82y  reason: invalid class name and case insensitive filesystem */
public final class C1364982y implements Runnable {
    public final /* synthetic */ AnonymousClass0gG A00;
    public final /* synthetic */ C132997ur A01;
    public final /* synthetic */ C146208lp A02;
    public final /* synthetic */ boolean A03;

    public C1364982y(AnonymousClass0gG r1, C132997ur r2, C146208lp r3, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        boolean z = this.A03;
        C1202879o r3 = this.A01.A00;
        AnonymousClass0gG r2 = this.A00;
        C146208lp r1 = this.A02;
        if (!z) {
            r3.A01(r2, r1);
        } else if (r3.A04.contains(r1)) {
            r1.CVn(r2);
            C1202879o.A00(r3);
        } else {
            throw C18180wK.A0a("Queue not managed");
        }
    }
}
