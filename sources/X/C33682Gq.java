package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2Gq  reason: invalid class name and case insensitive filesystem */
public final class C33682Gq {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        C14090on r2;
        int i;
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        C10300i6 A0F = C63913ic.A0F(r9);
        List list = r10.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, A1Z ? 1 : 0);
        String A0D = C63893iY.A0D(r10, 2);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C54392zN.A00(A0y);
        if (A0q == null || A0q.length() == 0 || A0q2 == null || A0q2.length() == 0) {
            C04220Ms.A0B(A0D, 0);
            C04220Ms.A0B(A0F, A1Z);
            A0y.remove(A0D);
            try {
                ArrayList A0s = C18200wM.A0s(A0y.values());
                C08350dD A00 = C08360dF.A00();
                C39237Kq4 kq4 = C36975Ji8.A03;
                C18180wK.A0v(C18220wO.A0B(A00), "live_chat_nonce", C18210wN.A0d(LiveChatNonceList.class, new LiveChatNonceList(A0s), kq4, kq4.A02));
                return null;
            } catch (IOException e) {
                e = e;
                r2 = C10770iu.A00();
                i = 817898180;
                str = "error removing live chat nonce: ";
                C18250wR.A13(r2, AnonymousClass0wJ.A0t(str, e), i);
                return null;
            }
        } else {
            C18180wK.A1P(A0D, 0, A0F);
            A0y.put(A0D, new LiveChatNonce(A0D, A0q, A0q2));
            try {
                ArrayList A0s2 = C18200wM.A0s(A0y.values());
                C08350dD A002 = C08360dF.A00();
                C39237Kq4 kq42 = C36975Ji8.A03;
                C18180wK.A0v(C18220wO.A0B(A002), "live_chat_nonce", C18210wN.A0d(LiveChatNonceList.class, new LiveChatNonceList(A0s2), kq42, kq42.A02));
                return null;
            } catch (IOException e2) {
                e = e2;
                r2 = C10770iu.A00();
                i = 817898180;
                str = "error saving live chat nonce: ";
                C18250wR.A13(r2, AnonymousClass0wJ.A0t(str, e), i);
                return null;
            }
        }
    }
}
