package X;

import android.content.Context;
import com.facebook.dcp.model.DcpContext;
import com.instagram.service.session.UserSession;

/* renamed from: X.617  reason: invalid class name */
public final class AnonymousClass617 extends AnonymousClass0gG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass617(Context context, UserSession userSession) {
        super(1927308600);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void run() {
        try {
            ((C125797e1) ((C132417tr) C86124wJ.A0o(this.A01, C132417tr.class, this.A00, 39)).A04.getValue()).A00((DcpContext) null);
        } catch (Exception e) {
            C14100oo ABJ = C10770iu.A00().ABJ("Error while warming up features", 1011495295);
            ABJ.Ciu(e);
            ABJ.report();
        }
    }
}
