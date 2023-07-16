package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.2Ih  reason: invalid class name and case insensitive filesystem */
public final class C34112Ih {
    public static Object A00(AnonymousClass601 r7, C63893iY r8) {
        int A03;
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        C127397h3 r5 = (C127397h3) A0B;
        C04220Ms.A0B(r7, 0);
        Fragment A01 = C63913ic.A01(r7);
        if (!(A01 instanceof AnonymousClass1c8)) {
            return null;
        }
        AnonymousClass1c8 r4 = (AnonymousClass1c8) A01;
        IgBloksScreenConfig igBloksScreenConfig = r4.A0A;
        if (igBloksScreenConfig.A0I != null) {
            AnonymousClass49P.A00(igBloksScreenConfig.A0C).A03(igBloksScreenConfig.A0I.intValue());
        }
        igBloksScreenConfig.A07 = C121997Jj.A03(r5);
        C121247Ez r0 = r4.A0C;
        if (r0 != null) {
            r0.A03();
            r4.A0C = null;
        }
        if (r4.A08 == null) {
            r4.A02 = new FrameLayout(r4.requireContext());
            LLF llf = new LLF(r4.requireContext());
            r4.A08 = llf;
            r4.A02.addView(llf);
            r4.A08.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            LLF llf2 = r4.A08;
            if (r4.A0I) {
                A03 = 0;
            } else {
                A03 = C18220wO.A03(AnonymousClass0wJ.A0B(r4));
            }
            E2V.A03(r4.A03).Cjs(llf2, A03, 0, false);
        }
        C121247Ez r02 = r4.A0C;
        if (r02 != null) {
            r02.A03();
        }
        C121247Ez A00 = new C58513Fy(r4.requireContext(), C121997Jj.A03(r5), r4.A09).A00();
        r4.A0C = A00;
        A00.A06(r4.A08);
        return null;
    }
}
