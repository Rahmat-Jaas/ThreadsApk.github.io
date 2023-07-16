package X;

import android.text.TextUtils;
import android.webkit.URLUtil;

/* renamed from: X.3Uc  reason: invalid class name */
public final class AnonymousClass3Uc {
    public String A00;
    public String A01;
    public String A02;

    public final String A00() {
        String str = this.A01;
        str.getClass();
        AnonymousClass7Ko.A0B(TextUtils.isDigitsOnly(str));
        return this.A01;
    }

    public AnonymousClass3Uc() {
    }

    public AnonymousClass3Uc(String str, String str2, String str3) {
        str.getClass();
        AnonymousClass7Ko.A0B(TextUtils.isDigitsOnly(str));
        this.A01 = str;
        str2.getClass();
        this.A02 = str2;
        if (str3 != null && URLUtil.isValidUrl(str3)) {
            this.A00 = str3;
        }
    }
}
