package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass6YF;
import X.AnonymousClass74F;
import X.AnonymousClass8s9;
import X.C03940Lk;
import X.C04220Ms;
import X.C107876hS;
import X.C142598fH;
import X.C146368m8;
import X.C18180wK;
import X.C18200wM;
import X.C27420EnC;
import X.C27607EqI;
import X.C41173LyC;
import X.C86144wL;
import X.CLl;
import X.CLm;
import android.os.SystemClock;
import ch.boye.httpclientandroidlib.util.VersionInfo;
import com.android.billingclient.api.SkuDetails;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000100_I2;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

public class IDxQListenerShape138S0300000_2_I2 implements C27607EqI {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxQListenerShape138S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = obj3;
    }

    public final void CGt(C41173LyC lyC, Map map) {
        C146368m8 r5;
        Object obj;
        String str;
        String str2;
        if (this.A03 != 0) {
            C107876hS r4 = (C107876hS) C18200wM.A0f(AnonymousClass6YF.A00, lyC.A00);
            Map map2 = (Map) this.A01;
            String str3 = "";
            if (r4 == null || (str = r4.A00) == null) {
                str = str3;
            }
            map2.put("fetch_status_error_code", str);
            if (!(r4 == null || (str2 = r4.A01) == null)) {
                str3 = str2;
            }
            map2.put("fetch_status_error_description", str3);
            Object obj2 = map2.get("product_price");
            C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
            Map A022 = C03940Lk.A02(obj2);
            Object obj3 = map2.get("price_info");
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.collections.MutableMap<kotlin.String, kotlin.String>>");
            Map A023 = C03940Lk.A02(obj3);
            if (lyC.A00 == 0) {
                map2.put("product_status", MessageAvailabilityResponseId$Companion.AVAILABLE);
                Iterator A0y = C86144wL.A0y(this.A02);
                while (A0y.hasNext()) {
                    Object next = A0y.next();
                    if (map != null && map.containsKey(next)) {
                        SkuDetails skuDetails = (SkuDetails) map.get(next);
                        Object obj4 = map.get(next);
                        if (obj4 != null) {
                            String optString = ((SkuDetails) obj4).A00.optString("price");
                            C04220Ms.A06(optString);
                            A022.put(next, optString);
                            Pair A0p = C18180wK.A0p("productID", next);
                            if (skuDetails != null) {
                                JSONObject jSONObject = skuDetails.A00;
                                A023.put(next, AnonymousClass4WJ.A0I(A0p, C18180wK.A0p("formattedPrice", jSONObject.optString("price")), C18180wK.A0p("amount", new BigDecimal(String.valueOf(((double) jSONObject.optLong("price_amount_micros")) / 1000000.0d)).toPlainString()), C18180wK.A0p("currencyCode", jSONObject.optString(AnonymousClass000.A00(1037)))));
                            } else {
                                throw C18180wK.A0a("Required value was null.");
                            }
                        } else {
                            throw C18180wK.A0a("Required value was null.");
                        }
                    }
                }
            } else {
                map2.put("product_status", VersionInfo.UNAVAILABLE);
            }
            AnonymousClass8s9 r1 = (AnonymousClass8s9) this.A00;
            if (((C27420EnC) r1)._state instanceof C142598fH) {
                r1.resumeWith((Object) null);
                return;
            }
            return;
        }
        if (lyC.A00 != 0 || map == null || map.isEmpty()) {
            r5 = (C146368m8) this.A00;
            obj = new CLm("iap_query_sku_price_failure", String.valueOf(lyC.A00), lyC.A01);
        } else {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (KtCSuperShape0S3000000_I2 ktCSuperShape0S3000000_I2 : (Iterable) this.A01) {
                SkuDetails skuDetails2 = (SkuDetails) map.get(ktCSuperShape0S3000000_I2.A01);
                if (skuDetails2 != null) {
                    String str4 = ktCSuperShape0S3000000_I2.A00;
                    String str5 = ktCSuperShape0S3000000_I2.A02;
                    JSONObject jSONObject2 = skuDetails2.A00;
                    String optString2 = jSONObject2.optString("productId");
                    C04220Ms.A06(optString2);
                    String optString3 = jSONObject2.optString("price");
                    C04220Ms.A06(optString3);
                    A0v.add(new KtCSuperShape0S4000100_I2(optString2, str4, str5, optString3, 0, jSONObject2.optLong("price_amount_micros")));
                }
            }
            AnonymousClass74F.A00 = SystemClock.uptimeMillis();
            List list = AnonymousClass74F.A02;
            list.clear();
            list.addAll(A0v);
            r5 = (C146368m8) this.A00;
            obj = new CLl(A0v, false);
        }
        r5.D7w(obj);
        r5.ADR((Throwable) null);
    }
}
