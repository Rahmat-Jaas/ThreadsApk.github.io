package X;

import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.7kj  reason: invalid class name and case insensitive filesystem */
public final class C128977kj implements C145378kP {
    public final /* synthetic */ AnonymousClass5qq A00;
    public final /* synthetic */ AnonymousClass832 A01;

    public C128977kj(AnonymousClass5qq r1, AnonymousClass832 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void Bnr() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", false);
        this.A01.A00.resolve(writableNativeMap);
        this.A00.A06();
    }

    public final void Bs6() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", true);
        this.A01.A00.resolve(writableNativeMap);
        this.A00.A06();
    }
}
