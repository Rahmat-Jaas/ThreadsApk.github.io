package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import ch.boye.httpclientandroidlib.client.utils.URLEncodedUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

/* renamed from: X.3aw  reason: invalid class name and case insensitive filesystem */
public final class C62843aw {
    public static Uri A00(Bundle bundle, String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                Object obj = bundle.get(A0k);
                if (obj instanceof String) {
                    builder.appendQueryParameter(A0k, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static String A02(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder A0r = C18200wM.A0r();
            for (byte b : digest) {
                A0r.append(Integer.toHexString((b >> 4) & 15));
                A0r.append(Integer.toHexString((b >> 0) & 15));
            }
            return A0r.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static boolean A04(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static Bundle A01(String str) {
        String str2;
        String str3;
        Bundle A06 = C18180wK.A06();
        if (!A04(str)) {
            for (String split : str.split(URLEncodedUtils.PARAMETER_SEPARATOR)) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        str2 = URLDecoder.decode(split2[0], "UTF-8");
                        str3 = URLDecoder.decode(split2[1], "UTF-8");
                    } else if (split2.length == 1) {
                        str2 = URLDecoder.decode(split2[0], "UTF-8");
                        str3 = "";
                    }
                    A06.putString(str2, str3);
                } catch (UnsupportedEncodingException e) {
                    e.toString();
                }
            }
        }
        return A06;
    }

    public static void A03(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    instance.setCookie(str, AnonymousClass00U.A0L(split2[0].trim(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                }
            }
            instance.removeExpiredCookie();
        }
    }
}
