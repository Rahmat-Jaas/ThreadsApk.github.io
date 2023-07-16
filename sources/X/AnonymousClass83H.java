package X;

import java.lang.ref.WeakReference;

/* renamed from: X.83H  reason: invalid class name */
public final class AnonymousClass83H implements Runnable {
    public final /* synthetic */ AnonymousClass7EN A00;
    public final /* synthetic */ AnonymousClass8jO A01;
    public final /* synthetic */ AnonymousClass945 A02;
    public final /* synthetic */ D1C A03;
    public final /* synthetic */ Double A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass83H(AnonymousClass7EN r1, AnonymousClass8jO r2, AnonymousClass945 r3, D1C d1c, Double d, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A07 = z;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = d;
        this.A03 = d1c;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8jO r0;
        AnonymousClass7EN r1 = this.A00;
        if (AnonymousClass0wJ.A1X(r1.A0B.getValue())) {
            WeakReference weakReference = r1.A00;
            if (weakReference != null) {
                r0 = (AnonymousClass8jO) weakReference.get();
            } else {
                return;
            }
        } else {
            r0 = this.A01;
        }
        if (r0 != null) {
            boolean z = this.A07;
            String str = this.A05;
            String str2 = this.A06;
            Double d = this.A04;
            r0.AEP(this.A02, this.A03, d, str, str2, z);
        }
    }
}
