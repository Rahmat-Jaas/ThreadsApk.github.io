package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fbpay.logging.FBPayLoggerData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Ff  reason: invalid class name and case insensitive filesystem */
public final class C121257Ff {
    public static Map A02(Map map) {
        if (!map.containsKey("AUTH_LOGGING_EXTRA_KEY")) {
            return Collections.emptyMap();
        }
        Object obj = map.get("AUTH_LOGGING_EXTRA_KEY");
        obj.getClass();
        return (Map) obj;
    }

    public static Map A00(Bundle bundle) {
        return Collections.unmodifiableMap(A01(bundle));
    }

    public static Map A01(Bundle bundle) {
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("logger_data", (FBPayLoggerData) C18240wQ.A0D(bundle, "logger_data"));
        if (bundle != null) {
            str = bundle.getString("CREDENTIAL_ID");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            A0y.put("FBPAY_AUTH_CREDENTIAL_ID", str);
        }
        Parcelable parcelable = bundle.getParcelable("logging_context");
        if (parcelable != null) {
            A0y.put("logging_context", parcelable);
        }
        Bundle bundle2 = bundle.getBundle("AUTH_LOGGING_EXTRA_KEY");
        if (bundle2 != null) {
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            Iterator A0x = C86144wL.A0x(bundle2);
            while (A0x.hasNext()) {
                String A0k = C18180wK.A0k(A0x);
                A0y2.put(A0k, bundle2.getString(A0k));
            }
            A0y.put("AUTH_LOGGING_EXTRA_KEY", A0y2);
        }
        return A0y;
    }
}
