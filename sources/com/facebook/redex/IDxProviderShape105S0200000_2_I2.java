package com.facebook.redex;

import X.AnonymousClass6GG;
import X.C04560Oe;
import X.C108216i0;
import X.C115266um;
import X.C1198677j;
import X.C13320nQ;
import X.C13330nS;
import X.C28477FNn;
import X.IPD;
import android.content.Context;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.instagram.barcelona.R;
import com.instagram.react.impl.IgReactPackage;
import com.instagram.react.modules.base.IgReactDialogModule;
import com.instagram.react.modules.base.IgReactFunnelLoggerModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.react.views.image.IgReactImageLoaderModule;
import com.instagram.service.session.UserSession;

public class IDxProviderShape105S0200000_2_I2 implements C04560Oe {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxProviderShape105S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A02) {
            case 0:
                return AnonymousClass6GG.A00(C13330nS.A02(((C28477FNn) this.A01).A05.A00), this.A00);
            case 1:
                Context context = (Context) this.A00;
                String string = context.getString(R.string.google_app_id);
                C13320nQ.A05(string, "ApplicationId must be set.");
                String string2 = context.getString(R.string.google_api_key);
                C13320nQ.A05(string2, "ApiKey must be set.");
                return new C115266um(string, string2, context.getString(R.string.firebase_database_url), context.getString(R.string.gcm_defaultSenderId), context.getString(R.string.project_id));
            case 2:
                return new C108216i0((Context) this.A00, (UserSession) this.A01);
            case 3:
                return new C1198677j((Context) this.A00, (UserSession) this.A01);
            case 4:
                return new IgReactCountryCodeRoute((IPD) this.A01, ((IgReactPackage) this.A00).A00);
            case 5:
                return new IgReactNavigatorModule((IPD) this.A01, ((IgReactPackage) this.A00).A00);
            case 6:
                return new IgReactFunnelLoggerModule((IPD) this.A01, ((IgReactPackage) this.A00).A00);
            case 7:
                return new IgReactDialogModule((IPD) this.A01);
            case 8:
                return new IgReactImageLoaderModule((IPD) this.A01);
            case 9:
                return new IgReactGeoGatingModule((IPD) this.A01);
            case 10:
                return new ClipboardModule((IPD) this.A01);
            default:
                return new IgReactCommentModerationModule((IPD) this.A01, ((IgReactPackage) this.A00).A00);
        }
    }
}
