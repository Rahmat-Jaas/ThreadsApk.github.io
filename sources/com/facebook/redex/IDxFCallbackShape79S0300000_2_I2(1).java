package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass5z0;
import X.AnonymousClass6aS;
import X.AnonymousClass7EC;
import X.AnonymousClass88H;
import X.C103226Yh;
import X.C109376ju;
import X.C109696kQ;
import X.C121557Gu;
import X.C128877kW;
import X.C129017kq;
import X.C143338gY;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C24128D9z;
import X.C83334rD;
import X.C86144wL;
import X.C92935kG;
import X.LWN;
import X.McB;
import android.os.RemoteException;
import android.util.SparseArray;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient$2$1;
import com.instagram.direct.stella.api.IStellaDirectMessagingService;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayAddCreditCardResponseImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class IDxFCallbackShape79S0300000_2_I2 implements C83334rD {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFCallbackShape79S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onFailure(Throwable th) {
        AnonymousClass7EC r0;
        C129017kq r1;
        switch (this.A03) {
            case 0:
                ((LWN) this.A01).setException(th);
                return;
            case 1:
                C92935kG r12 = (C92935kG) this.A00;
                r12.A00 = AnonymousClass7EC.A01((Throwable) ((McB) this.A01).apply(th));
                r0 = r12.A00;
                r1 = r12;
                break;
            case 2:
                StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A00;
                C24128D9z.A00(stellaIpcDirectMessagingServiceClient.mUserSession, AnonymousClass006.A0Y, th.toString());
                stellaIpcDirectMessagingServiceClient.onRequestFinished();
                return;
            default:
                r0 = AnonymousClass7EC.A01((Throwable) C103226Yh.A00.apply(th));
                r1 = (C129017kq) this.A01;
                break;
        }
        r1.A01(r0);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        boolean z;
        Object obj2;
        StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient;
        Object obj3;
        switch (this.A03) {
            case 0:
                Map map = (Map) obj;
                C121557Gu r3 = ((C109696kQ) this.A00).A01;
                Map map2 = (Map) this.A02;
                ArrayList<BrowserExtensionsAutofillData> A0v = AnonymousClass0wJ.A0v();
                A0v.addAll(C121557Gu.A02(map2));
                A0v.addAll(r3.A03(map2));
                A0v.addAll(C121557Gu.A00(map2));
                A0v.addAll(C121557Gu.A01(map2));
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                if (map == null) {
                    A0v2.addAll(A0v);
                } else {
                    for (BrowserExtensionsAutofillData browserExtensionsAutofillData : A0v) {
                        ArrayList A0v3 = AnonymousClass0wJ.A0v();
                        if (browserExtensionsAutofillData instanceof TelephoneAutofillData) {
                            str = "telephone-autofill-data";
                        } else if (browserExtensionsAutofillData instanceof NameAutofillData) {
                            str = "name-autofill-data";
                        } else if (browserExtensionsAutofillData instanceof EmailAutofillData) {
                            str = "email-autofill-data";
                        } else {
                            str = "address-autofill-data";
                        }
                        Collection collection = (Collection) map.get(str);
                        if (collection != null) {
                            A0v3.addAll(collection);
                        }
                        Iterator it = A0v3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                            } else if (browserExtensionsAutofillData.BYu((FbAutofillData) it.next())) {
                                z = true;
                            }
                        }
                        if (!C18210wN.A1W(z) && !A0v3.contains(browserExtensionsAutofillData) && !A0v2.contains(browserExtensionsAutofillData)) {
                            A0v2.add(browserExtensionsAutofillData);
                        }
                    }
                }
                ((LWN) this.A01).set(A0v2);
                return;
            case 1:
                C143338gY r7 = (C143338gY) obj;
                if (r7 == null || (obj2 = ((AnonymousClass5z0) r7).A01) == null) {
                    onFailure(new AnonymousClass88H());
                    return;
                }
                try {
                    C92935kG r4 = (C92935kG) this.A00;
                    Object apply = ((McB) this.A02).apply(obj2);
                    apply.getClass();
                    r4.A00 = new AnonymousClass7EC(r7.Aju(), apply, (Throwable) null);
                    r4.A01(r4.A00);
                    return;
                } catch (Exception e) {
                    onFailure(e);
                    return;
                }
            case 2:
                IStellaDirectMessagingService iStellaDirectMessagingService = (IStellaDirectMessagingService) obj;
                try {
                    C109376ju r5 = (C109376ju) this.A01;
                    JSONObject A0y = C18230wP.A0y();
                    try {
                        A0y.put("action", C18170wI.A00(706));
                        ImmutableMap immutableMap = r5.A00;
                        if (immutableMap != null) {
                            JSONObject A0y2 = C18230wP.A0y();
                            Iterator it2 = immutableMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry A0o = C18180wK.A0o(it2);
                                A0y2.put(C18200wM.A0p(A0o), A0o.getValue());
                            }
                            A0y.put("header", A0y2);
                        }
                    } catch (JSONException e2) {
                        C24128D9z.A00(r5.A01, AnonymousClass006.A0u, e2.toString());
                    }
                    ((SettableFuture) this.A02).set(iStellaDirectMessagingService.Ce2(C18190wL.A0n(A0y)));
                    stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A00;
                    if (stellaIpcDirectMessagingServiceClient.mContext != null) {
                        iStellaDirectMessagingService.CZr(new StellaIpcDirectMessagingServiceClient$2$1(this));
                    }
                } catch (RemoteException e3) {
                    stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A00;
                    C24128D9z.A00(stellaIpcDirectMessagingServiceClient.mUserSession, AnonymousClass006.A0N, e3.toString());
                } catch (Throwable th) {
                    ((StellaIpcDirectMessagingServiceClient) this.A00).onRequestFinished();
                    throw th;
                }
                stellaIpcDirectMessagingServiceClient.onRequestFinished();
                return;
            default:
                C143338gY r72 = (C143338gY) obj;
                if (r72 == null || (obj3 = ((AnonymousClass5z0) r72).A01) == null) {
                    onFailure(new AnonymousClass88H());
                    return;
                }
                C128877kW r1 = (C128877kW) this.A00;
                SparseArray sparseArray = (SparseArray) this.A02;
                try {
                    String A0m = C18220wO.A0m(C86144wL.A0X((IGFBPayAddCreditCardResponseImpl) obj3));
                    A0m.getClass();
                    r1.A00.A03(A0m, sparseArray.get(13).toString());
                } catch (Exception e4) {
                    AnonymousClass0LU.A0E("IGCreditCardFormApi", "Problem with card binding", e4);
                }
                ((C129017kq) this.A01).A01(AnonymousClass7EC.A00(AnonymousClass6aS.A00.apply(obj3)));
                return;
        }
    }
}
