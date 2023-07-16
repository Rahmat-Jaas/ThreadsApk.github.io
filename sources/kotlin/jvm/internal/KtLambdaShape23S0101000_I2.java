package kotlin.jvm.internal;

import X.AnonymousClass0MJ;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5J1;
import X.AnonymousClass6FM;
import X.AnonymousClass6ZQ;
import X.AnonymousClass7C0;
import X.AnonymousClass7HD;
import X.AnonymousClass7Hh;
import X.AnonymousClass8bN;
import X.AnonymousClass8bP;
import X.AnonymousClass8s2;
import X.AnonymousClass9CZ;
import X.C02220Ah;
import X.C04220Ms;
import X.C122067Jz;
import X.C123657Xy;
import X.C145518kd;
import X.C146178lm;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C22031CDi;
import X.C25786Drz;
import X.C86114wI;
import X.C89935Hp;
import X.C92245hr;
import X.CS7;
import X.F6u;
import X.IRw;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.instagram.rtc.rsys.proxies.IGRTCCallManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape23S0101000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape23S0101000_I2(int i, int i2, Object obj) {
        super(1);
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25786Drz A0U;
        String obj2;
        String A0P;
        Object obj3 = obj;
        switch (this.A02) {
            case 0:
                C04220Ms.A0B(obj3, 0);
                C123657Xy r6 = (C123657Xy) this.A01;
                int i = (-this.A00) >> 1;
                AnonymousClass0YY r4 = AnonymousClass6ZQ.A01;
                C18180wK.A1Q(r6, 0, r4);
                r6.A0E(r4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, AnonymousClass7Hh.A01(AnonymousClass7Hh.A00(i - ((r6.A01 - r6.A0B()) >> 1), i - ((r6.A00 - r6.A0A()) >> 1)), C123657Xy.A08(r6)));
                break;
            case 1:
                C04220Ms.A0B(obj3, 0);
                int i2 = this.A00 >> 1;
                C122067Jz.A00((C123657Xy) this.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, i2, i2);
                break;
            case 2:
                List list = (List) obj3;
                C04220Ms.A0B(list, 0);
                return Boolean.valueOf(list.addAll(this.A00, (Collection) this.A01));
            case 3:
                C92245hr.A02((C92245hr) this.A01, C18210wN.A0f(obj3), this.A00 + 1);
                break;
            case 4:
                C04220Ms.A0B(obj3, 0);
                int i3 = this.A00;
                int i4 = 0;
                for (C123657Xy r1 : (Iterable) this.A01) {
                    C122067Jz.A00(r1, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, i4, 0);
                    i4 += r1.A01 + i3;
                }
                break;
            case 5:
                Context context = (Context) obj3;
                C04220Ms.A0B(context, 0);
                RecyclerView recyclerView = new RecyclerView(context);
                recyclerView.setLayoutManager(new GridLayoutManager(3));
                recyclerView.setAdapter(((F6u) this.A01).A02);
                int i5 = this.A00;
                recyclerView.A0y(new C22031CDi(true, i5, i5, i5, 0));
                return recyclerView;
            case 6:
                AnonymousClass5J1 r62 = (AnonymousClass5J1) obj3;
                C04220Ms.A0B(r62, 0);
                int i6 = this.A00;
                return AnonymousClass5J1.A00(new AnonymousClass7HD((String) ((AnonymousClass0MJ) this.A01).A00, 4, AnonymousClass6FM.A00(i6, i6)), (KtCSuperShape0S3200000_I2) null, r62, (C89935Hp) null, (List) null, (AnonymousClass8s2) null, 1021, false, false, false, false);
            case 7:
                AnonymousClass5J1 r63 = (AnonymousClass5J1) obj3;
                C04220Ms.A0B(r63, 0);
                AnonymousClass8s2<C146178lm> r0 = r63.A05;
                int i7 = this.A00;
                AnonymousClass0YY r42 = (AnonymousClass0YY) this.A01;
                ArrayList A0w = AnonymousClass0wJ.A0w(r0);
                for (C146178lm r12 : r0) {
                    A0w.add(r12.AnQ() == i7 ? r42.invoke(r12) : r12);
                }
                return AnonymousClass5J1.A00((AnonymousClass7HD) null, (KtCSuperShape0S3200000_I2) null, r63, (C89935Hp) null, (List) null, AnonymousClass7C0.A00(A0w), 991, false, false, false, false);
            case 8:
                C04220Ms.A0B(obj3, 0);
                C122067Jz.A00((C123657Xy) this.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, -this.A00);
                break;
            case 9:
                ((AnonymousClass0YY) this.A01).invoke(AnonymousClass8bN.A0E(C18210wN.A0f(obj3), this.A00));
                break;
            case 10:
                C145518kd r64 = (C145518kd) obj3;
                C04220Ms.A0B(r64, 0);
                r64.C3O((AnonymousClass9CZ) this.A01, this.A00);
                break;
            case 11:
                A0U = C86114wI.A0U((Fragment) obj3, this);
                A0U.A06 = C18180wK.A0Y();
                A0U.A08();
                break;
            case 14:
                if (!(obj == null || (obj2 = obj3.toString()) == null || (A0P = AnonymousClass8bP.A0P(obj2)) == null)) {
                    ((CS7) this.A01).A01().A0A[this.A00].CrC(A0P);
                    break;
                }
            case 15:
                IGRTCCallManager iGRTCCallManager = (IGRTCCallManager) obj3;
                C04220Ms.A0B(iGRTCCallManager, 0);
                iGRTCCallManager.receivedMultiwaySignalingMessage((byte[]) this.A01, this.A00);
                break;
            case 16:
                IRw iRw = (IRw) obj3;
                C04220Ms.A0B(iRw, 0);
                CallApi callApi = iRw.A00;
                if (callApi != null) {
                    callApi.respondToApprovalRequests(C18200wM.A0s((Collection) this.A01), this.A00);
                    break;
                }
                break;
            default:
                A0U = C86114wI.A0U((Fragment) obj3, this);
                A0U.A06 = C18180wK.A0Y();
                A0U.A08();
                A0U.A0C = false;
                break;
        }
        A0U.A05();
        return Unit.A00;
    }
}
