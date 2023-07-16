package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.47G  reason: invalid class name */
public final class AnonymousClass47G implements C21800C0z {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ BaseFragmentActivity A03;
    public final /* synthetic */ C83384rI A04;

    public final /* synthetic */ void Bsd(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public AnonymousClass47G(CallerContext callerContext, BaseFragmentActivity baseFragmentActivity, C83384rI r3, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = callerContext;
        this.A04 = r3;
        this.A03 = baseFragmentActivity;
    }

    public final void onDestroy() {
        this.A03.A0F(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 64206) {
            if (i2 == -1) {
                String A012 = C62963bD.A01(this.A00, this.A01, this.A02);
                if (A012 == null || A012.length() == 0) {
                    C63813iO.A03(this.A03, (String) null, 2131830178, 0);
                    this.A04.Bxq();
                    return;
                }
                this.A04.CHC(A012);
            } else {
                C63813iO.A03(this.A03, (String) null, 2131830178, 0);
                this.A04.Bxq();
            }
            this.A03.A0F(this);
        }
    }
}
