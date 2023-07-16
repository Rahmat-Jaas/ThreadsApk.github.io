package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.4T1  reason: invalid class name */
public final class AnonymousClass4T1 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ C127397h3 A03;
    public final /* synthetic */ Runnable A04;

    public AnonymousClass4T1(View view, AnonymousClass3HX r2, C127397h3 r3, C127397h3 r4, Runnable runnable) {
        this.A00 = view;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = runnable;
    }

    public final void run() {
        this.A00.setTag(R.id.render_lifecycle_extension_runnable, (Object) null);
        C127397h3 r4 = this.A02;
        C109326jp A0V = C18230wP.A0V(this.A03);
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A02(r4, 0);
        AnonymousClass3HX r1 = this.A01;
        C122047Jt.A03(r1, r4, C63893iY.A05(A002, r1, 1), A0V);
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
