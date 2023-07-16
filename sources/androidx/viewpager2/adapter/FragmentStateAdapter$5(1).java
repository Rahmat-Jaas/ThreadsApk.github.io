package androidx.viewpager2.adapter;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.C14260p5;
import X.C34187I7h;
import android.os.Handler;

public class FragmentStateAdapter$5 implements C14260p5 {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C34187I7h A01;
    public final /* synthetic */ Runnable A02;

    public FragmentStateAdapter$5(Handler handler, C34187I7h i7h, Runnable runnable) {
        this.A01 = i7h;
        this.A00 = handler;
        this.A02 = runnable;
    }

    public final void CMI(AnonymousClass060 r3, AnonymousClass066 r4) {
        if (r3 == AnonymousClass060.ON_DESTROY) {
            this.A00.removeCallbacks(this.A02);
            r4.getLifecycle().A08(this);
        }
    }
}
