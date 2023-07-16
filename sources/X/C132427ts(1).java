package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.7ts  reason: invalid class name and case insensitive filesystem */
public final class C132427ts implements AnonymousClass0i1 {
    public final AnonymousClass01V A00;

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.endAllMarkers(4340, true);
    }

    public C132427ts(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public final void A00(String str, Throwable th) {
        String str2;
        int hashCode = str.hashCode();
        AnonymousClass01V r3 = this.A00;
        Throwable cause = th.getCause();
        if ((cause == null || (str2 = cause.getMessage()) == null) && (str2 = th.getMessage()) == null) {
            str2 = I17.A00(10);
        }
        r3.markerAnnotate(188226264, hashCode, TraceFieldType.FailureReason, str2);
        r3.markerEnd(188226264, hashCode, 87);
    }
}
