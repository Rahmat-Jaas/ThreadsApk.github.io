package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;
import kotlin.jvm.internal.KtLambdaShape30S0200000_I2_14;
import kotlin.jvm.internal.KtLambdaShape84S0100000_I2_64;

/* renamed from: X.6mo  reason: invalid class name and case insensitive filesystem */
public final class C111116mo {
    public C33788HuV A00;
    public C33788HuV A01;
    public C33788HuV A02;
    public C33788HuV A03;
    public C112476pf A04;
    public AnonymousClass7pN A05;
    public C08240d2 A06;
    public UserSession A07;
    public AnonymousClass7pQ A08;

    public C111116mo(Context context, UserSession userSession) {
        AnonymousClass7pR r0;
        AnonymousClass7pL r02;
        this.A07 = userSession;
        this.A04 = AnonymousClass6PA.A00(userSession);
        this.A03 = (KEV) userSession.A01(KEV.class, new KtLambdaShape84S0100000_I2_64(userSession, 34));
        if (C19573AyZ.A03(userSession)) {
            r0 = (AnonymousClass7pR) userSession.A01(AnonymousClass7pR.class, new KtLambdaShape84S0100000_I2_64(userSession, 33));
        } else {
            r0 = null;
        }
        this.A02 = r0;
        if (C19573AyZ.A03(userSession)) {
            r02 = (AnonymousClass7pL) userSession.A01(AnonymousClass7pL.class, new KtLambdaShape30S0200000_I2_14(29, context, userSession));
        } else {
            r02 = null;
        }
        this.A01 = r02;
        this.A08 = (AnonymousClass7pQ) userSession.A01(AnonymousClass7pQ.class, AnonymousClass8IC.A00);
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36326279338796531L)) {
            this.A00 = (AnonymousClass7pM) userSession.A01(AnonymousClass7pM.class, new KtLambdaShape28S0100000_I2_8(userSession, 24));
        }
        if (C63803iN.A0E(r2, userSession, 36315992892115892L)) {
            this.A06 = new C08240d2();
        }
        if (C63803iN.A0E(r2, userSession, 36311173938807231L)) {
            AnonymousClass7pN r03 = AnonymousClass7pN.A02;
            if (r03 == null) {
                r03 = new AnonymousClass7pN(context);
                AnonymousClass7pN.A02 = r03;
            }
            this.A05 = r03;
        }
    }
}
