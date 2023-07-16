package X;

import java.util.ArrayList;

/* renamed from: X.3WN  reason: invalid class name */
public final class AnonymousClass3WN {
    public static void A00(MMo mMo, C26641qy r4, String str) {
        if ("logged_in_user".equals(str)) {
            r4.A00 = C19527Axo.A01(mMo, false);
            return;
        }
        ArrayList arrayList = null;
        if ("login_deferred_accounts".equals(str)) {
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = AnonymousClass0wJ.A0v();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    AnonymousClass3FU parseFromJson = C36422Rg.parseFromJson(mMo);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            r4.A0A = arrayList;
        } else if ("help_url".equals(str)) {
            r4.A03 = AnonymousClass0wJ.A0r(mMo);
        } else if ("help_url_text".equals(str)) {
            r4.A04 = AnonymousClass0wJ.A0r(mMo);
        } else if ("bolded_text".equals(str)) {
            r4.A02 = AnonymousClass0wJ.A0r(mMo);
        } else if ("buttons".equals(str)) {
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = AnonymousClass0wJ.A0v();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    AnonymousClass3BW parseFromJson2 = AnonymousClass2QY.parseFromJson(mMo);
                    if (parseFromJson2 != null) {
                        arrayList.add(parseFromJson2);
                    }
                }
            }
            r4.A09 = arrayList;
        } else if ("invalid_credentials".equals(str)) {
            r4.A0B = mMo.A12();
        } else if ("sso_enabled".equals(str)) {
            r4.A0C = mMo.A12();
        } else if ("mac_login_nonce".equals(str)) {
            r4.A06 = AnonymousClass0wJ.A0r(mMo);
        } else if ("trusted_device_nonce".equals(str)) {
            r4.A08 = AnonymousClass0wJ.A0r(mMo);
        } else if ("session_flush_nonce".equals(str)) {
            r4.A07 = AnonymousClass0wJ.A0r(mMo);
        } else if ("login_source".equals(str)) {
            r4.A05 = AnonymousClass0wJ.A0r(mMo);
        } else if ("show_autoconf_consent".equals(str)) {
            r4.A01 = C18190wL.A0b(mMo);
        } else {
            AnonymousClass3N8.A00(mMo, r4, str);
        }
    }

    public static C26641qy parseFromJson(MMo mMo) {
        return (C26641qy) AnonymousClass0wJ.A0h(mMo, 24);
    }
}
