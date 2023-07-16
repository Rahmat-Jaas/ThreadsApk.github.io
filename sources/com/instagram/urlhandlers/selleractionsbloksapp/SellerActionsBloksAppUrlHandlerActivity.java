package com.instagram.urlhandlers.selleractionsbloksapp;

import X.AnonymousClass054;
import X.AnonymousClass0LU;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass2LR;
import X.AnonymousClass3YR;
import X.C04690Os;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C16240si;
import X.C18190wL;
import X.C18230wP;
import X.C62853b1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class SellerActionsBloksAppUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;
    public UserSession A01;
    public final AnonymousClass054 A02 = new IDxCListenerShape426S0100000_1_I2(this, 14);

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        C10300i6 r1;
        int A002 = C14030oh.A00(1609628641);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -99187986;
        } else {
            AnonymousClass0RG r4 = AnonymousClass0RA.A0C;
            this.A00 = r4.A02(A0C);
            Intent intent = getIntent();
            if (this.A00 != null) {
                try {
                    C18190wL.A0J().A00(this, intent, (C16240si) null);
                    C10300i6 r12 = this.A00;
                    if (!(r12 instanceof UserSession)) {
                        AnonymousClass3YR.A00(this, A0C, r12);
                        i = -1612312075;
                    } else {
                        this.A01 = r4.A06(A0C);
                        String A0i = C18190wL.A0i(A0C);
                        if (A0i == null) {
                            finish();
                            i = -2010016789;
                        } else {
                            getSupportFragmentManager().A0v(this.A02);
                            Uri A012 = C15430rJ.A01(A0i);
                            String queryParameter = A012.getQueryParameter("bloks_app_id");
                            String queryParameter2 = A012.getQueryParameter("params");
                            HashMap A0y = AnonymousClass0wJ.A0y();
                            UserSession userSession = this.A01;
                            if (!(userSession == null || queryParameter2 == null)) {
                                try {
                                    A0y = AnonymousClass2LR.A00(C04690Os.A02.A04(userSession, queryParameter2));
                                } catch (IOException e) {
                                    AnonymousClass0LU.A0E("FBShopsSellerActionsUrlHandler", "Failed to extract params from URI", e);
                                }
                            }
                            if (queryParameter == null || !Arrays.asList("com.bloks.www.shops.fb_channel_enablement,com.bloks.www.bloks.commerce.creator-shop.activation.info,com.bloks.www.bloks.commerce.drops.shared-launch-details,com.bloks.www.bloks.commerce.drops.future-product-details-edit,com.bloks.www.bloks.commerce.creators-as-sellers.shop-management,com.bloks.www.bloks.commerce.creators-as-sellers.featured-products,com.bloks.www.commerce.cam.shop.management".split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)).contains(queryParameter) || A0y == null || (r1 = this.A00) == null || this.A01 == null) {
                                finish();
                            } else {
                                C18230wP.A19(C62853b1.A03(r1, queryParameter, A0y), AnonymousClass0wJ.A0Q(this, this.A01));
                            }
                            i = 537902847;
                        }
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    str = "Security issue with caller";
                    AnonymousClass0LU.A0E("FBShopsSellerActionsUrlHandler", str, e);
                    finish();
                    i = -415405202;
                    C14030oh.A07(i, A002);
                } catch (IllegalStateException e3) {
                    e = e3;
                    str = "Failed to verify caller";
                    AnonymousClass0LU.A0E("FBShopsSellerActionsUrlHandler", str, e);
                    finish();
                    i = -415405202;
                    C14030oh.A07(i, A002);
                }
            }
            finish();
            i = -415405202;
        }
        C14030oh.A07(i, A002);
    }
}
