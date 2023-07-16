package com.facebookpay.offsite.models.message;

import X.C04220Ms;
import X.C15430rJ;
import X.C18190wL;
import android.net.Uri;
import android.webkit.URLUtil;

public final class UriUtils {
    public static final UriUtils INSTANCE = new UriUtils();

    public final String checkUriFormat(String str) {
        C04220Ms.A0B(str, 0);
        if (!URLUtil.isValidUrl(str)) {
            return null;
        }
        return str;
    }

    public final String toUriAuthorityAndPath(String str) {
        C04220Ms.A0B(str, 0);
        Uri A01 = C15430rJ.A01(str);
        return C18190wL.A0n(new Uri.Builder().scheme(A01.getScheme()).authority(A01.getAuthority()).build());
    }
}
