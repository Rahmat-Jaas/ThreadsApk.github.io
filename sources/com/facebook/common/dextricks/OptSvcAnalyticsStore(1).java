package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass0FX;
import X.C14630pr;
import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class OptSvcAnalyticsStore {
    public static final int CURRENT_SCHEMA_VERSION = 2;
    public static final String DEX2OAT_LOGGING_KEY_PREFIX = "dex2oat_stat";
    public static final String EVENT_DIR_NAME = "optsvc_analytics";
    public static final String FILE_SUFFIX = ".txt";
    public static final String LOGGING_KEY_APP_VERSION = "app_version";
    public static final String LOGGING_KEY_ATTEMPT_NUMBER = "attempt_number";
    public static final String LOGGING_KEY_CLIENT_TIME = "client_time";
    public static final String LOGGING_KEY_DETAIL_MSG = "detail_msg";
    public static final String LOGGING_KEY_DEX2OAT_FAILURE = "failure";
    public static final String LOGGING_KEY_DEX2OAT_PERCENT = "percent_success";
    public static final String LOGGING_KEY_DEX2OAT_SUCCESS = "success";
    public static final String LOGGING_KEY_DEX2OAT_TOTAL_CASES = "total_cases";
    public static final String LOGGING_KEY_DURATION = "duration";
    public static final String LOGGING_KEY_EVENT_NAME = "event_name";
    public static final String LOGGING_KEY_EXIT_CODE = "exit_code";
    public static final String LOGGING_KEY_JOB_NAME = "job_name";
    public static final String LOGGING_KEY_STEP = "step";
    public static final String TAG = "OptSvcAnalytics";
    public static final int UNKNOWN_SCHEMA_VERSION = -1;

    public interface EventConsumer {
        void consume(String str, Map map);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:54|12|16|17|18|19|20|21|22|(1:47)(1:27)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean readEventFileFully(java.io.File r8, java.util.Map r9) {
        /*
            r7 = 0
            r6 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005b, all -> 0x0057 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x005b, all -> 0x0057 }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r4.<init>(r5, r0)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004f }
            r3.<init>(r4)     // Catch:{ Exception -> 0x004f }
            goto L_0x001b
        L_0x0018:
            r9.put(r1, r0)     // Catch:{ Exception -> 0x004c, all -> 0x0071 }
        L_0x001b:
            java.lang.String r1 = r3.readLine()     // Catch:{ Exception -> 0x004c, all -> 0x0071 }
            if (r1 != 0) goto L_0x0022
            goto L_0x0029
        L_0x0022:
            java.lang.String r0 = r3.readLine()     // Catch:{ Exception -> 0x004c, all -> 0x0071 }
            if (r0 != 0) goto L_0x0018
            goto L_0x0048
        L_0x0029:
            r3.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r4.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r5.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            java.lang.String r1 = "event_name"
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r9.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006e
            r7 = 1
            return r7
        L_0x0048:
            r3.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0068
        L_0x004c:
            r2 = move-exception
            r6 = r3
            goto L_0x005e
        L_0x004f:
            r2 = move-exception
            goto L_0x005e
        L_0x0051:
            r0 = move-exception
            r4 = r6
            goto L_0x0073
        L_0x0054:
            r2 = move-exception
            r4 = r6
            goto L_0x005e
        L_0x0057:
            r0 = move-exception
            r4 = r6
            r5 = r6
            goto L_0x0073
        L_0x005b:
            r2 = move-exception
            r4 = r6
            r5 = r6
        L_0x005e:
            java.lang.String r1 = "OptSvcAnalytics"
            java.lang.String r0 = "Failed to read event"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x006f }
            closeIt(r6)
        L_0x0068:
            closeIt(r4)
            closeIt(r5)
        L_0x006e:
            return r7
        L_0x006f:
            r0 = move-exception
            goto L_0x0073
        L_0x0071:
            r0 = move-exception
            r6 = r3
        L_0x0073:
            closeIt(r6)
            closeIt(r4)
            closeIt(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OptSvcAnalyticsStore.readEventFileFully(java.io.File, java.util.Map):boolean");
    }

    public static void closeIt(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (isFileOldEnoughToDelete(r2) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void consumeEvents(android.content.Context r10, boolean r11, int r12, com.facebook.common.dextricks.OptSvcAnalyticsStore.EventConsumer r13) {
        /*
            java.lang.Class<com.facebook.common.dextricks.OptSvcAnalyticsStore> r9 = com.facebook.common.dextricks.OptSvcAnalyticsStore.class
            monitor-enter(r9)
            if (r10 == 0) goto L_0x0072
            java.io.File r0 = getStorageDir(r10)     // Catch:{ all -> 0x006f }
            java.io.File[] r8 = r0.listFiles()     // Catch:{ all -> 0x006f }
            if (r8 == 0) goto L_0x0072
            int r7 = r8.length     // Catch:{ all -> 0x006f }
            if (r7 == 0) goto L_0x0072
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x006f }
            r6.<init>()     // Catch:{ all -> 0x006f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x006f }
            r5.<init>()     // Catch:{ all -> 0x006f }
            r4 = 0
            r3 = 0
        L_0x001e:
            r2 = r8[r4]     // Catch:{ all -> 0x006f }
            if (r11 == 0) goto L_0x004e
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x006f }
            java.lang.String r0 = ".txt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x004e
            int r1 = getSchemaVersionFromFile(r2)     // Catch:{ all -> 0x006f }
            r0 = 2
            if (r1 != r0) goto L_0x0054
            if (r3 >= r12) goto L_0x0054
            r6.clear()     // Catch:{ all -> 0x006f }
            boolean r0 = readEventFileFully(r2, r6)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "event_name"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006f }
            r13.consume(r0, r6)     // Catch:{ all -> 0x006f }
            int r3 = r3 + 1
            goto L_0x0054
        L_0x004e:
            boolean r0 = isFileOldEnoughToDelete(r2)     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0057
        L_0x0054:
            r5.add(r2)     // Catch:{ all -> 0x006f }
        L_0x0057:
            int r4 = r4 + 1
            if (r4 < r7) goto L_0x001e
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x006f }
        L_0x005f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x006f }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x006f }
            r0.delete()     // Catch:{ all -> 0x006f }
            goto L_0x005f
        L_0x006f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0072:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OptSvcAnalyticsStore.consumeEvents(android.content.Context, boolean, int, com.facebook.common.dextricks.OptSvcAnalyticsStore$EventConsumer):void");
    }

    public static String escape(String str) {
        return str.replace("\\", "\\\\").replace("\n", "\\n");
    }

    public static String escapeObjectCoalesceNull(Object obj) {
        if (obj == null) {
            return "";
        }
        return escape(obj.toString());
    }

    public static String getNewFileName() {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append(".");
        sb.append(2);
        sb.append(FILE_SUFFIX);
        return sb.toString();
    }

    public static void logEvent(Context context, String str, Map map) {
        if (context != null && str != null && map != null && !map.isEmpty()) {
            File storageDir = getStorageDir(context);
            captureCommonKeyValues(map);
            String newFileName = getNewFileName();
            File file = new File(storageDir, newFileName);
            File file2 = new File(storageDir, AnonymousClass00U.A0L(newFileName, ".tmp"));
            StringBuilder sb = new StringBuilder("event_name");
            sb.append("\n");
            sb.append(str);
            sb.append("\n");
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (str2 != null) {
                    String escape = escape(str2);
                    String escapeObjectCoalesceNull = escapeObjectCoalesceNull(entry.getValue());
                    sb.append(escape);
                    sb.append("\n");
                    sb.append(escapeObjectCoalesceNull);
                    sb.append("\n");
                }
            }
            try {
                writeUTF8BytesToFile(sb.toString(), file2);
            } catch (IOException e) {
                Log.w(TAG, "Failed to log event", e);
            }
            file2.renameTo(file);
        }
    }

    public static String unescape(String str) {
        return str.replace("\\n", "\n").replace("\\\\", "\\");
    }

    public static void writeUTF8BytesToFile(String str, File file) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes, 0, bytes.length);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public static void captureCommonKeyValues(Map map) {
        map.put(LOGGING_KEY_APP_VERSION, Integer.valueOf(AnonymousClass0FX.A01()));
        map.put(LOGGING_KEY_CLIENT_TIME, Long.valueOf(System.currentTimeMillis()));
    }

    public static int getSchemaVersionFromFile(File file) {
        int indexOf;
        String name = file.getName();
        int length = name.length();
        if (length < 6 || (indexOf = name.indexOf(46)) < 0) {
            return -1;
        }
        try {
            return Integer.parseInt(name.substring(indexOf + 1, length - 4));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static File getStorageDir(Context context) {
        File A00 = C14630pr.A00(context, SC.android_optsvc_analytics);
        A00.mkdirs();
        return A00;
    }

    public static boolean isFileOldEnoughToDelete(File file) {
        if (System.currentTimeMillis() - file.lastModified() > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }
}
