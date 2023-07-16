package X;

import android.view.View;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;

/* renamed from: X.6GF  reason: invalid class name */
public final class AnonymousClass6GF {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        View view;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        AnonymousClass3HX r2 = r6.A00;
        if (r2 != null) {
            Object A0B = C63893iY.A0B(r7, 0);
            A0B.getClass();
            C127397h3 r72 = (C127397h3) A0B;
            if (r72.A03 == 16444) {
                C1196076c r62 = (C1196076c) AnonymousClass7K7.A03(r2, r72);
                C04530Oa r1 = r62.A04;
                if (((C112806qE) C18190wL.A0f(r1)).A02.isShowing() || ((C112806qE) C18190wL.A0f(r1)).A01 || (view = r62.A00) == null) {
                    return null;
                }
                C112806qE r12 = (C112806qE) C18190wL.A0f(r1);
                KtLambdaShape40S0200000_I2_1 A11 = C86164wN.A11(r62, r72, 34);
                AnonymousClass7Di A01 = ((AnonymousClass78A) r12.A04.getValue()).A01(view, r72);
                if (A01 != null) {
                    C873151x r22 = r12.A02;
                    View contentView = r22.getContentView();
                    C04220Ms.A0C(contentView, "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView");
                    ((LLH) contentView).setRenderTree(A01);
                    A11.invoke(r22);
                }
                C1196076c.A00(r62, r72, A1Z, A1Z);
                return null;
            }
            C30967GcS.A02("bk.action.tooltip.Show", "Signature called with invalid model.");
            return null;
        }
        throw C18190wL.A0a("Required value was null.");
    }
}
