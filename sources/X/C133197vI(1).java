package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.7vI  reason: invalid class name and case insensitive filesystem */
public final class C133197vI implements C21331Bsc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KtCSuperShape1S0200000_I2_1 A01;
    public final /* synthetic */ C20066BMj A02;
    public final /* synthetic */ UserSession A03;

    public C133197vI(KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1, C20066BMj bMj, UserSession userSession, int i) {
        this.A01 = ktCSuperShape1S0200000_I2_1;
        this.A03 = userSession;
        this.A02 = bMj;
        this.A00 = i;
    }

    public final void Bpe(ClickableSpan clickableSpan, View view, String str) {
        String str2;
        C04220Ms.A0B(str, 0);
        KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1 = this.A01;
        Iterator A0y = C86144wL.A0y(ktCSuperShape1S0200000_I2_1.A01);
        while (A0y.hasNext()) {
            User A0c = C18220wO.A0c(A0y);
            if (A0c != null) {
                str2 = A0c.BK7();
            } else {
                str2 = null;
            }
            if (C04220Ms.A0I(str2, str)) {
                UserSession userSession = this.A03;
                if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319437456020642L)) {
                    C37235Jn1 A002 = C37235Jn1.A00(userSession);
                    C04220Ms.A0A(view);
                    A002.A03(view, C171469zS.TAP);
                }
                C86104wH.A1R(A0c, this.A02, (AnonymousClass0YM) ((KtCSuperShape1S0200000_I2_1) ktCSuperShape1S0200000_I2_1.A00).A01, this.A00);
                return;
            }
        }
        ((AnonymousClass0YY) ((KtCSuperShape1S0200000_I2_1) ktCSuperShape1S0200000_I2_1.A00).A00).invoke(this.A02);
    }
}
