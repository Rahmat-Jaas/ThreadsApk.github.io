package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.0ii  reason: invalid class name and case insensitive filesystem */
public class C10660ii implements XAnalyticsAdapter {
    public final ImmutableMap A00;
    public final C10300i6 A01;
    public final String A02;

    public final void cleanup() {
    }

    public final void flush() {
    }

    public final String getStructureSamplingConfig(String str) {
        return "";
    }

    public final void logCounter(String str, double d) {
    }

    public final void logCounter(String str, double d, String str2) {
    }

    public final boolean shouldLog(String str) {
        return true;
    }

    public C10660ii(C10300i6 r3) {
        this((ImmutableMap) null, r3, "IgXAnalyticsAdapter");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0038 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0033=Splitter:B:16:0x0033, B:9:0x0028=Splitter:B:9:0x0028} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logEvent(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, double r9) {
        /*
            r4 = this;
            java.lang.String r0 = r4.A02
            X.0rn r3 = X.C15730rn.A01(r5, r0)
            java.lang.String r0 = "UTF8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ IOException -> 0x0039 }
            byte[] r0 = r6.getBytes(r0)     // Catch:{ IOException -> 0x0039 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0039 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0039 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0034 }
            r0.<init>(r2)     // Catch:{ all -> 0x0034 }
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch:{ all -> 0x0034 }
            r1.<init>(r0)     // Catch:{ all -> 0x0034 }
            X.0ri r0 = A00(r1)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0028
            r3.A04(r0)     // Catch:{ all -> 0x002f }
        L_0x0028:
            r1.close()     // Catch:{ all -> 0x0034 }
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x002f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            com.google.common.collect.ImmutableMap r0 = r4.A00
            if (r0 == 0) goto L_0x0040
            r3.A0F(r0)
        L_0x0040:
            X.0i6 r0 = r4.A01
            X.0kZ r0 = X.C12090lI.A00(r0)
            r0.Cd7(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10660ii.logEvent(java.lang.String, java.lang.String, java.lang.String, boolean, double):void");
    }

    public final void logEventBypassSampling(String str, String str2) {
        logEvent(str, str2, "", false, -1.0d);
    }

    public static C15680ri A00(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
            return null;
        }
        C15680ri r3 = new C15680ri();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = C10670ij.A00[jsonReader.peek().ordinal()];
            if (i == 1) {
                r3.A0B(nextName, Double.valueOf(jsonReader.nextDouble()));
            } else if (i == 2) {
                r3.A0D(nextName, jsonReader.nextString());
            } else if (i == 3) {
                r3.A0A(nextName, Boolean.valueOf(jsonReader.nextBoolean()));
            } else if (i == 4) {
                C15680ri A002 = A00(jsonReader);
                if (A002 != null) {
                    r3.A07(A002, nextName);
                }
            } else if (i != 5) {
                jsonReader.skipValue();
            } else {
                C15560rW A012 = A01(jsonReader);
                if (A012 != null) {
                    r3.A08(A012, nextName);
                }
            }
        }
        jsonReader.endObject();
        return r3;
    }

    public static C15560rW A01(JsonReader jsonReader) {
        Object obj;
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            return null;
        }
        C15560rW r2 = new C15560rW();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            int i = C10670ij.A00[jsonReader.peek().ordinal()];
            if (i == 1) {
                r2.A00(jsonReader.nextDouble());
            } else if (i == 2) {
                r2.A04(jsonReader.nextString());
            } else if (i != 3) {
                if (i == 4) {
                    obj = A00(jsonReader);
                } else if (i != 5) {
                    jsonReader.skipValue();
                } else {
                    obj = A01(jsonReader);
                }
                if (obj != null) {
                    r2.A00.add(obj);
                }
            } else {
                r2.A05(jsonReader.nextBoolean());
            }
        }
        jsonReader.endArray();
        return r2;
    }

    public C10660ii(ImmutableMap immutableMap, C10300i6 r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = immutableMap;
    }
}
