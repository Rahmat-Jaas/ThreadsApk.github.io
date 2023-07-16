package X;

import android.content.Context;
import com.facebook.dcp.model.DcpContext;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* renamed from: X.84m  reason: invalid class name and case insensitive filesystem */
public final class C1368084m implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass01V A01;
    public final /* synthetic */ AnonymousClass7EN A02;
    public final /* synthetic */ AnonymousClass5HJ A03;
    public final /* synthetic */ String A04;

    public C1368084m(Context context, AnonymousClass01V r2, AnonymousClass7EN r3, AnonymousClass5HJ r4, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C125757dw r12;
        AnonymousClass01V r4 = this.A01;
        r4.markerPoint(424097382, "future_begin");
        AnonymousClass7EN r5 = this.A02;
        r4.markerAnnotate(424097382, "threshold", String.valueOf(C86124wJ.A00(r5.A04.getValue())));
        List A0n = C18180wK.A0n(C18180wK.A0p(new DcpContext(this.A04, (Map) null, (Map) null, 30), (Object) null));
        if (AnonymousClass0wJ.A1X(r5.A08.getValue())) {
            r12 = new C125757dw(this.A03);
        } else {
            r12 = null;
        }
        UserSession userSession = r5.A01;
        Context context = this.A00;
        C146908n4 r1 = ((C132277td) C86124wJ.A0o(userSession, C132277td.class, context, 41)).A00;
        r4.markerPoint(424097382, "ml_engine_initialization_end");
        AnonymousClass5Id CX7 = r1.CX7(r12, (Long) null, A0n);
        boolean z = CX7.A02;
        r4.markerPoint(424097382, "prediction_end", String.valueOf(z));
        if (C18190wL.A08(r5.A02.getValue()) > 0) {
            GQH.A03.CwT(new C955561e(context, r12, userSession, A0n));
        }
        if (z) {
            Object obj = CX7.A00;
            if (C18190wL.A1a((Collection) obj)) {
                r4.markerAnnotate(424097382, "score", String.valueOf(C86124wJ.A00(((Pair) C18240wQ.A0b((List) obj)).A01)));
            }
        }
        return CX7;
    }
}
