package X;

import android.content.Context;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.graphql.instagramschemagraphservices.ServerSmartPrefetchQueryResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.41f  reason: invalid class name and case insensitive filesystem */
public final class C679341f implements C83334rD {
    public final Context A00;
    public final UserSession A01;

    public final void onFailure(Throwable th) {
        C04220Ms.A0B(th, 0);
        AnonymousClass0LU.A0C("SSP", th.getMessage());
        AnonymousClass0LU.A0C("SSP", "SSP didn't fetch");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        TreeJNI treeValue;
        ImmutableList treeList;
        C143338gY r13 = (C143338gY) obj;
        Object obj2 = null;
        if (r13 != null) {
            obj2 = ((AnonymousClass5z0) r13).A01;
        }
        if (obj2 != null) {
            TreeJNI A03 = C685344e.A03(r13);
            if (A03 == null || (treeValue = A03.getTreeValue("xfb_ssp(entrypoint:$entrypoint,params:$params)", ServerSmartPrefetchQueryResponseImpl.XfbSsp.class)) == null || (treeList = treeValue.getTreeList("screens", ServerSmartPrefetchQueryResponseImpl.XfbSsp.Screens.class)) == null) {
                str = "SSP failed because screens was null.";
            } else {
                AnonymousClass0LU.A0C("SSP", AnonymousClass00U.A0S("Got ", " screens", treeList.size()));
                C1366783w it = treeList.iterator();
                while (it.hasNext()) {
                    TreeJNI treeJNI = (TreeJNI) it.next();
                    if (!M4x.A04(this.A00, new C210718u(this.A01), treeJNI.getStringValue("screen"), AnonymousClass0wJ.A0y(), (long) treeJNI.getIntValue("tti"))) {
                        AnonymousClass0LU.A0C("SSP", AnonymousClass00U.A0L("Did not prefetch ", treeJNI.getStringValue("screen")));
                    }
                }
                return;
            }
        } else {
            str = "SSP failed.";
        }
        AnonymousClass0LU.A0C("SSP", str);
    }

    public C679341f(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
