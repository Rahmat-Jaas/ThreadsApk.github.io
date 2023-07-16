package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.2I6  reason: invalid class name */
public final class AnonymousClass2I6 {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        String str;
        String A0N;
        String A0N2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        C127397h3 A03 = C63893iY.A03(r12, 0);
        C58963Iu r3 = new C58963Iu(C63913ic.A0F(r11));
        Iterator it = A03.A0R(35).iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C127397h3 r8 = (C127397h3) it.next();
            IDxCListenerShape70S0200000_1_I2 A0R = C18200wM.A0R(r11, r8, 12);
            String A0N3 = r8.A0N(34);
            if (A0N3 == null || A0N3.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                r3.A09(r8.A0O(38, str), A0R);
            } else if (A0N3.equals("destructive")) {
                r3.A08(r8.A0O(38, str), A0R);
            } else {
                String format = String.format("Got unexpected value: %s while parsing action sheet item style", Arrays.copyOf(new Object[]{A0N3}, A1Z ? 1 : 0));
                C04220Ms.A06(format);
                C30967GcS.A02("IgBloksNavigationExtensions", format);
            }
        }
        C127397h3 A0K = A03.A0K(38);
        if (A0K != null) {
            String A0N4 = A0K.A0N(35);
            C127397h3 A0K2 = A03.A0K(40);
            if (A0K2 == null || (A0N2 = A0K2.A0N(35)) == null) {
                if (A0N4 != null) {
                    str = A0N4;
                }
                r3.A06(str);
            } else {
                if (A0N4 != null) {
                    str = A0N4;
                }
                r3.A0A(str, A0N2);
            }
        }
        C127397h3 A0K3 = A03.A0K(36);
        if (!(A0K3 == null || (A0N = A0K3.A0N(36)) == null)) {
            r3.A05(C18250wR.A0K(A0N));
        }
        FragmentActivity A05 = C63913ic.A05(r11);
        C25745DrH A0b = C18220wO.A0b(A05);
        if (A0b == null || !((C35189Ipf) A0b).A0M) {
            new C62763ag(r3).A02(A05);
            return null;
        }
        new C62763ag(r3).A03(A05);
        return null;
    }
}
