package X;

import android.app.Dialog;
import android.content.ClipData;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape14S1200000_1_I2;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.2HA  reason: invalid class name */
public final class AnonymousClass2HA {
    public static Object A00(AnonymousClass601 r14, C63893iY r15) {
        C127397h3 A02 = C63893iY.A02(r15, 0);
        if (A02 == null) {
            C30967GcS.A02("bk.action.navigation.OpenMap", "Received null config model");
            return null;
        }
        String A0O = A02.A0O(43, "");
        String A0O2 = A02.A0O(46, "");
        String A0O3 = A02.A0O(44, "");
        String A0O4 = A02.A0O(45, "");
        String A0O5 = A02.A0O(48, "");
        C04220Ms.A0B(r14, 0);
        FragmentActivity A05 = C63913ic.A05(r14);
        UserSession A0J = C63913ic.A0J(r14);
        ClipData newPlainText = ClipData.newPlainText((CharSequence) null, C62933bA.A01(A0O2, A0O3, A0O4));
        Object systemService = A05.getSystemService("clipboard");
        C64023jK r8 = new C64023jK(A05, A0O, A0O2, A0O3, A0O4);
        IDxCListenerShape77S0200000_1_I2 iDxCListenerShape77S0200000_1_I2 = new IDxCListenerShape77S0200000_1_I2(5, systemService, (Object) newPlainText);
        IDxCListenerShape14S1200000_1_I2 iDxCListenerShape14S1200000_1_I2 = new IDxCListenerShape14S1200000_1_I2((Object) r14, (Object) A0J, A0O5, 0);
        C25828Dsm A0W = C18190wL.A0W(A05);
        if (!AnonymousClass0hA.A08(A0O5) && !A0O5.trim().equals("0")) {
            A0W.A0T(iDxCListenerShape14S1200000_1_I2, AnonymousClass25l.DEFAULT, 2131835512);
        }
        A0W.A0N(r8, 2131835511);
        A0W.A0O(iDxCListenerShape77S0200000_1_I2, 2131824416);
        A0W.A0q(true);
        Dialog A0G = A0W.A0G();
        A0G.setCanceledOnTouchOutside(true);
        C13950oZ.A00(A0G);
        return null;
    }
}
