package X;

import com.instagram.share.facebook.upsell.noticestate.graphql.SyncCXPNoticeStateMutationResponseImpl;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateApi;
import java.util.Map;

/* renamed from: X.4A0  reason: invalid class name */
public final class AnonymousClass4A0 implements C144618in {
    public final /* synthetic */ CXPNoticeStateApi A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ AnonymousClass0YY A02;

    public AnonymousClass4A0(CXPNoticeStateApi cXPNoticeStateApi, Map map, AnonymousClass0YY r3) {
        this.A00 = cXPNoticeStateApi;
        this.A01 = map;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        AnonymousClass5z0 r3 = (AnonymousClass5z0) obj;
        this.A02.invoke(CXPNoticeStateApi.A01((SyncCXPNoticeStateMutationResponseImpl) r3.A01, this.A01));
        return r3;
    }
}
