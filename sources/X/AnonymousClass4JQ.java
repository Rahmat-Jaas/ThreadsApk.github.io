package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4JQ  reason: invalid class name */
public final class AnonymousClass4JQ implements C82924qU {
    public final Activity A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final Context A03;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass3Zk.A01(this.A03, C18220wO.A0O(this, 141), C18220wO.A0O(this, 142));
    }

    public AnonymousClass4JQ(Context context, UserSession userSession) {
        this.A02 = userSession;
        this.A03 = context;
        this.A01 = (FragmentActivity) C10050he.A00(context, FragmentActivity.class);
        this.A00 = (Activity) C10050he.A00(context, Activity.class);
    }
}
