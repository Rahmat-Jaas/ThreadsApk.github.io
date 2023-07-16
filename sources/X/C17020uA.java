package X;

import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0uA  reason: invalid class name and case insensitive filesystem */
public final class C17020uA implements AnonymousClass090 {
    public final Map A00 = new TreeMap();

    public final void Cbc(String str) {
        if (str != null) {
            this.A00.remove(str);
        }
    }

    public final void Cjp(String str, String str2, Object... objArr) {
        if (str == null) {
            return;
        }
        if (str2 != null) {
            if (objArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb);
                formatter.format(str2, objArr);
                formatter.close();
                str2 = sb.toString();
            }
            this.A00.put(str, str2);
            return;
        }
        Cbc(str);
    }
}
