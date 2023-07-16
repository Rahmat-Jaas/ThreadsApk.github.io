package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.80h  reason: invalid class name and case insensitive filesystem */
public final class C1358280h implements Runnable {
    public final /* synthetic */ AnonymousClass099 A00;
    public final /* synthetic */ FragmentActivity A01;

    public C1358280h(AnonymousClass099 r1, FragmentActivity fragmentActivity) {
        this.A00 = r1;
        this.A01 = fragmentActivity;
    }

    public final void run() {
        this.A00.A0A(this.A01.getSupportFragmentManager(), "consent_dialog");
    }
}
