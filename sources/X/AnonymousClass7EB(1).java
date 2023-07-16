package X;

import com.facebook.dcp.model.PredictorMetadata;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2;
import com.facebook.redex.IDxCCallbackShape584S0100000_2_I2;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7EB  reason: invalid class name */
public final class AnonymousClass7EB {
    public final C121547Gq A00;
    public final C86004w7 A01;
    public final C112096oz A02;

    public AnonymousClass7EB(C121547Gq r2, C112096oz r3, C86004w7 r4) {
        C04220Ms.A0B(r4, 2);
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }

    public final List A02(PredictorMetadata predictorMetadata, List list) {
        C04220Ms.A0B(predictorMetadata, 1);
        if (list.isEmpty()) {
            return AnonymousClass0ZV.A00;
        }
        return (List) C98666Gl.A00(AnonymousClass68S.USER_PREDICT, this.A00, AnonymousClass0ZV.A00, "no_use_case", C86154wM.A15(list, this, predictorMetadata, 10));
    }

    public static final C25322Dji A00(AnonymousClass7EB r10, KtCSuperShape0S2000100_I2 ktCSuperShape0S2000100_I2) {
        A01(r10, "download_pytorch_model");
        C112096oz r9 = r10.A02;
        String A002 = r9.A00(ktCSuperShape0S2000100_I2);
        A01(r10, "load_pytorch_model");
        try {
            SettableFuture settableFuture = new SettableFuture();
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C18240wQ.A1Q(A0v, new C28979FfK[]{C28979FfK.PYTORCH});
            Integer num = AnonymousClass006.A01;
            C37200JmN.A00().A02(r9.A00, new C36813Jf5((C12560m7) null, new IDxCCallbackShape584S0100000_2_I2(settableFuture, 1), num, A0v));
            if (AnonymousClass0wJ.A1X(settableFuture.get())) {
                return DHL.A00(A002);
            }
            throw new AnonymousClass6CN("Pytorch Voltron Module not loaded");
        } catch (CancellationException e) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to load pytorch model. CancellationException: ", e), e);
        } catch (ExecutionException e2) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to load pytorch model. ExecutionException: ", e2), e2);
        } catch (InterruptedException e3) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to load pytorch model. InterruptedException: ", e3), e3);
        } catch (Exception e4) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to load pytorch model. Exception: ", e4), e4);
        }
    }

    public static final void A01(AnonymousClass7EB r3, String str) {
        C121547Gq r32 = r3.A00;
        C121547Gq.A01(AnonymousClass68S.USER_PREDICT, C86134wK.A0N(str, (String) null, 6, 1), r32);
    }
}
