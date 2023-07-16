package X;

import android.os.SystemProperties;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0NF  reason: invalid class name */
public final class AnonymousClass0NF {
    public static final Map A00 = new AnonymousClass0NE();

    public static JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map map = (Map) Class.forName("android.os.ext.SdkExtensions").getMethod("getAllExtensionVersions", new Class[0]).invoke((Object) null, new Object[0]);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put(((Integer) entry.getKey()).toString(), ((Integer) entry.getValue()).toString());
                }
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            C04790Pd.A00();
        }
        if (jSONObject.length() == 0) {
            jSONObject = new JSONObject();
            try {
                for (Map.Entry entry2 : A00.entrySet()) {
                    String str = SystemProperties.get((String) entry2.getValue(), "");
                    if (str != null && !str.equals("")) {
                        jSONObject.put((String) entry2.getKey(), str);
                    }
                }
            } catch (Throwable unused2) {
                C04790Pd.A00();
            }
        }
        return jSONObject;
    }
}
