package X;

import android.os.Handler;
import java.util.concurrent.Semaphore;

/* renamed from: X.47k  reason: invalid class name */
public final class AnonymousClass47k implements C10390iG {
    public static AnonymousClass47k A06;
    public boolean A00;
    public boolean A01;
    public final Handler A02 = AnonymousClass0wJ.A0F();
    public final AnonymousClass0gG A03 = new AnonymousClass1mF(this);
    public final C08350dD A04;
    public final Semaphore A05;

    public AnonymousClass47k(C08350dD r3) {
        this.A04 = r3;
        this.A05 = new Semaphore(1);
        C691847d.A02(this);
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-1535473142);
        if (this.A01) {
            if (this.A00) {
                this.A02.removeCallbacks(this.A03);
            }
            throw new AnonymousClass4VS();
        }
        C14030oh.A0A(-359698558, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(346195037, C14030oh.A03(-1108619083));
    }
}
