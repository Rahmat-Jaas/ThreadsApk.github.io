package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.8MT  reason: invalid class name */
public final class AnonymousClass8MT extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MT A00 = new AnonymousClass8MT();

    public AnonymousClass8MT() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C04220Ms.A0B(context, 0);
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
