package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2H2  reason: invalid class name */
public final class AnonymousClass2H2 {
    public static Object A00(AnonymousClass601 r10, C63893iY r11) {
        C11630kW r5;
        String str = (String) C63893iY.A07(r11);
        List list = r11.A00;
        String A0q = C18190wL.A0q(list, 1);
        String A0q2 = C18190wL.A0q(list, 2);
        if (TextUtils.isEmpty(A0q)) {
            C04220Ms.A0B(r10, 0);
            r5 = C63913ic.A0A(r10);
        } else {
            r5 = new AnonymousClass43H(A0q);
        }
        UserSession A0J = C63913ic.A0J(r10);
        C04220Ms.A0B(r10, 0);
        FragmentActivity A05 = C63913ic.A05(r10);
        C40309LcG lcG = (C40309LcG) EnumHelper.A00(str, C40309LcG.A0z);
        if (C18210wN.A1W(C18180wK.A1Z(lcG, C40309LcG.A01))) {
            Bundle A06 = C18180wK.A06();
            A06.putString("analytics_module", r5.getModuleName());
            A06.putString("location", str);
            A06.putString(C61973Wo.A01(174, 10, 9), A0q2);
            C63863iT.A08(A05, A06, A0J, ModalActivity.class, "account_status");
            return null;
        }
        AnonymousClass3RM r8 = AnonymousClass3RM.A00;
        if (r8 == null) {
            r8 = new AnonymousClass3RM();
            AnonymousClass3RM.A00 = r8;
        }
        AnonymousClass0wJ.A1N(A05, A0J);
        AnonymousClass0wJ.A1Q(r5, lcG);
        AnonymousClass3RM.A00(A05, r5, lcG, A0J, r8, A0q2, (String) null, (String) null).A04();
        return null;
    }
}
