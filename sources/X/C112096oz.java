package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2;
import com.facebook.models.IgModelLoader;
import com.facebook.models.ModelAssetMetadata;
import com.facebook.models.ModelMetadata;
import com.instagram.service.session.UserSession;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.6oz  reason: invalid class name and case insensitive filesystem */
public final class C112096oz {
    public final UserSession A00;
    public final IgModelLoader A01;

    public C112096oz(IgModelLoader igModelLoader, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A01 = igModelLoader;
        this.A00 = userSession;
    }

    public final String A00(KtCSuperShape0S2000100_I2 ktCSuperShape0S2000100_I2) {
        AnonymousClass6CN r1;
        String str = ktCSuperShape0S2000100_I2.A02;
        long j = ktCSuperShape0S2000100_I2.A00;
        String str2 = ktCSuperShape0S2000100_I2.A01;
        try {
            ModelMetadata modelMetadata = (ModelMetadata) this.A01.load(str, j).get();
            if (modelMetadata != null) {
                ModelAssetMetadata assetMetadata = modelMetadata.getAssetMetadata(str2);
                if (assetMetadata != null) {
                    String str3 = assetMetadata.path;
                    C04220Ms.A05(str3);
                    return str3;
                }
                StringBuilder A0r = C18200wM.A0r();
                A0r.append("Cannot find model asset: ");
                A0r.append(str2);
                C18230wP.A1S(" for model name: ", str, ", model version: ", A0r);
                r1 = new AnonymousClass6CN(C86154wM.A0n(A0r, j));
            } else {
                StringBuilder A0r2 = C18200wM.A0r();
                C18230wP.A1S("Cannot load model metadata for model name: ", str, ", model version: ", A0r2);
                r1 = new AnonymousClass6CN(C86154wM.A0n(A0r2, j));
            }
            throw r1;
        } catch (CancellationException e) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to download model file. CancellationException: ", e), e);
        } catch (ExecutionException e2) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to download model file. ExecutionException: ", e2), e2);
        } catch (InterruptedException e3) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to download model file. InterruptedException: ", e3), e3);
        } catch (Exception e4) {
            throw new AnonymousClass6CN(C18230wP.A0t("Failed to download model file. Exception: ", e4), e4);
        }
    }
}
