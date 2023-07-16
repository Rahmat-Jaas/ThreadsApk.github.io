package X;

import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0402000_I2;

/* renamed from: X.7vL  reason: invalid class name and case insensitive filesystem */
public final class C133217vL implements C33755Htt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KtCSuperShape0S0310000_I2 A01;
    public final /* synthetic */ AnonymousClass5xa A02;
    public final /* synthetic */ List A03;

    public final void C5F(C33828HvI hvI, String str, String str2) {
        String str3 = str2;
        C04220Ms.A0B(str3, 2);
        AnonymousClass5xa r4 = this.A02;
        Context context = r4.getContext();
        if (context != null) {
            int i = this.A00;
            KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2 = this.A01;
            List list = this.A03;
            C86654y1 r8 = new C86654y1(str3, (int) (((float) C09860go.A08(context)) * 0.5f));
            r8.A01 = Math.min(2147483647L, 1);
            C883457r r6 = (C883457r) r4.A07.getValue();
            C04220Ms.A0B(list, 3);
            if (!ktCSuperShape0S0310000_I2.A03) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0211000_I2(r6, (C146958n9) null, true), AnonymousClass3J5.A00(r6), 3);
                return;
            }
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0402000_I2((Object) r6, (Object) ktCSuperShape0S0310000_I2, (Object) r8, (Object) list, (C146958n9) null, i, 2), AnonymousClass3J5.A00(r6), 3);
        }
    }

    public final void CDG(String str, float f) {
    }

    public C133217vL(KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2, AnonymousClass5xa r2, List list, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = ktCSuperShape0S0310000_I2;
        this.A03 = list;
    }

    public final void onError(String str) {
        AnonymousClass5xa r1 = this.A02;
        if (r1.getContext() != null) {
            C62793ak A0N = C18200wM.A0N(r1.A07);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(A0N, (C146958n9) null, 45), AnonymousClass3J5.A00(A0N), 3);
        }
    }
}
