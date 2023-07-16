package X;

import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6Oz  reason: invalid class name and case insensitive filesystem */
public final class C100876Oz {
    public static final Object A00(AnonymousClass601 r20, C63893iY r21) {
        AnonymousClass601 r1 = r20;
        C63893iY r0 = r21;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r1);
        C127397h3 A03 = C63893iY.A03(r0, 0);
        String A0F = C127397h3.A0F(A03, "", 43);
        String A0F2 = C127397h3.A0F(A03, "", 45);
        String A0O = A03.A0O(46, (String) null);
        int A0H = A03.A0H(44, 0);
        boolean A1X = C86144wL.A1X(A03.A0O(35, ""), "ENABLED");
        boolean A00 = AnonymousClass2LL.A00(C127397h3.A0A(A03, 38), A1Z);
        boolean A002 = AnonymousClass2LL.A00(C127397h3.A0A(A03, 40), false);
        PromptStickerModel promptStickerModel = new PromptStickerModel((User) null, (Integer) null, A0F2, A0F, A0O, A03.A0O(140, (String) null), (List) null, A0H, A1X ? 1 : 0, 2091784, A00, A002, false, AnonymousClass2LL.A00(C127397h3.A0A(A03, 42), false), false, false);
        C10300i6 A0F3 = C63913ic.A0F(r1);
        C18200wM.A1R(A0F3);
        C18656Aj9.A01(C63913ic.A05(r1), C63913ic.A01(r1), C171799zz.A3g, (BKU) null, promptStickerModel, (UserSession) A0F3);
        return null;
    }
}
