package X;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.2C9  reason: invalid class name */
public final class AnonymousClass2C9 {
    public static final double A00(String str, JSONObject jSONObject) {
        return jSONObject.getDouble(str) * ((double) TimeUnit.SECONDS.toMicros(1));
    }
}
