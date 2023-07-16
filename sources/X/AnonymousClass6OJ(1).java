package X;

import android.os.Bundle;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.6OJ  reason: invalid class name */
public final class AnonymousClass6OJ {
    public static final Object A00(AnonymousClass601 r15, C63893iY r16) {
        C63893iY r1 = r16;
        boolean A1Z = AnonymousClass0wJ.A1Z(r1, r15);
        List list = r1.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, A1Z ? 1 : 0);
        C109326jp A0R = C18190wL.A0R(list, 2);
        C109326jp A0R2 = C18190wL.A0R(list, 3);
        Bundle A06 = C18180wK.A06();
        A06.putInt("STYLE_RES", 2131886670);
        Bundle A062 = C18180wK.A06();
        A062.putSerializable("viewmodel_class", C92845jx.class);
        HashSet A0u = C18200wM.A0u();
        C86154wM.A1E(A062, new FBPayLoggerData((String) null, (String) null, (String) null, (String) null, A0q2, (String) null, C86104wH.A13(A0u, A0u)));
        A062.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, A0q);
        C92745jn r2 = new C92745jn();
        r2.setArguments(A062);
        AnonymousClass5qq r12 = new AnonymousClass5qq();
        r12.setArguments(A06);
        C12560m7 supportFragmentManager = C63913ic.A05(r15).getSupportFragmentManager();
        r12.A05 = r2;
        r12.A0A(supportFragmentManager, (String) null);
        r2.A00 = new C128987kk(r12, r15, A0R, A0R2);
        return null;
    }
}
