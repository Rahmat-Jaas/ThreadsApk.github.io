package X;

/* renamed from: X.8XH  reason: invalid class name */
public final class AnonymousClass8XH extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8XH A00 = new AnonymousClass8XH();

    public AnonymousClass8XH() {
        super(2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.os.Parcelable[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            X.7KG r11 = (X.AnonymousClass7KG) r11
            r0 = 1
            X.C04220Ms.A0B(r11, r0)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            android.os.Bundle r2 = X.C18180wK.A06()
            X.78h r0 = r11.A07
            java.util.Map r0 = r0.A00
            java.util.Map r0 = X.AnonymousClass4WJ.A0E(r0)
            java.util.Iterator r1 = X.AnonymousClass0wJ.A0z(r0)
        L_0x001a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002b
            java.util.Map$Entry r0 = X.C18180wK.A0o(r1)
            r0.getKey()
            r0.getValue()
            goto L_0x001a
        L_0x002b:
            boolean r0 = X.C18250wR.A1K(r3)
            if (r0 == 0) goto L_0x006d
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r0 = "android-support-nav:controller:navigatorState:names"
            r2.putStringArrayList(r0, r3)
            java.lang.String r0 = "android-support-nav:controller:navigatorState"
            r5.putBundle(r0, r2)
        L_0x003f:
            X.8AL r1 = r11.A0M
            boolean r0 = X.C18250wR.A1K(r1)
            if (r0 == 0) goto L_0x0074
            if (r5 != 0) goto L_0x004d
            android.os.Bundle r5 = X.C18180wK.A06()
        L_0x004d:
            int r0 = r1.size()
            android.os.Parcelable[] r6 = new android.os.Parcelable[r0]
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L_0x0058:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006f
            X.7Zx r2 = X.C86154wM.A0J(r4)
            int r1 = r3 + 1
            androidx.navigation.NavBackStackEntryState r0 = new androidx.navigation.NavBackStackEntryState
            r0.<init>((X.C123917Zx) r2)
            r6[r3] = r0
            r3 = r1
            goto L_0x0058
        L_0x006d:
            r5 = 0
            goto L_0x003f
        L_0x006f:
            java.lang.String r0 = "android-support-nav:controller:backStack"
            r5.putParcelableArray(r0, r6)
        L_0x0074:
            java.util.Map r1 = r11.A0H
            boolean r0 = X.C86164wN.A1R(r1)
            if (r0 == 0) goto L_0x00ba
            if (r5 != 0) goto L_0x0082
            android.os.Bundle r5 = X.C18180wK.A06()
        L_0x0082:
            int r0 = r1.size()
            int[] r7 = new int[r0]
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = X.AnonymousClass0wJ.A0z(r1)
            r3 = 0
        L_0x0091:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.util.Map$Entry r1 = X.C18180wK.A0o(r4)
            java.lang.Object r0 = r1.getKey()
            int r2 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r1 = r1.getValue()
            int r0 = r3 + 1
            r7[r3] = r2
            r6.add(r1)
            r3 = r0
            goto L_0x0091
        L_0x00b0:
            java.lang.String r0 = "android-support-nav:controller:backStackDestIds"
            r5.putIntArray(r0, r7)
            java.lang.String r0 = "android-support-nav:controller:backStackIds"
            r5.putStringArrayList(r0, r6)
        L_0x00ba:
            java.util.Map r1 = r11.A0I
            boolean r0 = X.C86164wN.A1R(r1)
            if (r0 == 0) goto L_0x0118
            if (r5 != 0) goto L_0x00c8
            android.os.Bundle r5 = X.C18180wK.A06()
        L_0x00c8:
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = X.AnonymousClass0wJ.A0z(r1)
        L_0x00d0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0113
            java.util.Map$Entry r0 = X.C18180wK.A0o(r8)
            java.lang.String r6 = X.C18200wM.A0p(r0)
            java.lang.Object r1 = r0.getValue()
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            r7.add(r6)
            int r0 = r1.size()
            android.os.Parcelable[] r4 = new android.os.Parcelable[r0]
            java.util.Iterator r3 = r1.iterator()
            r2 = 0
        L_0x00f2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r1 = r3.next()
            int r0 = r2 + 1
            if (r2 >= 0) goto L_0x0105
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x0105:
            r4[r2] = r1
            r2 = r0
            goto L_0x00f2
        L_0x0109:
            java.lang.String r0 = "android-support-nav:controller:backStackStates:"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r6)
            r5.putParcelableArray(r0, r4)
            goto L_0x00d0
        L_0x0113:
            java.lang.String r0 = "android-support-nav:controller:backStackStates"
            r5.putStringArrayList(r0, r7)
        L_0x0118:
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x0129
            if (r5 != 0) goto L_0x0122
            android.os.Bundle r5 = X.C18180wK.A06()
        L_0x0122:
            boolean r1 = r11.A0A
            java.lang.String r0 = "android-support-nav:controller:deepLinkHandled"
            r5.putBoolean(r0, r1)
        L_0x0129:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XH.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
