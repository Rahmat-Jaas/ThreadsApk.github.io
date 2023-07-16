package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.2P0  reason: invalid class name */
public final class AnonymousClass2P0 {
    public static void A00(Context context, DialogInterface.OnClickListener onClickListener, C82584pw r7, UserSession userSession, Integer num) {
        String BFt;
        String BFt2;
        String Ao9;
        if (context != null) {
            C25828Dsm A0W = C18190wL.A0W(context);
            int intValue = num.intValue();
            if (intValue != 3) {
                C85534vL A04 = C63713iA.A04();
                if (A04.BH0() == null || C121687Hl.A03(A04.BH0().BFt())) {
                    throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
                }
                BFt = A04.BH0().BFt();
            } else {
                C85524vK A03 = C63713iA.A03();
                if (A03.BGz() == null || C121687Hl.A03(A03.BGz().BFt())) {
                    throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
                }
                BFt = A03.BGz().BFt();
            }
            A0W.A02 = BFt;
            if (intValue != 3) {
                C85534vL A042 = C63713iA.A04();
                if (A042.ATl() == null || C121687Hl.A03(A042.ATl().BFt())) {
                    throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
                }
                BFt2 = A042.ATl().BFt();
            } else {
                C85524vK A032 = C63713iA.A03();
                if (A032.ATk() == null || C121687Hl.A03(A032.ATk().BFt())) {
                    throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
                }
                BFt2 = A032.ATk().BFt();
            }
            A0W.A0p(BFt2);
            C85724vf A01 = C63713iA.A01();
            if (intValue != 3) {
                if (!C121687Hl.A03(A01.B6l())) {
                    Ao9 = A01.B6l();
                } else {
                    throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
                }
            } else if (A01.Ao9() != null) {
                Ao9 = A01.Ao9();
            } else {
                throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
            }
            A0W.A0Y(C18250wR.A0E(r7, num, userSession, 27), AnonymousClass25l.BLUE_BOLD, Ao9, true);
            C85724vf A012 = C63713iA.A01();
            if (!C121687Hl.A03(A012.B6k())) {
                A0W.A0b(new IDxCListenerShape77S0200000_1_I2(30, (Object) num, (Object) userSession), A012.B6k());
                if (context instanceof C82044oz) {
                    C85724vf A013 = C63713iA.A01();
                    if (A013.B6m() != null) {
                        A0W.A0a(onClickListener, A013.B6m());
                    } else {
                        throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
                    }
                }
                Dialog A0G = A0W.A0G();
                C63243h6.A03(AnonymousClass2A7.A0D, AnonymousClass2P1.A00(num), userSession);
                if (num == AnonymousClass006.A00 || num == AnonymousClass006.A01) {
                    AnonymousClass0wJ.A13(C28161tl.A03(userSession), "fxim_has_seen_reminder_dialog_on_photo_change", true);
                }
                if (num == AnonymousClass006.A0Y) {
                    AnonymousClass0wJ.A13(C28161tl.A03(userSession), "fxim_has_seen_reminder_dialog_on_name_update", true);
                }
                C13950oZ.A00(A0G);
                return;
            }
            throw C18180wK.A0a("Missing required content to build the FX Reminder Dialog.");
        }
    }
}
