package X;

import android.os.Build;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0If  reason: invalid class name and case insensitive filesystem */
public final class C03410If {
    public static int A01 = -2;
    public static Method A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static boolean A0A;
    public static boolean A0B;
    public static final AnonymousClass0K9 A0C = new AnonymousClass0K9("HiddenApis");
    public static final ClassLoader A0D = C03410If.class.getClassLoader();
    public static final Object A0E = new Object();
    public static final Map A0F = new HashMap();
    public static final Object A0G = new Object();
    public static volatile C017208e A0H;
    public static volatile boolean A0I;
    public final ClassLoader A00 = A0D;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class A02(X.C03400Id r16, java.lang.ClassLoader r17, java.lang.String r18) {
        /*
            r3 = 1
            X.08e r0 = A00()
            r12 = 0
            r5 = r17
            r4 = r18
            if (r0 == 0) goto L_0x00c1
            java.lang.reflect.Method r1 = X.C017208e.A0A
            r0 = 0
            if (r1 == 0) goto L_0x0012
            r0 = 1
        L_0x0012:
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "com.facebook"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            if (r16 == 0) goto L_0x0030
            X.0Id r0 = X.C03400Id.LikelyHidden
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00a9
        L_0x0030:
            r0 = 1
        L_0x0031:
            r11 = r0 ^ 1
            r6 = 0
            r10 = r11 ^ 1
            r2 = 0
        L_0x0037:
            r7 = 2
            if (r2 >= r7) goto L_0x00ac
            int r0 = r10 + r2
            int r1 = r0 % 2
            if (r1 == 0) goto L_0x0045
            java.lang.Class r0 = java.lang.Class.forName(r4, r3, r5)     // Catch:{ ClassNotFoundException -> 0x0086 }
            return r0
        L_0x0045:
            java.lang.reflect.Method r8 = X.C017208e.A09     // Catch:{ ClassNotFoundException -> 0x0086 }
            if (r8 != 0) goto L_0x004e
            java.lang.Class r0 = java.lang.Class.forName(r4, r3, r5)     // Catch:{ ClassNotFoundException -> 0x0086 }
            return r0
        L_0x004e:
            r9 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0060 }
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r5}     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r0 = r8.invoke(r9, r0)     // Catch:{ Exception -> 0x0060 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x0060 }
            if (r0 == 0) goto L_0x006d
            goto L_0x00ab
        L_0x0060:
            r8 = move-exception
            r9 = r8
        L_0x0062:
            if (r8 == 0) goto L_0x006d
            boolean r0 = r8 instanceof java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0086 }
            if (r0 != 0) goto L_0x0085
            java.lang.Throwable r8 = r8.getCause()     // Catch:{ ClassNotFoundException -> 0x0086 }
            goto L_0x0062
        L_0x006d:
            if (r9 == 0) goto L_0x0074
            java.lang.String r0 = r9.getMessage()     // Catch:{ ClassNotFoundException -> 0x0086 }
            goto L_0x0076
        L_0x0074:
            java.lang.String r0 = "None found"
        L_0x0076:
            java.lang.Object[] r8 = new java.lang.Object[]{r4, r0}     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.String r0 = "Class %s could not be found with given class loader. Error: %s"
            java.lang.String r0 = java.lang.String.format(r0, r8)     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0086 }
            r8.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0086 }
        L_0x0085:
            throw r8     // Catch:{ ClassNotFoundException -> 0x0086 }
        L_0x0086:
            r15 = move-exception
            X.0K9 r13 = A0C
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "normal"
        L_0x008f:
            java.lang.Object[] r16 = new java.lang.Object[]{r4, r0}
            java.lang.String r14 = "Could not load class %s from %s forName."
            boolean r0 = X.AnonymousClass0K9.A02
            if (r0 == 0) goto L_0x00a0
            r17 = 3
            r18 = r7
            r13.A05(r14, r15, r16, r17, r18)
        L_0x00a0:
            if (r1 != r3) goto L_0x00a3
            r6 = r15
        L_0x00a3:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00a6:
            java.lang.String r0 = "internal Reflect"
            goto L_0x008f
        L_0x00a9:
            r0 = 0
            goto L_0x0031
        L_0x00ab:
            return r0
        L_0x00ac:
            X.0K9 r2 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r12] = r4
            java.lang.String r0 = "NOT "
            if (r6 != 0) goto L_0x00c6
            if (r11 == 0) goto L_0x00ba
            java.lang.String r0 = ""
        L_0x00ba:
            r1[r3] = r0
            java.lang.String r0 = "Internal with forName and also could not find class %s (can%s be hidden)"
            r2.A07(r0, r1)
        L_0x00c1:
            java.lang.Class r0 = java.lang.Class.forName(r4, r3, r5)
            return r0
        L_0x00c6:
            if (r11 == 0) goto L_0x00ca
            java.lang.String r0 = ""
        L_0x00ca:
            r1[r3] = r0
            java.lang.String r0 = "Could not find class %s (can%s be hidden)"
            r2.A09(r6, r0, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A02(X.0Id, java.lang.ClassLoader, java.lang.String):java.lang.Class");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        java.util.Arrays.toString(r5);
        r0.getMessage();
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0131 A[ExcHandler: IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException (r0v12 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:81:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009b A[SYNTHETIC, Splitter:B:55:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3 A[Catch:{ NoSuchMethodException -> 0x013d, Exception -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1 A[Catch:{ NoSuchMethodException -> 0x013d, Exception -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c9 A[Catch:{ NoSuchMethodException -> 0x013d, Exception -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d6 A[Catch:{ NoSuchMethodException -> 0x013d, Exception -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7 A[SYNTHETIC, Splitter:B:77:0x00d7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(java.lang.Class r12, java.lang.Object... r13) {
        /*
            r11 = this;
            r4 = 0
            r9 = 1
            int r3 = r13.length     // Catch:{ Exception -> 0x014a }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x014a }
            r6 = 0
        L_0x0006:
            if (r6 >= r3) goto L_0x0028
            r5 = r13[r6]     // Catch:{ Exception -> 0x014a }
            boolean r0 = r5 instanceof X.C019208y     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x0016
            X.08y r5 = (X.C019208y) r5     // Catch:{ Exception -> 0x014a }
            java.lang.Class r0 = r5.A00     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x0023
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x014a }
        L_0x0016:
            r1 = 0
            if (r5 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            java.lang.String r0 = "Param cannot be null use NullInstance"
            X.AnonymousClass0KW.A05(r1, r0)     // Catch:{ Exception -> 0x014a }
            java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x014a }
        L_0x0023:
            r2[r6] = r0     // Catch:{ Exception -> 0x014a }
            int r6 = r6 + 1
            goto L_0x0006
        L_0x0028:
            java.util.Arrays.toString(r2)     // Catch:{ Exception -> 0x014a }
            r7 = 0
            X.0Id r8 = X.C03400Id.Unknown     // Catch:{ Exception -> 0x014a }
            X.08e r5 = A00()     // Catch:{ NoSuchMethodException -> 0x013d }
            if (r5 != 0) goto L_0x0037
            java.util.Arrays.toString(r2)     // Catch:{ NoSuchMethodException -> 0x013d }
        L_0x0037:
            java.lang.reflect.Method r1 = X.C017208e.A0B     // Catch:{ NoSuchMethodException -> 0x013d }
            r0 = 0
            if (r1 == 0) goto L_0x003d
            r0 = 1
        L_0x003d:
            if (r0 == 0) goto L_0x0095
            if (r5 == 0) goto L_0x0095
            boolean r0 = A0A(r8, r12)     // Catch:{ NoSuchMethodException -> 0x013d }
            if (r0 != 0) goto L_0x0095
            r10 = 0
            if (r1 != 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r6 = r1.invoke(r12, r0)     // Catch:{ Exception -> 0x0060 }
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6     // Catch:{ Exception -> 0x0060 }
            if (r6 == 0) goto L_0x006d
            goto L_0x005c
        L_0x0058:
            java.lang.reflect.Constructor r6 = r12.getDeclaredConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x008e }
        L_0x005c:
            java.util.Arrays.toString(r2)     // Catch:{ NoSuchMethodException -> 0x008e }
            goto L_0x0099
        L_0x0060:
            r10 = move-exception
            r1 = r10
        L_0x0062:
            if (r1 == 0) goto L_0x006d
            boolean r0 = r1 instanceof java.lang.NoSuchMethodException     // Catch:{ NoSuchMethodException -> 0x008e }
            if (r0 != 0) goto L_0x008a
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ NoSuchMethodException -> 0x008e }
            goto L_0x0062
        L_0x006d:
            java.lang.String r5 = r12.getName()     // Catch:{ NoSuchMethodException -> 0x008e }
            java.lang.String r1 = java.util.Arrays.toString(r2)     // Catch:{ NoSuchMethodException -> 0x008e }
            if (r10 == 0) goto L_0x008b
            java.lang.String r0 = r10.getMessage()     // Catch:{ NoSuchMethodException -> 0x008e }
        L_0x007b:
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r0}     // Catch:{ NoSuchMethodException -> 0x008e }
            java.lang.String r0 = "Constructor for %s ( %s ) could not be found. Error msg: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x008e }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ NoSuchMethodException -> 0x008e }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x008e }
        L_0x008a:
            throw r1     // Catch:{ NoSuchMethodException -> 0x008e }
        L_0x008b:
            java.lang.String r0 = "None found"
            goto L_0x007b
        L_0x008e:
            r0 = move-exception
            java.util.Arrays.toString(r2)     // Catch:{ NoSuchMethodException -> 0x013d }
            r0.getMessage()     // Catch:{ NoSuchMethodException -> 0x013d }
        L_0x0095:
            java.lang.reflect.Constructor r6 = r12.getDeclaredConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x013d }
        L_0x0099:
            if (r6 == 0) goto L_0x009e
            r6.setAccessible(r9)     // Catch:{ Exception -> 0x014a }
        L_0x009e:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x014a }
            r2 = 0
        L_0x00a1:
            if (r2 >= r3) goto L_0x00b4
            r1 = r13[r2]     // Catch:{ Exception -> 0x014a }
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1 instanceof X.C019208y     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x00af
            X.08y r1 = (X.C019208y) r1     // Catch:{ Exception -> 0x014a }
            java.lang.Object r1 = r1.A01     // Catch:{ Exception -> 0x014a }
        L_0x00af:
            r5[r2] = r1     // Catch:{ Exception -> 0x014a }
            int r2 = r2 + 1
            goto L_0x00a1
        L_0x00b4:
            java.util.Arrays.toString(r5)     // Catch:{ Exception -> 0x014a }
            java.lang.Class r3 = r6.getDeclaringClass()     // Catch:{ Exception -> 0x014a }
            X.08e r2 = A00()     // Catch:{ Exception -> 0x014a }
            if (r2 != 0) goto L_0x00c4
            java.util.Arrays.toString(r5)     // Catch:{ Exception -> 0x014a }
        L_0x00c4:
            java.lang.reflect.Method r1 = X.C017208e.A0E     // Catch:{ Exception -> 0x014a }
            r0 = 0
            if (r1 == 0) goto L_0x00ca
            r0 = 1
        L_0x00ca:
            if (r0 == 0) goto L_0x0138
            if (r2 == 0) goto L_0x0138
            boolean r0 = A0A(r7, r3)     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x0138
            if (r1 != 0) goto L_0x00d7
            goto L_0x00e2
        L_0x00d7:
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ Exception -> 0x00ea }
            if (r0 == 0) goto L_0x0103
            goto L_0x00e6
        L_0x00e2:
            java.lang.Object r0 = r6.newInstance(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
        L_0x00e6:
            java.util.Arrays.toString(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            return r0
        L_0x00ea:
            r7 = move-exception
            r1 = r7
        L_0x00ec:
            if (r1 == 0) goto L_0x0103
            boolean r0 = r1 instanceof java.lang.InstantiationException     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            if (r0 != 0) goto L_0x0130
            boolean r0 = r1 instanceof java.lang.IllegalAccessException     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            if (r0 != 0) goto L_0x0130
            boolean r0 = r1 instanceof java.lang.IllegalArgumentException     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            if (r0 != 0) goto L_0x0130
            boolean r0 = r1 instanceof java.lang.reflect.InvocationTargetException     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            if (r0 != 0) goto L_0x0130
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            goto L_0x00ec
        L_0x0103:
            java.lang.Class r3 = r6.getDeclaringClass()     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            java.lang.String r2 = java.util.Arrays.toString(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            if (r7 == 0) goto L_0x0116
            java.lang.Class r0 = r7.getClass()     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            java.lang.String r1 = r0.getSimpleName()     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            goto L_0x0118
        L_0x0116:
            java.lang.String r1 = "Unknown"
        L_0x0118:
            if (r7 == 0) goto L_0x011f
            java.lang.String r0 = r7.getMessage()     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            goto L_0x0121
        L_0x011f:
            java.lang.String r0 = "None found"
        L_0x0121:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            java.lang.String r0 = "Could not construct a new instance for %s with ( %s ). Error msg from %s: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            java.lang.InstantiationException r1 = new java.lang.InstantiationException     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
            r1.<init>(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
        L_0x0130:
            throw r1     // Catch:{ IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131, IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException -> 0x0131 }
        L_0x0131:
            r0 = move-exception
            java.util.Arrays.toString(r5)     // Catch:{ Exception -> 0x014a }
            r0.getMessage()     // Catch:{ Exception -> 0x014a }
        L_0x0138:
            java.lang.Object r0 = r6.newInstance(r5)     // Catch:{ Exception -> 0x014a }
            return r0
        L_0x013d:
            r1 = move-exception
            boolean r0 = A09(r8)     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x0149
            java.lang.String r0 = "<init>"
            A0B(r12, r7, r0, r2)     // Catch:{ Exception -> 0x014a }
        L_0x0149:
            throw r1     // Catch:{ Exception -> 0x014a }
        L_0x014a:
            r3 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r0 = "Could not construct hidden api class %s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1.A0A(r3, r2, r0)
            boolean r0 = r3 instanceof X.C03390Ic
            if (r0 == 0) goto L_0x0161
            throw r3
        L_0x0161:
            X.0Ic r0 = new X.0Ic
            r0.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A0F(java.lang.Class, java.lang.Object[]):java.lang.Object");
    }

    public final Field A0I(C03400Id r3, Class cls, String str) {
        try {
            return A0H(r3, cls, (Class) null, str);
        } catch (NoSuchFieldException e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C017208e A00() {
        /*
            boolean r0 = A0I
            r5 = 0
            if (r0 != 0) goto L_0x002f
            X.08e r0 = A0H
            if (r0 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Object r4 = A0G
            monitor-enter(r4)
            X.08e r3 = A0H     // Catch:{ all -> 0x002c }
            if (r3 != 0) goto L_0x002a
            int r2 = A01     // Catch:{ all -> 0x002c }
            if (r2 >= 0) goto L_0x0016
            r2 = 0
        L_0x0016:
            r1 = 1
            boolean r0 = A04     // Catch:{ all -> 0x002c }
            X.08e r3 = new X.08e     // Catch:{ all -> 0x002c }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x002c }
            boolean r0 = r3.A03()     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x0028
            A0I = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            return r5
        L_0x0028:
            A0H = r3     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            return r3
        L_0x002c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A00():X.08e");
    }

    public static C03410If A01(C03410If r3, int i, boolean z) {
        AnonymousClass0K9 r2;
        Object[] objArr;
        String str;
        if (r3 != null) {
            return r3;
        }
        C017208e r0 = A0H;
        if (r0 != null) {
            r0.A02 = z;
        }
        A04 = z;
        int i2 = A01;
        if (i2 < 0) {
            if (i != -4) {
                A01 = i;
            } else {
                r2 = A0C;
                objArr = new Object[0];
                str = "TargetSdkVersion is not set yet, so cannot rely on cached value";
                r2.A06(str, objArr);
            }
        } else if (!(i == -4 || i < 0 || i == i2)) {
            r2 = A0C;
            objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2)};
            str = "The given target sdk version %s is different than the cached sdk version %d";
            r2.A06(str, objArr);
        }
        return new C03410If();
    }

    public static Method A04() {
        boolean z = A05;
        Method method = A02;
        if (!z) {
            try {
                C03400Id r3 = C03400Id.LikelyHidden;
                method = A05(r3, A02(r3, A0D, "dalvik.system.VMStack"), "getStackClass2", new Class[0], false);
                if (method != null) {
                    method.setAccessible(true);
                }
                A02 = method;
            } catch (Exception e) {
                A0C.A07("Could not get VMStack.getStackClass2. Error %s: %s", e.getClass(), e.getMessage());
                method = null;
            } catch (Throwable th) {
                A05 = true;
                throw th;
            }
            A05 = true;
        }
        if (method == null) {
            return null;
        }
        boolean z2 = A08;
        boolean z3 = A0B;
        if (!z2) {
            z3 = HiddenApis$TestGetCallingClassClass.callAndCheckVMStackGetStackClass2(method);
            A0B = z3;
            A08 = true;
        }
        if (!z3) {
            return null;
        }
        return method;
    }

    public static boolean A06() {
        boolean z = A06;
        boolean z2 = A09;
        if (z) {
            return z2;
        }
        boolean testJdkInternalReflectGetCallingClass = HiddenApis$TestGetCallingClassClass.testJdkInternalReflectGetCallingClass();
        A09 = testJdkInternalReflectGetCallingClass;
        A06 = true;
        return testJdkInternalReflectGetCallingClass;
    }

    public static boolean A07() {
        if (33 <= Build.VERSION.SDK_INT) {
            return false;
        }
        boolean z = A07;
        boolean z2 = A0A;
        if (z) {
            return z2;
        }
        boolean testSunReflectGetCallingClass = HiddenApis$TestGetCallingClassClass.testSunReflectGetCallingClass();
        A0A = testSunReflectGetCallingClass;
        A07 = true;
        return testSunReflectGetCallingClass;
    }

    public static boolean A08(C017208e r6, String str) {
        Map map;
        Boolean bool;
        Object obj = A0E;
        synchronized (obj) {
            map = A0F;
            bool = (Boolean) map.get(str);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String str2 = new String[]{str}[0];
        StringBuilder sb = new StringBuilder("L");
        sb.append(str2.replace('.', '/'));
        sb.append(BasicHeaderValueParser.PARAM_DELIMITER);
        String[] strArr = {sb.toString()};
        String.format("Exempting classes %s", new Object[]{Arrays.toString(strArr)});
        boolean A042 = r6.A04(strArr);
        synchronized (obj) {
            map.put(str, Boolean.valueOf(A042));
        }
        return false;
    }

    public static boolean A09(C03400Id r2) {
        if (!A04 || A0I || r2 == null) {
            return true;
        }
        return !r2.A00;
    }

    public static boolean A0B(Class cls, Class cls2, String str, Class... clsArr) {
        C017208e A002;
        if (!A0I && (A002 = A00()) != null) {
            StringBuilder sb = new StringBuilder(C017208e.A00(cls));
            sb.append("->");
            if (str != null) {
                sb.append(str);
                sb.append('(');
                for (Class A012 : clsArr) {
                    sb.append(C017208e.A01(A012));
                }
                if (cls2 != null) {
                    sb.append(')');
                    sb.append(C017208e.A01(cls2));
                }
            }
            String obj = sb.toString();
            if (obj != null) {
                A002.A04(obj);
            }
            Arrays.toString(clsArr);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[SYNTHETIC, Splitter:B:21:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC, Splitter:B:32:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class A0C(X.C03400Id r9, java.lang.String r10) {
        /*
            r8 = this;
            boolean r0 = A03
            if (r0 != 0) goto L_0x000a
            com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass.testVMStackGetCallingClassLoader()
            r0 = 1
            A03 = r0
        L_0x000a:
            java.lang.String r7 = "forName W/ Hint"
            r4 = 0
            r5 = 0
            r6 = r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L_0x0038
            boolean r0 = A07()
            if (r0 == 0) goto L_0x0038
            java.lang.Class r0 = sun.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x002c, NoSuchMethodError -> 0x002a }
            if (r0 == 0) goto L_0x0038
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x0028, NoSuchMethodError -> 0x002e }
            goto L_0x0038
        L_0x0028:
            r2 = move-exception
            goto L_0x002f
        L_0x002a:
            r2 = move-exception
            goto L_0x002f
        L_0x002c:
            r2 = move-exception
            goto L_0x002f
        L_0x002e:
            r2 = move-exception
        L_0x002f:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0C(r2, r3, r0)
        L_0x0038:
            if (r6 != 0) goto L_0x005c
            boolean r0 = A06()
            if (r0 == 0) goto L_0x005c
            java.lang.Class r0 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x004f, NoSuchMethodError -> 0x004d }
            if (r0 == 0) goto L_0x005c
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x004b, NoSuchMethodError -> 0x0051 }
            goto L_0x005c
        L_0x004b:
            r2 = move-exception
            goto L_0x0052
        L_0x004d:
            r2 = move-exception
            goto L_0x0052
        L_0x004f:
            r2 = move-exception
            goto L_0x0052
        L_0x0051:
            r2 = move-exception
        L_0x0052:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0C(r2, r3, r0)
            r6 = r4
        L_0x005c:
            if (r6 != 0) goto L_0x008c
            java.lang.reflect.Method r1 = A04()
            if (r1 == 0) goto L_0x008c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch:{ IllegalAccessException -> 0x0075, IllegalArgumentException -> 0x0073, InvocationTargetException -> 0x007f }
            goto L_0x008b
        L_0x0073:
            r3 = move-exception
            goto L_0x0080
        L_0x0075:
            r3 = move-exception
            goto L_0x0080
        L_0x0077:
            r4 = r6
            goto L_0x008b
        L_0x0079:
            r3 = move-exception
            goto L_0x0080
        L_0x007b:
            r3 = move-exception
            goto L_0x0080
        L_0x007d:
            r3 = move-exception
            goto L_0x0080
        L_0x007f:
            r3 = move-exception
        L_0x0080:
            X.0K9 r2 = A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r2.A0C(r3, r0, r1)
        L_0x008b:
            r6 = r4
        L_0x008c:
            if (r6 != 0) goto L_0x0090
            java.lang.ClassLoader r6 = r8.A00
        L_0x0090:
            java.lang.Class r0 = A03(r9, r6, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A0C(X.0Id, java.lang.String):java.lang.Class");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[SYNTHETIC, Splitter:B:21:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC, Splitter:B:32:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class A0D(X.C03400Id r9, java.lang.String r10) {
        /*
            r8 = this;
            boolean r0 = A03
            if (r0 != 0) goto L_0x000a
            com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass.testVMStackGetCallingClassLoader()
            r0 = 1
            A03 = r0
        L_0x000a:
            java.lang.String r7 = "getClassOrNull W/ Hint"
            r4 = 0
            r5 = 0
            r6 = r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L_0x0038
            boolean r0 = A07()
            if (r0 == 0) goto L_0x0038
            java.lang.Class r0 = sun.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x002c, NoSuchMethodError -> 0x002a }
            if (r0 == 0) goto L_0x0038
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x0028, NoSuchMethodError -> 0x002e }
            goto L_0x0038
        L_0x0028:
            r2 = move-exception
            goto L_0x002f
        L_0x002a:
            r2 = move-exception
            goto L_0x002f
        L_0x002c:
            r2 = move-exception
            goto L_0x002f
        L_0x002e:
            r2 = move-exception
        L_0x002f:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0C(r2, r3, r0)
        L_0x0038:
            if (r6 != 0) goto L_0x005c
            boolean r0 = A06()
            if (r0 == 0) goto L_0x005c
            java.lang.Class r0 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x004f, NoSuchMethodError -> 0x004d }
            if (r0 == 0) goto L_0x005c
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x004b, NoSuchMethodError -> 0x0051 }
            goto L_0x005c
        L_0x004b:
            r2 = move-exception
            goto L_0x0052
        L_0x004d:
            r2 = move-exception
            goto L_0x0052
        L_0x004f:
            r2 = move-exception
            goto L_0x0052
        L_0x0051:
            r2 = move-exception
        L_0x0052:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0C(r2, r3, r0)
            r6 = r4
        L_0x005c:
            if (r6 != 0) goto L_0x008c
            java.lang.reflect.Method r1 = A04()
            if (r1 == 0) goto L_0x008c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch:{ IllegalAccessException -> 0x0075, IllegalArgumentException -> 0x0073, InvocationTargetException -> 0x007f }
            goto L_0x008b
        L_0x0073:
            r3 = move-exception
            goto L_0x0080
        L_0x0075:
            r3 = move-exception
            goto L_0x0080
        L_0x0077:
            r4 = r6
            goto L_0x008b
        L_0x0079:
            r3 = move-exception
            goto L_0x0080
        L_0x007b:
            r3 = move-exception
            goto L_0x0080
        L_0x007d:
            r3 = move-exception
            goto L_0x0080
        L_0x007f:
            r3 = move-exception
        L_0x0080:
            X.0K9 r2 = A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r2.A0C(r3, r0, r1)
        L_0x008b:
            r6 = r4
        L_0x008c:
            if (r6 != 0) goto L_0x0090
            java.lang.ClassLoader r6 = r8.A00
        L_0x0090:
            r10.getClass()
            r6.getClass()
            java.lang.Class r0 = A03(r9, r6, r10)     // Catch:{ ClassNotFoundException -> 0x009b }
            return r0
        L_0x009b:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A0D(X.0Id, java.lang.String):java.lang.Class");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[SYNTHETIC, Splitter:B:21:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC, Splitter:B:32:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class A0E(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = A03
            if (r0 != 0) goto L_0x000a
            com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass.testVMStackGetCallingClassLoader()
            r0 = 1
            A03 = r0
        L_0x000a:
            java.lang.String r7 = "getClassOrNull"
            r4 = 0
            r5 = 0
            r3 = r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r6 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L_0x0038
            boolean r0 = A07()
            if (r0 == 0) goto L_0x0038
            java.lang.Class r0 = sun.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x002c, NoSuchMethodError -> 0x002a }
            if (r0 == 0) goto L_0x0038
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x0028, NoSuchMethodError -> 0x002e }
            goto L_0x0038
        L_0x0028:
            r2 = move-exception
            goto L_0x002f
        L_0x002a:
            r2 = move-exception
            goto L_0x002f
        L_0x002c:
            r2 = move-exception
            goto L_0x002f
        L_0x002e:
            r2 = move-exception
        L_0x002f:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0C(r2, r6, r0)
        L_0x0038:
            if (r3 != 0) goto L_0x005c
            boolean r0 = A06()
            if (r0 == 0) goto L_0x005c
            java.lang.Class r0 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x004f, NoSuchMethodError -> 0x004d }
            if (r0 == 0) goto L_0x005c
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x004b, NoSuchMethodError -> 0x0051 }
            goto L_0x005c
        L_0x004b:
            r2 = move-exception
            goto L_0x0052
        L_0x004d:
            r2 = move-exception
            goto L_0x0052
        L_0x004f:
            r2 = move-exception
            goto L_0x0052
        L_0x0051:
            r2 = move-exception
        L_0x0052:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0C(r2, r6, r0)
            r3 = r4
        L_0x005c:
            if (r3 != 0) goto L_0x008c
            java.lang.reflect.Method r1 = A04()
            if (r1 == 0) goto L_0x008c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ IllegalAccessException -> 0x007d, IllegalArgumentException -> 0x007b, InvocationTargetException -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch:{ IllegalAccessException -> 0x0075, IllegalArgumentException -> 0x0073, InvocationTargetException -> 0x007f }
            goto L_0x008b
        L_0x0073:
            r3 = move-exception
            goto L_0x0080
        L_0x0075:
            r3 = move-exception
            goto L_0x0080
        L_0x0077:
            r4 = r3
            goto L_0x008b
        L_0x0079:
            r3 = move-exception
            goto L_0x0080
        L_0x007b:
            r3 = move-exception
            goto L_0x0080
        L_0x007d:
            r3 = move-exception
            goto L_0x0080
        L_0x007f:
            r3 = move-exception
        L_0x0080:
            X.0K9 r2 = A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r2.A0C(r3, r0, r1)
        L_0x008b:
            r3 = r4
        L_0x008c:
            if (r3 != 0) goto L_0x0090
            java.lang.ClassLoader r3 = r8.A00
        L_0x0090:
            r0 = 0
            r9.getClass()
            r3.getClass()
            java.lang.Class r0 = A03(r0, r3, r9)     // Catch:{ ClassNotFoundException -> 0x009c }
            return r0
        L_0x009c:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A0E(java.lang.String):java.lang.Class");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC, Splitter:B:21:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC, Splitter:B:32:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3 A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c4 A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ca A[Catch:{ Exception -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00dc A[Catch:{ Exception -> 0x00e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0G(java.lang.String r11, java.lang.Object[] r12, java.lang.String... r13) {
        /*
            r10 = this;
            boolean r0 = A03
            if (r0 != 0) goto L_0x000a
            com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass.testVMStackGetCallingClassLoader()
            r0 = 1
            A03 = r0
        L_0x000a:
            r8 = 1
            java.lang.String r6 = "constructNewInstance"
            r5 = 0
            r4 = 0
            r9 = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L_0x0039
            boolean r0 = A07()
            if (r0 == 0) goto L_0x0039
            java.lang.Class r0 = sun.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x002d, NoSuchMethodError -> 0x002b }
            if (r0 == 0) goto L_0x0039
            java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x002f, NoSuchMethodError -> 0x0029 }
            goto L_0x0039
        L_0x0029:
            r2 = move-exception
            goto L_0x0030
        L_0x002b:
            r2 = move-exception
            goto L_0x0030
        L_0x002d:
            r2 = move-exception
            goto L_0x0030
        L_0x002f:
            r2 = move-exception
        L_0x0030:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            r1.A0C(r2, r3, r0)
        L_0x0039:
            if (r9 != 0) goto L_0x005d
            boolean r0 = A06()
            if (r0 == 0) goto L_0x005d
            java.lang.Class r0 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x0050, NoSuchMethodError -> 0x004e }
            if (r0 == 0) goto L_0x005d
            java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x0052, NoSuchMethodError -> 0x004c }
            goto L_0x005d
        L_0x004c:
            r2 = move-exception
            goto L_0x0053
        L_0x004e:
            r2 = move-exception
            goto L_0x0053
        L_0x0050:
            r2 = move-exception
            goto L_0x0053
        L_0x0052:
            r2 = move-exception
        L_0x0053:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            r1.A0C(r2, r3, r0)
            r9 = r5
        L_0x005d:
            if (r9 != 0) goto L_0x008d
            java.lang.reflect.Method r1 = A04()
            if (r1 == 0) goto L_0x008d
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x007e, IllegalArgumentException -> 0x007c, InvocationTargetException -> 0x007a }
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch:{ IllegalAccessException -> 0x007e, IllegalArgumentException -> 0x007c, InvocationTargetException -> 0x007a }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ IllegalAccessException -> 0x007e, IllegalArgumentException -> 0x007c, InvocationTargetException -> 0x007a }
            if (r0 == 0) goto L_0x0078
            java.lang.ClassLoader r5 = r0.getClassLoader()     // Catch:{ IllegalAccessException -> 0x0076, IllegalArgumentException -> 0x0080, InvocationTargetException -> 0x0074 }
            goto L_0x008c
        L_0x0074:
            r3 = move-exception
            goto L_0x0081
        L_0x0076:
            r3 = move-exception
            goto L_0x0081
        L_0x0078:
            r5 = r9
            goto L_0x008c
        L_0x007a:
            r3 = move-exception
            goto L_0x0081
        L_0x007c:
            r3 = move-exception
            goto L_0x0081
        L_0x007e:
            r3 = move-exception
            goto L_0x0081
        L_0x0080:
            r3 = move-exception
        L_0x0081:
            X.0K9 r2 = A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r2.A0C(r3, r0, r1)
        L_0x008c:
            r9 = r5
        L_0x008d:
            if (r9 != 0) goto L_0x0091
            java.lang.ClassLoader r9 = r10.A00
        L_0x0091:
            r9.getClass()
            r0 = 0
            java.lang.Class r1 = A03(r0, r9, r11)     // Catch:{ ClassNotFoundException -> 0x009a }
            goto L_0x009f
        L_0x009a:
            r7 = move-exception
            java.util.Arrays.toString(r12)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00a1
        L_0x009f:
            r7 = r0
            r0 = r1
        L_0x00a1:
            if (r0 != 0) goto L_0x00c1
            int r6 = r13.length     // Catch:{ Exception -> 0x00e1 }
            if (r6 <= 0) goto L_0x00c1
            java.util.Arrays.toString(r13)     // Catch:{ Exception -> 0x00e1 }
            X.08e r5 = A00()     // Catch:{ Exception -> 0x00e1 }
            if (r5 != 0) goto L_0x00b3
            java.util.Arrays.toString(r13)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00c1
        L_0x00b3:
            r3 = 0
            r2 = 0
        L_0x00b5:
            if (r3 >= r6) goto L_0x00c2
            r1 = r13[r3]     // Catch:{ Exception -> 0x00e1 }
            boolean r1 = A08(r5, r1)     // Catch:{ Exception -> 0x00e1 }
            r2 = r2 | r1
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 == 0) goto L_0x00c8
            java.lang.Class r0 = java.lang.Class.forName(r11, r8, r9)     // Catch:{ Exception -> 0x00e1 }
        L_0x00c8:
            if (r0 != 0) goto L_0x00dc
            if (r7 != 0) goto L_0x00db
            java.lang.String r1 = "Could not find a class name %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x00e1 }
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ Exception -> 0x00e1 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00e1 }
        L_0x00db:
            throw r7     // Catch:{ Exception -> 0x00e1 }
        L_0x00dc:
            java.lang.Object r0 = r10.A0F(r0, r12)     // Catch:{ Exception -> 0x00e1 }
            return r0
        L_0x00e1:
            r3 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = java.lang.String.format(r11, r0)
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1.A0A(r3, r2, r0)
            boolean r0 = r3 instanceof X.C03390Ic
            if (r0 == 0) goto L_0x00f4
            throw r3
        L_0x00f4:
            X.0Ic r0 = new X.0Ic
            r0.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A0G(java.lang.String, java.lang.Object[], java.lang.String[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Field A0H(X.C03400Id r5, java.lang.Class r6, java.lang.Class r7, java.lang.String r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0004
            X.0Id r5 = X.C03400Id.Unknown
        L_0x0004:
            r6.getClass()
            boolean r0 = A04     // Catch:{ NoSuchFieldException -> 0x007c }
            r3 = 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = A0I     // Catch:{ NoSuchFieldException -> 0x007c }
            if (r0 != 0) goto L_0x0014
            if (r5 == 0) goto L_0x0014
            boolean r3 = r5.A01     // Catch:{ NoSuchFieldException -> 0x007c }
        L_0x0014:
            X.08e r2 = A00()     // Catch:{ NoSuchFieldException -> 0x007c }
            java.lang.reflect.Method r1 = X.C017208e.A0C     // Catch:{ NoSuchFieldException -> 0x007c }
            r0 = 0
            if (r1 == 0) goto L_0x001e
            r0 = 1
        L_0x001e:
            if (r0 == 0) goto L_0x0071
            if (r2 == 0) goto L_0x0071
            boolean r0 = A0A(r5, r6)     // Catch:{ NoSuchFieldException -> 0x007c }
            if (r0 != 0) goto L_0x0071
            r2 = 0
            if (r8 == 0) goto L_0x0069
            if (r1 != 0) goto L_0x0032
            java.lang.reflect.Field r1 = r6.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x006a }
            goto L_0x0075
        L_0x0032:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch:{ Exception -> 0x003f }
            java.lang.Object r1 = r1.invoke(r6, r0)     // Catch:{ Exception -> 0x003f }
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch:{ Exception -> 0x003f }
            if (r1 == 0) goto L_0x004c
            goto L_0x0075
        L_0x003f:
            r2 = move-exception
            r1 = r2
        L_0x0041:
            if (r1 == 0) goto L_0x004c
            boolean r0 = r1 instanceof java.lang.NoSuchFieldException     // Catch:{ NoSuchFieldException -> 0x006a }
            if (r0 != 0) goto L_0x0065
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ NoSuchFieldException -> 0x006a }
            goto L_0x0041
        L_0x004c:
            java.lang.String r1 = r6.getName()     // Catch:{ NoSuchFieldException -> 0x006a }
            if (r2 == 0) goto L_0x0066
            java.lang.String r0 = r2.getMessage()     // Catch:{ NoSuchFieldException -> 0x006a }
        L_0x0056:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r8, r0}     // Catch:{ NoSuchFieldException -> 0x006a }
            java.lang.String r0 = "Method %s.%s ( %s ) could not be found. Error msg: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchFieldException -> 0x006a }
            java.lang.NoSuchFieldException r1 = new java.lang.NoSuchFieldException     // Catch:{ NoSuchFieldException -> 0x006a }
            r1.<init>(r0)     // Catch:{ NoSuchFieldException -> 0x006a }
        L_0x0065:
            throw r1     // Catch:{ NoSuchFieldException -> 0x006a }
        L_0x0066:
            java.lang.String r0 = "None found"
            goto L_0x0056
        L_0x0069:
            throw r2     // Catch:{ NoSuchFieldException -> 0x006a }
        L_0x006a:
            r0 = move-exception
            r0.getMessage()     // Catch:{ NoSuchFieldException -> 0x007c }
            if (r3 != 0) goto L_0x0071
            throw r0     // Catch:{ NoSuchFieldException -> 0x007c }
        L_0x0071:
            java.lang.reflect.Field r1 = r6.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x007c }
        L_0x0075:
            if (r1 == 0) goto L_0x007b
            r0 = 1
            r1.setAccessible(r0)
        L_0x007b:
            return r1
        L_0x007c:
            r3 = move-exception
            boolean r0 = A09(r5)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r5.A00
            X.AnonymousClass0KW.A04(r0)
            boolean r0 = A0I
            if (r0 != 0) goto L_0x00c0
            X.08e r2 = A00()
            if (r2 == 0) goto L_0x00c0
            java.lang.String r0 = X.C017208e.A00(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "->"
            r1.append(r0)
            if (r8 == 0) goto L_0x00b3
            r1.append(r8)
            r0 = 58
            r1.append(r0)
            if (r7 == 0) goto L_0x00b3
            java.lang.String r0 = X.C017208e.A01(r7)
            r1.append(r0)
        L_0x00b3:
            java.lang.String r0 = r1.toString()
            if (r0 == 0) goto L_0x00c0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r2.A04(r0)
        L_0x00c0:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.A0H(X.0Id, java.lang.Class, java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    public final Method A0J(C03400Id r3, Class cls, Class cls2, String str, Class... clsArr) {
        if (r3 == null) {
            r3 = C03400Id.Unknown;
        }
        cls.getClass();
        try {
            boolean z = true;
            if (A04 && !A0I && r3 != null) {
                z = r3.A01;
            }
            Method A052 = A05(r3, cls, str, clsArr, z);
            if (A052 != null) {
                A052.setAccessible(true);
            }
            return A052;
        } catch (NoSuchMethodException e) {
            if (!A09(r3)) {
                AnonymousClass0KW.A04(r3.A00);
                A0B(cls, cls2, str, clsArr);
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094 A[SYNTHETIC, Splitter:B:43:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d3 A[SYNTHETIC, Splitter:B:60:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Class forName(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = A03
            r1 = 0
            if (r0 != 0) goto L_0x000c
            boolean r1 = com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass.testVMStackGetCallingClassLoader()
            r0 = 1
            A03 = r0
        L_0x000c:
            r11 = 3
            r9 = 4
            r5 = 2
            r2 = 1
            java.lang.String r10 = "forName"
            r8 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0042
            java.lang.ClassLoader r6 = dalvik.system.VMStack.getCallingClassLoader()     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x001e }
            r3 = r8
            if (r6 == 0) goto L_0x002c
            goto L_0x002b
        L_0x001e:
            r6 = move-exception
            X.0K9 r3 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r10
            java.lang.String r0 = "%s: Cannot call VMStack.getCallingClassLoader on this platform"
            r3.A0C(r6, r0, r1)
            r6 = r8
        L_0x002b:
            r3 = r6
        L_0x002c:
            X.0K9 r0 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r4] = r10
            r1[r2] = r6
            r1[r5] = r13
            if (r3 == 0) goto L_0x003f
            java.lang.String r0 = "found"
        L_0x003a:
            r1[r11] = r0
            java.lang.String r0 = "%s: VMStack.getCallingClassLoader gave classLoader %s called forName to load %s. Calling ClassLoader was %s."
            goto L_0x0043
        L_0x003f:
            java.lang.String r0 = "NOT found"
            goto L_0x003a
        L_0x0042:
            r3 = r8
        L_0x0043:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r7 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L_0x0082
            if (r3 != 0) goto L_0x0082
            boolean r0 = A07()
            if (r0 == 0) goto L_0x0082
            java.lang.Class r6 = sun.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x0060, NoSuchMethodError -> 0x0062 }
            if (r6 == 0) goto L_0x0070
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x005e, NoSuchMethodError -> 0x0065 }
            goto L_0x0070
        L_0x005e:
            r3 = move-exception
            goto L_0x0066
        L_0x0060:
            r3 = move-exception
            goto L_0x0063
        L_0x0062:
            r3 = move-exception
        L_0x0063:
            r6 = r8
            goto L_0x0066
        L_0x0065:
            r3 = move-exception
        L_0x0066:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r10
            r1.A0C(r3, r7, r0)
            r3 = r8
        L_0x0070:
            X.0K9 r0 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r4] = r10
            r1[r2] = r6
            r1[r5] = r13
            if (r3 == 0) goto L_0x008b
            java.lang.String r0 = "found"
        L_0x007e:
            r1[r11] = r0
            java.lang.String r0 = "%s: Class %s (with sun.reflect.Reflection.getCallerClass) called forName to load %s. Calling ClassLoader was %s."
        L_0x0082:
            if (r3 != 0) goto L_0x00bd
            boolean r0 = A06()
            if (r0 == 0) goto L_0x00bd
            goto L_0x008e
        L_0x008b:
            java.lang.String r0 = "NOT found"
            goto L_0x007e
        L_0x008e:
            java.lang.Class r6 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch:{ NoClassDefFoundError -> 0x009b, NoSuchMethodError -> 0x009d }
            if (r6 == 0) goto L_0x00ab
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch:{ NoClassDefFoundError -> 0x0099, NoSuchMethodError -> 0x00a0 }
            goto L_0x00ab
        L_0x0099:
            r3 = move-exception
            goto L_0x00a1
        L_0x009b:
            r3 = move-exception
            goto L_0x009e
        L_0x009d:
            r3 = move-exception
        L_0x009e:
            r6 = r8
            goto L_0x00a1
        L_0x00a0:
            r3 = move-exception
        L_0x00a1:
            X.0K9 r1 = A0C
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r10
            r1.A0C(r3, r7, r0)
            r3 = r8
        L_0x00ab:
            X.0K9 r0 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r4] = r10
            r1[r2] = r6
            r1[r5] = r13
            if (r3 == 0) goto L_0x00c6
            java.lang.String r0 = "found"
        L_0x00b9:
            r1[r11] = r0
            java.lang.String r0 = "%s: Class %s (with jdk.internal.reflect.Reflection.getCallerClass) called forName to load %s. Calling ClassLoader was %s."
        L_0x00bd:
            if (r3 != 0) goto L_0x0104
            java.lang.reflect.Method r1 = A04()
            if (r1 == 0) goto L_0x0104
            goto L_0x00c9
        L_0x00c6:
            java.lang.String r0 = "NOT found"
            goto L_0x00b9
        L_0x00c9:
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x00e0, IllegalArgumentException -> 0x00de, InvocationTargetException -> 0x00e2 }
            java.lang.Object r7 = r1.invoke(r8, r0)     // Catch:{ IllegalAccessException -> 0x00e0, IllegalArgumentException -> 0x00de, InvocationTargetException -> 0x00e2 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ IllegalAccessException -> 0x00e0, IllegalArgumentException -> 0x00de, InvocationTargetException -> 0x00e2 }
            if (r7 == 0) goto L_0x00dc
            java.lang.ClassLoader r8 = r7.getClassLoader()     // Catch:{ IllegalAccessException -> 0x00da, IllegalArgumentException -> 0x00d8, InvocationTargetException -> 0x00e5 }
            goto L_0x00f1
        L_0x00d8:
            r6 = move-exception
            goto L_0x00e6
        L_0x00da:
            r6 = move-exception
            goto L_0x00e6
        L_0x00dc:
            r8 = r3
            goto L_0x00f1
        L_0x00de:
            r6 = move-exception
            goto L_0x00e3
        L_0x00e0:
            r6 = move-exception
            goto L_0x00e3
        L_0x00e2:
            r6 = move-exception
        L_0x00e3:
            r7 = r8
            goto L_0x00e6
        L_0x00e5:
            r6 = move-exception
        L_0x00e6:
            X.0K9 r3 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r10
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r3.A0C(r6, r0, r1)
        L_0x00f1:
            X.0K9 r0 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r4] = r10
            r1[r2] = r7
            r1[r5] = r13
            if (r8 == 0) goto L_0x0133
            java.lang.String r0 = "found"
        L_0x00ff:
            r1[r11] = r0
            java.lang.String r0 = "%s: Class %s (with VMStack.getStackClass2) called forName to load %s. Calling ClassLoader was %s."
            r3 = r8
        L_0x0104:
            if (r3 != 0) goto L_0x0112
            X.0K9 r0 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r10
            r1[r2] = r13
            java.lang.String r0 = "%s: Using DEFAULT classloader to load %s"
            java.lang.ClassLoader r3 = r12.A00
        L_0x0112:
            X.0K9 r0 = A0C
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r10
            if (r3 == 0) goto L_0x0130
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
        L_0x0122:
            r1[r2] = r0
            java.lang.String r0 = "%s: Using calling class loader: %s."
            r3.getClass()
            r0 = r12
            r0 = 0
            java.lang.Class r0 = A03(r0, r3, r13)
            return r0
        L_0x0130:
            java.lang.String r0 = "<Not Found>"
            goto L_0x0122
        L_0x0133:
            java.lang.String r0 = "NOT found"
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03410If.forName(java.lang.String):java.lang.Class");
    }

    public static final Class A03(C03400Id r3, ClassLoader classLoader, String str) {
        C017208e A002;
        classLoader.getClass();
        if (r3 == null) {
            r3 = C03400Id.Unknown;
        }
        try {
            return A02(r3, classLoader, str);
        } catch (ClassNotFoundException e) {
            if (!A09(r3)) {
                AnonymousClass0KW.A04(r3.A00);
                boolean z = false;
                if (!A0I && (A002 = A00()) != null) {
                    z = A08(A002, str);
                }
                if (z) {
                    return Class.forName(str, true, classLoader);
                }
            }
            throw e;
        }
    }

    public static Method A05(C03400Id r3, Class cls, String str, Class[] clsArr, boolean z) {
        Method method;
        Throwable th;
        String str2;
        C017208e A002 = A00();
        if (A002 == null) {
            Arrays.toString(clsArr);
        }
        Method method2 = C017208e.A0D;
        boolean z2 = false;
        if (method2 != null) {
            z2 = true;
        }
        if (z2 && A002 != null && !A0A(r3, cls)) {
            Exception e = null;
            if (cls == null || str == null) {
                throw null;
            }
            if (method2 == null) {
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException e2) {
                    Arrays.toString(clsArr);
                    if (!z) {
                        throw e2;
                    }
                }
            } else {
                try {
                    method = (Method) method2.invoke(cls, new Object[]{str, clsArr});
                    if (method != null) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    th = e;
                    while (true) {
                        if (th != null) {
                            if (th instanceof NoSuchMethodException) {
                                break;
                            }
                            th = th.getCause();
                        } else {
                            break;
                        }
                    }
                }
                String name = cls.getName();
                String arrays = Arrays.toString(clsArr);
                if (e != null) {
                    str2 = e.getMessage();
                } else {
                    str2 = "None found";
                }
                th = new NoSuchMethodException(String.format("Method %s.%s ( %s ) could not be found. Error msg: %s", new Object[]{name, str, arrays, str2}));
                throw th;
            }
            Arrays.toString(clsArr);
            return method;
        }
        return cls.getDeclaredMethod(str, clsArr);
    }

    public static boolean A0A(C03400Id r2, Class cls) {
        if (!cls.getName().contains("com.facebook")) {
            return false;
        }
        if (r2 == null || r2.equals(C03400Id.LikelyHidden)) {
            return true;
        }
        if (r2.A01 || !r2.A00) {
            return false;
        }
        return true;
    }
}
