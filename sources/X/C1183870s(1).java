package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape21S0300000_2_I2;

/* renamed from: X.70s  reason: invalid class name and case insensitive filesystem */
public final class C1183870s {
    public static final View A00(ViewGroup viewGroup) {
        C04220Ms.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        C18200wM.A1C(frameLayout);
        LLF llf = new LLF(context);
        frameLayout.addView(llf);
        frameLayout.setTag(new C88885Bb(frameLayout, llf));
        return frameLayout;
    }

    public static final void A01(C130667qT r5, AnonymousClass5HM r6, C88885Bb r7, int i, int i2) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, r6);
        C04220Ms.A0B(r5, 2);
        C121247Ez r1 = r6.A00;
        if (r1 == null) {
            r1 = new C58513Fy(r7.A01.getContext(), C121997Jj.A02((AnonymousClass2LD) null, r6.A01.A01()), r5).A00();
            r6.A00 = r1;
            r5.A04(new IDxLListenerShape21S0300000_2_I2(r5, r1, r6, 2));
        }
        C121247Ez r0 = r7.A00;
        if (r0 != r1) {
            if (r0 != null) {
                r0.A04();
            }
            r7.A00 = r1;
            r1.A06(r7.A02);
        }
        FrameLayout frameLayout = r7.A01;
        Context context = frameLayout.getContext();
        frameLayout.setPadding(A1Y ? 1 : 0, C18240wQ.A01(context, i), A1Y, C18240wQ.A01(context, i2));
    }
}
