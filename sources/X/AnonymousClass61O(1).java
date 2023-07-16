package X;

import com.facebook.dcp.model.DcpData;
import com.facebook.dcp.model.PredictorMetadata;
import com.facebook.models.IgModelLoader;
import java.util.List;

/* renamed from: X.61O  reason: invalid class name */
public final class AnonymousClass61O extends AnonymousClass0gG {
    public final /* synthetic */ C1203279s A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61O(C1203279s r2, String str, List list) {
        super(728039861);
        this.A00 = r2;
        this.A02 = list;
        this.A01 = str;
    }

    public final void run() {
        Runnable runnable;
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        C1203279s r4 = this.A00;
        IgModelLoader A002 = GP0.A00(r1.A02(r4.A02));
        if (A002 != null) {
            r4.A00 = A002;
            AnonymousClass7EB r12 = new AnonymousClass7EB(r4.A04, new C112096oz(A002, r4.A06), r4.A05);
            try {
                List list = this.A02;
                PredictorMetadata predictorMetadata = r4.A03;
                List<DcpData> A022 = r12.A02(predictorMetadata, list);
                if (C18190wL.A1a(A022)) {
                    String str = this.A01;
                    for (DcpData dcpData : A022) {
                        double d = dcpData.A00;
                        C1203279s.A00(r4, predictorMetadata.A0B, predictorMetadata.A0A, str, d, predictorMetadata.A04);
                    }
                    runnable = new C1361281n(r4, A022);
                } else {
                    AnonymousClass0LU.A0B("on_device_compute", "Failed to get prediction results");
                    C1203279s.A00(r4, predictorMetadata.A0B, predictorMetadata.A0A, this.A01, -1.0d, predictorMetadata.A04);
                    runnable = new AnonymousClass809(r4);
                }
                C63643hy.A04(runnable);
            } catch (AnonymousClass6CN e) {
                AnonymousClass0LU.A0B("on_device_compute", String.valueOf(e.getMessage()));
                PredictorMetadata predictorMetadata2 = r4.A03;
                C1203279s.A00(r4, predictorMetadata2.A0B, predictorMetadata2.A0A, this.A01, -2.0d, predictorMetadata2.A04);
                C63643hy.A04(new C1361381o(e, r4));
            }
        } else {
            throw AnonymousClass0wJ.A0b();
        }
    }
}
