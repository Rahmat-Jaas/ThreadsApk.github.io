package X;

import android.app.ActivityThread;
import android.os.Binder;
import com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook;
import com.facebook.common.activitythreadhook.IApplicationThreadFactory;
import com.facebook.common.binderhooker.BinderHook;

/* renamed from: X.0Et  reason: invalid class name and case insensitive filesystem */
public final class C03180Et {
    public static ActivityThread A0A;
    public static Binder A0B;
    public static C03180Et A0C;
    public static C03600Jw A0D;
    public static final AnonymousClass0K9 A0E;
    public static final Object A0F = new Object();
    public static volatile boolean A0G;
    public static volatile boolean A0H;
    public BinderHook A00;
    public boolean A01 = false;
    public final ActivityThreadBinderHooker$ApplicationThreadBinderHook A02;
    public final AnonymousClass06R A03;
    public final IApplicationThreadFactory A04;
    public final C03190Eu A05;
    public final AnonymousClass0F0 A06;
    public final AnonymousClass0F2 A07;
    public final C03410If A08;
    public final Object A09 = new Object();

    public C03180Et(C03190Eu r8, AnonymousClass0F0 r9, C03410If r10) {
        C03410If r6 = r10;
        this.A08 = r10;
        C03190Eu r3 = r8;
        this.A05 = r8;
        AnonymousClass0F0 r4 = r9;
        this.A06 = r9;
        AnonymousClass0F2 r5 = new AnonymousClass0F2(r8, r10);
        this.A07 = r5;
        IApplicationThreadFactory iApplicationThreadFactory = IApplicationThreadFactory.A05;
        if (iApplicationThreadFactory == null) {
            synchronized (IApplicationThreadFactory.A04) {
                if (IApplicationThreadFactory.A05 != null) {
                    iApplicationThreadFactory = IApplicationThreadFactory.A05;
                } else {
                    IApplicationThreadFactory.A05 = new IApplicationThreadFactory(r10);
                    iApplicationThreadFactory = IApplicationThreadFactory.A05;
                }
            }
        }
        iApplicationThreadFactory.getClass();
        this.A04 = iApplicationThreadFactory;
        AnonymousClass06R r1 = new AnonymousClass06R(this, r3, r4, r5, r6);
        this.A03 = r1;
        this.A02 = new ActivityThreadBinderHooker$ApplicationThreadBinderHook(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[Catch:{ Exception -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c A[Catch:{ Exception -> 0x006b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C03180Et A00(int r8, boolean r9) {
        /*
            r3 = 0
            boolean r0 = A0H
            if (r0 == 0) goto L_0x0008
            X.0Et r0 = A0C
            return r0
        L_0x0008:
            X.0If r6 = X.C03410If.A01(r3, r8, r9)
            X.0Eu r5 = X.C03190Eu.A00(r6)
            X.0F0 r4 = X.AnonymousClass0F0.A00(r6)
            java.lang.Object r9 = A0F
            monitor-enter(r9)
            boolean r0 = A0H     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x008a
            r0 = 1
            if (r4 != 0) goto L_0x001f
            r0 = 0
        L_0x001f:
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0086
            if (r5 == 0) goto L_0x0086
            boolean r0 = X.C03200Ew.A00     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x003b
            X.0K9 r2 = A0E     // Catch:{ all -> 0x008e }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x008e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Android %d is not currently supported"
        L_0x0037:
            r2.A07(r0, r1)     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x003b:
            android.app.ActivityThread r2 = X.AnonymousClass0Ep.A00()     // Catch:{ all -> 0x008e }
            A0A = r2     // Catch:{ all -> 0x008e }
            if (r2 != 0) goto L_0x004a
            X.0K9 r2 = A0E     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Could not find ActivityThread"
            goto L_0x0037
        L_0x004a:
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "mAppThread"
            java.lang.reflect.Field r0 = r6.A0H(r3, r1, r3, r0)     // Catch:{ Exception -> 0x006b }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x006b }
            android.os.Binder r0 = (android.os.Binder) r0     // Catch:{ Exception -> 0x006b }
            if (r0 != 0) goto L_0x0066
            X.0K9 r2 = A0E     // Catch:{ Exception -> 0x006b }
            java.lang.String r1 = "Got a null ActivityThread Binder mAppThread."
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x006b }
            r2.A07(r1, r0)     // Catch:{ Exception -> 0x006b }
            goto L_0x0075
        L_0x0066:
            A0B = r0     // Catch:{ Exception -> 0x006b }
            r1 = 1
            r0 = 0
            goto L_0x0077
        L_0x006b:
            r3 = move-exception
            X.0K9 r2 = A0E     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Could not get ActivityThread Binder mAppThread"
            r2.A0B(r3, r0, r1)     // Catch:{ all -> 0x008e }
        L_0x0075:
            r1 = 0
            r0 = 1
        L_0x0077:
            A0G = r0     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r0 = 0
            goto L_0x0083
        L_0x007e:
            X.0Et r0 = new X.0Et     // Catch:{ all -> 0x008e }
            r0.<init>(r5, r4, r6)     // Catch:{ all -> 0x008e }
        L_0x0083:
            A0C = r0     // Catch:{ all -> 0x008e }
            goto L_0x0088
        L_0x0086:
            A0G = r8     // Catch:{ all -> 0x008e }
        L_0x0088:
            A0H = r8     // Catch:{ all -> 0x008e }
        L_0x008a:
            X.0Et r0 = A0C     // Catch:{ all -> 0x008e }
            monitor-exit(r9)     // Catch:{ all -> 0x008e }
            return r0
        L_0x008e:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03180Et.A00(int, boolean):X.0Et");
    }

    static {
        AnonymousClass0K9 r2 = new AnonymousClass0K9("ActivityThreadBinderHooker");
        A0E = r2;
        C03600Jw r1 = r2.A00;
        if (r1 == null) {
            synchronized (r2) {
                r1 = r2.A00;
                if (r1 == null) {
                    r1 = new C03600Jw(r2.A01);
                    r2.A00 = r1;
                }
            }
        }
        A0D = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r0.isHooked() == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r0 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016e, code lost:
        if (r0.isHooked() == false) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0159 A[Catch:{ 0Ic -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169 A[Catch:{ 0Ic -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0173 A[Catch:{ 0Ic -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0182 A[Catch:{ 0Ic -> 0x013e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r15 = this;
            boolean r0 = r15.A01
            if (r0 == 0) goto L_0x0011
            com.facebook.common.binderhooker.BinderHook r0 = r15.A00
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isHooked()
            r5 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            return r5
        L_0x0011:
            java.lang.Object r2 = r15.A09
            monitor-enter(r2)
            boolean r0 = r15.A01     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0026
            com.facebook.common.binderhooker.BinderHook r0 = r15.A00     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isHooked()     // Catch:{ all -> 0x0195 }
            r5 = 1
            if (r0 != 0) goto L_0x0183
        L_0x0023:
            r5 = 0
            goto L_0x0183
        L_0x0026:
            r12 = 1
            r15.A01 = r12     // Catch:{ all -> 0x0195 }
            boolean r0 = A0H     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0185
            boolean r0 = A0G     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0185
            X.0K9 r4 = A0E     // Catch:{ all -> 0x0195 }
            r8 = 0
            android.os.Binder r6 = A0B     // Catch:{ all -> 0x0195 }
            com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook r5 = r15.A02     // Catch:{ all -> 0x0195 }
            if (r6 == 0) goto L_0x015d
            if (r5 == 0) goto L_0x015d
            com.facebook.common.activitythreadhook.IApplicationThreadFactory r0 = r15.A04     // Catch:{ all -> 0x0195 }
            X.0K9 r7 = com.facebook.common.activitythreadhook.IApplicationThreadFactory.A03     // Catch:{ all -> 0x0195 }
            java.lang.String r3 = "IApplicationThreadBinderHookWrapper"
            r5.getInterfaceDescriptor()     // Catch:{ all -> 0x0195 }
            java.lang.Class r10 = r5.getClass()     // Catch:{ all -> 0x0195 }
            X.0If r11 = r0.A00     // Catch:{ all -> 0x0195 }
            boolean r0 = com.facebook.common.activitythreadhook.IApplicationThreadFactory.A02     // Catch:{ all -> 0x0195 }
            java.lang.Class r9 = com.facebook.common.activitythreadhook.IApplicationThreadFactory.A01     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x009a
            X.0Id r1 = X.C03400Id.LikelyHidden     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "com.facebook.common.activitythreadhook.IApplicationThreadBinderHookWrapper"
            java.lang.Class r0 = r11.A0D(r1, r0)     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0087
            java.lang.Class<com.facebook.common.activitythreadhook.IApplicationThreadFactory> r0 = com.facebook.common.activitythreadhook.IApplicationThreadFactory.class
            java.lang.String r9 = r0.getName()     // Catch:{ all -> 0x0195 }
            r0 = 46
            int r0 = r9.lastIndexOf(r0)     // Catch:{ all -> 0x0195 }
            if (r0 < 0) goto L_0x0089
            java.lang.String r13 = r9.substring(r8, r0)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "com.facebook.common.activitythreadhook"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x0195 }
            r9 = 0
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass00U.A0V(r13, r0, r3)     // Catch:{ all -> 0x0195 }
            java.lang.Class r0 = r11.A0D(r1, r0)     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0087
        L_0x0082:
            com.facebook.common.activitythreadhook.IApplicationThreadFactory.A01 = r9     // Catch:{ all -> 0x0195 }
            com.facebook.common.activitythreadhook.IApplicationThreadFactory.A02 = r12     // Catch:{ all -> 0x0195 }
            goto L_0x009a
        L_0x0087:
            r9 = r0
            goto L_0x0082
        L_0x0089:
            java.lang.Object[] r1 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Cannot deduce package name from name %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0195 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0195 }
            r1.<init>(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x0194
        L_0x009a:
            if (r9 != 0) goto L_0x00ab
            java.lang.String r0 = r5.getInterfaceDescriptor()     // Catch:{ all -> 0x0195 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r0}     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Failled to construct an AppThreadWrapper %s for binder hook %s."
            r7.A07(r0, r1)     // Catch:{ all -> 0x0195 }
            goto L_0x014c
        L_0x00ab:
            java.lang.Class<com.facebook.common.binderhooker.BinderHook> r13 = com.facebook.common.binderhooker.BinderHook.class
            X.08y r3 = new X.08y     // Catch:{ 0Ic -> 0x013e }
            r3.<init>(r13, r5)     // Catch:{ 0Ic -> 0x013e }
            java.lang.Class<android.os.Binder> r1 = android.os.Binder.class
            X.08y r0 = new X.08y     // Catch:{ 0Ic -> 0x013e }
            r0.<init>(r1, r6)     // Catch:{ 0Ic -> 0x013e }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch:{ 0Ic -> 0x013e }
            java.lang.Object r12 = r11.A0F(r9, r0)     // Catch:{ 0Ic -> 0x013e }
            if (r12 == 0) goto L_0x011e
            java.lang.String r11 = r13.getName()     // Catch:{ 0Ic -> 0x013e }
            java.lang.Class r3 = r12.getClass()     // Catch:{ 0Ic -> 0x013e }
            boolean r0 = r13.isAssignableFrom(r3)     // Catch:{ ClassCastException -> 0x011c }
            if (r0 == 0) goto L_0x0108
            com.facebook.common.binderhooker.BinderHook r12 = (com.facebook.common.binderhooker.BinderHook) r12     // Catch:{ 0Ic -> 0x013e }
            r14 = 0
            if (r12 == 0) goto L_0x0101
            r14 = 1
            java.lang.Class r0 = r12.getClass()     // Catch:{ 0Ic -> 0x013e }
            java.lang.String r0 = r0.getName()     // Catch:{ 0Ic -> 0x013e }
        L_0x00df:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ 0Ic -> 0x013e }
            java.lang.String r0 = "(cls: %s)"
            X.085 r13 = X.AnonymousClass085.A00(r0, r1)     // Catch:{ 0Ic -> 0x013e }
            r11 = 0
            r0 = 103(0x67, float:1.44E-43)
            X.0KC r3 = X.AnonymousClass08Y.A04     // Catch:{ 0Ic -> 0x013e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 0Ic -> 0x013e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ 0Ic -> 0x013e }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r11, r13}     // Catch:{ 0Ic -> 0x013e }
            X.AnonymousClass0KC.A02(r3, r0)     // Catch:{ 0Ic -> 0x013e }
            r5.getInterfaceDescriptor()     // Catch:{ 0Ic -> 0x013e }
            goto L_0x0104
        L_0x0101:
            java.lang.String r0 = "<UNDEFINED CLASS>"
            goto L_0x00df
        L_0x0104:
            if (r12 == 0) goto L_0x014c
            r5 = r12
            goto L_0x0153
        L_0x0108:
            java.lang.String r1 = "Class %s is not assignable from %s. Cls Id: %s"
            java.lang.String r0 = r3.getName()     // Catch:{ ClassCastException -> 0x011c }
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0, r9}     // Catch:{ ClassCastException -> 0x011c }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ ClassCastException -> 0x011c }
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ ClassCastException -> 0x011c }
            r0.<init>(r1)     // Catch:{ ClassCastException -> 0x011c }
            throw r0     // Catch:{ ClassCastException -> 0x011c }
        L_0x011c:
            r3 = move-exception
            goto L_0x012e
        L_0x011e:
            java.lang.Object[] r1 = new java.lang.Object[]{r9}     // Catch:{ 0Ic -> 0x013e }
            java.lang.String r0 = "Could not construct cls %s because we got a null instance.."
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ 0Ic -> 0x013e }
            X.0Ic r1 = new X.0Ic     // Catch:{ 0Ic -> 0x013e }
            r1.<init>(r0)     // Catch:{ 0Ic -> 0x013e }
            goto L_0x013d
        L_0x012e:
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r11}     // Catch:{ 0Ic -> 0x013e }
            java.lang.String r0 = "Could not construct cls %s because %s is not a base class."
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ 0Ic -> 0x013e }
            X.0Ic r1 = new X.0Ic     // Catch:{ 0Ic -> 0x013e }
            r1.<init>(r0, r3)     // Catch:{ 0Ic -> 0x013e }
        L_0x013d:
            throw r1     // Catch:{ 0Ic -> 0x013e }
        L_0x013e:
            r3 = move-exception
            java.lang.String r0 = r5.getInterfaceDescriptor()     // Catch:{ all -> 0x0195 }
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r0, r10}     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Cannot construct AppThread wrapper %s for binder hook %s (cls: %s)."
            r7.A0A(r3, r0, r1)     // Catch:{ all -> 0x0195 }
        L_0x014c:
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Failed creating a wrapped binder hook. Defaulting to normal binder hook"
            r4.A07(r0, r1)     // Catch:{ all -> 0x0195 }
        L_0x0153:
            X.0FP r0 = X.AnonymousClass0FQ.A00(r6, r5)     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0164
            r15.A00 = r5     // Catch:{ all -> 0x0195 }
            r3 = 1
            goto L_0x0165
        L_0x015d:
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Cannot hook activity thread binder since it doesn't have the needed binder or binder hook deps"
            r4.A07(r0, r1)     // Catch:{ all -> 0x0195 }
        L_0x0164:
            r3 = 0
        L_0x0165:
            com.facebook.common.binderhooker.BinderHook r0 = r15.A00     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0170
            boolean r0 = r0.isHooked()     // Catch:{ all -> 0x0195 }
            r5 = 1
            if (r0 != 0) goto L_0x0171
        L_0x0170:
            r5 = 0
        L_0x0171:
            if (r3 != 0) goto L_0x0180
            java.lang.String r1 = "Failed while hooking ActivityThread binder. Is Hook returned: %s"
            java.lang.String r0 = java.lang.Boolean.toString(r5)     // Catch:{ all -> 0x0195 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0195 }
            r4.A07(r1, r0)     // Catch:{ all -> 0x0195 }
        L_0x0180:
            if (r5 == r3) goto L_0x0183
            goto L_0x018d
        L_0x0183:
            monitor-exit(r2)     // Catch:{ all -> 0x0195 }
            return r5
        L_0x0185:
            java.lang.String r0 = "Must init ActivityThreadBinderHooker first"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0195 }
            r1.<init>(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x0194
        L_0x018d:
            java.lang.String r0 = "In an inconsistent hook state"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0195 }
            r1.<init>(r0)     // Catch:{ all -> 0x0195 }
        L_0x0194:
            throw r1     // Catch:{ all -> 0x0195 }
        L_0x0195:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0195 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03180Et.A01():boolean");
    }
}
