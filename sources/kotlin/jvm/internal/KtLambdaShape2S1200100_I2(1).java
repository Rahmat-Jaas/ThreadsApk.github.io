package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass68S;
import X.AnonymousClass791;
import X.C02220Ah;
import X.C04220Ms;
import X.C104516bu;
import X.C112966qU;
import X.C121547Gq;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import X.C23267CpF;
import X.C36975Ji8;
import X.C39237Kq4;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.signals.model.SignalResult;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2;
import com.facebook.papaya.store.PapayaStore;
import com.instagram.pendingmedia.model.PendingMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

public class KtLambdaShape2S1200100_I2 extends C02220Ah implements AnonymousClass0ZU {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S1200100_I2(Object obj, Object obj2, String str, int i, long j) {
        super(0);
        this.A04 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A04 != 0) {
            ((C23267CpF) this.A02).A00.A1H((PendingMedia) this.A01, this.A03, this.A00);
        } else {
            AnonymousClass791 r8 = (AnonymousClass791) this.A02;
            C104516bu r7 = r8.A04;
            String str = this.A03;
            List<SignalResult> list = (List) this.A01;
            long j = this.A00;
            C04220Ms.A0B(list, 1);
            for (SignalResult signalResult : list) {
                C04220Ms.A0B(signalResult, 1);
                C112966qU r10 = new C112966qU(Long.parseLong(str) + 100000000);
                Map map = signalResult.A05;
                ArrayList A0k = C18240wQ.A0k(map.size());
                Iterator A0z = AnonymousClass0wJ.A0z(map);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    r10.A01.put(Long.valueOf(Long.parseLong(C18200wM.A0p(A0o))), Double.valueOf((double) C18240wQ.A00(A0o.getValue())));
                    A0k.add(r10);
                }
                Map map2 = signalResult.A06;
                ArrayList A0k2 = C18240wQ.A0k(map2.size());
                Iterator A0z2 = AnonymousClass0wJ.A0z(map2);
                while (A0z2.hasNext()) {
                    Map.Entry A0o2 = C18180wK.A0o(A0z2);
                    r10.A03.put(Long.valueOf(Long.parseLong(C18200wM.A0p(A0o2))), Long.valueOf(C18190wL.A08(A0o2.getValue())));
                    A0k2.add(r10);
                }
                Map map3 = signalResult.A08;
                ArrayList A0k3 = C18240wQ.A0k(map3.size());
                Iterator A0z3 = AnonymousClass0wJ.A0z(map3);
                while (A0z3.hasNext()) {
                    Map.Entry A0o3 = C18180wK.A0o(A0z3);
                    long parseLong = Long.parseLong(C18200wM.A0p(A0o3));
                    r10.A05.put(Long.valueOf(parseLong), A0o3.getValue());
                    A0k3.add(r10);
                }
                Map map4 = signalResult.A07;
                ArrayList A0k4 = C18240wQ.A0k(map4.size());
                Iterator A0z4 = AnonymousClass0wJ.A0z(map4);
                while (A0z4.hasNext()) {
                    Map.Entry A0o4 = C18180wK.A0o(A0z4);
                    long parseLong2 = Long.parseLong(C18200wM.A0p(A0o4));
                    r10.A06.put(Long.valueOf(parseLong2), A0o4.getValue());
                    A0k4.add(r10);
                }
                String str2 = signalResult.A04;
                if (str2 != null) {
                    r10.A00.A02 = str2;
                }
                DcpContext dcpContext = signalResult.A01;
                if (dcpContext != null) {
                    C39237Kq4 kq4 = C36975Ji8.A03;
                    r10.A05.put(1000L, C18210wN.A0d(DcpContext.class, dcpContext, kq4, kq4.A02));
                }
                r10.A00.A00 = signalResult.A00;
                r10.A00().A00((PapayaStore) r7.A00.getValue(), j * 86400000);
            }
            C121547Gq r2 = r8.A02;
            C121547Gq.A01(AnonymousClass68S.SIGNAL_STORE_STORE, new KtCSuperShape1S1210000_I2("stored_signal", (List) list), r2);
        }
        return Unit.A00;
    }
}
