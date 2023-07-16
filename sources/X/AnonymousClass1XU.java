package X;

import android.app.Dialog;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.1XU  reason: invalid class name */
public final class AnonymousClass1XU extends C19130zL {
    public final Dialog A0C(Bundle bundle) {
        C25828Dsm A0W = C18190wL.A0W(getActivity());
        A0W.A02 = requireArguments().getString(DialogModule.KEY_TITLE);
        A0W.A0p(requireArguments().getString("body"));
        C18180wK.A1O(A0W, this, 173, 2131831976);
        return A0W.A0G();
    }
}
