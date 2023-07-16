package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.46Y  reason: invalid class name */
public final class AnonymousClass46Y implements C81384nh {
    public AnonymousClass46Y(Context context, String str) {
        try {
            PhoneNumberUtil.A01(context).A0A(str, (String) null);
        } catch (C32122Ah unused) {
            C10450iM.A03("PhoneNumberVerifiedEvent", "Unable to parse verified phone number.");
        }
    }

    public AnonymousClass46Y() {
    }
}
