package X;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Qr  reason: invalid class name and case insensitive filesystem */
public final class C05060Qr implements C04050Mb {
    public final C06180Xz A00;

    public final void CWp(C04170Mn r11, AnonymousClass0ND r12) {
        HashMap hashMap;
        C06180Xz r3 = this.A00;
        if (r3 != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(r3.A02);
            for (Map.Entry entry : r3.A01.entrySet()) {
                hashMap2.put(entry.getKey(), ((C04560Oe) entry.getValue()).get());
            }
            AnonymousClass0O2 r0 = r3.A00;
            synchronized (r0.A02) {
                Properties properties = new Properties();
                try {
                    MappedByteBuffer mappedByteBuffer = r0.A01.A00;
                    mappedByteBuffer.position(0);
                    properties.load(new AnonymousClass0O0(mappedByteBuffer));
                } catch (IOException e) {
                    C04790Pd.A00();
                    AnonymousClass0LU.A0H("lacrima", "Cannot parse mmapped values", e);
                }
                HashMap hashMap3 = new HashMap();
                for (AnonymousClass0O1 r02 : AnonymousClass0O1.values()) {
                    hashMap3.put(r02.A01, r02.name());
                }
                hashMap = new HashMap();
                for (Map.Entry entry2 : properties.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(hashMap3.get(entry2.getKey()));
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(entry2.getValue());
                    hashMap.put(obj, sb2.toString());
                }
            }
            hashMap2.putAll(hashMap);
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                String str = (String) entry3.getKey();
                Object value = entry3.getValue();
                AnonymousClass0ND r1 = AnonymousClass0ND.CRITICAL_REPORT;
                String str2 = r1.A00;
                if (str.startsWith(str2) || r12 != r1) {
                    if (!str.startsWith(AnonymousClass00U.A0L(str2, "cadm_"))) {
                        String str3 = AnonymousClass0ND.LARGE_REPORT.A00;
                        if (!str.startsWith(AnonymousClass00U.A0L(str3, "cadm_"))) {
                            String replaceFirst = str.replaceFirst(str2, "").replaceFirst(str3, "").replaceFirst("cadm_", "");
                            Map map = r11.A03;
                            if (value == null) {
                                value = "unknown";
                            }
                            map.put(replaceFirst, value);
                        }
                    }
                    try {
                        jSONObject.put(str.replaceFirst(str2, "").replaceFirst(AnonymousClass0ND.LARGE_REPORT.A00, "").replaceFirst("cadm_", ""), value);
                    } catch (JSONException unused) {
                        C04790Pd.A00();
                    }
                }
            }
            r11.A03(AnonymousClass0MU.A4s, jSONObject.toString());
        }
    }

    public C05060Qr(C06180Xz r1) {
        this.A00 = r1;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0D;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
