package X;

import android.app.Activity;
import android.app.ActivityThread;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0Eu  reason: invalid class name and case insensitive filesystem */
public final class C03190Eu {
    public static C03190Eu A0F;
    public static final AnonymousClass0K9 A0G = new AnonymousClass0K9("ActivityThreadHelper");
    public static final Object A0H = new Object();
    public static volatile boolean A0I;
    public static volatile boolean A0J;
    public ActivityThread A00 = null;
    public Handler A01 = null;
    public C004802e A02 = null;
    public Class A03 = null;
    public Class A04 = null;
    public Field A05 = null;
    public Field A06 = null;
    public Field A07 = null;
    public Field A08 = null;
    public Field A09 = null;
    public Method A0A = null;
    public Method A0B = null;
    public Method A0C = null;
    public boolean A0D = false;
    public final C03410If A0E;

    /* JADX WARNING: Removed duplicated region for block: B:80:0x017c A[Catch:{ NoSuchMethodException -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C03190Eu A00(X.C03410If r19) {
        /*
            r13 = 0
            r2 = -2346(0xfffffffffffff6d6, float:NaN)
            r0 = 0
            boolean r1 = A0J
            if (r1 == 0) goto L_0x000b
            X.0Eu r0 = A0F
            return r0
        L_0x000b:
            java.lang.Object r9 = A0H
            monitor-enter(r9)
            boolean r1 = A0J     // Catch:{ all -> 0x0184 }
            if (r1 != 0) goto L_0x0180
            r1 = r19
            X.0If r10 = X.C03410If.A01(r1, r2, r0)     // Catch:{ all -> 0x0184 }
            r8 = 1
            X.0Eu r4 = new X.0Eu     // Catch:{ all -> 0x0184 }
            r4.<init>(r10)     // Catch:{ all -> 0x0184 }
            boolean r1 = X.C03200Ew.A00     // Catch:{ all -> 0x0184 }
            if (r1 != 0) goto L_0x0035
            X.0K9 r5 = A0G     // Catch:{ all -> 0x0184 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0184 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0184 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Android %d is not currently supported"
        L_0x0030:
            r5.A07(r0, r1)     // Catch:{ all -> 0x0184 }
            goto L_0x0176
        L_0x0035:
            android.app.ActivityThread r6 = X.AnonymousClass0Ep.A00()     // Catch:{ all -> 0x0184 }
            if (r6 != 0) goto L_0x0042
            X.0K9 r5 = A0G     // Catch:{ all -> 0x0184 }
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Could not find ActivityThread"
            goto L_0x0030
        L_0x0042:
            java.lang.Class r12 = r6.getClass()     // Catch:{ all -> 0x0184 }
            r4.A00 = r6     // Catch:{ all -> 0x0184 }
            r2 = 0
            X.0Id r11 = X.C03400Id.UnlikelyHidden     // Catch:{ NoSuchMethodException -> 0x005a }
            java.lang.String r14 = "getActivityClient"
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            java.lang.Class[] r15 = new java.lang.Class[]{r1}     // Catch:{ NoSuchMethodException -> 0x005a }
            java.lang.reflect.Method r1 = r10.A0J(r11, r12, r13, r14, r15)     // Catch:{ NoSuchMethodException -> 0x005a }
            r4.A0C = r1     // Catch:{ NoSuchMethodException -> 0x005a }
            goto L_0x0064
        L_0x005a:
            r5 = move-exception
            X.0K9 r3 = A0G     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "Could not get getActivityClient method."
            r3.A03(r1, r5)     // Catch:{ all -> 0x0184 }
            r4.A0C = r13     // Catch:{ all -> 0x0184 }
        L_0x0064:
            X.0Id r3 = X.C03400Id.UnlikelyHidden     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            java.lang.String r1 = "mActivities"
            java.lang.reflect.Field r1 = r10.A0H(r3, r12, r13, r1)     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            java.lang.Object r3 = r1.get(r6)     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            if (r3 == 0) goto L_0x007a
            X.02e r1 = new X.02e     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            r1.<init>(r3)     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            r4.A02 = r1     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            goto L_0x0099
        L_0x007a:
            java.lang.String r3 = "A null obj cannot be a map"
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            r1.<init>(r3)     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
            throw r1     // Catch:{ NoSuchFieldException -> 0x0086, IllegalAccessException -> 0x0084, ClassCastException -> 0x0082 }
        L_0x0082:
            r3 = move-exception
            goto L_0x0087
        L_0x0084:
            r3 = move-exception
            goto L_0x0087
        L_0x0086:
            r3 = move-exception
        L_0x0087:
            X.0K9 r5 = A0G     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "Could not get mActivities field. Not fatal."
            r5.A03(r1, r3)     // Catch:{ all -> 0x0184 }
            r4.A02 = r13     // Catch:{ all -> 0x0184 }
            java.lang.reflect.Method r1 = r4.A0C     // Catch:{ all -> 0x0184 }
            if (r1 != 0) goto L_0x0099
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Could not get activities (IBinder token to activity info) field."
            goto L_0x0030
        L_0x0099:
            X.0Id r5 = X.C03400Id.UnlikelyHidden     // Catch:{ Exception -> 0x016c }
            java.lang.String r1 = "android.app.ActivityThread$ActivityClientRecord"
            java.lang.Class r3 = r10.A0C(r5, r1)     // Catch:{ Exception -> 0x016c }
            r4.A03 = r3     // Catch:{ Exception -> 0x016c }
            java.lang.String r1 = "activity"
            java.lang.reflect.Field r1 = r10.A0H(r5, r3, r13, r1)     // Catch:{ Exception -> 0x016c }
            r4.A05 = r1     // Catch:{ Exception -> 0x016c }
            java.lang.Class r3 = r4.A03     // Catch:{ Exception -> 0x016c }
            java.lang.String r1 = "activityInfo"
            java.lang.reflect.Field r1 = r10.A0H(r5, r3, r13, r1)     // Catch:{ Exception -> 0x016c }
            r4.A06 = r1     // Catch:{ Exception -> 0x016c }
            java.lang.Class r3 = r4.A03     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "intent"
            java.lang.reflect.Field r1 = r10.A0I(r5, r3, r1)     // Catch:{ all -> 0x0184 }
            r4.A07 = r1     // Catch:{ all -> 0x0184 }
            java.lang.Class r1 = r4.A03     // Catch:{ all -> 0x0184 }
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0184 }
            java.lang.String r18 = "getStateString"
            r3 = 0
            r14 = r10
            r15 = r5
            r16 = r1
            r17 = r13
            r19 = r7
            java.lang.reflect.Method r3 = r14.A0J(r15, r16, r17, r18, r19)     // Catch:{ NoSuchMethodException -> 0x00d3 }
            goto L_0x00da
        L_0x00d3:
            r1 = move-exception
            java.util.Arrays.toString(r7)     // Catch:{ all -> 0x0184 }
            r1.getMessage()     // Catch:{ all -> 0x0184 }
        L_0x00da:
            r4.A0B = r3     // Catch:{ all -> 0x0184 }
            java.lang.Class r1 = r4.A03     // Catch:{ all -> 0x0184 }
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0184 }
            java.lang.String r18 = "getLifecycleState"
            r3 = 0
            r16 = r1
            r19 = r7
            java.lang.reflect.Method r3 = r14.A0J(r15, r16, r17, r18, r19)     // Catch:{ NoSuchMethodException -> 0x00ec }
            goto L_0x00f3
        L_0x00ec:
            r1 = move-exception
            java.util.Arrays.toString(r7)     // Catch:{ all -> 0x0184 }
            r1.getMessage()     // Catch:{ all -> 0x0184 }
        L_0x00f3:
            r4.A0A = r3     // Catch:{ all -> 0x0184 }
            java.lang.Class r3 = r4.A03     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "paused"
            java.lang.reflect.Field r1 = r10.A0I(r5, r3, r1)     // Catch:{ all -> 0x0184 }
            r4.A08 = r1     // Catch:{ all -> 0x0184 }
            java.lang.Class r3 = r4.A03     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "stopped"
            java.lang.reflect.Field r1 = r10.A0I(r5, r3, r1)     // Catch:{ all -> 0x0184 }
            r4.A09 = r1     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "mH"
            java.lang.reflect.Field r1 = r10.A0H(r13, r12, r13, r1)     // Catch:{ Exception -> 0x012b }
            java.lang.Object r3 = r1.get(r6)     // Catch:{ Exception -> 0x012b }
            android.os.Handler r3 = (android.os.Handler) r3     // Catch:{ Exception -> 0x012b }
            if (r3 == 0) goto L_0x0120
            java.lang.Class r1 = r3.getClass()     // Catch:{ Exception -> 0x012b }
            r4.A01 = r3     // Catch:{ Exception -> 0x012b }
            r4.A04 = r1     // Catch:{ Exception -> 0x012b }
            goto L_0x014f
        L_0x0120:
            X.0K9 r5 = A0G     // Catch:{ Exception -> 0x012b }
            java.lang.String r3 = "Got a null ActivityThread Handler mH. Trying next way."
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x012b }
            r5.A07(r3, r1)     // Catch:{ Exception -> 0x012b }
            r3 = 0
            goto L_0x0133
        L_0x012b:
            r3 = move-exception
            X.0K9 r5 = A0G     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "Could not get ActivityThread Handler from field mH."
            r5.A03(r1, r3)     // Catch:{ all -> 0x0184 }
        L_0x0133:
            java.lang.String r14 = "getHandler"
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0159 }
            r11 = r13
            r15 = r1
            java.lang.reflect.Method r7 = r10.A0J(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r1 = r7.invoke(r6, r1)     // Catch:{ Exception -> 0x0159 }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ Exception -> 0x0159 }
            if (r1 == 0) goto L_0x0151
            java.lang.Class r0 = r1.getClass()     // Catch:{ Exception -> 0x0159 }
            r4.A01 = r1     // Catch:{ Exception -> 0x0159 }
            r4.A04 = r0     // Catch:{ Exception -> 0x0159 }
        L_0x014f:
            r2 = 1
            goto L_0x0167
        L_0x0151:
            java.lang.String r1 = "Got a null ActivityThread Handler from ActivityThread.getHandler."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0159 }
            r5.A07(r1, r0)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0162
        L_0x0159:
            r1 = move-exception
            java.lang.String r0 = "Could not get ActivityThread Handler from method getHandler."
            r5.A03(r0, r1)     // Catch:{ all -> 0x0184 }
            if (r3 != 0) goto L_0x0162
            r3 = r1
        L_0x0162:
            java.lang.String r0 = "Could not init ActivityThread Handler links via any method"
            r5.A04(r0, r3)     // Catch:{ all -> 0x0184 }
        L_0x0167:
            r4.A0D = r2     // Catch:{ all -> 0x0184 }
            r1 = 1
            r0 = 0
            goto L_0x0178
        L_0x016c:
            r3 = move-exception
            X.0K9 r2 = A0G     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "Could not get critical ActivityClientRecord links "
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0184 }
            r2.A0C(r3, r1, r0)     // Catch:{ all -> 0x0184 }
        L_0x0176:
            r1 = 0
            r0 = 1
        L_0x0178:
            A0I = r0     // Catch:{ all -> 0x0184 }
            if (r1 == 0) goto L_0x017e
            A0F = r4     // Catch:{ all -> 0x0184 }
        L_0x017e:
            A0J = r8     // Catch:{ all -> 0x0184 }
        L_0x0180:
            X.0Eu r0 = A0F     // Catch:{ all -> 0x0184 }
            monitor-exit(r9)     // Catch:{ all -> 0x0184 }
            return r0
        L_0x0184:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0184 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03190Eu.A00(X.0If):X.0Eu");
    }

    public final Object A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            ActivityThread activityThread = this.A00;
            Method method = this.A0C;
            if (method != null && activityThread != null) {
                return method.invoke(activityThread, new Object[]{iBinder});
            }
            C004802e r0 = this.A02;
            if (r0 != null) {
                return r0.A00.get(iBinder);
            }
            throw new IllegalStateException("Don't know how to get ActivityClientRecord from token");
        } catch (Exception e) {
            A0G.A0B(e, "Could not get ActivityClientRecord info for token %s", iBinder);
            return null;
        }
    }

    public final boolean A02(IBinder iBinder, C016507v r10, Object obj) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        String str3;
        String str4;
        if (obj != null) {
            Field field = this.A06;
            Field field2 = this.A05;
            Field field3 = this.A07;
            if (field == null && field2 == null && field3 == null) {
                A0G.A07("Couldn't get activity info from client record since we were missing some fields", new Object[0]);
            } else {
                Object obj4 = null;
                if (field != null) {
                    try {
                        obj2 = field.get(obj);
                    } catch (ClassCastException | IllegalAccessException e) {
                        A0G.A0B(e, "Couldn't get ActivityInfo for %s", r10);
                        return false;
                    }
                } else {
                    obj2 = null;
                }
                ActivityInfo activityInfo = (ActivityInfo) obj2;
                if (field2 != null) {
                    obj3 = field2.get(obj);
                } else {
                    obj3 = null;
                }
                Activity activity = (Activity) obj3;
                if (field3 != null) {
                    obj4 = field3.get(obj);
                }
                Intent intent = (Intent) obj4;
                r10.A06 = obj;
                r10.A03 = iBinder;
                r10.A02 = activityInfo;
                r10.A00 = activity;
                r10.A01 = intent;
                if (iBinder != null && activityInfo != null && activity != null && intent != null) {
                    return true;
                }
                AnonymousClass0K9 r4 = C016507v.A0J;
                if (iBinder != null) {
                    str = "Y";
                } else {
                    str = "N";
                }
                if (activityInfo != null) {
                    str2 = "Y";
                } else {
                    str2 = "N";
                }
                if (activity != null) {
                    str3 = "Y";
                } else {
                    str3 = "N";
                }
                if (intent != null) {
                    str4 = "Y";
                } else {
                    str4 = "N";
                }
                r4.A07("Did not find expected items. Has Token: %s Has Activity Info: %s Has Activity: %s Has Activity Intent: %s", str, str2, str3, str4);
                return true;
            }
        }
        return false;
    }

    public C03190Eu(C03410If r3) {
        this.A0E = r3;
    }
}
