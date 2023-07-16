package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.4YG  reason: invalid class name */
public final class AnonymousClass4YG extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YG(Fragment fragment, String str) {
        super(0);
        this.A00 = fragment;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r0 = r0.isAssignableFrom(r1)
            r4 = 33
            r3 = 0
            if (r0 == 0) goto L_0x0024
            androidx.fragment.app.Fragment r1 = r5.A00
            java.lang.String r2 = r5.A01
            int r0 = android.os.Build.VERSION.SDK_INT
            android.os.Bundle r1 = r1.requireArguments()
            if (r0 < r4) goto L_0x0044
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.io.Serializable r0 = r1.getSerializable(r2, r0)
        L_0x001f:
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x004c
            return r0
        L_0x0024:
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x004d
            androidx.fragment.app.Fragment r1 = r5.A00
            java.lang.String r2 = r5.A01
            int r0 = android.os.Build.VERSION.SDK_INT
            android.os.Bundle r1 = r1.requireArguments()
            if (r0 < r4) goto L_0x003f
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = r1.getParcelable(r2, r0)
            goto L_0x001f
        L_0x003f:
            android.os.Parcelable r0 = r1.getParcelable(r2)
            goto L_0x0048
        L_0x0044:
            java.io.Serializable r0 = r1.getSerializable(r2)
        L_0x0048:
            if (r0 != 0) goto L_0x001f
            r0 = r3
            goto L_0x001f
        L_0x004c:
            return r3
        L_0x004d:
            java.lang.String r2 = "Argument type for "
            java.lang.String r1 = r5.A01
            java.lang.String r0 = " is not yet supported"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YG.invoke():java.lang.Object");
    }
}
