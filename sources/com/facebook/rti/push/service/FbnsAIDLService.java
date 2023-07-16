package com.facebook.rti.push.service;

import X.AnonymousClass0LU;
import X.C14030oh;
import X.C16540tH;
import X.C16800tl;
import X.C16930u0;
import android.content.Context;
import android.os.Bundle;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import java.util.HashMap;
import java.util.Map;

public final class FbnsAIDLService extends IFbnsAIDLService.Stub {
    public final Context A00;
    public final Map A01;

    public /* synthetic */ FbnsAIDLService(Context context, C16800tl r6, C16800tl r7) {
        int A03 = C14030oh.A03(426944757);
        HashMap hashMap = new HashMap();
        this.A01 = hashMap;
        C16930u0 r0 = C16930u0.GET_PREF_BASED_CONFIG;
        C16800tl r1 = C16540tH.A02;
        hashMap.put(r0, r1);
        hashMap.put(C16930u0.SET_PREF_BASED_CONFIG, r1);
        C16930u0 r02 = C16930u0.GET_ANALYTICS_CONFIG;
        C16800tl r12 = C16540tH.A01;
        hashMap.put(r02, r12);
        hashMap.put(C16930u0.SET_ANALYTICS_CONFIG, r12);
        C16930u0 r03 = C16930u0.GET_PREF_IDS;
        C16800tl r13 = C16540tH.A03;
        hashMap.put(r03, r13);
        hashMap.put(C16930u0.SET_PREF_IDS, r13);
        this.A00 = context;
        hashMap.put(C16930u0.GET_APPS_STATISTICS, r6);
        hashMap.put(C16930u0.GET_FLYTRAP_REPORT, r7);
        C14030oh.A0A(-393220584, A03);
        C14030oh.A0A(181612027, C14030oh.A03(-450747708));
    }

    private C16800tl A00(FbnsAIDLRequest fbnsAIDLRequest, boolean z) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int i2;
        int A03 = C14030oh.A03(1757836597);
        if (fbnsAIDLRequest == null || (i2 = fbnsAIDLRequest.A00) < 0) {
            AnonymousClass0LU.A0B("FbnsAIDLService", "Invalid FbnsAIDLRequest");
            illegalArgumentException = new IllegalArgumentException("FbnsService received invalid FbnsAIDLRequest");
            i = 47240374;
        } else {
            C16930u0 r3 = (C16930u0) C16930u0.A02.get(Integer.valueOf(i2));
            if (r3 == null) {
                r3 = C16930u0.NOT_EXIST;
            }
            if (r3 == C16930u0.NOT_EXIST) {
                illegalArgumentException = new IllegalArgumentException("FbnsService operation not found");
                i = -783403537;
            } else if (r3.A01 == z) {
                C16800tl r1 = (C16800tl) this.A01.get(r3);
                if (r1 != null) {
                    C14030oh.A0A(143105443, A03);
                    return r1;
                }
                StringBuilder sb = new StringBuilder("FbnsService does not implement operation ");
                sb.append(r3);
                illegalArgumentException = new IllegalArgumentException(sb.toString());
                i = 1761423386;
            } else {
                AnonymousClass0LU.A0B("FbnsAIDLService", "FbnsAIDLOperation incorrect return type");
                illegalArgumentException = new IllegalArgumentException("FbnsService operation incorrect return type");
                i = -2746196;
            }
        }
        C14030oh.A0A(i, A03);
        throw illegalArgumentException;
    }

    public final FbnsAIDLResult CYb(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = C14030oh.A03(91810972);
        C16800tl A002 = A00(fbnsAIDLRequest, true);
        Context context = this.A00;
        Bundle bundle = fbnsAIDLRequest.A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        FbnsAIDLResult fbnsAIDLResult = new FbnsAIDLResult(A002.AIQ(context, bundle));
        C14030oh.A0A(576271924, A03);
        return fbnsAIDLResult;
    }

    public final void D8a(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = C14030oh.A03(812821291);
        C16800tl A002 = A00(fbnsAIDLRequest, false);
        Context context = this.A00;
        Bundle bundle = fbnsAIDLRequest.A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        A002.AIW(context, bundle);
        C14030oh.A0A(283333045, A03);
    }
}
