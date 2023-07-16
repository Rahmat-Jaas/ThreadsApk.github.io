package X;

import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.4AS  reason: invalid class name */
public abstract class AnonymousClass4AS implements C39549KvX {
    public final long A00;

    public void A00(Object obj, long j, Object obj2) {
        long j2;
        String A33;
        Long A02;
        if (this instanceof AnonymousClass1o0) {
            AnonymousClass1o0 r3 = (AnonymousClass1o0) this;
            C61723Vc r8 = (C61723Vc) obj;
            C04220Ms.A0B(r8, 0);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A00, "comments_from_facebook_impression"), 427);
            BKU bku = r3.A01;
            if (bku == null || (A33 = bku.A33()) == null || (A02 = AnonymousClass4n2.A02(A33)) == null) {
                j2 = -1;
            } else {
                j2 = A02.longValue();
            }
            C18210wN.A18(A0I, j2);
            A0I.A0S("reaction_count", C18230wP.A0f(r8.A00()));
            A0I.Bb4();
        } else if (this instanceof C25631nz) {
            C23941gd r32 = ((C25631nz) this).A00;
            if (!r32.A00) {
                r32.A00 = true;
                UserSession userSession = r32.A03;
                AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
                if (C63803iN.A0E(r4, userSession, 36319991507719732L)) {
                    C62673aV r33 = r32.A02;
                    C313425p r6 = C313425p.A0P;
                    if (r33.A03.get(r6) != null && C63803iN.A0E(r4, r33.A00, 36319991506736687L)) {
                        AnonymousClass3ZL r1 = r33.A01;
                        AnonymousClass0wJ.A11(AnonymousClass3ZL.A00(r1), "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", r1.A02() + 1);
                        C207916c A01 = C62673aV.A01(r33, r6, C62673aV.A00(r33, r6));
                        r33.A02.A03(r6, new C207916c(A01.A01, A01.A00 + 1, A01.A02, A01.A03));
                        return;
                    }
                    return;
                }
                AnonymousClass3ZL r12 = r32.A04;
                AnonymousClass0wJ.A11(AnonymousClass3ZL.A00(r12), "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", r12.A02() + 1);
            }
        } else {
            BKU bku2 = (BKU) obj;
            C04220Ms.A0B(bku2, 0);
            AnonymousClass3C8 r2 = ((C25621ny) this).A00;
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A01, "comments_from_facebook_cta_impression"), 425);
            String A332 = bku2.A33();
            C04220Ms.A06(A332);
            C18210wN.A18(A0I2, AnonymousClass4n2.A00(A332));
            SharedPreferences sharedPreferences = r2.A04.A00;
            A0I2.A0Q("is_nux", C18240wQ.A0X(sharedPreferences.getBoolean("has_seen_comments_from_fb_cta", false)));
            A0I2.Bb4();
            AnonymousClass0wJ.A13(sharedPreferences.edit(), "has_seen_comments_from_fb_cta", true);
        }
    }

    public AnonymousClass4AS(long j) {
        this.A00 = j;
    }

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        if (c2r.BLJ(jnx) == AnonymousClass006.A0C) {
            long Af5 = c2r.Af5(jnx);
            if (Af5 >= this.A00) {
                A00(jnx.A02, Af5, jnx.A03);
            }
        }
    }
}
