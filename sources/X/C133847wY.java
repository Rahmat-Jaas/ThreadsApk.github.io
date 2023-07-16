package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.7wY  reason: invalid class name and case insensitive filesystem */
public final class C133847wY implements C145608km {
    public final /* synthetic */ C145608km A00;
    public final /* synthetic */ C110796mI A01;

    public final void onFailure(String str) {
        C04220Ms.A0B(str, 0);
        AnonymousClass0LU.A0O("connectivity_prober", "Connectivity probe failed (%s).", str);
        C110796mI r1 = this.A01;
        AnonymousClass01V r4 = r1.A04;
        r4.markerAnnotate(79501264, "error_message", str);
        r4.markerAnnotate(79501264, TraceFieldType.RetryCount, r1.A02);
        r4.markerEnd(79501264, 3);
        this.A00.onFailure(str);
    }

    public C133847wY(C145608km r1, C110796mI r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void CMy(int i, int i2) {
        AnonymousClass0LU.A0O("connectivity_prober", C28174Ezk.A00(333), C18210wN.A1X(i));
        AnonymousClass01V r2 = this.A01.A04;
        r2.markerAnnotate(79501264, C18170wI.A00(106), i);
        r2.markerAnnotate(79501264, TraceFieldType.RetryCount, i2);
        r2.markerEnd(79501264, 2);
        this.A00.CMy(i, i2);
    }
}
