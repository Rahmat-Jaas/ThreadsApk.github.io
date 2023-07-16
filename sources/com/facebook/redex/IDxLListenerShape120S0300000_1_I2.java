package com.facebook.redex;

import X.AnonymousClass3J8;
import X.AnonymousClass3VO;
import X.AnonymousClass3WS;
import X.AnonymousClass601;
import X.C109326jp;
import X.C18250wR;
import X.C21800C0z;
import X.C28161tl;
import X.C63813iO;
import X.C63893iY;
import X.C63913ic;
import X.C83384rI;
import X.I17;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import org.json.JSONException;

public class IDxLListenerShape120S0300000_1_I2 implements C21800C0z {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLListenerShape120S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        switch (this.A03) {
            case 0:
                if (i == 1005) {
                    AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                    A002.A02(((Reel) this.A02).getId(), 0);
                    C63893iY.A0F((AnonymousClass601) this.A00, A002, (C109326jp) this.A01, "HIGHLIGHT", 1);
                }
                C63913ic.A0R((AnonymousClass601) this.A00, this);
                return;
            case 1:
                if (i == 64206) {
                    BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) this.A00;
                    baseFragmentActivity.A0F(this);
                    if (i2 == -1) {
                        String A06 = C28161tl.A06(AnonymousClass3WS.A01((UserSession) this.A02), I17.A00(295), "");
                        if (A06.length() != 0) {
                            AccessToken accessToken = null;
                            try {
                                accessToken = AnonymousClass3J8.A00(C18250wR.A0j(A06));
                            } catch (JSONException unused) {
                            }
                            if (!(accessToken == null || (str = accessToken.A02) == null)) {
                                ((C83384rI) this.A01).CHC(str);
                                return;
                            }
                        }
                    }
                    C63813iO.A03(baseFragmentActivity, (String) null, 2131830178, 0);
                    ((C83384rI) this.A01).Bxq();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
        if (1 - this.A03 == 0) {
            ((BaseFragmentActivity) this.A00).A0F(this);
        }
    }

    public final void onDestroyView() {
        if (this.A03 == 0) {
            C63913ic.A0R((AnonymousClass601) this.A00, this);
        }
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void Bsd(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}
