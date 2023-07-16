package androidx.compose.ui.platform;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.C04220Ms;
import X.C14260p5;
import X.C871950n;

public final class ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 implements C14260p5 {
    public final /* synthetic */ C871950n A00;

    public ViewCompositionStrategy_androidKt$installForLifecycle$observer$1(C871950n r1) {
        this.A00 = r1;
    }

    public final void CMI(AnonymousClass060 r2, AnonymousClass066 r3) {
        C04220Ms.A0B(r2, 1);
        if (r2 == AnonymousClass060.ON_DESTROY) {
            this.A00.A03();
        }
    }
}
