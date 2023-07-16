package X;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;

/* renamed from: X.7oY  reason: invalid class name */
public final class AnonymousClass7oY implements C39522Kv6 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ ReadableMap A01;

    public AnonymousClass7oY(Bundle bundle, ReadableMap readableMap) {
        this.A00 = bundle;
        this.A01 = readableMap;
    }

    public final void A66(C15730rn r5) {
        Bundle bundle = (Bundle) this.A00.getParcelable("fb_analyticsExtras");
        AnonymousClass71V.A01(bundle, this.A01);
        Iterator A0x = C86144wL.A0x(bundle);
        while (A0x.hasNext()) {
            String A0k = C18180wK.A0k(A0x);
            r5.A0D(A0k, bundle.getString(A0k));
        }
    }
}
