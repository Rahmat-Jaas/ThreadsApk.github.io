package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape20S0400000_1_I2;
import com.facebook.redex.IDxComparatorShape94S0000000_1_I2;
import com.facebook.redex.IDxLListenerShape191S0200000_4_I2;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.2Gr  reason: invalid class name and case insensitive filesystem */
public final class C33692Gr {
    public static final Object A00(AnonymousClass601 r21, C63893iY r22) {
        String A0N;
        AnonymousClass601 r13 = r21;
        C63893iY r0 = r22;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r13);
        Object A0B = C63893iY.A0B(r0, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C121997Jj r1 = (C121997Jj) A0B;
        AnonymousClass3HX r11 = r13.A00;
        if (r11 == null) {
            r11 = C63913ic.A0D(r13);
        }
        C127397h3 A00 = C101046Pr.A00(r11, r13, r1.A02);
        FragmentActivity A05 = C63913ic.A05(r13);
        C04220Ms.A0B(A05, 0);
        C25828Dsm A0W = C18190wL.A0W(A05);
        String A0N2 = A00.A0N(38);
        if (!(A0N2 == null || A0N2.length() == 0)) {
            A0W.A02 = A0N2;
        }
        String A0o = C18230wP.A0o(A00);
        if (!(A0o == null || A0o.length() == 0)) {
            A0W.A0p(A0o);
        }
        List A0Q = A00.A0Q(35);
        C04220Ms.A06(A0Q);
        if (!A0Q.isEmpty()) {
            List A0W2 = AnonymousClass00J.A0W(A0Q, AnonymousClass4TZ.A00);
            String A0N3 = ((C127397h3) A0W2.get(0)).A0N(38);
            if (A0N3 != null && !A0N3.equals("emphasized")) {
                A0W2 = AnonymousClass00J.A0W(A0Q, new IDxComparatorShape94S0000000_1_I2(3));
            }
            int size = A0W2.size();
            for (int i = 0; i < size; i++) {
                C127397h3 r3 = (C127397h3) A0W2.get(i);
                AnonymousClass25l r2 = AnonymousClass25l.DEFAULT;
                String A0o2 = C18230wP.A0o(r3);
                C109326jp A0L = r3.A0L(35);
                if (!(r3.A0N(38) == null || (A0N = r3.A0N(38)) == null)) {
                    int hashCode = A0N.hashCode();
                    if (hashCode != -1829997182) {
                        if (hashCode == 506776930 && A0N.equals("emphasized")) {
                            r2 = AnonymousClass25l.BLUE_BOLD;
                        }
                    } else if (A0N.equals("destructive")) {
                        r2 = AnonymousClass25l.RED;
                    }
                }
                IDxCListenerShape20S0400000_1_I2 iDxCListenerShape20S0400000_1_I2 = null;
                if (A0L != null) {
                    iDxCListenerShape20S0400000_1_I2 = new IDxCListenerShape20S0400000_1_I2(r11, r13, r3, A0L, 2);
                }
                if (A0o2 != null) {
                    if (i == 0) {
                        A0W.A0Y(iDxCListenerShape20S0400000_1_I2, r2, A0o2, A1Z);
                    } else if (i == A1Z) {
                        A0W.A0W(iDxCListenerShape20S0400000_1_I2, r2, A0o2, A1Z);
                    } else if (i == 2) {
                        A0W.A0X(iDxCListenerShape20S0400000_1_I2, r2, A0o2, A1Z);
                    }
                }
            }
        }
        if (!(A00.A0N(41) == null || !C04220Ms.A0I(A00.A0N(41), "promotional") || A00.A0N(40) == null)) {
            SimpleImageUrl A0K = C18250wR.A0K(A00.A0N(42));
            String A0N4 = A00.A0N(40);
            if (A0N4 != null) {
                int hashCode2 = A0N4.hashCode();
                if (hashCode2 != 1079772361) {
                    if (hashCode2 == 1782764648 && A0N4.equals("profile_picture")) {
                        A0W.A0l(A0K, C63913ic.A09(r11));
                    }
                } else if (A0N4.equals("full_width_photo")) {
                    C11630kW A09 = C63913ic.A09(r11);
                    IgImageView A002 = C25828Dsm.A00(A0W);
                    A002.A0F = new IDxLListenerShape191S0200000_4_I2(2, A002, A0W);
                    A002.setUrl(A0K, A09);
                    A0W.A0H();
                }
            }
            A0W.A0I.setImageURL(A0K, C63913ic.A09(r11), (C33619HrR) null);
        }
        AnonymousClass0wJ.A1K(A0W);
        return null;
    }
}
