package X;

import android.util.JsonWriter;

/* renamed from: X.0Kr  reason: invalid class name and case insensitive filesystem */
public final class C03770Kr {
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.Throwable r4) {
        /*
            java.lang.String r3 = ""
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ IOException -> 0x0026, NullPointerException -> 0x0025 }
            r2.<init>()     // Catch:{ IOException -> 0x0026, NullPointerException -> 0x0025 }
            r0 = 1
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0020 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0020 }
            r4.printStackTrace(r1)     // Catch:{ all -> 0x001b }
            r1.close()     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x0026, NullPointerException -> 0x0025 }
            return r0
        L_0x001b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0     // Catch:{ IOException -> 0x0026, NullPointerException -> 0x0025 }
        L_0x0025:
            return r3
        L_0x0026:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03770Kr.A00(java.lang.Throwable):java.lang.String");
    }

    public static void A01(JsonWriter jsonWriter, Throwable th) {
        jsonWriter.beginObject();
        jsonWriter.name("excls").value(th.getClass().getName());
        jsonWriter.name("msg").value(th.getMessage());
        jsonWriter.name("stack");
        jsonWriter.beginArray();
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jsonWriter.beginObject();
            jsonWriter.name("cls").value(stackTraceElement.getClassName());
            jsonWriter.name("method").value(stackTraceElement.getMethodName());
            jsonWriter.name("ln").value((long) stackTraceElement.getLineNumber());
            jsonWriter.endObject();
        }
        jsonWriter.endArray();
        Throwable cause = th.getCause();
        if (cause != null) {
            jsonWriter.name("cause");
            A01(jsonWriter, cause);
        }
        jsonWriter.endObject();
    }
}
