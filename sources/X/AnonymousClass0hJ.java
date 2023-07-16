package X;

import android.view.Choreographer;

/* renamed from: X.0hJ  reason: invalid class name */
public final class AnonymousClass0hJ {
    public static COK A00() {
        Choreographer choreographer = AnonymousClass0hK.A00;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            AnonymousClass0hK.A00 = choreographer;
        }
        return COK.A01(choreographer);
    }
}
