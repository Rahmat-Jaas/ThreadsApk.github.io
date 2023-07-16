package X;

import android.view.View;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.graphql.instagramschema.AdActivityRemoveUndoMutationResponseImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.7vv  reason: invalid class name and case insensitive filesystem */
public final class C133577vv implements C39777Kzl {
    public final /* synthetic */ RecentAdActivityFragment A00;
    public final /* synthetic */ C144878jR A01;
    public final /* synthetic */ String A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public C133577vv(RecentAdActivityFragment recentAdActivityFragment, C144878jR r2, String str) {
        this.A00 = recentAdActivityFragment;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onButtonClick(View view) {
        UserSession userSession = this.A00.A0A;
        String str = this.A02;
        C144878jR r2 = this.A01;
        C04220Ms.A0B(userSession, 0);
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(str, "ad_id");
        C67463zb.A01(A0L, A002);
        AnonymousClass3WK.A01(userSession).A07(new PandoGraphQLRequest(C63233h2.A00(), "AdActivityRemoveUndoMutation", A002.getParamsCopy(), A003.getParamsCopy(), AdActivityRemoveUndoMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "xfb_undo_delete_recent_ad_activity"), new IDxACallbackShape112S0100000_2_I2(r2, 20));
    }
}
