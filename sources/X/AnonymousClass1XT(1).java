package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape0S3200000_1_I2;

/* renamed from: X.1XT  reason: invalid class name */
public final class AnonymousClass1XT extends C19130zL {
    public final Dialog A0C(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        C10300i6 A0S = C18190wL.A0S(requireArguments);
        String string = requireArguments.getString("feedback_message");
        String string2 = requireArguments.getString("feedback_title");
        String string3 = requireArguments.getString("feedback_url");
        String string4 = requireArguments.getString("feedback_appeal_label");
        String string5 = requireArguments.getString("feedback_action");
        String string6 = requireArguments.getString("feedback_ignore_label");
        C25828Dsm A0W = C18190wL.A0W(getActivity());
        A0W.A0p(string);
        if (string2 != null) {
            A0W.A02 = string2;
        }
        if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
            A0W.A0c(new IDxCListenerShape0S3200000_1_I2(A0S, this, string5, string3, string4, 0), string4);
        }
        if (TextUtils.isEmpty(string6)) {
            string6 = getString(2131826195);
        }
        A0W.A0b((DialogInterface.OnClickListener) null, string6);
        return A0W.A0G();
    }
}
