package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.6xV  reason: invalid class name and case insensitive filesystem */
public final class C116766xV {
    public static void A01(JsonWriter jsonWriter, Object obj) {
        String valueOf;
        int intValue;
        int compareTo;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof List) {
            jsonWriter.beginArray();
            Iterator A0y = C86144wL.A0y(obj);
            while (A0y.hasNext()) {
                A01(jsonWriter, A0y.next());
            }
            jsonWriter.endArray();
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            Iterator A0u = C18190wL.A0u(new TreeMap((Map) obj));
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                jsonWriter.name(C18200wM.A0p(A0o));
                A01(jsonWriter, A0o.getValue());
            }
            jsonWriter.endObject();
        } else if (obj instanceof Boolean) {
            jsonWriter.value(AnonymousClass0wJ.A1X(obj));
        } else if (obj instanceof Number) {
            if (obj instanceof Float) {
                Float f = (Float) obj;
                intValue = f.intValue();
                compareTo = f.compareTo(Float.valueOf((float) intValue));
            } else {
                if (obj instanceof Double) {
                    Double d = (Double) obj;
                    intValue = d.intValue();
                    compareTo = d.compareTo(Double.valueOf((double) intValue));
                }
                jsonWriter.value((Number) obj);
            }
            if (compareTo == 0) {
                jsonWriter.value((long) intValue);
                return;
            }
            jsonWriter.value((Number) obj);
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else {
                valueOf = String.valueOf(obj);
            }
            jsonWriter.value(valueOf);
        }
    }

    public static Map A00(Map map) {
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (map != null) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Object key = A0o.getKey();
                Object value = A0o.getValue();
                StringWriter A0d = C18230wP.A0d();
                JsonWriter jsonWriter = new JsonWriter(A0d);
                jsonWriter.setLenient(true);
                try {
                    A01(jsonWriter, value);
                    jsonWriter.close();
                    str = A0d.toString();
                    str.getClass();
                } catch (IOException unused) {
                    str = "";
                }
                A0y.put(key, str);
            }
        }
        return A0y;
    }
}
