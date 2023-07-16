package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6MV  reason: invalid class name */
public final class AnonymousClass6MV {
    public static final void A00(C147188nY r36, ImageUrl imageUrl, String str, AnonymousClass0ZU r39, int i, boolean z, boolean z2) {
        int i2;
        C147188nY r13 = r36;
        r13.Cvd(702105690);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r13, str2) | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r13, imageUrl2);
        }
        boolean z3 = z;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0N(r13, z3);
        }
        boolean z4 = z2;
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0O(r13, z4);
        }
        AnonymousClass0ZU r5 = r39;
        if ((57344 & i) == 0) {
            i2 |= C147188nY.A0D(r13, r5);
        }
        if ((46811 & i2) != 9362 || !r13.BCM()) {
            C970267q r16 = C970267q.POST;
            LineType lineType = LineType.LINE;
            Modifier A04 = Modifier.A04(Modifier.A00);
            AnonymousClass7W3 r8 = (AnonymousClass7W3) r13;
            Object A13 = r8.A13();
            Object obj = AnonymousClass7GN.A00;
            C147258p3 r12 = (C147258p3) C86144wL.A0f(r8, A13, obj);
            C74544ac r23 = C74544ac.A00;
            boolean A0y = C147188nY.A0y(r13, r5);
            Object A132 = r8.A13();
            if (A0y || A132 == obj) {
                A132 = AnonymousClass7W3.A0G(r8, r5, 2);
            }
            ImageUrl imageUrl3 = imageUrl2;
            C121317Fl.A00(r12, r13, A04, lineType, r16, imageUrl3, (C23894D0g) null, (Double) null, str2, (String) null, (AnonymousClass0ZU) null, r23, (AnonymousClass0ZU) null, (AnonymousClass0ZU) null, (AnonymousClass0ZU) null, AnonymousClass7W3.A09(r8, A132, false), (i2 & 14) | 920350080 | (i2 & 112), ((i2 << 3) & 7168) | 24624 | ((i2 << 9) & 3670016), 0, 67011584, z3, false, false, z4, false, false, false, false, false, false, false);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8RX(imageUrl2, str2, r5, i3, z3, z4));
        }
    }
}
