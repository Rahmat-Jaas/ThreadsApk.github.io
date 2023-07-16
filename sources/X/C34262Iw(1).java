package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2Iw  reason: invalid class name and case insensitive filesystem */
public final class C34262Iw {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        String A0D = C63893iY.A0D(r9, 0);
        boolean A01 = AnonymousClass3WF.A01(r9, A1Z ? 1 : 0);
        C10300i6 A0F = C63913ic.A0F(r8);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        C04620Ok r92 = C06810aP.A01;
        User A012 = r92.A01(userSession);
        int hashCode = A0D.hashCode();
        if (hashCode != -1804233150) {
            if (hashCode != -957868191) {
                if (hashCode == -868192944 && A0D.equals("muted_words_global_list")) {
                    C35332Na.A00(userSession, A1Z, A01);
                    C18230wP.A1K(userSession, r92.A01(userSession), A01);
                    if (A01 && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312947762201838L)) {
                        C18240wQ.A0W(userSession, r92).CnG(Boolean.valueOf(A1Z));
                        SharedPreferences A04 = C28161tl.A04(userSession);
                        if (A04.contains("hidden_word_spam_scam_consent_accepted")) {
                            C18180wK.A0u(A04.edit(), "hidden_word_spam_scam_consent_accepted");
                        }
                    }
                }
            } else if (A0D.equals("hide_more_comments")) {
                A012.A27(Boolean.valueOf(A01));
            }
            A012.A1t(userSession);
            return null;
        } else if (A0D.equals("muted_words_custom_list")) {
            C04220Ms.A0B(userSession, A1Z);
            C37010Jil jil = new C37010Jil((C30087FzX) null);
            userSession.A01(C58303Ew.class, C75804cq.A00);
            if (AnonymousClass3WI.A02(userSession) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321426025945876L)) {
                AnonymousClass3A4 A00 = AnonymousClass2NO.A00(userSession);
                jil.A02(new AnonymousClass47J(), A00.A00.A0F(new AnonymousClass48Y(A00, 2, 3, A01)));
            }
            User A013 = r92.A01(userSession);
            A013.A05.CnE(Boolean.valueOf(A01));
            A013.A1t(userSession);
            return null;
        }
        C30967GcS.A02("IgBloksExtensions", AnonymousClass00U.A0L("Unknown Content Filter setting: ", A0D));
        return null;
    }
}
