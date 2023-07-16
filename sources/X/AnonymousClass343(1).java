package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.343  reason: invalid class name */
public final class AnonymousClass343 {
    public final Bundle A00;

    public AnonymousClass343(Context context) {
        Bundle A06 = C18180wK.A06();
        this.A00 = A06;
        A06.putBoolean("isCrop", true);
        A06.putParcelable("output", Uri.fromFile(AnonymousClass0hL.A05(context)));
    }
}
