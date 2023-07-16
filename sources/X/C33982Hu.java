package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Hu  reason: invalid class name and case insensitive filesystem */
public final class C33982Hu {
    public static Object A00(AnonymousClass601 r8, C63893iY r9) {
        Object A0B = C63893iY.A0B(r9, 0);
        A0B.getClass();
        int A04 = AnonymousClass0wJ.A04(C63893iY.A09(r9));
        C130667qT A08 = C63913ic.A08(r8);
        C04220Ms.A0B(r8, 0);
        C10300i6 A0F = C63913ic.A0F(r8);
        UserSession A02 = C05030Qo.A02(A0F);
        IgBloksScreenConfig A0N = C18190wL.A0N(A0F);
        A0N.A08 = (C121997Jj) A0B;
        A0N.A0Y = A08.A00;
        Bundle A06 = C18180wK.A06();
        IgBloksScreenConfig.A03(A06, A0N);
        C18180wK.A0w(A06, A0F);
        AnonymousClass1Xa r2 = new AnonymousClass1Xa();
        r2.A00 = A04;
        r2.setArguments(A06);
        r2.A0B(false);
        ((C696449k) A02.A01(C696449k.class, AnonymousClass4Ud.A00)).mIgBloksIdfaDialogList.add(r2);
        r2.A0A(C63913ic.A07(r8), (String) null);
        return null;
    }
}
