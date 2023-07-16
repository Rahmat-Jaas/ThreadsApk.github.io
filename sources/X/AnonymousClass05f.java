package X;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.05f  reason: invalid class name */
public final class AnonymousClass05f extends AnonymousClass04m {
    public final /* synthetic */ AnonymousClass00M A00;
    public final /* synthetic */ AnonymousClass00X A01;
    public final /* synthetic */ C142618fJ A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ AtomicReference A04;

    public AnonymousClass05f(AnonymousClass00M r1, AnonymousClass00X r2, C142618fJ r3, Fragment fragment, AtomicReference atomicReference) {
        this.A03 = fragment;
        this.A02 = r3;
        this.A04 = atomicReference;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00() {
        Fragment fragment = this.A03;
        String generateActivityResultKey = fragment.generateActivityResultKey();
        this.A04.set(((AnonymousClass00R) this.A02.apply((Object) null)).A01(this.A00, this.A01, fragment, generateActivityResultKey));
    }
}
