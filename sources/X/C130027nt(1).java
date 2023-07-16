package X;

import com.facebook.papaya.store.PapayaStore;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.7nt  reason: invalid class name and case insensitive filesystem */
public final class C130027nt implements C83334rD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass685 A01;
    public final /* synthetic */ PapayaStore A02;

    public C130027nt(AnonymousClass685 r1, PapayaStore papayaStore, int i) {
        this.A02 = papayaStore;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onFailure(Throwable th) {
        String str;
        C142138dv r5 = this.A02.mEventListener;
        if (r5 != null) {
            AnonymousClass685 r1 = this.A01;
            int i = this.A00;
            C132537u4 r52 = (C132537u4) r5;
            C04220Ms.A0B(r1, 0);
            int A002 = C132537u4.A00(r1);
            if (th != null) {
                AnonymousClass01V r2 = r52.A00;
                Throwable cause = th.getCause();
                if ((cause == null || (str = cause.getMessage()) == null) && (str = th.getMessage()) == null) {
                    str = AnonymousClass000.A00(1367);
                }
                r2.markerAnnotate(A002, i, TraceFieldType.FailureReason, str);
            }
            r52.A00.markerEnd(A002, i, 3);
        }
    }

    public final void onSuccess(Object obj) {
        C142138dv r4 = this.A02.mEventListener;
        if (r4 != null) {
            AnonymousClass685 r1 = this.A01;
            int i = this.A00;
            C04220Ms.A0B(r1, 0);
            ((C132537u4) r4).A00.markerEnd(C132537u4.A00(r1), i, 2);
        }
    }
}
