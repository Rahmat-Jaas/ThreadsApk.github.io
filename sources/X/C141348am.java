package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape36S0200000_I2_20;
import kotlin.jvm.internal.KtLambdaShape4S0600000_I2;

/* renamed from: X.8am  reason: invalid class name and case insensitive filesystem */
public final class C141348am extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ C147368pE A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ AnonymousClass0YY A03;
    public final /* synthetic */ AnonymousClass0YY A04;
    public final /* synthetic */ AnonymousClass0YM A05;
    public final /* synthetic */ C83224qz A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141348am(C147368pE r2, UserSession userSession, List list, AnonymousClass0YY r5, AnonymousClass0YY r6, AnonymousClass0YM r7, C83224qz r8) {
        super(4);
        this.A02 = list;
        this.A01 = userSession;
        this.A00 = r2;
        this.A06 = r8;
        this.A04 = r5;
        this.A05 = r7;
        this.A03 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r8 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = obj;
        C04220Ms.A0B(obj5, 0);
        if ((A043 & 14) == 0) {
            i = A043 | C147188nY.A0F(r8, obj5);
        } else {
            i = A043;
        }
        if ((A043 & 112) == 0) {
            i |= C147188nY.A04(r8, A042);
        }
        if ((i & 731) != 146 || !r8.BCM()) {
            KtCSuperShape0S3400000_I2 ktCSuperShape0S3400000_I2 = (KtCSuperShape0S3400000_I2) this.A02.get(A042);
            Object obj6 = ktCSuperShape0S3400000_I2.A03;
            boolean A1X = C86144wL.A1X(this.A01.getUserId(), ((User) ktCSuperShape0S3400000_I2.A02).getId());
            String str = ktCSuperShape0S3400000_I2.A05;
            String str2 = ktCSuperShape0S3400000_I2.A06;
            String str3 = ktCSuperShape0S3400000_I2.A04;
            boolean A1W = AnonymousClass0wJ.A1W(obj6);
            C147368pE r6 = this.A00;
            boolean A0I = C04220Ms.A0I(r6.getValue(), str);
            C83224qz r5 = this.A06;
            AnonymousClass0YY r0 = this.A04;
            AnonymousClass7KL.A05(r8, (ImageUrl) ktCSuperShape0S3400000_I2.A01, (C23894D0g) ktCSuperShape0S3400000_I2.A00, str, str2, str3, new KtLambdaShape36S0200000_I2_20(22, ktCSuperShape0S3400000_I2, r0), new KtLambdaShape36S0200000_I2_20(23, ktCSuperShape0S3400000_I2, this.A03), new KtLambdaShape4S0600000_I2(r6, this.A05, obj6, r5, r0, ktCSuperShape0S3400000_I2, 4), 0, 0, A1X, A1W, A0I);
        } else {
            r8.CuJ();
        }
        return Unit.A00;
    }
}
