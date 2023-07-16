package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.5xf  reason: invalid class name */
public final class AnonymousClass5xf extends AnonymousClass1eT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C24805DaJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5xf(Context context, C24805DaJ daJ) {
        super(false);
        this.A01 = daJ;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C61323St r5 = (C61323St) obj;
        C04220Ms.A0B(r5, 0);
        C24805DaJ daJ = this.A01;
        UserSession userSession = daJ.A01;
        Context context = this.A00;
        C04220Ms.A0C(context, C18170wI.A00(2));
        C33492Fx.A00(C130667qT.A00((SparseArray) null, (FragmentActivity) context, daJ.A00, userSession), r5);
    }
}
