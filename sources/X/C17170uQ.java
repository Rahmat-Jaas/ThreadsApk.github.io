package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.xanalytics.XAnalyticsAdapter;

/* renamed from: X.0uQ  reason: invalid class name and case insensitive filesystem */
public final class C17170uQ implements XAnalyticsAdapter {
    public C11660kZ A00 = null;

    private synchronized C11660kZ A00() {
        AnonymousClass7Ko.A07(this.A00, "trying to log events in IgQPLXAnalytics while its analytics logger is null");
        return this.A00;
    }

    public final synchronized void A03(C11660kZ r2) {
        this.A00 = r2;
    }

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

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0039=Splitter:B:16:0x0039, B:9:0x002e=Splitter:B:9:0x002e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logEvent(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, double r9) {
        /*
            r4 = this;
            java.lang.String r0 = "IgQPLXAnalytincs"
            X.0rn r3 = X.C15730rn.A01(r5, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r3.A00 = r0
            java.lang.String r0 = "UTF8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ IOException -> 0x003f }
            byte[] r0 = r6.getBytes(r0)     // Catch:{ IOException -> 0x003f }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x003f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x003f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x003a }
            r0.<init>(r2)     // Catch:{ all -> 0x003a }
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch:{ all -> 0x003a }
            r1.<init>(r0)     // Catch:{ all -> 0x003a }
            X.0ri r0 = A01(r1)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002e
            r3.A04(r0)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            r1.close()     // Catch:{ all -> 0x003a }
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x003f
        L_0x0035:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            X.0kZ r0 = r4.A00()
            r0.Cd7(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17170uQ.logEvent(java.lang.String, java.lang.String, java.lang.String, boolean, double):void");
    }

    public final void logEventBypassSampling(String str, String str2) {
        logEvent(str, str2, "", false, -1.0d);
    }

    public static C15680ri A01(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
            return null;
        }
        C15680ri r3 = new C15680ri();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i = C17200uV.A00[jsonReader.peek().ordinal()];
            if (i == 1) {
                r3.A0B(nextName, Double.valueOf(jsonReader.nextDouble()));
            } else if (i == 2) {
                r3.A0D(nextName, jsonReader.nextString());
            } else if (i == 3) {
                r3.A0A(nextName, Boolean.valueOf(jsonReader.nextBoolean()));
            } else if (i == 4) {
                C15680ri A01 = A01(jsonReader);
                if (A01 != null) {
                    r3.A07(A01, nextName);
                }
            } else if (i != 5) {
                jsonReader.skipValue();
            } else {
                C15560rW A02 = A02(jsonReader);
                if (A02 != null) {
                    r3.A08(A02, nextName);
                }
            }
        }
        jsonReader.endObject();
        return r3;
    }

    public static C15560rW A02(JsonReader jsonReader) {
        Object obj;
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            return null;
        }
        C15560rW r2 = new C15560rW();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            int i = C17200uV.A00[jsonReader.peek().ordinal()];
            if (i == 1) {
                r2.A00(jsonReader.nextDouble());
            } else if (i == 2) {
                r2.A04(jsonReader.nextString());
            } else if (i != 3) {
                if (i == 4) {
                    obj = A01(jsonReader);
                } else if (i != 5) {
                    jsonReader.skipValue();
                } else {
                    obj = A02(jsonReader);
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
}
