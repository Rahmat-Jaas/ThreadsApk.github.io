package X;

import android.content.Context;

/* renamed from: X.3Ai  reason: invalid class name and case insensitive filesystem */
public final class C57253Ai {
    public final C130667qT A00;
    public final C81644o8 A01;
    public final C84844tx A02;

    public C57253Ai(Context context, C130667qT r5, C84844tx r6, C28291u0 r7, C83724rs r8) {
        C95255zj r0;
        this.A00 = r5;
        this.A02 = r6;
        this.A01 = r7;
        C559735h r02 = r7.A08.A04;
        if (r02 == null || (r0 = r02.A00) == null) {
            C10450iM.A03("bloks_qp_presenter", "Bloks data was null");
            r8.C54("Bloks data was null");
            return;
        }
        r8.C1l(new C58513Fy(context, C121997Jj.A02((AnonymousClass2LD) null, r0.A01()), this.A00).A00(), this);
    }
}
