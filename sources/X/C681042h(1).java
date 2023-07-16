package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42h  reason: invalid class name and case insensitive filesystem */
public final class C681042h implements C39528KvC {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C681042h(BaseFragmentActivity baseFragmentActivity, UserSession userSession, String str) {
        this.A00 = baseFragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void onComplete() {
        C67093yr.A01(this.A00, this.A01, this.A02);
    }
}
