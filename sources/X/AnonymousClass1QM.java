package X;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.1QM  reason: invalid class name */
public abstract class AnonymousClass1QM extends F6h {
    public WeakReference A00;

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, str);
        if (str2 != null) {
            A06.putString("challenge_id", str2);
        }
        if (str3 != null) {
            A06.putString("challenge_use_case", str3);
        }
        if (str4 != null) {
            A06.putString("av_session_id", str4);
        }
        if (str5 != null) {
            A06.putString("flow_id", str5);
        }
        if (str6 != null) {
            A06.putString("product_surface", str6);
        }
        setArguments(A06);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C82004ot) {
            this.A00 = new WeakReference(context);
        }
    }
}
