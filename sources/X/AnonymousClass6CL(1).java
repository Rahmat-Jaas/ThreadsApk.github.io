package X;

/* renamed from: X.6CL  reason: invalid class name */
public final class AnonymousClass6CL extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6CL(java.lang.Integer r3) {
        /*
            r2 = this;
            java.lang.String r1 = "Ble scan error: "
            int r0 = r3.intValue()
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0013;
                case 2: goto L_0x0016;
                case 3: goto L_0x0019;
                case 4: goto L_0x001c;
                case 5: goto L_0x001f;
                case 6: goto L_0x0022;
                case 7: goto L_0x0025;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "UNKNOWN_ERROR"
        L_0x000b:
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r2.<init>(r0)
            return
        L_0x0013:
            java.lang.String r0 = "BLE_NOT_SUPPORTED"
            goto L_0x000b
        L_0x0016:
            java.lang.String r0 = "OS_NOT_SUPPORTED"
            goto L_0x000b
        L_0x0019:
            java.lang.String r0 = "USER_DISABLED"
            goto L_0x000b
        L_0x001c:
            java.lang.String r0 = "BLUETOOTH_PERMISSION_DENIED"
            goto L_0x000b
        L_0x001f:
            java.lang.String r0 = "LOCATION_PERMISSION_DENIED"
            goto L_0x000b
        L_0x0022:
            java.lang.String r0 = "TIMEOUT"
            goto L_0x000b
        L_0x0025:
            java.lang.String r0 = "SCAN_ALREADY_IN_PROGRESS"
            goto L_0x000b
        L_0x0028:
            java.lang.String r0 = "BLUETOOTH_NOT_SUPPORTED"
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CL.<init>(java.lang.Integer):void");
    }

    public AnonymousClass6CL(Throwable th) {
        super(AnonymousClass00U.A0L("Ble scan error: ", "UNKNOWN_ERROR"), th);
    }
}
