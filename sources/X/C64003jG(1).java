package X;

import android.content.DialogInterface;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.MicroUserDict;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3jG  reason: invalid class name and case insensitive filesystem */
public final class C64003jG implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass3LL A00;
    public final /* synthetic */ C63723iC A01;
    public final /* synthetic */ HashMap A02;
    public final /* synthetic */ boolean A03;

    public C64003jG(AnonymousClass3LL r1, C63723iC r2, HashMap hashMap, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A00 = r1;
        this.A02 = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C63723iC r2 = this.A01;
        UserSession userSession = r2.A08;
        C15730rn A002 = C15730rn.A00(r2.A03, "logout_d2_logout_tapped");
        A002.A0D("type", "is_all");
        C18180wK.A1K(A002, userSession);
        if (this.A03) {
            HashMap hashMap = this.A02;
            C04220Ms.A0B(userSession, 0);
            AnonymousClass3LL.A00(userSession, "logout_password_saving_multiaccount_logout_all_clicked", "logout_spi", "logout", "logout_interaction", (String) null, hashMap);
        }
        C62353Yv A003 = C62353Yv.A00(userSession);
        if (!A003.A01.isEmpty()) {
            Iterator it = C18240wQ.A0J(A003.A01).iterator();
            while (it.hasNext()) {
                AnonymousClass3FU r6 = (AnonymousClass3FU) it.next();
                if (r6.A02) {
                    String A004 = r6.A00();
                    MicroUserDict microUserDict = r6.A00;
                    C04220Ms.A0B(microUserDict, 0);
                    String str = microUserDict.A0F;
                    if (str == null) {
                        str = "";
                    }
                    MicroUserDict microUserDict2 = r6.A00;
                    C04220Ms.A0B(microUserDict2, 0);
                    ImageUrl imageUrl = microUserDict2.A04;
                    imageUrl.getClass();
                    C63533hk.A02(userSession).A0F(new C62733ac(imageUrl, A004, str, r6.A01));
                }
            }
        }
        C62353Yv A005 = C62353Yv.A00(userSession);
        if (!A005.A01.isEmpty()) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A005.A01 = A0y;
            A005.A04(A0y.values());
        }
        r2.A0D(AnonymousClass006.A0C, true);
    }
}
