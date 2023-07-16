package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Ct  reason: invalid class name and case insensitive filesystem */
public final class C02760Ct {
    public final C05500Tz A00;
    public final AnonymousClass0CC A01;
    public final SamplingPolicyConfig A02;

    public final void A00(IOException iOException) {
        C05500Tz r1 = this.A00;
        if (r1.BOB()) {
            r1.unlock();
        }
        this.A01.ByC(iOException);
    }

    public final void A01(InputStream inputStream, int i) {
        if (i == 200) {
            try {
                SamplingPolicyConfig samplingPolicyConfig = this.A02;
                if (samplingPolicyConfig != null) {
                    samplingPolicyConfig.D9W(inputStream);
                }
                this.A00.Beo();
                this.A01.onSuccess();
            } catch (IOException e) {
                this.A01.ByC(e);
            } catch (Throwable th) {
                this.A00.unlock();
                inputStream.close();
                throw th;
            }
            this.A00.unlock();
            inputStream.close();
            return;
        }
        throw new AnonymousClass0CA(AnonymousClass00U.A0J("Unexpected HTTP code ", i));
    }

    public C02760Ct(C05500Tz r1, AnonymousClass0CC r2, SamplingPolicyConfig samplingPolicyConfig) {
        this.A00 = r1;
        this.A02 = samplingPolicyConfig;
        this.A01 = r2;
    }
}
