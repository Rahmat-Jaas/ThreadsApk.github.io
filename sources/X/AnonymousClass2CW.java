package X;

import android.view.View;
import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.2CW  reason: invalid class name */
public final class AnonymousClass2CW {
    public static final View A00(View view, int i) {
        C04220Ms.A0B(view, 0);
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw C18180wK.A0a(C28174Ezk.A00(HttpStatus.SC_LENGTH_REQUIRED));
    }
}
