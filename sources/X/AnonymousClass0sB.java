package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0sB  reason: invalid class name */
public final class AnonymousClass0sB {
    public static final String A00 = String.format("Null metadata in caller identity, API=%d", new Object[]{Integer.valueOf(Build.VERSION.SDK_INT)});

    public static C16050sO A00(Context context, Intent intent) {
        return A01(context, intent, (C16240si) null, 60000);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|(1:4)|5|6|7|(1:9)|10|11|12|13|14|(1:16)|(1:18)|19|20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        throw new X.C15690rj(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006d */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051 A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[Catch:{ JSONException -> 0x006d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.content.Context r13, android.content.Intent r14, java.lang.String r15) {
        /*
            r6 = 0
            r5 = 1140850688(0x44000000, float:512.0)
            java.lang.ClassLoader r0 = r13.getClassLoader()     // Catch:{ Exception -> 0x0088 }
            r14.setExtrasClassLoader(r0)     // Catch:{ Exception -> 0x0088 }
            android.os.Bundle r4 = r14.getExtras()     // Catch:{ Exception -> 0x0088 }
            if (r4 != 0) goto L_0x0015
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Exception -> 0x0088 }
            r4.<init>()     // Catch:{ Exception -> 0x0088 }
        L_0x0015:
            java.lang.ClassLoader r0 = r13.getClassLoader()     // Catch:{ Exception -> 0x0088 }
            r4.setClassLoader(r0)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r3 = "_ci_"
            r8 = 0
            android.content.pm.PackageManager r1 = r13.getPackageManager()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002f }
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = r13.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002f }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r6)     // Catch:{ NameNotFoundException | RuntimeException -> 0x002f }
            java.lang.String r8 = r0.versionName     // Catch:{ NameNotFoundException | RuntimeException -> 0x002f }
        L_0x002f:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0088 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0088 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0088 }
            r7.<init>()     // Catch:{ Exception -> 0x0088 }
            r0 = 0
            java.lang.String r2 = "t"
            java.lang.String r1 = java.lang.Long.toString(r11)     // Catch:{ JSONException -> 0x006d }
            r7.put(r2, r1)     // Catch:{ JSONException -> 0x006d }
            java.lang.String r2 = "r"
            java.lang.String r1 = java.lang.Long.toString(r9)     // Catch:{ JSONException -> 0x006d }
            r7.put(r2, r1)     // Catch:{ JSONException -> 0x006d }
            if (r15 == 0) goto L_0x0056
            java.lang.String r1 = "d"
            r7.put(r1, r15)     // Catch:{ JSONException -> 0x006d }
        L_0x0056:
            if (r8 == 0) goto L_0x005d
            java.lang.String r1 = "v"
            r7.put(r1, r8)     // Catch:{ JSONException -> 0x006d }
        L_0x005d:
            java.lang.String r2 = r7.toString()     // Catch:{  }
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch:{  }
            r1 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r1)     // Catch:{  }
        L_0x006d:
            X.0sh r2 = new X.0sh     // Catch:{ Exception -> 0x0088 }
            r2.<init>()     // Catch:{ Exception -> 0x0088 }
            r2.A0A = r0     // Catch:{ Exception -> 0x0088 }
            java.lang.String r1 = "com.facebook.invalid_class.f4c3b00c"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x0088 }
            r0.<init>(r13, r1)     // Catch:{ Exception -> 0x0088 }
            r2.A03 = r0     // Catch:{ Exception -> 0x0088 }
            android.app.PendingIntent r0 = r2.A01(r13, r6, r5)     // Catch:{ Exception -> 0x0088 }
            r4.putParcelable(r3, r0)     // Catch:{ Exception -> 0x0088 }
            r14.putExtras(r4)     // Catch:{ Exception -> 0x0088 }
            return
        L_0x0088:
            r1 = move-exception
            X.0rj r0 = new X.0rj
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0sB.A03(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    public static C16050sO A01(Context context, Intent intent, C16240si r14, int i) {
        String str;
        String str2;
        String str3;
        if (intent == null || !intent.hasExtra("_ci_")) {
            str = "Missing caller identity intent extra.";
        } else {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
            if (pendingIntent != null) {
                String creatorPackage = pendingIntent.getCreatorPackage();
                int creatorUid = pendingIntent.getCreatorUid();
                if (creatorPackage == null) {
                    return null;
                }
                try {
                    C15460rM A03 = C15980sH.A03(C15980sH.A01(C15980sH.A00(context, creatorPackage)));
                    try {
                        String str4 = (String) PendingIntent.class.getMethod("getTag", new Class[]{String.class}).invoke(pendingIntent, new Object[]{""});
                        if (str4 != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str4, 11), "UTF-8"));
                                if (jSONObject.has("d")) {
                                    str2 = jSONObject.getString("d");
                                } else {
                                    str2 = null;
                                }
                                try {
                                    if (jSONObject.has("v")) {
                                        str3 = jSONObject.getString("v");
                                    } else {
                                        str3 = null;
                                    }
                                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
                                    e = e;
                                    A04(r14, "Error parsing metadata from caller identity.", e);
                                    return null;
                                }
                                try {
                                    long j = (long) i;
                                    if (System.currentTimeMillis() - Long.parseLong(jSONObject.getString("t")) >= j) {
                                        if (jSONObject.has("r")) {
                                            if (SystemClock.elapsedRealtime() - Long.parseLong(jSONObject.getString("r")) < j) {
                                            }
                                        }
                                        A04(r14, "Caller identity has expired.", (Throwable) null);
                                        return null;
                                    }
                                    return new C16050sO(A03, str3, str2, Collections.singletonList(creatorPackage), creatorUid);
                                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e2) {
                                    e = e2;
                                    A04(r14, "Error parsing metadata from caller identity.", e);
                                    return null;
                                }
                            } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e3) {
                                e = e3;
                                A04(r14, "Error parsing metadata from caller identity.", e);
                                return null;
                            }
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                        A04(r14, "Error extracting metadata from caller identity.", e4);
                    }
                    str = A00;
                } catch (SecurityException e5) {
                    A04(r14, "Failed to get signature.", e5);
                    return null;
                }
            } else {
                str = "Null caller identity intent extra.";
            }
        }
        A04(r14, str, (Throwable) null);
        return null;
    }

    public static void A04(C16240si r1, String str, Throwable th) {
        if (r1 != null) {
            r1.Ccw("CallerInfoHelper", str, th);
        }
    }

    public static void A02(Context context, Intent intent, C16240si r3, String str) {
        try {
            A03(context, intent, str);
        } catch (C15690rj e) {
            r3.Ccw("CallerInfoHelper", "Error attaching caller info to Intent.", e);
        }
    }
}
