package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112;

/* renamed from: X.3C8  reason: invalid class name */
public final class AnonymousClass3C8 {
    public final C25621ny A00;
    public final C13330nS A01;
    public final C30938GbW A02;
    public final C26372EBv A03 = new C26372EBv();
    public final AnonymousClass36V A04;

    public AnonymousClass3C8(Context context, C13330nS r5, C30938GbW gbW, UserSession userSession) {
        this.A02 = gbW;
        this.A01 = r5;
        this.A04 = (AnonymousClass36V) userSession.A01(AnonymousClass36V.class, new KtLambdaShape132S0100000_I2_112(userSession, 37));
        long integer = (long) context.getResources().getInteger(17694720);
        this.A00 = new C25621ny(this, integer);
    }
}
