package X;

import android.text.TextUtils;

/* renamed from: X.1U3  reason: invalid class name */
public class AnonymousClass1U3 extends AnonymousClass1j3 {
    public String A00;
    public AnonymousClass3Um A01;
    public boolean A02;

    public String getErrorMessage() {
        if (TextUtils.isEmpty(this.A00)) {
            return this.mErrorMessage;
        }
        return this.A00;
    }

    public final boolean isOk() {
        if (((this instanceof C26631qx) || this.A02) && super.isOk()) {
            return true;
        }
        return false;
    }
}
