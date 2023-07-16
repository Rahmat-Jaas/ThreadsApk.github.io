package com.instagram.react.modules.product;

import X.AnonymousClass0wJ;
import X.AnonymousClass3LY;
import X.AnonymousClass7CL;
import X.AnonymousClass80F;
import X.AnonymousClass832;
import X.C12560m7;
import X.C127227gl;
import X.C131327rm;
import X.C131377rr;
import X.C1362181w;
import X.C1362281x;
import X.C1362882d;
import X.C142148dw;
import X.C145858lE;
import X.C18180wK;
import X.C18190wL;
import X.C19380AvN;
import X.C86124wJ;
import X.IPD;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@ReactModule(name = "IGPurchaseExperienceBridgeModule")
public class IgReactPurchaseExperienceBridgeModule extends NativeIGPurchaseExperienceBridgeModuleSpec {
    public static final String MODULE_NAME = "IGPurchaseExperienceBridgeModule";
    public static final String RN_PAYMENT_TYPE_KEY = "paymentType";
    public static final String RN_SHOP_PAY_CODE = "code";
    public static final String RN_SHOP_PAY_SESSION_ID = "session_id";
    public static final String RN_SHOP_PAY_STATE = "state";
    public static final String RN_SHOP_PAY_STATUS = "status";
    public static final int SHOP_PAY_REQUEST_CODE = 1;
    public final C142148dw mActivityEventListener;
    public List mProducts;
    public C145858lE mShopPayPromise;
    public C19380AvN mSurveyController;
    public UserSession mUserSession;

    public void authenticate(double d, ReadableMap readableMap, C145858lE r4) {
    }

    public void checkoutConfirmationWillDismiss() {
    }

    public String getName() {
        return "IGPurchaseExperienceBridgeModule";
    }

    public void openConnectFlow(double d, String str, String str2, C145858lE r5) {
    }

    public void openPaypalConsentFlow(double d, String str, String str2, String str3, C145858lE r6) {
    }

    public static C12560m7 getFragmentManager(FragmentActivity fragmentActivity, Fragment fragment) {
        if (fragment != null) {
            return fragment.getChildFragmentManager();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw C18190wL.A0a("FragmentActivity and fragment cannot both be empty");
    }

    public void dismissCheckout(double d, ReadableArray readableArray, boolean z, boolean z2) {
        AnonymousClass3LY.A00(this.mUserSession).CWx(new C131377rr(getProductIdsFromReadableArray(readableArray), z, z2));
        AnonymousClass7CL.A00(new AnonymousClass80F(this));
    }

    public void initCheckout(double d, ReadableMap readableMap) {
        AnonymousClass7CL.A00(new C1362281x(readableMap, this));
    }

    public void onPaymentSuccess(String str, boolean z, String str2, ReadableArray readableArray, ReadableArray readableArray2) {
        UserSession userSession = this.mUserSession;
        if (userSession != null) {
            AnonymousClass0wJ.A0Y(userSession).A26(C18180wK.A0Y());
            if (z && str2 != null) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                if (readableArray2 != null) {
                    Iterator it = readableArray2.toArrayList().iterator();
                    while (it.hasNext()) {
                        C86124wJ.A1V(A0v, it);
                    }
                }
                AnonymousClass3LY.A00(this.mUserSession).CWx(new C131327rm(str2, Collections.unmodifiableList(A0v)));
            }
        }
        C19380AvN avN = this.mSurveyController;
        if (avN != null) {
            avN.A01 = true;
        }
    }

    public void openShopPayFlow(double d, String str, String str2, C145858lE r6) {
        this.mShopPayPromise = r6;
        try {
            AnonymousClass7CL.A00(new C1362181w(this, str));
        } catch (IllegalArgumentException | NullPointerException e) {
            r6.reject(e);
        }
    }

    public void openShopPayInterstitial(double d, String str, String str2, C145858lE r6) {
        try {
            AnonymousClass7CL.A00(new AnonymousClass832(r6, this, str2, str));
        } catch (IllegalArgumentException | NullPointerException e) {
            r6.reject(e);
        }
    }

    public void sharePurchaseToStory(double d, String str, String str2) {
        AnonymousClass7CL.A00(new C1362882d(this, str, str2));
    }

    public IgReactPurchaseExperienceBridgeModule(IPD ipd) {
        super(ipd);
        C127227gl r1 = new C127227gl(this);
        this.mActivityEventListener = r1;
        ipd.A0B.add(r1);
    }

    private List getProductIdsFromReadableArray(ReadableArray readableArray) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (readableArray != null) {
            Iterator it = readableArray.toArrayList().iterator();
            while (it.hasNext()) {
                C86124wJ.A1V(A0v, it);
            }
        }
        return A0v;
    }

    public void setProducts(List list) {
        this.mProducts = list;
    }

    public void setSurveyController(C19380AvN avN) {
        this.mSurveyController = avN;
    }

    public void setUserSession(UserSession userSession) {
        this.mUserSession = userSession;
    }
}
