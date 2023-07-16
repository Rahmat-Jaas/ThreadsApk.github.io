package androidx.fragment.app;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.C14260p5;
import X.C34641IcO;
import android.view.View;

public class CustomFragment$1 implements C14260p5 {
    public final /* synthetic */ C34641IcO A00;

    public CustomFragment$1(C34641IcO icO) {
        this.A00 = icO;
    }

    public final void CMI(AnonymousClass060 r2, AnonymousClass066 r3) {
        View view;
        if (r2 == AnonymousClass060.ON_STOP && (view = this.A00.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
