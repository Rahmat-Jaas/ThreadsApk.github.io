package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3WX  reason: invalid class name */
public final class AnonymousClass3WX {
    public static List A00() {
        AnonymousClass3S2 A00 = AnonymousClass3S2.A00();
        C22351Um r2 = null;
        if (AnonymousClass0wJ.A1X(C29781zI.A03.A01.A02())) {
            String string = A00.A00.getString("cloud_account_user_map", (String) null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    C22351Um parseFromJson = C33362Fk.parseFromJson(C18180wK.A0L(string));
                    if (parseFromJson != null) {
                        r2 = parseFromJson;
                    }
                } catch (IOException unused) {
                }
            }
        }
        if (r2 == null) {
            return AnonymousClass0wJ.A0v();
        }
        List list = r2.A00;
        if (list == null) {
            return AnonymousClass0wJ.A0v();
        }
        return C18200wM.A0s(list);
    }

    public static void A01(ImageUrl imageUrl, String str, String str2) {
        List A00 = A00();
        Iterator it = A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                A00.add(new AnonymousClass3Uc(str, str2, imageUrl.getUrl()));
                break;
            }
            AnonymousClass3Uc r2 = (AnonymousClass3Uc) it.next();
            if (r2.A00().equals(str)) {
                String url = imageUrl.getUrl();
                if (!URLUtil.isValidUrl(url)) {
                    url = null;
                }
                r2.A00 = url;
                r2.A02.getClass();
                r2.A02 = str2;
            }
        }
        A02(A00);
    }

    public static void A02(List list) {
        AnonymousClass3S2 A00 = AnonymousClass3S2.A00();
        C29781zI r3 = C29781zI.A03;
        C22351Um r2 = new C22351Um(list);
        if (r3.A02.isAssignableFrom(r2.getClass()) && AnonymousClass0wJ.A1X(r3.A01.A02())) {
            SharedPreferences.Editor edit = A00.A00.edit();
            String str = null;
            try {
                StringWriter A0d = C18230wP.A0d();
                MMp A0K = C18180wK.A0K(A0d);
                if (r2.A00 != null) {
                    A0K.A0U("cloud_accounts_list");
                    A0K.A0I();
                    for (AnonymousClass3Uc r32 : r2.A00) {
                        if (r32 != null) {
                            A0K.A0J();
                            String str2 = r32.A01;
                            if (str2 != null) {
                                A0K.A0d("user_id", str2);
                            }
                            String str3 = r32.A02;
                            if (str3 != null) {
                                A0K.A0d(C61943Wl.A00(), str3);
                            }
                            String str4 = r32.A00;
                            if (str4 != null) {
                                A0K.A0d("profile_pic_url", str4);
                            }
                            A0K.A0G();
                        }
                    }
                    A0K.A0F();
                }
                str = C18180wK.A0h(A0K, A0d);
            } catch (IOException unused) {
            }
            C18180wK.A0v(edit, "cloud_account_user_map", str);
        }
    }
}
