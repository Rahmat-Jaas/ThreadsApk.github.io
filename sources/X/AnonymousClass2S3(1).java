package X;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.2S3  reason: invalid class name */
public final class AnonymousClass2S3 {
    public static String A00(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("IS_ADD_ACCOUNT_FLOW", false)) {
            String string = bundle.getString("page_id_for_suma_new_biz_account");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return null;
    }
}
