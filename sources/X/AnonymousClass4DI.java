package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0202000_I2;

/* renamed from: X.4DI  reason: invalid class name */
public final class AnonymousClass4DI implements C33516HpC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C196210u A01;
    public final /* synthetic */ AnonymousClass0MJ A02;

    public AnonymousClass4DI(C196210u r1, AnonymousClass0MJ r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final boolean onToggle(boolean z) {
        Object obj = this.A02.A00;
        ((KtCSuperShape0S0110000_I2) obj).A01 = z;
        C196210u r2 = this.A01;
        AnonymousClass36B r0 = r2.A00;
        C04220Ms.A05(obj);
        int i = this.A00;
        C62793ak A0N = C18200wM.A0N(r0.A00.A01);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0202000_I2(A0N, obj, (C146958n9) null, i, 9), AnonymousClass3J5.A00(A0N), 3);
        r2.notifyItemChanged(i);
        return true;
    }
}
