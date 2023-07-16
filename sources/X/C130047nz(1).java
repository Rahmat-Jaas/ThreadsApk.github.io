package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;

/* renamed from: X.7nz  reason: invalid class name and case insensitive filesystem */
public final class C130047nz implements C83334rD {
    public final /* synthetic */ AnonymousClass01V A00;
    public final /* synthetic */ AnonymousClass7EN A01;
    public final /* synthetic */ AnonymousClass8jO A02;
    public final /* synthetic */ AnonymousClass945 A03;
    public final /* synthetic */ D1C A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final void onFailure(Throwable th) {
        C04220Ms.A0B(th, 0);
        AnonymousClass01V r3 = this.A00;
        String message = th.getMessage();
        if (message == null) {
            message = "future failed";
        }
        r3.markerAnnotate(424097382, TraceFieldType.FailureReason, message);
        AnonymousClass7EN r1 = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        C63643hy.A04(new AnonymousClass83H(r1, this.A02, this.A03, this.A04, (Double) null, str, str2, true));
    }

    public C130047nz(AnonymousClass01V r1, AnonymousClass7EN r2, AnonymousClass8jO r3, AnonymousClass945 r4, D1C d1c, String str, String str2) {
        this.A01 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = r3;
        this.A04 = d1c;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        AnonymousClass7EN r5;
        String str2;
        String str3;
        Double d;
        AnonymousClass8jO r6;
        D1C d1c;
        AnonymousClass945 r7;
        boolean z;
        AnonymousClass5Id r14 = (AnonymousClass5Id) obj;
        if (r14 != null && r14.A02) {
            Object obj2 = r14.A00;
            if (C18190wL.A1a((Collection) obj2)) {
                double A002 = C86124wJ.A00(((Pair) C18240wQ.A0b((List) obj2)).A01);
                r5 = this.A01;
                z = C86114wI.A1S((A002 > C86124wJ.A00(r5.A04.getValue()) ? 1 : (A002 == C86124wJ.A00(r5.A04.getValue()) ? 0 : -1)));
                str2 = this.A05;
                str3 = this.A06;
                d = Double.valueOf(A002);
                r6 = this.A02;
                d1c = this.A04;
                r7 = this.A03;
                C63643hy.A04(new AnonymousClass83H(r5, r6, r7, d1c, d, str2, str3, z));
            }
        }
        AnonymousClass01V r3 = this.A00;
        if (r14 != null) {
            str = r14.A01;
        } else {
            str = null;
        }
        r3.markerAnnotate(424097382, TraceFieldType.FailureReason, str);
        r5 = this.A01;
        str2 = this.A05;
        str3 = this.A06;
        d = null;
        r6 = this.A02;
        d1c = this.A04;
        r7 = this.A03;
        z = true;
        C63643hy.A04(new AnonymousClass83H(r5, r6, r7, d1c, d, str2, str3, z));
    }
}
