package X;

import androidx.fragment.app.Fragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.2Hd  reason: invalid class name and case insensitive filesystem */
public final class C33812Hd {
    public static final Object A00(AnonymousClass601 r15, C63893iY r16) {
        String A0o;
        String str;
        Fragment A01;
        C63893iY r7 = r16;
        C04220Ms.A0B(r7, 0);
        C04220Ms.A0B(r15, 1);
        Object A0B = C63893iY.A0B(r7, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C121997Jj r2 = (C121997Jj) A0B;
        AnonymousClass3HX r1 = r15.A00;
        if (!(r1 == null || (A0o = C18220wO.A0o(C101046Pr.A00(r1, r15, r2.A02))) == null)) {
            String A0q = C18190wL.A0q(r7.A00, 1);
            C109326jp A06 = C63893iY.A06(r7, 3);
            C10300i6 A0F = C63913ic.A0F(r15);
            C18200wM.A1R(A0F);
            Integer[] A1a = C18240wQ.A1a();
            int length = A1a.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Integer num = A1a[i];
                    switch (num.intValue()) {
                        case 1:
                            str = "bake_off";
                            break;
                        case 2:
                            str = "mlex_survey";
                            break;
                        case 3:
                            str = "acqs";
                            break;
                        default:
                            str = "asq";
                            break;
                    }
                    if (A0o.equals(str)) {
                        int A00 = C62533aC.A00(new C570339m(r15, A06));
                        int intValue = num.intValue();
                        if (intValue == 2 || intValue == 0 || intValue == 3) {
                            A01 = IgFragmentFactoryImpl.A00().A01(Integer.valueOf(A00), A0o, A0q, (String) null, (String) null);
                        } else if (intValue == 1) {
                            A01 = IgFragmentFactoryImpl.A00().A02(A0q);
                        }
                        AnonymousClass0wJ.A19(A01, C63913ic.A05(r15), A0F);
                    } else {
                        i++;
                    }
                }
            }
        }
        return null;
    }
}
