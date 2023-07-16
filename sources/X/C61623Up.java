package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3Up  reason: invalid class name and case insensitive filesystem */
public final class C61623Up {
    public final UserSession A00;
    public final C04560Oe A01;
    public final C04560Oe A02;
    public final C04560Oe A03;
    public final C04560Oe A04;
    public final C04560Oe A05;

    public static C61623Up A00(UserSession userSession) {
        return (C61623Up) C18180wK.A0c(userSession, C61623Up.class, 14);
    }

    public final boolean A01() {
        Integer num;
        boolean booleanValue;
        if (AnonymousClass0wJ.A1X(this.A02.get())) {
            UserSession userSession = this.A00;
            C63473hX A012 = C63473hX.A01(userSession);
            Boolean A022 = C63473hX.A02(A012);
            if (A022 == null) {
                booleanValue = false;
            } else {
                booleanValue = A022.booleanValue();
            }
            if (C63473hX.A05(A012, booleanValue) && (AnonymousClass0wJ.A1X(this.A01.get()) || (AnonymousClass0wJ.A1X(this.A05.get()) && AnonymousClass0wJ.A1X(this.A04.get())))) {
                int A002 = C63473hX.A00(userSession);
                if (A002 == 2) {
                    num = AnonymousClass006.A0C;
                } else if (A002 == 1) {
                    num = AnonymousClass006.A01;
                }
                return num.equals(AnonymousClass006.A0C);
            }
        }
        num = AnonymousClass006.A00;
        return num.equals(AnonymousClass006.A0C);
    }

    public C61623Up(UserSession userSession) {
        this.A00 = userSession;
        this.A02 = new AnonymousClass47S(new AnonymousClass4UK(AnonymousClass0e5.A00(36312402299585499L), userSession, true));
        this.A01 = AnonymousClass4UK.A00(userSession, 36313450271475206L, true);
        this.A05 = AnonymousClass4UK.A00(userSession, 36313454566442503L, true);
        this.A04 = AnonymousClass4UK.A00(userSession, 36313488926180881L, true);
        this.A03 = AnonymousClass4UK.A00(userSession, 36315511855778390L, true);
    }
}
