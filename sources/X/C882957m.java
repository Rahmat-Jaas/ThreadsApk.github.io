package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.redex.IDxFunctionShape1S3100000_2_I2;
import com.facebook.redex.IDxFunctionShape30S1100000_2_I2;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.57m  reason: invalid class name and case insensitive filesystem */
public abstract class C882957m extends C62793ak {
    public Bundle A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C880756q A03 = C880756q.A01();
    public final C880856r A04 = C880856r.A03();
    public final C880856r A05 = C880856r.A03();
    public final C880856r A06 = C880856r.A03();
    public final C880856r A07 = C880856r.A03();
    public final C880856r A08 = C880856r.A03();
    public final C880856r A09 = C880856r.A03();
    public final C880856r A0A = C880856r.A03();

    public final int A01() {
        if (this instanceof C92865jz) {
            C92865jz r1 = (C92865jz) this;
            if (r1.A04) {
                return 0;
            }
            if (r1.A05) {
                return 2131827292;
            }
            return 2131827290;
        } else if (this instanceof C92835jw) {
            return 2131832208;
        } else {
            if (this instanceof C92855jy) {
                return 2131832200;
            }
            if (this instanceof C92825jv) {
                return 2131832199;
            }
            if (this instanceof AnonymousClass5k0) {
                return 2131824340;
            }
            if (this instanceof C92805jt) {
                return 2131835780;
            }
            return 0;
        }
    }

    public final boolean A02(Bundle bundle, int i, boolean z) {
        Map map;
        C143688h9 r1;
        String str;
        Map map2;
        C143688h9 r12;
        String str2;
        M5J A002;
        C143158gC A0O;
        C112716q4 r13;
        String queryParameter;
        if (this instanceof C92835jw) {
            C92835jw r2 = (C92835jw) this;
            if (i != 1 || bundle == null || bundle.getString("web_fragment_intercepted_url") == null) {
                if ((i == 5 || i == 6) && (r13 = r2.A07) != null) {
                    String A003 = r2.A06.A00();
                    A003.getClass();
                    r13.A00(A003);
                }
                if (!z) {
                    return false;
                }
                if (i == 5) {
                    if (bundle != null) {
                        if ("success".equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                            String string = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                            String string2 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                            if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string)) {
                                map2 = C122037Js.A05(r2.A06);
                                r12 = r2.A0E;
                                str2 = "client_add_credential_success";
                            } else {
                                C112716q4 r4 = r2.A07;
                                r4.getClass();
                                String A004 = r2.A06.A00();
                                A004.getClass();
                                A002 = AnonymousClass5k7.A00(new IDxFunctionShape1S3100000_2_I2(r4, string2, string, A004, 1), r4.A02);
                                A0O = C86164wN.A0O(A002, r2, 25);
                            }
                        } else if (OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE.equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                            map2 = C122037Js.A05(r2.A06);
                            r12 = r2.A0E;
                            str2 = "client_add_credential_fail";
                        }
                        r12.Bb8(str2, map2);
                    }
                } else if (!(i == 2 || i == 3 || i == 6 || i == 5)) {
                    return false;
                }
                r2.A05.A00(r2.A0G);
                return true;
            }
            String string3 = bundle.getString("web_fragment_intercepted_url");
            if (TextUtils.isEmpty(string3) || (queryParameter = C15430rJ.A01(string3).getQueryParameter("ba_token")) == null) {
                return false;
            }
            M5J m5j = r2.A00;
            if (m5j != null) {
                m5j.A0F(r2.A0C);
            }
            C112706q3 r42 = r2.A05;
            A002 = AnonymousClass5k7.A00(new IDxFunctionShape30S1100000_2_I2(queryParameter, r42, 3), r42.A00);
            r2.A00 = A002;
            A0O = r2.A0C;
            A002.A0E(A0O);
            return true;
        } else if (!(this instanceof C92855jy)) {
            return false;
        } else {
            C92855jy r14 = (C92855jy) this;
            if (i != 6) {
                return false;
            }
            if (bundle == null) {
                return true;
            }
            if ("success".equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                String string4 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                String string5 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                if (TextUtils.isEmpty(string5) || TextUtils.isEmpty(string4)) {
                    HashSet A0u = C18200wM.A0u();
                    Collections.addAll(A0u, C969867m.values());
                    r14.A06.A00(A0u);
                    map = C122037Js.A05(r14.A02);
                    C86164wN.A1J(AnonymousClass0wJ.A0d(r14.A01.A00), map);
                    r1 = r14.A07;
                    str = "client_edit_credential_success";
                } else {
                    C112716q4 r3 = r14.A08;
                    String A005 = r14.A02.A00();
                    A005.getClass();
                    M5J A006 = AnonymousClass5k7.A00(new IDxFunctionShape1S3100000_2_I2(r3, string5, string4, A005, 1), r3.A02);
                    A006.A0E(C86164wN.A0O(A006, r14, 24));
                    return true;
                }
            } else if (!OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE.equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                return true;
            } else {
                map = C122037Js.A05(r14.A02);
                C86164wN.A1J(AnonymousClass0wJ.A0d(r14.A01.A00), map);
                r1 = r14.A07;
                str = "client_edit_credential_fail";
            }
            r1.Bb8(str, map);
            return true;
        }
    }

    public void A03(Bundle bundle) {
        this.A00 = bundle;
        this.A01 = true;
    }
}
