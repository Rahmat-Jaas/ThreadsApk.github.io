package X;

import android.app.Application;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape19S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1100000_I2;

/* renamed from: X.56R  reason: invalid class name */
public final class AnonymousClass56R extends AnonymousClass10X {
    public final C23418Crl A00;
    public final C86064wD A01;
    public final C84714tk A02;
    public final C84714tk A03;
    public final UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass56R(Application application, C23410Crb crb, C23418Crl crl, UserSession userSession, String str) {
        super(application);
        AnonymousClass0wJ.A1Q(crb, crl);
        this.A00 = crl;
        this.A04 = userSession;
        this.A02 = C98446Fo.A00(AnonymousClass3J5.A00(this), new IDxFlowShape94S0200000_2_I2(24, (Object) new PageFetcher(new PagingConfig(10, 0, 0, false, 0, 58), new KtSLambdaShape19S0100000_I2((C146958n9) null, new KtLambdaShape4S1100000_I2(str, crb, 27), 0)).A03, (Object) this));
        C27442EnY enY = new C27442EnY();
        this.A01 = enY;
        this.A03 = AnonymousClass7C4.A02(enY);
    }
}
