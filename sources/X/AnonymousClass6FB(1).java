package X;

import androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$observer$1;

/* renamed from: X.6FB  reason: invalid class name */
public final class AnonymousClass6FB {
    public static final AnonymousClass0ZU A00(C871950n r2, AnonymousClass062 r3) {
        if (((C14340pE) r3).A00.compareTo(AnonymousClass061.DESTROYED) > 0) {
            ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 viewCompositionStrategy_androidKt$installForLifecycle$observer$1 = new ViewCompositionStrategy_androidKt$installForLifecycle$observer$1(r2);
            r3.A07(viewCompositionStrategy_androidKt$installForLifecycle$observer$1);
            return C86164wN.A0v(r3, viewCompositionStrategy_androidKt$installForLifecycle$observer$1, 24);
        }
        StringBuilder A0s = C18190wL.A0s("Cannot configure ");
        A0s.append(r2);
        A0s.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        A0s.append(r3);
        throw C18180wK.A0a(C18180wK.A0i("is already destroyed", A0s));
    }
}
